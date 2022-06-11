package ch08;

public class Order {
    public long orderId;
    public String orderPhoneNumber;
    public String orderAddress;
    public int orderDate;
    public int orderTime;
    public int orderPrice;
    public String orderMenuNumber;

    public Order(long orderId, String orderAddress, int orderDate, int orderTime, int orderPrice, String orderMenuNumber, String orderPhoneNumber) {
        this.orderAddress = orderAddress;
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.orderPrice = orderPrice;
        this.orderMenuNumber = orderMenuNumber;
        this.orderPhoneNumber = orderPhoneNumber;
    }

    public void orderNotification() {
        System.out.println("음식점에 배달 주문이 들어왔습니다.");
        System.out.println("주문 접수 번호 :" + this.orderId);
        System.out.println("주문 휴대폰 번호 :" + this.orderPhoneNumber);
        System.out.println("주문 집 주소 :" + this.orderAddress);
        System.out.println("주문 날짜 : " + this.orderDate);
        System.out.println("주문 시간 : " + this.orderTime);
        System.out.println("주문 가격 : " + this.orderPrice);
        System.out.println("메뉴 번호 : " + this.orderMenuNumber);
    }

}
