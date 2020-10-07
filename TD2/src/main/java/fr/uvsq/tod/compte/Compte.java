/**
 * La classe <code>Compte</code> représente un compte bancaire.
 *
 * @author hal
 * @version 2020
 */


// LIBRARIES

package fr.uvsq.tod.compte;

 // CLASS

public class Compte
{
  // VARIABLES
  private int balance;

  // CONSTRUCTOR
  public Compte(int initialBalance)
  {
    if(initialBalance<0)
    {
      throw new IllegalArgumentException("Impossible d'initialiser le compte avec un solde négatif");
    }

    this.balance=initialBalance;
  }

  // METHODS
  public int getBalance()
  {
    return this.balance;
  }

  public void credit(int sum)
  {
    if(sum<0)
    {
      throw new IllegalArgumentException("Impossible de créditer une somme négative");
    }

    this.balance=balance+sum;
  }

  public void debit(int sum)
  {
    if(sum<0)
    {
      throw new IllegalArgumentException("Impossible de débiter une somme négative");
    }

    if((this.balance-sum)<0)
    {
      throw new IllegalArgumentException("Débit impossible, solde insuffisant");
    }

    this.balance=balance-sum;
  }

  public void transfer(int sum, Compte c)
  {
    if((this.balance-sum)<0)
    {
      throw new IllegalArgumentException("Virement impossible, solde insuffisant");
    }

    this.debit(sum);
    c.credit(sum);
  }
}
