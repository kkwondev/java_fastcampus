package ch07;

import java.util.Random;

public class UserInfo {
    public int userId;
    public String userPassword;
    public String userName;
    public String userAddress;
    public String userPhoneNumber;


    public UserInfo() {}

    public UserInfo(String userPassword, String userName, String userAddress, String userPhoneNumber) {
        Random random = new Random();
        this.userId = random.nextInt(10000);
        this.userPassword = userPassword;
        this.userName = userName;
        this.userAddress = userAddress;
        this.userPhoneNumber = userPhoneNumber;
    }
    public String userInfoShow() {
        return userId + "회원의 이름은 " + userName + "이고 " + "비밀번호는 " + userPassword + "주소는 " + userAddress + "이고 " + userPhoneNumber + "입니다.";
    }
}
