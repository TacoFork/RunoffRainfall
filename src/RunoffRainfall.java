public class RunoffRainfall {
    public static void main(String[] args){
        //used the example variables for the problem
        int dimension1 = 50; //50 feet
        int dimension2 = 20; //20 feet
        int rain_amount = 1; //1 inch of rainfall
        double total_rainfall = 0;
        dimension1 = dimension1 * 12;   //converting to inches
        dimension2 = dimension2 * 12;
        total_rainfall = (dimension1 * dimension2 * rain_amount)/231;
        System.out.println("The total amount of rainfall in gallons is: " + total_rainfall);

    }
}
