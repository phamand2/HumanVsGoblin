package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Human human = new Human();
        Goblin goblin = new Goblin();

        System.out.println(human);
        System.out.println(goblin);

        System.out.println("================");

        while(human.getHealthPoints() !=0 || goblin.getHealthPoints() != 0){
            human.attack(goblin);
            goblin.attack(human);

            if(goblin.isAlive()){
                System.out.println("Goblin wins");
                break;
            } else if (human.isAlive()){
                System.out.println("Human wins");
                break;
            }
        }


    }
}
