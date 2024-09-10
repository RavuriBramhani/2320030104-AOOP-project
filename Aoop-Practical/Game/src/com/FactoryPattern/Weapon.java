package com.FactoryPattern;

public abstract class Weapon {
	public abstract void use();
	}

	abstract class PowerUp {
	    public abstract void apply();
	}

	class EasyWeapon extends Weapon {
	    public void use() {
	        System.out.println("Using a basic weapon.");
	    }
	}

	class MediumWeapon extends Weapon {
	    public void use() {
	        System.out.println("Using an advanced weapon.");
	    }
	}

	class HardWeapon extends Weapon {
	    public void use() {
	        System.out.println("Using an expert weapon.");
	    }
	}

	class EasyPowerUp extends PowerUp {
	    public void apply() {
	        System.out.println("Applying a basic power-up.");
	    }
	}

	class MediumPowerUp extends PowerUp {
	    public void apply() {
	        System.out.println("Applying an advanced power-up.");
	    }
	}

	class HardPowerUp extends PowerUp {
	    public void apply() {
	        System.out.println("Applying an expert power-up.");
	    }
	}

	interface GameItemFactory {
	    Weapon createWeapon();
	    PowerUp createPowerUp();
	}
	
	class EasyItemFactory implements GameItemFactory {
	    public Weapon createWeapon() {
	        return new EasyWeapon();
	    }
	    public PowerUp createPowerUp() {
	        return new EasyPowerUp();
	    }
	}

	class MediumItemFactory implements GameItemFactory {
	    public Weapon createWeapon() {
	        return new MediumWeapon();
	    }
	    public PowerUp createPowerUp() {
	        return new MediumPowerUp();
	    }
	}

	class HardItemFactory implements GameItemFactory {
	    public Weapon createWeapon() {
	        return new HardWeapon();
	    }

	    public PowerUp createPowerUp() {
	        return new HardPowerUp();
	    }
	}

	class GameItemFactoryProvider {
	    public static GameItemFactory getFactory(String difficulty) {
	        switch (difficulty) {
	            case "Easy":
	            	  return new EasyItemFactory();
	            case "Medium":
	                return new MediumItemFactory();
	            case "Hard":
	                return new HardItemFactory();
	            default:
	                throw new IllegalArgumentException("Invalid difficulty");
	        }
	    }

}
