// 4. Write a java program to calculate simple interest, get the required inputs from command line ?
//    SI = (principal * rate * years)/100

   class SimpleInterest{
   	public static void main(String[] args) {
   		float s;
   		float p = Float.parseFloat(args[0]);
   		float r = Float.parseFloat(args[1]);
   		float y = Float.parseFloat(args[2]);

   		s = (p * r * y) / 100;
   		System.out.println("Simple Interest = " + s);
   	}
   }
