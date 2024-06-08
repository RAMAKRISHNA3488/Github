public class Armstrong {
    public static void main(String[] args) {
        int num=153;
        int remainder,temp,result=0;
        temp=num;
        while(temp!=0){
            remainder=temp%10;
            num=num/10;
            result=result+(remainder*remainder*remainder);
        }
        if(result==num){
            System.out.println(num+" is an Armstrong number");
        }else{
            System.out.println(num+" is not an Armstrong number");
        }
    }

    
}
