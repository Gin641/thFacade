public class Twitter implements SocialShare {
    private String mess;
    @Override
    public void setMess(String mess){
        this.mess=mess;
    }
    @Override
    public void share(){
        System.out.println("Sharing to Twitter: " + this.mess);
    }
}
