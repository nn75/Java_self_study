package com.company;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");


    public static void main(String[] args) {
        //GearBox example:
//        GearBox mcLeran = new GearBox(6);
//
//        mcLeran.operateClutch(true);
//        mcLeran.changeGear(1);
//        mcLeran.operateClutch(false);
//        System.out.println("" + mcLeran.wheelSpeed(1000));
//
//        mcLeran.changeGear(2);
//        System.out.println(mcLeran.wheelSpeed(3000));
//
//        mcLeran.operateClutch(true);
//        mcLeran.changeGear(3);
//        mcLeran.operateClutch(false);
//        System.out.println("" + mcLeran.wheelSpeed(6000));


        //Button example:
//        class ClickListener implements Button.OnClickListener {
//            public ClickListener() {
//                System.out.println("I've been attached");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked.");
//            }
//        }
//
//        btnPrint.setOnClickListener(new ClickListener());

        //Anonymous class example:
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked.");
            }
        });
        listen();
    }

    private static void listen() {
        boolean quit = false;
        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}

