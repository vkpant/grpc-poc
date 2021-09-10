package server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import service.StudentServiceImpl;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentServer {
    // Let's use a logger to log everything that we want
    private static final Logger logger = Logger.getLogger(ResultServer.class.getName());

    // The good old main method is defined here :)
    public static void main(String[] args) {
        Server server = ServerBuilder.forPort(9005)
                .addService(new StudentServiceImpl())
                .build();

        try {
            server.start();
            logger.log(Level.INFO, "STUDENT SERVER STARTED ON PORT 9005");
            server.awaitTermination();
        } catch (IOException e) {
            logger.log(Level.SEVERE, "STUDENT SERVER DID NOT START");
        } catch (InterruptedException e) {
            logger.log(Level.SEVERE, "SERVER SHUT DOWN ON INTERRUPTED");
        }

    }
}
