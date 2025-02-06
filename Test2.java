public class Test2 {
    public static void main(String[] args) {
        
        
        double sum_col = 0;
       double[][] data = {{1,2,3},{4,5,6},{7,8,6}};
       for(int i = 0; i<data.length; i++){
            double sum_row = 0;
            for(int j = 0; j < data[i].length; j ++){
                sum_row += data[i][j];
            }

            System.out.println(sum_row);
       }


    }
}
