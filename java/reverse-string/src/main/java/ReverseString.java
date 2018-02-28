class ReverseString {

	/**
	 * Reverses the 
	 * @param  inputString [description]
	 * @return             [description]
	 */
    String reverse(String inputString) {
    	String newString = "";
    	char currChar = 'x';
    	for(int i = inputString.length() - 1; i >= 0; i--){
    		currChar = inputString.charAt(i);
    		newString += currChar;
		}
		return newString;
    }

    public static void main(String[] args) {
    	ReverseString test = new ReverseString();
    	String one = "hello";
    	System.out.println(test.reverse(one));
    }
}
  
