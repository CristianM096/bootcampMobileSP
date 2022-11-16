/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bootcampmobilesp;

/**
 *
 * @author Crist
 */
public class Challenge1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(generateRandom("TipoA"));
        System.out.println(generateRandom("TipoB"));
        System.out.println(generateRandom("TipoC"));
        
    }
    
    public static String generateRandom(String type){
        /**
         * This method returns a string of 10 character composed only of numbers.    
         */
        String answer = "";
        if(type.compareTo("TipoA") == 0 || type.compareTo("TipoB") == 0){
            Integer randomGenerate = (int)(Math.random()*99999999+1);
            String randomToString = randomGenerate.toString();
            answer = (type.compareTo("TipoA") == 0)? "54" :"08";
            for(int i=0; i<8-randomToString.length();i++){
                answer += "0";
            }
            answer += randomToString;
        }
        return answer;
    }
    
}
