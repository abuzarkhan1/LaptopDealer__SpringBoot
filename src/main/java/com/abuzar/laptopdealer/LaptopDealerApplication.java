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
                beanId = switch (userProcessorSelect) {
                    case 1 -> "dellWithi3";
                    case 2 -> "dellWithi5";
                    case 3 -> "dellWithi7";
                    default -> beanId;
                };
                break;

            case 2:
                beanId = switch (userProcessorSelect) {
                    case 1 -> "macbookWithi3";
                    case 2 -> "macbookWithi5";
                    case 3 -> "macbookWithi7";
                    default -> beanId;
                };
                break;

            case 3:
                beanId = switch (userProcessorSelect) {
                    case 1 -> "lenovoWithi3";
                    case 2 -> "lenovoWithi5";
                    case 3 -> "lenovoWithi7";
                    default -> beanId;
                };
                break;

            default:
                System.out.println("Invalid selection. Please try again.");
        }

        Brand brand = (Brand) context.getBean(beanId);
        brand.showDetails();


    }

}
