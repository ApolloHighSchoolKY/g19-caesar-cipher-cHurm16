/**
 * @(#)CaesarCipher.java
 *
 *
 * @author
 * @version 1.00 2025/2/20
 */


public class CaesarCipher {

	private char[] alphabet ('a','b','c','d','e','f','g','h','i','j','k','l','m','n',
    'o','p','q','r','s','t','u','v','w','x','y','z');
	private char[] shifted;
	private int shift;

    public CaesarCipher() 
    {
        
        shifter(1);

    }

    public CaesarCipher(int num)
    {

        shifter(num);

    }

    public String encrypt(String message){
        String encrypted = "";

        for(int i=0; i<message.length(); i++)
        {
            char letter = message.charAt(i);
            for(int spot=0; spot<alaphbet.length; spot++)
            {
                if(letter==alaphbet[spot])
                {
                    encrypted += "" + shifted[spot];
                }
            }
        }

        return "";
    }

    public String decrypt(String message){

    }

    public void shifter(int num){


        shifted[i+shift%26]=alaphbet[i];
    }


}
