public class array {
    int[] a;

    array(int[] a){
        this.a=a;

    }
    int max (){
        int max=a[0];
        for (int i=0;i<a.length;i++){

                if (a[i]>max){
                    max=a[i];
                }
        }
        return max;
    }
    int sum (int[] a){
        int sum =0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum;
    }

    int min (){
        int min=a[0];
        for (int i=0;i<a.length;i++){

            if (a[i]<min){
                min=a[i];
            }
        }
        return min;
    }


}
