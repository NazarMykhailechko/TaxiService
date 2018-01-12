package mytaxi.app.controller;

import com.sun.javafx.sg.prism.NGShape;
import mytaxi.app.dao.ClientDao;
import mytaxi.app.exceptions.*;
import mytaxi.app.model.Address;
import mytaxi.app.model.Client;
import mytaxi.app.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RequestMapping("/")
//@Component
public class ClientServiceImpl implements ClientService{

        //@Autowired
        ClientDao clientDao;

    public ClientServiceImpl() {
    }

    public ClientServiceImpl(ClientDao clientDao) {
        this.clientDao = clientDao;
    }

    @Override
    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String register(@RequestParam(value = "name")String name,
                           @RequestParam(value = "phone")String phone,
                           @RequestParam(value = "password")String password) throws ClientCreateException {

        System.out.println("name " + name + " phone " + phone + " password " + password);

         //Client c =  clientDao.create(new Client(name,phone,password));
        //System.out.println(c);
        //return clientDao.create(new Client(name,phone,password));
        return "/invitation";
    }

    @Override
    @RequestMapping("/enter")
    public Client login(@RequestParam(value = "phone")String phone,
                        @RequestParam(value = "password")String password) throws LoginException, ClientNotFoundException {

           System.out.println("phone " + phone + " password " + password);

           Client found = clientDao.findByPhone(phone);

           if(found!=null && found.getPassword().equals(password)){
              return found;
           }
           else{
            throw new LoginException("Login or password is incorrect!");
           }
    }

    @Override
    public Order makeOrder(Address from, Address to) throws MakeOrderException {

        return null;
    }

    @Override
    public Order submitOrder(Order order) throws SubmitException {
        return null;
    }

    @Override
    public Order getOrderInfo(long orderId) throws GetOrderInfoException {
        return null;
    }

    @Override
    public String cancelOrder(long orderId) throws CancelOrderException {
        return null;
    }
}
