package Coocking;

import java.util.ArrayList;

public class SouffleRecepe implements Recepe {

	private ArrayList<String> recipeSteps=new ArrayList<String>();

	private ArrayList<String> recipeProducts=new ArrayList<String>();
	
	private ArrayList<String> recipeImagePath=new ArrayList<String>();
	
	public SouffleRecepe(){
		recipeSteps.add("1.Шоколадът се нарязва и разтопява на водна баня,\n заедно с маслото.");
		recipeSteps.add("2.Яйцата се разбиват до побеляване.");
		recipeSteps.add("3.Прибавя се шоколадовата смес,а след това брашното \n и какаото.Всички съставки трябва да се смесят добре.");
		recipeSteps.add("4.Формичките за суфле се намсляват \n и се пълнят със сместа.");
		recipeSteps.add("5.Пекат се около 10 минунти в предватирелно \n загрята фурна на 220 градуса.");
		
		recipeProducts.add("натурален шоколад - 200 г");
		recipeProducts.add("масло - 200 г ");
		recipeProducts.add("яйца - 7 бр.");
		recipeProducts.add("захар - 270 г ");
		recipeProducts.add("брашно - 125 г ");
		recipeProducts.add("натурално какао 50 г ");
		recipeProducts.add("мазнина за формите");
		
		recipeImagePath.add("/Step1 Souffle.jpg");
		recipeImagePath.add("/Step2 Souffle.jpg");
		recipeImagePath.add("/Step3 Souffle.jpg");
		recipeImagePath.add("/Step4 Souffle.jpg");
		recipeImagePath.add("/Step5 Souffle.jpg");
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
