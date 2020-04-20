public class LinkedIn implements SocialShare {
    private String mess;
    @Override
    public void setMess(String mess) {
        this.mess = mess;
    }
    @Override
    public void share() {
        System.out.println("Sharing to LinkedIn: " + this.mess);
    }
}
