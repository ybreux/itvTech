package org.example;

/**
 * Hello world!
 *
 */
public class App 
{

    public static Change optimalChange(final long somme){

        long reste = somme;
        Change change = new Change();

        if(reste == 1 || reste == 3){
            return null;
        }

        if(reste/10 >=1) {
            change.setBill10(reste/10);
            reste = reste - change.getBill10()*10;
        }

        if(reste == 0){
            return change;
        }

        if(reste%5 == 0 || getLastDigit(reste)==7 || getLastDigit(reste) == 9){
            change.setBill5(1);
            reste = reste -5;
        }

        if(getLastDigit(reste)%2 != 0) {
            change.setBill10(change.getBill10() - 1);
            reste = reste + 10;
            change.setBill5(1);
            reste = reste - 5;
        }

        change.setCoin2(getLastDigit(reste)/2);

        return change;
    }

    private static int getLastDigit(long somme) {
        return (int) (somme%10);
    }
}
