package pl.sda.database;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.BootstrapServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import javax.imageio.spi.ServiceRegistry;

public class SessionProvider {
    //    private static SessionFactory sessionFactory;
//    private static ServiceRegistry serviceRegistry;
//
//    public static SessionFactory createSessionFactory() {
//        Configuration configuration = new Configuration();
//        configuration.configure();
//        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().appSetting(
//                configuration.getProperties()). buildServiceRegistry();
//        sessionFactory = configuration.buildSessionFactory((org.hibernate.service.ServiceRegistry) serviceRegistry);
//        return sessionFactory;
//    }
//}
    private static final SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    private SessionProvider() {
    }

    public static Session getSession() {

        return sessionFactory.openSession();
    }
}

