public class Main {

	public static void main(String[] args) throws Exception {

		// Kontrol amaçlı oluşturulmuş bir main

		Employee e1 = new Employee("Semih Yildiz", 2000, 45, 1985);

		System.out.println("Adı: " + e1.getName());
		System.out.println("Maaşı: " + e1.getSalary());
		System.out.println("Çalışma Saati: " + e1.getWorkHours());
		System.out.println("Başlangıç Yılı: " + e1.getHireYear());
		System.out.println("Vergi: " + e1.tax());
		System.out.println("Bonus: " + e1.bonus());
		System.out.println("Maaş artışı: " + e1.raiseSalary());
		System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + e1.taxBonusSalary());
		System.out.println("Toplam Maaş: " + e1.newSalary());

	}
}