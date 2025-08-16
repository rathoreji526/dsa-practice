package dailyChallangesLeetcode;

public class max69Num {
    static int maximum69Num(int n){
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        for(int i=0 ; i < sb.length() ; i++){
            if(sb.charAt(i)=='6'){
                sb.setCharAt(i , '9');
                return Integer.parseInt(sb.toString());
            }
        }
        return n;
    }
    public static void main(String[] args){
        int num = 9669;
        System.out.println(maximum69Num(num));
    }
}

/*
question => given an integer n that includes 9 & 6 only we have to change only one digit either 6->9 or 9->6 ans we have to form maximum number and return it.
intution => we can't iterate on numbers so... we will first convert it into iteratable form (String or char array) and then iterate left to right when we have first 6 we will convert into 9 and we will convert it into number and return.
 */