public class Main {
    public static void main(String[] args) {
        PhonesStore phonesStore = new PhonesStore();

        phonesStore.addPhone(new Phone("iphone XS", PhoneColors.Red, 63000, 23));
        phonesStore.addPhone(new Phone("iphone 13", PhoneColors.SpaceGray, 55000, 41));
        phonesStore.addPhone(new Phone("Redmi Note 8t", PhoneColors.Yellow, 25000, 131));
        phonesStore.addPhone(new Phone("iphone 15 Pro Max", PhoneColors.SpaceGray, 175000, 15));

        System.out.println(phonesStore.getPhonesInTableView());
    }
}