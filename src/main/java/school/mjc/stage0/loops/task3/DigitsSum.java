package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String n= String.valueOf(Math.abs(t));
        int sum=0;
        for(int i=0;i<n.length();i++){
            int tmp=Integer.parseInt(String.valueOf(n.charAt(i)));
            sum+=tmp;
        }

        System.out.println(sum);
    }

}
