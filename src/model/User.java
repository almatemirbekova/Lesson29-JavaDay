package model;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Arrays;
import java.util.Scanner;

public class User {
    private  int id;
    private  String email;
    private String firtsname;
    private String passwort;
    private Product[] products;
    private String test;

    public User() {
    }

    public User(int id, String email, String firtsname, String passwort, Product[] products) {
        this.id = id;
        this.email = email;
        this.firtsname = firtsname;
        this.passwort = passwort;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirtsname() {
        return firtsname;
    }

    public void setFirtsname(String firtsname) {
        this.firtsname = firtsname;
    }

    public String getPasswort() {
        return passwort;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }

    public Product[] getProducts() {
        return products;
    }
    User [] users=new User[10];
    int counter=0;

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public void registrasiya(){
        Scanner scannerforint=new Scanner(System.in);
        Scanner scannerforString=new Scanner(System.in);
        User user=new User();
        System.out.println("write id");
        user.setId(scannerforint.nextInt());
        System.out.println("write email");
        user.setEmail(scannerforString.nextLine());
        System.out.println("write firtsname");
        user.setFirtsname(scannerforString.nextLine());
        System.out.println("write password");
        user.setPasswort(scannerforString.nextLine());


        if(counter<  users.length) {
            users[counter++] = user;
            System.out.println("succes");
        }
        else{
            System.out.println("error");

            }
        System.out.println(Arrays.toString(users));
        }
        public void login (){
            Scanner scannerforint=new Scanner(System.in);
            Scanner scannerforString=new Scanner(System.in);
            System.out.println("write email");
            String  email=scannerforString.nextLine();
            String password=scannerforString.nextLine();

            for (int i = 0; i <counter ; i++) {
                if (users[i].getEmail().equals(email)&&users[i].getPasswort().equals(password)) {
                    System.out.println("succes");

                } else{
                    System.out.println("error ");
                }

            }
        }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", firtsname='" + firtsname + '\'' +
                ", passwort='" + passwort + '\'' +
                ", products=" + Arrays.toString(products) +
                '}';
    }
}
