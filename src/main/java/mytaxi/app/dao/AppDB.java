package mytaxi.app.dao;

import mytaxi.app.exceptions.ClientNotFoundException;
import mytaxi.app.model.Car;
import mytaxi.app.model.Client;
import mytaxi.app.model.Driver;
import mytaxi.app.model.Order;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class AppDB implements ClientDao {

    private static long id;
    private List<Client> clients;
    private List<Order> orders;
    private List<Driver> drivers;
    private List<Car> cars;

    public AppDB() {
        clients = new ArrayList<>();
        orders = new ArrayList<>();
        drivers = new ArrayList<>();
        cars = new ArrayList<>();
    }

    public void initClients(int number){

        final String[] NAMES = {"Nazar","Serhii","Andrii","Artem","Alyona","Koly",
                          "Vasil","Oleg","Igor","Stepan","Ira","Olya","Anna",
                          "Volodya","Slavik","Lyubov","Olesia","Antonina",
                          "Valentyna","Zhanna","Oksana","Anton"};

        for (int i = 0; i < number; i++) {

            String name = NAMES[new Random().nextInt(NAMES.length)];
            String phone = new StringBuilder().append("+380").append(new Random().nextInt(900000000+1)+100000000).toString();

            StringBuilder password = new StringBuilder();
            for (int j = 0; j <10 ; j++) {
                password.append((char)(new Random().nextInt((122 - 48) + 1) + 48));
            }

            Client client = new Client(name,phone,password.toString());
            client.setId(this.getId());
               clients.add(client);
        }
    }
    public long getId() {
        return id++;
    }
    public void setId(long id) {
        this.id = id;
    }
    public List<Client> getClients() {
        return clients;
    }
    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
    public List<Order> getOrders() {
        return orders;
    }
    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
    public List<Driver> getDrivers() {
        return drivers;
    }
    public void setDrivers(List<Driver> drivers) {
        this.drivers = drivers;
    }
    public List<Car> getCars() {
        return cars;
    }
    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public Client create(Client client) {
        client.setId(getId());
        clients.add(client);
        return client;
    }
    @Override
    public List<Client> readAll() {
        return clients;
    }
    @Override
    public Client update(String password) throws ClientNotFoundException {

        Client found = clients.stream()
                              .filter(p->p.getPassword().equals(password))
                              .findFirst()
                              .get();

        if (found == null){
            throw new ClientNotFoundException("Couldn't find client by password!");
        }

        found.setName("Rocky");
        found.setPhone("+380999999999");
        found.setPassword("0000000000");

        return found;
    }
    @Override
    public void delete(String password) throws ClientNotFoundException {

        Client found = clients.stream()
                              .filter(p->p.getPassword().equals(password))
                              .findFirst()
                              .get();

        if (found == null){
            throw new ClientNotFoundException("Couldn't find client by password!");
        }

        clients.remove(found);
    }
    @Override
    public Client findByPhone(String phone) throws ClientNotFoundException {

        Client found = clients.stream()
                              .filter(p->p.getPhone().equals(phone))
                              .findFirst()
                              .get();

        if (found == null){
            throw new ClientNotFoundException("Couldn't find client by phone!");
        }

        return found;
    }
    @Override
    public Client FindById(long id) throws ClientNotFoundException {

        Client found = clients.stream()
                              .filter(i->i.getId()==id)
                              .findFirst()
                              .get();

        if (found == null){
            throw new ClientNotFoundException("Couldn't find client by id!");
        }

        return found;
    }
    @Override
    public void initClientDB(int number) {
        initClients(number);
    }
}
