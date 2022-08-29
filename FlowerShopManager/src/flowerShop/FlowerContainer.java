package flowerShop;

public class FlowerContainer {
	
	private String flowerId;
	private String latinName;
	private String nickName;
	private Byte categoryId;
	private Integer stockpile;
	
	public FlowerContainer(String flowerId, String latinName, String nickName, Byte categoryId, Integer stockpile) {
		this.flowerId = flowerId;
		this.latinName = latinName;
		this.nickName = nickName;
		this.categoryId = categoryId;
		this.stockpile = stockpile;
	}

	public String getFlowerId() {
		return flowerId;
	}

	public String getLatinName() {
		return latinName;
	}

	public String getNickName() {
		return nickName;
	}

	public Byte getCategoryId() {
		return categoryId;
	}

	public Integer getStockpile() {
		return stockpile;
	}
	
	public String getCategoryString(Byte categoryId) {
		String answer = null;
		if(categoryId == 1) {
			answer = "Sz�las vir�g";
		} else if(categoryId == 2) {
			answer = "Cserepes vir�g";
		} else if(categoryId == 3) {
			answer = "Z�ld";
		}
		return answer;
	}
	
	

}
