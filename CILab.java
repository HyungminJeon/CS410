
public class CILab implements CILabInterface {
    private String myString;

    
    @Override
    public String getString() {
        return myString;
    }
    
    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
    	
    	boolean detect = false;
    	String word = getString();
    	int count=0;
    	for(int i = 0; i < word.length(); i++) {
    		if(Character.isUpperCase(word.charAt(i))) {
    			count++;
    		}
    	}
    	if (count == word.length() || count == 0 || count == 1 && Character.isUpperCase(word.charAt(0))) {
    		detect = true;
    	}
        return detect;
    }

}

