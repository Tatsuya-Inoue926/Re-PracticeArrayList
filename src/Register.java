import java.util.ArrayList;

public class Register {
	
	//Itemクラス内の情報をリストに入れる
		private ArrayList <Item> ItemList = new ArrayList <> ();
		int less_num;

		public void addItem( Item it ) {
			ItemList.add(it);
			}
			
		
		public void removeItem(Item it ) {
			ItemList.remove(it);
			}
		
		public void searchItem(String number) {
			
			for( Item i : ItemList ) {
				//System.out.println(i);
				if(i.getNumber().equals(number)) {
					System.out.print(i.getName());
					System.out.println(" " + i.getNumber());
				}else if(!i.getNumber().equals(number)){
					less_num += 1;
				}
			}
			if(less_num == (int)ItemList.size()) {
				System.out.println("商品が見つかりませんでした");
			}
		}

}
