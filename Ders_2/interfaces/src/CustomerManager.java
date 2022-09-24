public class CustomerManager {
    ICustomerDal customerDal;
    public CustomerManager(ICustomerDal customer){
        this.customerDal = customer;
    }
    public void add(){
        //iş kodları
        customerDal.add();
    }
}
