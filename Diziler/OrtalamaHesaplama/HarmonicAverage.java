package Diziler.OrtalamaHesaplama;
public class HarmonicAverage {
    public static void main(String[] args) {

        double [] list = {1,3,5,7};
        double harmonicAverage = 0;
        for ( double i: list){
            harmonicAverage += (1/i);

        }
        harmonicAverage = list.length/harmonicAverage;

        System.out.println("Harmonic average of thr numbers in the array :" +(harmonicAverage));

    }
}
