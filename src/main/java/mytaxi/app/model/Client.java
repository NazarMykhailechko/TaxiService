package mytaxi.app.model;

public class Client {

     private long id;
     private String name;
     private String phone;
     private String password;

    public Client() {
    }

    public Client(String name, String phone) {

        this.name = name;
        this.phone = phone;
    }

    public Client(String name, String phone, String password) {
        this.name = name;
        this.phone = phone;
        this.password = password;
        //this.setId(id++);
        //System.out.println(getId());
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
