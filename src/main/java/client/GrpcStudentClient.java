package client;



import com.students_information.stubs.student.StudentRequest;
import com.students_information.stubs.student.StudentResponse;
import com.students_information.stubs.student.StudentServiceGrpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcStudentClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9005)
          .usePlaintext()
          .build();

        StudentServiceGrpc.StudentServiceBlockingStub stub 
          =  StudentServiceGrpc.newBlockingStub(channel);

        StudentResponse helloResponse = stub.getStudentInfo(StudentRequest.newBuilder()
          .setStudentId("st3")
          .build());
        System.out.println("Response received from server:\n" + helloResponse);
        channel.shutdown();
    }
}