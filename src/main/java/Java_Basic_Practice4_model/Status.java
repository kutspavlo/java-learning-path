package Java_Basic_Practice4_model;

public enum Status {
    NEW ("New"),
    ACTIVE ("Active"),
    FIRED ("Fired"),
    PENDING ("Pending");

    private String status;

    Status(String status){
        this.status = status;
    }

    @Override
    public String toString(){
        return this.status;
    }
}
