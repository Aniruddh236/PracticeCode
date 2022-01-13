import java.util.*;

class PanSolution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Pan[] p = new Pan[4];
		for (int i = 0; i < 4; i++) {
			System.out.println(i+"------------------");
			int id = sc.nextInt();
			
			String material = sc.next();
			String brand = sc.next();
			int price = sc.nextInt();
			
			int capacity = sc.nextInt();
			Pan pan = new Pan(id, material, brand, price, capacity);
			p[i] = pan;
		}
		System.out.println("---------------------------------------");
		String material = sc.next();
		String brand = sc.next();
		System.out.println("---------------------------------------");
		Pan p_new1 = costeliestPan(p, material);
		if (p_new1 != null) {
			System.out.println(p_new1.getId());
		} else {
			System.out.println("no object found of this material");
		}

		Pan[] p_new2 = discountedPrice(p, brand);
		if (p_new2.length != 0) {
			for (Pan i : p_new2) {
				System.out.println(i.getBrand() + "  " + i.getPrice() + "----> updated price");
				break;}
		} else {
			System.out.println("no object found of this brand");
		}

	}// main end

	static Pan costeliestPan(Pan[] p, String material) {
		Pan costliestPan = new Pan();
		int cost = Integer.MIN_VALUE;
		for (Pan i : p) {
			if (i.getPrice() > cost) {
				cost = i.getPrice();
				costliestPan = i;
			}
		}
		return costliestPan;

	}// function 1 end

	static Pan[] discountedPrice(Pan[] p, String brand) {

		Pan[] updatedPrice = new Pan[4];
		int k = 0;
		for (Pan i : p) {
			if (i.getBrand().equalsIgnoreCase(brand)) {
				if (i.getCapacity() > 500) {
					i.setPrice((int) Math.abs(i.getPrice() - i.getPrice() * 0.2));
				} else if (i.getCapacity() > 1000) {
					i.setPrice((int)Math.abs(i.getPrice() - i.getPrice() * 0.26));
				}
				updatedPrice[k++] = i;
			} // if end
		} // for end
		return updatedPrice;

	}// function 2 end

}// end class