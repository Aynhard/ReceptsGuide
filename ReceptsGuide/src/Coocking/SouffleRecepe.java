package Coocking;

import java.util.ArrayList;

public class SouffleRecepe implements Recepe {

	private ArrayList<String> recipeSteps=new ArrayList<String>();

	private ArrayList<String> recipeProducts=new ArrayList<String>();
	
	private ArrayList<String> recipeImagePath=new ArrayList<String>();
	
	public SouffleRecepe(){
		recipeSteps.add("1.��������� �� ������� � ��������� �� ����� ����,\n ������ � �������.");
		recipeSteps.add("2.������ �� �������� �� ����������.");
		recipeSteps.add("3.������� �� ������������ ����,� ���� ���� �������� \n � �������.������ �������� ������ �� �� ������ �����.");
		recipeSteps.add("4.���������� �� ����� �� ��������� \n � �� ������ ��� ������.");
		recipeSteps.add("5.����� �� ����� 10 ������� � ������������� \n ������� ����� �� 220 �������.");
		
		recipeProducts.add("��������� ������� - 200 �");
		recipeProducts.add("����� - 200 � ");
		recipeProducts.add("���� - 7 ��.");
		recipeProducts.add("����� - 270 � ");
		recipeProducts.add("������ - 125 � ");
		recipeProducts.add("��������� ����� 50 � ");
		recipeProducts.add("������� �� �������");
		
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
