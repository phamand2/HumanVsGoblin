package com.company;

public class Humanoid {
    private String name;
    private int healthPoints;
    private String ability;
    private int strength;
    private int hitPoints;


    public Humanoid(String name,int hitPoints, String ability, int strength, int healthPoints) {
        this.hitPoints = hitPoints;
        this.ability = ability;
        this.strength = strength;
        this.healthPoints = healthPoints;
        this.name = name;
    }

    public boolean isAlive(){
        return this.healthPoints > 0;
    }


    public boolean attack(Humanoid enemy){
        if(!this.isAlive()){
            System.out.println(this.getName() + " is dead.");
            return false;
        }

        enemy.setHealthPoints(enemy.getHealthPoints() - this.hitPoints);
        System.out.println(this.name + " attack damage for " + this.hitPoints);
        System.out.println("Remaining health for " + enemy.getName() + " " + enemy.getHealthPoints());
        return true;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
        return healthPoints;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    @Override
    public String toString() {
        return "Humanoid{" +
                "name='" + name + '\'' +
                ", healthPoints=" + healthPoints +
                ", ability='" + ability + '\'' +
                ", strength=" + strength +
                ", hitPoints=" + hitPoints +
                '}';
    }
}


