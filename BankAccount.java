public class BankAccount {
    private String name;
    private int age;
     private long accnum;
    private long accbal;
    private long dep;
   
    
    public String getName(){
        return name;
    }
     public int getAge(){
        return age;
    }
      public long getAccbal(){
        return accbal;
    }
       public long getAccnum(){
        return accnum;
    }
        public long getDep(){
        return dep;
    }
      
    public void setName(String name){
        this.name = name;
        System.out.println("Name: " + this.name);
    }
     public void setAge(int age){
        this.age = age;
        System.out.println("Age: " + this.age);
    }
       public void setAccnum(long accnum){
        this.accnum = accnum;
        System.out.println("Account Number: " + this.accnum);
    }
      public void setAccbal(long accbal){
        this.accbal = accbal;
        System.out.println("Balance: " + this.accbal);
      }
        public void setDep(long dep){
            this.dep = dep;
            System.out.println("Deposit: " + this.dep);
    }
        public void Summary(){
            this.accbal = this.accbal + this.dep;
            System.out.println("Balance Remaining: " + this.accbal);
        }
}
class Main{
    public static void main(String[] args){
        
        BankAccount i= new BankAccount(); 
        BankAccount r= new BankAccount(); 
        
        i.setName("Jam Dominggo");
        i.setAge(57);
        i.setAccnum(212121);
        i.setAccbal(15000000);
        i.setDep(200000);
        i.Summary();
        
        System.out.println("");
        
        r.setName("Analita Sabado");
        r.setAge(70);
        r.setAccnum(202020);
        r.setAccbal(80978000);
        r.setDep(1000000);
        r.Summary();
    }
}

