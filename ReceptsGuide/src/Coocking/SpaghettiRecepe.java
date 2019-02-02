package Coocking;

import java.util.ArrayList;

public class SpaghettiRecepe implements Recepe {
	
	private ArrayList<String> recipeSteps=new ArrayList<String>();

	private ArrayList<String> recipeProducts=new ArrayList<String>();

	private ArrayList<String> recipeImagePath=new ArrayList<String>();
	
	public SpaghettiRecepe(){
		recipeSteps.add("1.Спагетите се варят в подсолена вода, когато са готови,\n се отцеждат.");
		recipeSteps.add("2.В тенджерка се запържва лукът до златисто,\n после се добавя каймата и се натрошава.");
		recipeSteps.add("3.Добавят се подправките и се бърка.");
		recipeSteps.add("4.После доматите се обелват и се настъргват при каймата.\n Бърка се и се вари, докато не се сгъсти.");
		recipeSteps.add("5.Сосът се излива при спагетите.");
		
		recipeProducts.add("спагети - 1 пакет");
		recipeProducts.add("кайма - 250 г");
		recipeProducts.add("лук - 1 глава");
		recipeProducts.add("домати - 2 бр.");
		recipeProducts.add("червен пипер");
		recipeProducts.add("черен пипер");
		recipeProducts.add("риган");
		recipeProducts.add("босилек");
		recipeProducts.add("сол");
		
		recipeImagePath.add("/Step1 Spaghetti.jpg");
		recipeImagePath.add("/Step2 Spaghetti.jpg");
		recipeImagePath.add("/Step3 Spaghetti.jpg");
		recipeImagePath.add("/Step4 Spaghetti.jpg");
		recipeImagePath.add("/Step5 Spaghetti.jpg");
		
	}
		@Override
		public  ArrayList<String> getStrps() {
			return recipeSteps;
		}

		@Override
		public ArrayList<String> getListWithProducts() {
			return recipeProducts;
		}
		@Override
		public ArrayList<String> getListImagePath() {		
			return recipeImagePath;
		}
}
