public class Main {
    public static void main(String[] args) {
//        DatabaseLogger databaseLogger = new DatabaseLogger();
//        databaseLogger.log("iyimin");
//        BaseLogger[] loggers = new BaseLogger[]{new DatabaseLogger(),new EmailLogger(),new FileLogger(),new ConsoleLogger()};
//        for (BaseLogger logger:loggers){
//            logger.log("log mesajı");
//        }
        CustomerManager customerManager =new CustomerManager(new DatabaseLogger());
        customerManager.add();




    }
}