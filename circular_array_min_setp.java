/*
Given an array of string containing names of tools (can be duplicates), the starting index and a target tool,
find the minimum number of steps required to reach the target tool from the starting index.
The array is circular, that is, if you reach the end of the array, go to its start and vice versa.
 */

public class circular_array_min_setp {
    public static void main(String[] args) {
        String arr[]={"saw","hammer","mallet","file","saw","ladder","scissor"};
        int start=2;
        String find="scissor";
        int countfront=1;
        int countback=1;
        //CASE 1 : start=arr.length-1
        if(start==arr.length-1){
            int i=0;
            int j=start-1;
            while(i<=arr.length-1){
                if(arr[i]!=find){
                    countfront++;
                    i++;
                }
                else{
                    break;
                }
            }

            while(j>=0){
                if(arr[j]!=find){
                    countback++;
                    j--;
                }
                else{
                    break;
                }
            }

        }


        //CASE 2: start=0
        else if(start==0){
            int i=arr.length-1;
            int j=start+1;
            while(i>=0){
                if(arr[i]!=find){
                    countfront++;
                    i--;
                }
                else{
                    break;
                }
            }

            while(j<=arr.length-1){
                if(arr[j]!=find){
                    countback++;
                    j++;
                }
                else{
                    break;
                }
            }

        }

        //CASE 3 :start!=0 && start!=arr.length-1
        else{
            int i=start+1;
            int j=start-1;

            while(i<=arr.length){
            if(arr[i]!=find){
                countfront++;
                i++;
            }
            else{
                break;
            }
            }
            if(i==arr.length && arr[i]!=find){
                i=0;
                if(arr[i]!=find){
                    countfront++;
                    i++;
                }


            }

            while(j>=0){
                if(arr[j]!=find){
                    countback++;
                    j--;
                }
                else{
                    break;
                }}
            if(j==0 && arr[j]!=find){
                j=arr.length-1;
                if(arr[j]!=find){
                    countback++;
                    j--;
                }



            }
        }




        System.out.println(countback>countfront?countfront:countback);
        System.out.println("countback "+countback);
        System.out.println("countfront "+countfront);

    }
}
