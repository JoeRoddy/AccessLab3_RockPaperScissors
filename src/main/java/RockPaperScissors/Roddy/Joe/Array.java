package RockPaperScissors.Roddy.Joe;

public class Array {

    public static int maxValuePosition(float[] floatArray){
        float maxValue = floatArray[0];
        int position = 0;
        for(int x=1;x<floatArray.length;x++){
            if(floatArray[x]>maxValue){
                maxValue=floatArray[x];
                position=x;
            }
        }
        return position;
    }
    public static int maxValuePosition(int[] intArray){
        int maxValue = intArray[0];
        int position = 0;
        for(int x=1;x<intArray.length;x++){
            if(intArray[x]>maxValue){
                maxValue=intArray[x];
                position=x;
            }
        }
        return position;
    }
    public static int maxValuePosition(double[] doubleArray){
        double maxValue = doubleArray[0];
        int position = 0;
        for(int x=1;x<doubleArray.length;x++){
            if(doubleArray[x]>maxValue){
                maxValue=doubleArray[x];
                position=x;
            }
        }
        return position;
    }
    public static int secondHighestValuePosition(double[] doubleArray){
        double maxValue = doubleArray[0];
        int maxPosition = 0;
        int secondPosition=0;
        for(int x=1;x<doubleArray.length;x++){
            if(doubleArray[x]>maxValue){
                maxValue=doubleArray[x];
                secondPosition=maxPosition;
                maxPosition=x;
            }
        }
        return secondPosition;
    }

}
