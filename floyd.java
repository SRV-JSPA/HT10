import java.util.*;
public class floyd {

    public static int[][] rutacorta(int[][] adj, int[][] path) 
    {
        int n = adj.length;
        int[][] ans = new int[n][n];
        duplicar(ans, adj);
    	for (int k=0; k<n;k++) 
            for (int i=0; i<n; i++) 
        	for (int j=0; j<n;j++) 
                    if (ans[i][k]+ans[k][j] < ans[i][j]) {
                        ans[i][j] = ans[i][k]+ans[k][j];
          		        path[i][j] = path[k][j];
                    }
    	return ans;
    }
    public static void duplicar(int[][] a, int[][] b) 
    {
        for (int i=0;i<a.length;i++)
            for (int j=0;j<a[0].length;j++)
                a[i][j] = b[i][j];
    }
}
//* El algoritmo se obtuvo de https://www.youtube.com/watch?v=CyJj75Z67TU */


