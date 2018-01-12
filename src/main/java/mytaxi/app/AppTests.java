package mytaxi.app;

public class AppTests {

//    private static ClientDao clientDao = new ClientDaoImpl(new AppDB());
//
//    public static void main(String[] args) throws ClientNotFoundException {
//
//        clientDao.initClientDB(100);
//
//        testCreateClient();
//        testReadAllClients();
//        testFindClientByIdPositive();
//        testFindClientByIdNegative();
//        testFindClientByPhonePositive();
//        testFindClientByPhoneNegative();
//        testUpdateClient();
//        testDeleteClient();
//
//    }
//
//    private static void testCreateClient() {
//
//        try {
//
//            clientDao.create(new Client("Nazar", "+380984518683", "123456789"));
//            clientDao.create(new Client("Kolya", "+380971112233", "987654321"));
//
//            System.out.println("testCreateClient() true");
//
//        } catch (ClientCreateException e) {
//            e.printStackTrace();
//            System.out.println("testCreateClient() false");
//        }
//    }
//
//    private static void testReadAllClients() {
//
//        try {
//            clientDao.readAll().stream().forEach(System.out::println);
//            System.out.println("testReadAllClients() true");
//        } catch (ClientReadAllException e) {
//            e.printStackTrace();
//            System.out.println("testReadAllClients() false");
//        }
//
//    }
//
//    private static void testFindClientByIdPositive() {
//
//        try {
//            System.out.println(clientDao.FindById(27));
//            System.out.println("testFindClientByIdPositive() true");
//        } catch (ClientNotFoundException e) {
//            e.printStackTrace();
//            System.out.println("testFindClientByIdPositive() false");
//        }
//    }
//
//    private static void testFindClientByIdNegative() {
//
//        try {
//            System.out.println(clientDao.FindById(200));
//            System.out.println("testFindClientByIdNegative() false");
//        } catch (ClientNotFoundException e) {
//            e.printStackTrace();
//            System.out.println("testFindClientByIdNegative() true");
//        }
//    }
//
//    private static void testFindClientByPhonePositive() {
//
//        try {
//            System.out.println(clientDao.findByPhone("+380984518683"));
//            System.out.println("testFindClientByPhonePositive() true");
//        } catch (ClientNotFoundException e) {
//            e.printStackTrace();
//            System.out.println("testFindClientByPhonePositive() false");
//        }
//    }
//
//    private static void testFindClientByPhoneNegative() {
//
//        try {
//            System.out.println(clientDao.findByPhone("+380984518681"));
//            System.out.println("testFindClientByPhoneNegative() false");
//        } catch (ClientNotFoundException e) {
//            e.printStackTrace();
//            System.out.println("testFindClientByPhoneNegative() true");
//        }
//
//    }
//
//    private static void testUpdateClient() {
//
//        try {
//            clientDao.update("123456789");
//            System.out.println("testUpdateClient() true");
//            System.out.println(clientDao.FindById(100));
//        } catch (ClientNotFoundException e) {
//            e.printStackTrace();
//            System.out.println("testUpdateClient() false");
//        }
//
//    }
//
//    private static void testDeleteClient() {
//
//        try {
//            clientDao.delete("0000000000");
//            System.out.println("testDeleteClient() true");
//            testReadAllClients();
//        } catch (ClientNotFoundException e) {
//            e.printStackTrace();
//            System.out.println("testDeleteClient() false");
//        }
//
//    }
}
