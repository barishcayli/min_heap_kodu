package min_heap;

import java.util.Scanner;

public class Min_heap {

    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        System.out.println("boşluksuz virgül kullanarak sayıları giriniz:");
        String str = input.nextLine(); 
        String[] dizi = str.split("[,]"); 
        int[] sayilar=new int[dizi.length];
        
        for(int i=0;i<sayilar.length;i++){
            sayilar[i]= Integer.parseInt(dizi[i]);
                    
        }
        
        
        int min_heap=1;
       for(int i=0;i<dizi.length;i++){
          int a=(i-1)/3;
           if(sayilar[i]<sayilar[a]){
               min_heap=0;
               
           }
          
           }
    for(int i=0;i<sayilar.length;i++){
        System.out.print(sayilar[i]+" ");
    }
        System.out.println("");
    if(min_heap==0){
        System.out.println("min heap değil");
        for(int i=0;i<sayilar.length;i++){
            for(int j=0;j<sayilar.length;j++){
                int a=(i-1)/3;
                if(sayilar[i]<sayilar[a]){  
                    int tmp=sayilar[i];
                    sayilar[i]=sayilar[a];
                    sayilar[a]=tmp;
                    
               
           }
            }
        }
        System.out.println("min heap hali:");    
    for(int i=0;sayilar.length>i;i++){
        System.out.print(sayilar[i]+" ");
    }    
        System.out.println("");
    }
    else{
        System.out.println("min heap");
    }
    }
    
    
}
    

