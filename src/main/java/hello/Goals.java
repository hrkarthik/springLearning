package hello;

import org.bson.types.BSONTimestamp;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Goals {
	@Id
	public ObjectId _id;
	
	public String userId;
	public String goal;
	public String description;
	public String amount;
	public String monthlyInstallment;
	public String currentAmount;
	public BSONTimestamp targetDate;
	public BSONTimestamp startDate;
	
	public ObjectId get_id() {
		return _id;
	}
	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getGoal() {
		return goal;
	}
	public void setGoal(String goal) {
		this.goal = goal;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getMonthlyInstallment() {
		return monthlyInstallment;
	}
	public void setMonthlyInstallment(String monthlyInstallment) {
		this.monthlyInstallment = monthlyInstallment;
	}
	public String getCurrentAmount() {
		return currentAmount;
	}
	public void setCurrentAmount(String currentAmount) {
		this.currentAmount = currentAmount;
	}
}