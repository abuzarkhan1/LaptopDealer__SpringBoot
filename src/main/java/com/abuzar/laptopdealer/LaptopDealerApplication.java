package com.abuzar.laptopdealer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

//@SpringBootApplication
public class LaptopDealerApplication {

    public static void main(String[] args) {
//        SpringApplication.run(LaptopDealerApplication.class, args);


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the laptop you want to buy:\n Dell \n Macbook \n Lenovo");

        int userBrandSelect = scanner.nextInt();
        System.out.println("Choose The Processor You Want: \n i3 \n i5 \n i7");

        int userProcessorSelect = scanner.nextInt();

        String beanId = "";

        switch (userBrandSelect) {

            case 1:
                switch (userProcessorSelect) {

                    case 1:
                        beanId = "dellWithi3";
                        break;
                    case 2:
                        beanId="dellWithi5";
                        break;
                    case 3:
                        beanId="dellWithi7";
                        break;
                }
                break;

            case 2:
                switch (userProcessorSelect) {

                    case 1:
                        beanId = "macbookWithi3";
                        break;
                    case 2:
                        beanId="macbookWithi5";
                        break;
                    case 3:
                        beanId="macbookWithi7";
                        break;
                }
                break;

            case 3:
                switch (userProcessorSelect) {

                    case 1:
                        beanId = "lenovoWithi3";
                        break;
                    case 2:
                        beanId="lenovoWithi5";
                        break;
                    case 3:
                        beanId="lenovoWithi7";
                        break;
                }
                break;

            default:
                System.out.println("Invalid selection. Please try again.");
        }

        Brand brand = (Brand) context.getBean(beanId);
        brand.showDetails();


    }

}
