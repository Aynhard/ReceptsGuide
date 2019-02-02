package Coocking;

public class ChoiceRecepe {
	
	public Recepe recipe;
	public ChoiceRecepe(){
		 this.recipe=null;
		}
	public ChoiceRecepe(Recepe recipe){
	 this.recipe=recipe;
	}
		public String getStep(int step){
			return recipe.getStrps().get(step);
		}
		public String getImagePath(int step){
			return recipe.getListImagePath().get(step);
		}

}
