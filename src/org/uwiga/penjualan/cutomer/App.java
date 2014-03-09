package org.uwiga.penjualan.cutomer;

public class App {

	public static void main(String[] args) {
		MasterCustomerModel Model = new MasterCustomerModel();
		MasterCustomerView View = new MasterCustomerView(Model);
		MasterCustomerController controller = new MasterCustomerController(View, Model);
		View.setVisible(true);
		System.out.println("PERCOBAAN");
	}

}
