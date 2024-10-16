public class Customer {
    private String name;
    private String surname;
    private String birhtdate;


    public void Customer() {

    }

    public void Customer(String name, String surname, Date birthday){
   this.name=name;
   this.surname=surname;
   this.birhtdate=birhtdate;
    }

    public String getBirhtdate() {
        return birhtdate;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }
}