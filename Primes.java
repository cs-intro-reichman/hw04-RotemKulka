public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] primes = new boolean[n+1];
        for (int i=2; i<=n; i++){
            primes[i]=true;
        }

        int j = 2;
        while (j*j <= n){
            if (primes[j]==true){
                int m = j*j;
                while (m<=n){
                    primes[m]=false;
                    m = m + j;
                } 
            }
        j++;
        }

        System.out.println("Prime numbers up to " + n + ":");
        int count = 0;
        for (int i=2; i<=n; i++){
            if (primes[i]){
                System.out.println(i);
                count++;
            }

        }

        double percent = (count/(double)n)*100;
        System.out.println("There are " + count + " primes between 2 and " + n + " (" + (int)percent + "% are primes)");
      }
      }
      
