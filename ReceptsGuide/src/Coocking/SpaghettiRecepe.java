package Coocking;

import java.util.ArrayList;

public class SpaghettiRecepe implements Recepe {
	
	private ArrayList<String> recipeSteps=new ArrayList<String>();

	private ArrayList<String> recipeProducts=new ArrayList<String>();

	private ArrayList<String> recipeImagePath=new ArrayList<String>();
	
	public SpaghettiRecepe(){
		recipeSteps.add("1.��������� �� ����� � ��������� ����, ������ �� ������,\n �� ��������.");
		recipeSteps.add("2.� ��������� �� �������� ����� �� ��������,\n ����� �� ������ ������� � �� ���������.");
		recipeSteps.add("3.������� �� ����������� � �� �����.");
		recipeSteps.add("4.����� �������� �� ������� � �� ���������� ��� �������.\n ����� �� � �� ����, ������ �� �� ������.");
		recipeSteps.add("5.����� �� ������ ��� ���������.");
		
		recipeProducts.add("������� - 1 �����");
		recipeProducts.add("����� - 250 �");
		recipeProducts.add("��� - 1 �����");
		recipeProducts.add("������ - 2 ��.");
		recipeProducts.add("������ �����");
		recipeProducts.add("����� �����");
		recipeProducts.add("�����");
		recipeProducts.add("�������");
		recipeProducts.add("���");
		
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
