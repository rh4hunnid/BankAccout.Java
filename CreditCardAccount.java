class CreditcardAccount extends BankAccount{
    private int limit;
    private String type = "Creditcard";
    
    
    public boolean debit(int amount){
       if ((limit - amount) >=0){
          balance = balance - amount;
       return true;
       } else {return false;}
       
    }
    
    public boolean credit(int amount){
       balance = balance + amount;
       return true;
    }
    
    
    public void setLimit(int limit){
       this.limit = limit;
    }
    
     public void applyInterest(){
        if(balance < 0){
        balance = balance + (int)(balance * interestRate);
        }
     }
    
    public int getLimit(){
       return  limit;
    }
    
     public String accountInfo(){
        double newNum = Math.abs(balance/100.0);
        double num2 = interestRate * 100;
        double num3 = (double)(limit)/100;
       String mydog = String.format("Type of Account : %s\nAccount ID      : %s\nCurrent Balance : $%.2f\nInterest rate   : %.2f%%\nCredit Limit    : $%.2f",type,accountID,newNum,num2,num3);
       return mydog;
    }
    
 }
 