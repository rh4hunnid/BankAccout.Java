abstract class BankAccount{
   
    protected String accountID;
    protected double interestRate;
    protected int balance;
    
    public BankAccount(){
       accountID = "0000-0000-0000-0000";
       
    }
    
     public boolean credit(int credit) {
        balance = balance + credit;
        return true;
        
     }
       public abstract boolean debit(int num);
       
       public int getBalance(){
          return balance;
       }
       
       public String getAccountID(){
          return accountID;
       }
       
       public void setAccountID(String name){
          accountID = name;
       }
       
       public double getInterestRate(){
          return interestRate;  
       }
       public void setInterestRate(double in){
          interestRate = in;
       }
       public abstract void applyInterest();
       public abstract String accountInfo();
       
       
    }
    