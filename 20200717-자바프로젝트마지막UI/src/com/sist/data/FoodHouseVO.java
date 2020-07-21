package com.sist.data;
/*
 *   주소	대구광역시 중구 달구벌대로443길 15-25
                       지번 대구시 중구 삼덕동2가 290-6
전화번호	010-6861-5478
음식 종류	카페 / 디저트
가격대	만원 미만
주차	유료주차 가능
영업시간	09:00 - 21:00
 */
// 맛집 1개에 대한 정보 
public class FoodHouseVO {
   private int no;
   private int cno;
   private String poster;// splite
   private String review;
   private String title;
   private double score;
   private String addrss;
   private String tel;
   private String type;
   private String price;
   private String parking;
   private String time;  
   private int good;
   private int soso;
   private int bad;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getAddrss() {
		return addrss;
	}
	public void setAddrss(String addrss) {
		this.addrss = addrss;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getParking() {
		return parking;
	}
	public void setParking(String parking) {
		this.parking = parking;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getGood() {
		return good;
	}
	public void setGood(int good) {
		this.good = good;
	}
	public int getSoso() {
		return soso;
	}
	public void setSoso(int soso) {
		this.soso = soso;
	}
	public int getBad() {
		return bad;
	}
	public void setBad(int bad) {
		this.bad = bad;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
    
}
