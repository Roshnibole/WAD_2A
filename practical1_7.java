/* calculate profit or loss.
write a program that takes the cost price and selling price(take it hardcoded) and calculates its profit or loss
input1:
sellingPrice=1200
costPrice=1000
output= profit of 200

sellingPrice=300
costPrice=500
output=loss of 200

sellingPrice=900
costPrice=900
output=no loss
*/

class p1{
	public static void main(String[] args) {
		double sellingPrice=1200;
		double costPrice=1000;
		
			if(sellingPrice>costPrice) {
				System.out.println(sellingPrice-costPrice);
			} else if(sellingPrice<costPrice) {
				System.out.println(costPrice-sellingPrice);
			}else if(sellingPrice==costPrice) {
				System.out.println("no loss");
			}
		}
	}