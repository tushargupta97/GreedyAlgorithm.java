import java.util.*;
public class Chocola {
    public static void main(String[] args) {
        int n=4,m=6;
        Integer costHoz[]={4,1,2};
        Integer costVer[]={2,1,3,1,4};
        Arrays.sort(costHoz, Collections.reverseOrder());
        Arrays.sort(costVer, Collections.reverseOrder());
        int h=0,v=0;
        int hp=1, vp=1; 
        int cost=0;
        while(h<costHoz.length && v<costVer.length){
            if(costVer[v]<=costHoz[h]){
                cost+=(costHoz[h]*vp);
                hp++; 
                h++;
            }
            else{
                cost+=(costVer[v]*hp);
                vp++; 
                v++; 
            }
        }
        while(h<costHoz.length ){
            cost+=(costHoz[h]*vp);
            hp++; 
            h++;
        }
        while( v<costVer.length){
            cost+=(costVer[v]*hp);
            vp++; 
            v++;  
        }
        System.out.println("min cost of cuts="+cost);
    }
}
