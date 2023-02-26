import java.util.Map;

/**
 * App1
 */
public class App1 {
    public static void main(String[] args) {
        int[] start = {5, 2};
        int[][] finish = {{6, 7}, {6, 9}};
        int[][] area = initArea();
        
        printArea(area, start, finish);
    }
    
    public static int[][] initArea() {
        int[][] area = new int[11][11];
        //Стены вокруг поля для проверки
        for (int i = 0; i < area.length; i++) {
            area[0][i] = -1;
            area[area.length - 1][i] = -1;
            area[i][0] = -1;
            area[i][area.length - 1] = -1;
        }
        //Сам лабиринт статичный
        area[3][2] = -1; area[4][3] = -1; area[5][3] = -1; area[6][3] = -1; area[7][2] = -1; area[7][1] = -1;
        area[3][6] = -1; area[4][6] = -1; area[5][6] = -1; area[6][6] = -1; area[7][6] = -1; area[7][5] = -1;
        area[3][5] = -1; area[3][7] = -1; area[3][8] = -1; area[5][8] = -1; area[6][8] = -1; area[7][8] = -1;
        area[1][4] = -1;
        return area;
    }

    public static void printArea(int[][] area, int[] start, int[][] finish) {

        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area.length; j++) {
                if(area[i][j] == -1)
                    System.out.printf((char)27 + "[31m%d \t",area[i][j]);
                else{
                    if(i==start[0] && j == start[1])
                        System.out.printf((char)27 + "[32m%d \t",area[i][j]);

                    else if ((i==finish[0][0] && j == finish[0][1])||(i==finish[1][0] && j == finish[1][1]))  {
                        System.out.printf((char)27 + "[34m%d \t",area[i][j]);
                    }
                    else
                        System.out.printf((char)27 + "[0m%d \t",area[i][j]);

                }                     
            }
            System.out.println();
        }
    }

    public static void findWays(int[][] area, int[] start, int[][] finish) {
        
    }
}