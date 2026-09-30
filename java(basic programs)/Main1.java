interface Bird{
	public void fly();
	public void makesound();
}
class Sparrow implements Bird{
		public void fly(){
			System.out.println("flying");
		}
		public void makesound(){
			System.out.println("chi chi");
		}
}
interface ToyDuck{
	public void squack();
}
class PlasticToyDuck implements ToyDuck{
	public void squack()
	{
		System.out.println("squack");
	}
}
class BirdAdapter implements ToyDuck{
	Bird bird;
	BirdAdapter(Bird bird)
	{
		this.bird=bird;
	}
	public void squack(){
		bird.makesound();
	}
}
class Main1{
	public static void main(String[] args)
	{
		Sparrow sparrow;
		PlasticToyDuck plasticToyDuck;
		ToyDuck birdAdapter;
		sparrow=new Sparrow();
		plasticToyDuck=new PlasticToyDuck();
		birdAdapter=new BirdAdapter(sparrow);
		System.out.println("sparroe");
		sparrow.fly();
		sparrow.makesound();
		System.out.println("ToyDuck");
		plasticToyDuck.squack();
		System.out.println("birs");
		birdAdapter.squack();
	}
}
		
		