import com.rabbitmq.client.*;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by lin on 2017/2/4.
 */
public class RabbitTest {
    private final static String QUEUE_NAME = "hello";
    Logger logger= Logger.getLogger(getClass());

    @Test
    public void testMq(){
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("127.0.0.1");
        factory.setPort(15672);
        factory.setUsername("lindl");
        factory.setPassword("passwd");
        factory.setVirtualHost("vhost");

        try {
            logger.info("=======newConnection======");
            Connection connection = factory.newConnection();
            logger.info("========createChannel================");
            Channel channel = connection.createChannel();

            channel.queueDeclare(QUEUE_NAME, false, false, false, null);
            String message = "Hello World!";
            channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
            System.out.println(" [x] Sent '" + message + "'");


            //DefaultConsumer类实现了Consumer接口，通过传入一个频道，
            // 告诉服务器我们需要那个频道的消息，如果频道中有消息，就会执行回调函数handleDelivery
            Consumer consumer = new DefaultConsumer(channel) {
                @Override
                public void handleDelivery(String consumerTag, Envelope envelope,
                                           AMQP.BasicProperties properties, byte[] body)
                        throws IOException {
                    String mes = new String(body, "UTF-8");
                    System.out.println("Customer Received '" + mes + "'");
                }
            };
            //自动回复队列应答 -- RabbitMQ中的消息确认机制
            channel.basicConsume(QUEUE_NAME, true, consumer);



            channel.close();
            connection.close();
        }catch (Exception e){
            logger.info(e);
        }finally {
            logger.info("====finally=====");
        }

    }
}
