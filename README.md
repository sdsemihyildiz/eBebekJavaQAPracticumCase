# ebebek Java&QA Practicum First Case

## Not: Ekstra olarak karşılaşılabilecek tüm hatalara karşı exception ekledim.

## Task

Java'da "Employee" adında fabrika çalışanlarını temsil eden ve metotları ile çalışanların maaşlarını hesaplayan bir
sınıf yazmalısınız. Bu sınıf 4 nitelik ve 5 metoda sahip olacaktır. Sizden konsol çıktısı halinde Adı, maaşı, çalışma
saati, başlangıç yılı, vergi, bonus, maaş artışı, vergi ve bonuslarla birlikte maaş, toplam maaş değerlerini konsola
yazdırmanızı bekliyoruz.

## Sınıfın Nitelikleri

- name : Çalışanın adı ve soyadı
- salary : Çalışanın maaşı
- workHours : Haftalık çalışma saati
- hireYear : İşe başlangıç yılı

## Sınıfın Metodları

- Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alacaktır.
- tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
- Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
- Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
- bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde
  bonus ücretleri hesaplayacaktır.
- raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
- Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
- Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
- Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
- toString() : Çalışana ait bilgileri ekrana bastıracaktır.
- Örnek konsol çıktısı:

<a href="https://ibb.co/SDCqLrZ"><img src="https://i.ibb.co/qLQbZ52/Ekran-Resmi-2022-10-20-17-04-02.png" alt="Ekran-Resmi-2022-10-20-17-04-02" border="0"></a>



## Notlar

- raiseSalary() hesaplarken vergi ve bonusları dikkate almalısınız.
- tax() fonksiyonu ile sadece salary’i uygulanan vergi hesaplanacak.
- Toplam maaş: çalışanın kendi maaşı +artış+ bonus.
- Vergi ve bonuslarla birlikte maaş için: vergi, bonus ve çalışanın kendi maaşı ile bulunacak.





 
