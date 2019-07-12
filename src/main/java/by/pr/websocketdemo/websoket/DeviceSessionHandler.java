package by.pr.websocketdemo.websoket;

import by.pr.websocketdemo.model.Device;

import javax.enterprise.context.ApplicationScoped;
import javax.websocket.Session;
import java.util.HashSet;
import java.util.Set;

@ApplicationScoped
public class DeviceSessionHandler {

    private final Set<Session> sessions = new HashSet<>();
    private final Set<Device> devices = new HashSet<>();

    public void addSession(Session session) {
        sessions.add(session);
    }

    public void removeSession(Session session) {
        sessions.remove(session);
    }
}
