package ObjectOrientedDesign.Week3;

public class SmartPhone {
    private ICamera myCamera;
    private IPhone myPhone;

    public SmartPhone(ICamera aCamera, IPhone aPhone){
        this.myCamera = aCamera;
        this.myPhone = aPhone;
    }
    public void useCamera() {
        this.myCamera.takePhoto();
    }
    public void usePhone() {
        this.myPhone.makePhoneCall();
    }
}
