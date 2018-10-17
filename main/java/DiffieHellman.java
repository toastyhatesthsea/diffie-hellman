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
        //B to the power of aKey MOD primeA

        BigInteger answer = primeB.pow(privateKey.intValue()).mod(primeA);

        return answer;
    }

    public BigInteger secret(BigInteger primeA, BigInteger bobPublicKey, BigInteger alicePrivateKey)
    {
        BigInteger answer = bobPublicKey.pow(alicePrivateKey.intValue()).mod(primeA);

        return answer;
    }
}