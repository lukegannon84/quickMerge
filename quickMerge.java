import java.util.concurrent.*;
import java.util.*;
public class quickMerge{

	public static void main(String [] args){
		
		int f[]=new int[10];
		ForkJoinPool fjPool=new ForkJoinPool();
		for(int j=0;j<f.length;j++)f[j]=(int)(Math.random()*10);
		fjPool.invoke(new Sum(f,0,f.length));
			boolean sorted=true;
			for(int i=0; i<f.length-1;i++)if (f[i]>f[i+1])sorted=false;
			System.out.println("Sum = "+sorted);
		for	(int j=0;j<f.length;j++){
					
						System.out.print(f[j]+" ");
						
						
		static void mergeSort(int f[],int lb, int ub){
    //termination reached when a segment of size 1 reached -lb+1=ub
    if(lb+1<ub){
        int mid = (lb+ub)/2;
        mergeSort(f,lb,mid);
        mergeSort(f,mid,ub);
        merge(f,lb,mid,ub);
    }
}

static void merge (int f[],int p, int q, int r){
    //p<=q<=r
    int i =p; int j = q; 
    //use temp array to store merged sub-sequence
    int temp[] = new int[r-p]; int t = 0; 
    while(i<q && j<r){
        if(f[i]<=f[j]){
            temp[t] =f[i]; 
            i++;t++;
        }
        else{
            temp[t] = f[j];
            j++;
            t++;
        }
    }
    while(i<q){temp[t]=f[i];i++;t++;}
    while(j<r){temp[t]=f[j];j++;t++;}
    //copy back to f
    i=p;t=0;
    while(t<temp.length){f[i]=temp[t];i++;t++;}
}

		}
	}
}

	