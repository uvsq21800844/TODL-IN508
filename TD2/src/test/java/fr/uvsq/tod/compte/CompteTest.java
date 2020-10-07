// LIBRARIES

package fr.uvsq.tod.compte;
import org.junit.Test;
import static org.junit.Assert.*;


// CLASS

public class CompteTest
{
  @Test
  public void shouldCreateAnAccountWithTheSpecifiedBalance()
  {
    Compte c=new Compte(100);

    assertEquals(100, c.getBalance());
  }
  
  @Test(expected=IllegalArgumentException.class)
  public void shouldFailCreatingAnAccountWithANegativeBalance()
  {
    Compte c=new Compte(-100);
  }

  @Test
  public void shouldSuccedCreditingAnAccountWithAPositiveSum()
  {
    Compte c=new Compte(100);

    c.credit(10);

    assertEquals(100+10, c.getBalance());
  }

  @Test(expected=IllegalArgumentException.class)
  public void shouldFailCreditingAnAccountWithANegativeSum()
  {
    Compte c=new Compte(100);

    c.credit(-10);
  }

  @Test
  public void shouldSuccedDebitingAnAccountWithAPositiveSum()
  {
    Compte c=new Compte(100);

    c.debit(10);

    assertEquals(100-10, c.getBalance());
  }

  @Test(expected=IllegalArgumentException.class)
  public void shouldFailDebitingAnAccountWithANegativeSum()
  {
    Compte c=new Compte(100);

    c.debit(-10);
  }

  @Test(expected=IllegalArgumentException.class)
  public void shouldFailDebitingAnAccountWithASumSuperiorToItsBalance()
  {
    Compte c=new Compte(100);

    c.debit(110);
  }

  @Test
  public void shouldSuccedTransferringAPositiveSumFromAnAccountWithABalanceSuperiorToThisSumToAnother()
  {
    Compte c1=new Compte(100);
    Compte c2=new Compte(100);

    c1.transfer(10, c2);

    assertEquals(100-10, c1.getBalance());
    assertEquals(100+10, c2.getBalance());
  }

  @Test(expected=IllegalArgumentException.class)
  public void shouldFailTransferingASumFromAnAccountThatHasLessBalanceThanTheTransferedSum()
  {
    Compte c1=new Compte(100);
    Compte c2=new Compte(200);

    c1.transfer(110, c2);
  }
  
}