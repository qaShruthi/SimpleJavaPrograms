package simplejava;

public class RemoveJunkorSpecialCharacters {

	public static void main(String[] args) {
//Remove Special Characters
		String s = "! @ # $ % ^ & * ( )- _ = + \\ | [ ] { } ; : / ? . > huell sshdj be finene";
        // using regular expression
		s=s.replaceAll("[^a-zA-Z0-9]", "");
System.out.println("Without special characters: " + s);


//Remove White spaces
String s1 = "java      Progammign Selenium    automarit";
s1 = s1.replaceAll("\\s", "");
System.out.println("After removing white spaces " + s1);
	}

}
