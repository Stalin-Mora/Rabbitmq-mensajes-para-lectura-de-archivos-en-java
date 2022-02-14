/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rabbit;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.MessageProperties;
import java.io.File;
import java.util.Scanner;
import static rabbit.leer.findAllFilesInFolder;

public class nuevatarea {

     private static final String TASK_QUEUE_NAME = "task_queue";
     
  public static void main(String[] argv) throws Exception {
      
      String mensaje="";
      Scanner sca=new Scanner(System.in);
      System.out.println("Ingrese nombre de la carpeta");  
      String carpeta=sca.next();
      
      
    ConnectionFactory factory = new ConnectionFactory();
    factory.setHost("localhost");
    try (Connection connection = factory.newConnection();
         Channel channel = connection.createChannel()) {
        channel.queueDeclare(TASK_QUEUE_NAME, true, false, false, null);

        String message =carpeta;

        channel.basicPublish("", TASK_QUEUE_NAME,
                MessageProperties.PERSISTENT_TEXT_PLAIN,
                message.getBytes("UTF-8"));
        System.out.println(" [x] Enviado nombre de carpeta: '" + message + "'");
    }
  }

}
