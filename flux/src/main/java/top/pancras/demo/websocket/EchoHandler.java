package top.pancras.demo.websocket;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.socket.WebSocketHandler;
import org.springframework.web.reactive.socket.WebSocketSession;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * Created by pancras on 2018/5/8 0008.
 */
@Component
public class EchoHandler implements WebSocketHandler{
    @Override
    public Mono<Void> handle(WebSocketSession session) {
        return session.send(
                session.receive()
                    .map(msg -> session.textMessage("ECHO -> " + msg.getPayloadAsText()))
        );
    }
}
