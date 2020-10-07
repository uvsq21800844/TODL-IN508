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
  
  @Test
  public void shouldFailCreatingAnAccountWithANegativeBalance()
  {
    Compte c=new Compte(-100);
  }

  @Test
  public void shouldFailCreditingAnAccountWithANegativeSum()
  {
    Compte c=new Compte(100);

    c.credit(-10);
  }

  @Test
  public void shouldFailDebitingAnAccountWithANegativeSum()
  {
    Compte c=new Compte(100);

    c.debit(-10);
  }

  @Test
  public void shouldFailDebitingAnAccountWithASumSuperiorToItsBalance()
  {
    Compte c=new Compte(100);

    c.debit(110);
  }

  @Test
  public void shouldFailTransferingASumFromAnAccountThatHasLessBalanceThanTheTransferedSum()
  {
    Compte c1=new Compte(100);
    Compte c2=new Compte(200);

    c1.transfer(110, c2);
  }
  
}