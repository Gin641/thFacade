public class SocialMediaFacade {
    private Twitter twitter;
    private Facebook facebook;
    private LinkedIn linkedIn;
    public SocialMediaFacade(Twitter twitter, Facebook facebook, LinkedIn linkedIn) {
        this.twitter = twitter;
        this.facebook = facebook;
        this.linkedIn = linkedIn;
    }
    public void share(String mess){
        this.twitter.setMess(mess);
        this.facebook.setMess(mess);
        this.linkedIn.setMess(mess);
        this.twitter.share();
        this.facebook.share();
        this.linkedIn.share();
    }
}
