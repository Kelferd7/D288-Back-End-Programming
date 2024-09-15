package com.example.demo.bootstrap;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.dao.DivisionRepository;
import com.example.demo.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class BootStrapData implements CommandLineRunner {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private DivisionRepository divisionRepository;

    @Override
    public void run(String...args) throws Exception{

        if(customerRepository.count() == 1) {

            Customer customer1 = new Customer();
            customer1.setFirstName("Kelley");
            customer1.setLastName("Buhlig");
            customer1.setPostal_code("73160");
            customer1.setAddress("111 Street");
            customer1.setPhone("(555)555-1111");
            customer1.setDivision(divisionRepository.findAll().get(1));
            customer1.setCreate_date(new Date());
            customer1.setLast_update(new Date());

            Customer customer2 = new Customer();
            customer2.setFirstName("Cherokee");
            customer2.setLastName("Buhlig");
            customer2.setPostal_code("73160");
            customer2.setAddress("222 Street");
            customer2.setPhone("(555)555-2222");
            customer2.setDivision(divisionRepository.findAll().get(2));
            customer2.setCreate_date(new Date());
            customer2.setLast_update(new Date());

            Customer customer3 = new Customer();
            customer3.setFirstName("Jescey");
            customer3.setLastName("Buhlig");
            customer3.setPostal_code("73160");
            customer3.setAddress("333 Street");
            customer3.setPhone("(555)555-3333");
            customer3.setDivision(divisionRepository.findAll().get(3));
            customer3.setCreate_date(new Date());
            customer3.setLast_update(new Date());

            Customer customer4 = new Customer();
            customer4.setFirstName("Olive");
            customer4.setLastName("Buhlig");
            customer4.setPostal_code("73160");
            customer4.setAddress("444 Street");
            customer4.setPhone("(555)555-4444");
            customer4.setDivision(divisionRepository.findAll().get(4));
            customer4.setCreate_date(new Date());
            customer4.setLast_update(new Date());

            Customer customer5 = new Customer();
            customer5.setFirstName("Scarlet");
            customer5.setLastName("Buhlig");
            customer5.setPostal_code("73160");
            customer5.setAddress("555 Street");
            customer5.setPhone("(555)555-5555");
            customer5.setDivision(divisionRepository.findAll().get(5));
            customer5.setCreate_date(new Date());
            customer5.setLast_update(new Date());

            customerRepository.save(customer1);
            customerRepository.save(customer2);
            customerRepository.save(customer3);
            customerRepository.save(customer4);
            customerRepository.save(customer5);

            System.out.println("Sample customers added!");
        }else {
            System.out.println("Sample customers already exist!");
        }
    }
}

