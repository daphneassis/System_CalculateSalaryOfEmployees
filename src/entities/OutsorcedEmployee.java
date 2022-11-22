package entities;

public class OutsorcedEmployee extends Employee{
	
		private Double aditionalCharge;

		public OutsorcedEmployee(String name, Integer hours, Double valuePerHour, Double aditionalCharge) {
			super(name, hours, valuePerHour);
			this.aditionalCharge = aditionalCharge;
		}
		@Override
		public Double payment() {
			return super.payment()+ aditionalCharge*1.1;
		}

}

