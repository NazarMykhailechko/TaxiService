package main.java.mytaxi.app.dao;

import main.java.mytaxi.app.exceptions.ClientCreateException;
import main.java.mytaxi.app.exceptions.ClientNotFoundException;
import main.java.mytaxi.app.exceptions.ClientReadAllException;
import main.java.mytaxi.app.model.Client;

import java.util.List;


public interface ClientDao {

    Client create(Client client) throws ClientCreateException;
    List<Client> readAll() throws ClientReadAllException;
    Client update(String password) throws ClientNotFoundException;
    void delete(String password) throws ClientNotFoundException;
    Client findByPhone(String phone) throws ClientNotFoundException;
    Client FindById(long id) throws ClientNotFoundException;
    void initClientDB(int number);

}
