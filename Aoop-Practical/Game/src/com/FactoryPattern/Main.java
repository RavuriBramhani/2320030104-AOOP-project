package com.FactoryPattern;

public class Main {

	public static void main(String[] args) {
		Game gameState = Game.getInstance();

        gameState.setDifficulty("Medium");

        Enemy enemy = EnemyFactory.createEnemy(gameState.getDifficulty());
        enemy.attack();

        GameItemFactory itemFactory = GameItemFactoryProvider.getFactory(gameState.getDifficulty());

        Weapon weapon = itemFactory.createWeapon();
        PowerUp powerUp = itemFactory.createPowerUp();

        weapon.use();
        powerUp.apply();

        gameState.addScore(500);
        gameState.nextLevel();

        gameState.setDifficulty("Hard");

        Enemy harderEnemy = EnemyFactory.createEnemy(gameState.getDifficulty());
        harderEnemy.attack();

        GameItemFactory harderItemFactory = GameItemFactoryProvider.getFactory(gameState.getDifficulty());

        Weapon harderWeapon = harderItemFactory.createWeapon();
        PowerUp harderPowerUp = harderItemFactory.createPowerUp();

        harderWeapon.use();
        harderPowerUp.apply();

	}

}
