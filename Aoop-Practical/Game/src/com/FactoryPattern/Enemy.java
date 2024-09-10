package com.FactoryPattern;

public abstract class Enemy {
	public abstract void attack();
	}

	class EasyEnemy extends Enemy {
	    public void attack() {
	        System.out.println("Easy enemy attacks with minimal damage.");
	    }
	}

	class MediumEnemy extends Enemy {
	    public void attack() {
	        System.out.println("Medium enemy attacks with moderate damage.");
	    }
	}

	class HardEnemy extends Enemy {
	    public void attack() {
	        System.out.println("Hard enemy attacks with severe damage.");
	    }
	}

	class EnemyFactory {
	    public static Enemy createEnemy(String difficulty) {
	        switch (difficulty) {
	            case "Easy":
	                return new EasyEnemy();
	            case "Medium":
	                return new MediumEnemy();
	            case "Hard":
	                return new HardEnemy();
	            default:
	                throw new IllegalArgumentException("Invalid difficulty");
	        }
	    }

}
