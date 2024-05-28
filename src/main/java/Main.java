/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/slillbox";
        String username = "root";
        String password = "10052024";

        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement statement = connection.prepareStatement("SELECT course_id, COUNT(course_id) / (SELECT MAX(MONTH(subscription_date)) FROM subscriptions) AS count FROM subscriptions GROUP BY course_id")) {
            try (ResultSet resultSet = statement.executeQuery()) {
                Map<Integer, Double> results = new HashMap<>();
                while (resultSet.next()) {
                    int courseId = resultSet.getInt("course_id");
                    double count = resultSet.getDouble("count");
                    results.put(courseId, count);
                    System.out.println("Course ID: " + courseId + ", Average Monthly Subscriptions: " + count);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}*/


/*
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Subscription.class)
                .buildSessionFactory();

        try (Session session = sessionFactory.openSession()) {
            String hql = "SELECT s.courseId, COUNT(*) AS totalSubscriptions\n" +
                    "FROM Subscription s\n" +
                    "GROUP BY s.courseId\n" ;

            Query query = session.createQuery(hql, Subscription[].class);
            List<String[]> resultList = query.getResultList();

            for (Object[] row : resultList) {
                int courseId = (int) row[0];
                float totalSubscriptions = (long) row[1];
                System.out.println("Course ID: " + courseId + ", Total Subscriptions: " + totalSubscriptions / 9);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}*/
