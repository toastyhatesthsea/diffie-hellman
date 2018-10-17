import java.math.BigInteger;
import java.util.Random;

public class DiffieHellman
{


    public BigInteger privateKey(BigInteger prime)
    {
        Random ran = new Random();

        return BigInteger.valueOf((ran.nextInt(prime.intValue() - 1)) + 1);
    }

    public BigInteger publicKey(BigInteger primeA, BigInteger primeB, BigInteger privateKey)
    {


        return null;
    }

    public BigInteger secret(BigInteger primeA, BigInteger bobPublicKey, BigInteger alicePrivateKey)
    {
        return null;
    }
}

class DiffieTesters
{
    public static void main(String[] aegfsgsg)
    {
        BigInteger rawrs = BigInteger.valueOf(10);

        long meow = rawrs.longValue();


    }
}
