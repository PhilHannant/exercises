public class HashUtilities{

		public static int shortHash(int intIn){
			intIn = Math.abs(intIn);
			int intOut = intIn % 1000;
			return intOut;
		
		}
		public static void main(String[] args){
				System.out.println("Give me a string and I will calculate its hash code");
				String str = System.console().readLine();
				int hash = str.hashCode();
				int smallHash = HashUtilities.shortHash(hash);
				System.out.println("0 < " + smallHash + " < 1000");
			
		}


}
