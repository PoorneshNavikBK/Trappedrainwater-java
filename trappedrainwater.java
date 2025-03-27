import java.util.*;

public class trappedrainwater{
    public static int trappedwater(int height[]){
        int n = height.length;

        // left max number
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for ( int i = 1 ; i < n ;i++ ){
            leftmax[i] = Math.max(leftmax[i-1], height[i] );
            System.out.print(leftmax[i]);
        }
        System.out.println();
        // Rightmax of number
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for( int i = n - 2 ; i >= 0 ; i--){
            rightmax[i] = Math.max(height[i] ,rightmax[i + 1]);
            System.out.print(rightmax[i]);
        }
        System.out.println();
        int ans = 0;
        for ( int i = 0 ; i < n ; i++){
            int waterlevel = (Math.min(leftmax[i],rightmax[i]));
            ans += ( waterlevel - height[i]);
        }

        return ans;
    }

    public static void main(String args[]){
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedwater(height));
    }
}