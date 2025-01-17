<<<<<<< HEAD
package Day13.Prime;

public class PrimeChecker {
    public boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
=======
package Day13.Prime;

public class PrimeChecker {
    public boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
>>>>>>> 9f4db15e6bd5544983a99aced35c95885731322f
