package ch07;

public class UserInfoText {
    public static void main(String[] args) {
        UserInfo kangUser = new UserInfo("1234","강경원", "경기도 부천시","020202020");

        System.out.println(kangUser.userInfoShow());

        UserInfo kyoungUser = new UserInfo();
        kyoungUser.userId = 1;
        kyoungUser.userPassword = "123123";
        kyoungUser.userAddress = "경기도";
        kyoungUser.userName = "경원";
        kyoungUser.userPhoneNumber = "010202022002";

        System.out.println(kyoungUser.userInfoShow());
    }
}
