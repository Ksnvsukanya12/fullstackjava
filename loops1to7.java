//loops1
class BrightITCareer
{
    public static void main(String[]args)
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Bright IT Career");
        }
    }
}
//loop2
class print
{
    public static void main(String[]args)
    {
        int i=1;
        while(i<=20)
        {
            System.out.println(i);
            i++;
        }
    }
}
//loops3
class enoprtator
{
    public static void main(String[]args)
    {
        int[] numbers={3,5,7,5};
        int target=3;
        System.out.println("Checkeng numbers equal or not equal to"+target+":");
        for(int num: numbers){
            if(num==target){
                System.out.println(num+"=="+target+"Equal");
            }
            else if(num!=target)
            {
                System.out.println(num+"!="+target+" not equal" );
            }
        }
    }
}
//odd or evenloop4
class oddoreven
{
    public static void main(String[]args)
    {
        for(int i=1;i<=20;i++)
        {
            if(i%2==0)
            {
                System.out.println(i+"even");
            }
            else{
                System.out.println(i+"odd");
            }
        }
    }
}
//largestloop5
import java.util.Scanner;
class largest
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 integers");
        int[] nums={sc.nextInt(),sc.nextInt(),sc.nextInt()};
        int max=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
            }
        }
        System.out.println("largest number"+max);
        sc.close();
    }
}
//evenNumberloop6
class evennum
{
    public static void main(String[]args)
    {
        int num=10;
        while(num<=100)
        {
            if(num%2==0)
            {
                System.out.println(num);
            }
            num++;
        }
    }
        }
//dowhileloop7
class evennum
{
    public static void main(String[]args)
    {
        int i=1;
       do 
       {
           System.out.println(i);
           i++;
       }while(i<=10);
    }
}
