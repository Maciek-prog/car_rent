package pl.sda.database;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class SessionProvider {
        private static final SessionProvider sessionProvider = (SessionProvider) new Configuration().configure().buildSessionFactory();
    private static Session session;

    private SessionProvider(){
        }

    public static SessionProvider getSessionProvider() {
        return sessionProvider;
    }

    public static Session getSession() {
        return session;
    }

    public static void setSession(Session session) {
        SessionProvider.session = session;
    }
}
