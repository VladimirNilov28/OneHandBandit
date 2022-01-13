/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import entity.Player;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class App {
    Random rand = new Random();
    Player player = new Player();
    Scanner scanner = new Scanner(System.in);
    public App(){
        String repeat = "yes";
        do {
            System.out.println("0. Выход");
            System.out.println("1. Добавить игрока");
            System.out.println("2. Купить попытки");
            System.out.println("3. Играть");
            System.out.println("4. Выигрышь");
            int task = scanner.nextInt(); scanner.nextLine();
            switch (task) {
               case 0:
                   System.out.println("Выход");
                   repeat = "no";
                   break;
               case 1:
                   System.out.print("Имя: ");
                   player.setFirstname(scanner.nextLine());
                   System.out.print("Фамилия: ");
                   player.setLastname(scanner.nextLine());
                   System.out.println("Телефон: ");
                   player.setTelnumber(scanner.nextLine());
                   System.out.println("Денги: ");
                   player.setPlayersMoney(scanner.nextInt());
                   break;
               case 2:
                   System.out.print("Покупка попыток: ");
                   System.out.println("");
                   System.out.println("10 попыток - 10$");
                   System.out.println("");
                   System.out.println("1 - покупать\n 2 - назад");
                   int choise = scanner.nextInt();
                   if (choise == 1){
                       player.setTrys(10);
                       player.setPlayersMoney(player.getPlayersMoney()-10);
                   }
                   break;
               case 3:
                   //1 - 2000$
                   //2 - 20$
                   //3 - 100$
                   //4 - 500$
                   //5 - 50$
                   for (int i = 0; i < player.getTrys() ; i++) {
                        int num1 = rand.nextInt(5);
                        int num2 = rand.nextInt(5);
                        int num3 = rand.nextInt(5);
                        System.out.print(num1 +" "+ num2 +" "+ num3);
                        System.out.println("");
                        if(num1 == num2 & num2 == num3 & num3 == num1){
                            if (num1 == 1){
                                System.out.println("Ты выиграл 1000$!");
                                player.setWonMoney(player.getPlayersMoney()+1000);
                            }
                            if (num1 == 2){
                                System.out.println("Ты выиграл 20$!");
                                player.setWonMoney(player.getPlayersMoney()+20);
                            }
                            if (num1 == 3){
                                System.out.println("Ты выиграл 100$!");
                                player.setWonMoney(player.getPlayersMoney()+100);
                            }
                            if (num1 == 4){
                                System.out.println("Ты выиграл 500$!");
                                player.setWonMoney(player.getPlayersMoney()+500);
                            }
                            if (num1 == 5){
                                System.out.println("Ты выиграл 50$!");
                                player.setWonMoney(player.getPlayersMoney()+50);
                            }
                            System.out.println("Продолжить игру\n1 - да \n2 - нет");
                            choise = scanner.nextInt();
                            if (choise == 2){
                                break;
                            }
                        }
                    }
                   break;
               case 4:
                   System.out.println("Ваш выигрышь");
                   System.out.println(player.getWonMoney()+"$");
                   break;
               default:
                   System.out.println("Выберите номер из списка!");
           }
        } while ("yes".equals(repeat));
        System.out.println("Спасибо за игру ;)");;      
        
        
        
    }

    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
