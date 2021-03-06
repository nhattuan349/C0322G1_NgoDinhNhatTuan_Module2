package BaiTapCaseStudy.Task1.Services.Impl;

import BaiTapCaseStudy.Task1.Models.Facility;
import BaiTapCaseStudy.Task1.Models.House;
import BaiTapCaseStudy.Task1.Models.Room;
import BaiTapCaseStudy.Task1.Models.Villa;
import BaiTapCaseStudy.Task1.Services.FacilityService;
import BaiTapCaseStudy.Task1.Untils.FacilityRentalType;
import BaiTapCaseStudy.Task1.Untils.ReadAndWriteFileTask1;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FacilityIpmt implements FacilityService {

    final String pathVilla = "J:\\CG\\CodegymX\\module2\\src\\BaiTapCaseStudy\\Task1\\DaTa\\Villa.csv";
    final String pathHouse = "J:\\CG\\CodegymX\\module2\\src\\BaiTapCaseStudy\\Task1\\DaTa\\House.csv";
    final String pathRoom = "J:\\CG\\CodegymX\\module2\\src\\BaiTapCaseStudy\\Task1\\DaTa\\Room.csv";

    private static Scanner scanner = new Scanner(System.in);

    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Map<Villa, Integer> villaIntegerMap = new LinkedHashMap<>();
    private static Map<House, Integer> houseIntegerMap = new LinkedHashMap<>();
    private static Map<Room, Integer> roomIntegerMap = new LinkedHashMap<>();

    @Override
    public void display() {
        List<String[]> list = ReadAndWriteFileTask1.ReadFile(pathVilla);
        /**
         * Villa....
         */
        facilityIntegerMap.clear();
        for (String[] item : list) {
            String serviceName = item[0];
            double usableArea = Double.parseDouble(item[1]);
            double rentalCosts = Double.parseDouble(item[2]);
            int peopleMaximum = Integer.parseInt(item[3]);
            String rentalType = item[4];
            String romStandard = item[5];
            double poolArea = Double.parseDouble(item[6]);
            int numberFloors = Integer.parseInt(item[7]);
            int num = Integer.parseInt(item[8]);
            ;

            Villa villa = new Villa(serviceName, usableArea, rentalCosts, peopleMaximum,
                    rentalType, romStandard, poolArea, numberFloors);
            facilityIntegerMap.put(villa, num);
        }

        /**
         * House
         */
        list.clear();
        list = ReadAndWriteFileTask1.ReadFile(pathHouse);
        for (String[] item : list) {
            String serviceName = item[0];
            double usableArea = Double.parseDouble(item[1]);
            double rentalCosts = Double.parseDouble(item[2]);
            int peopleMaximum = Integer.parseInt(item[3]);
            String rentalType = item[4];
            String romStandard = item[5];
            double numberFloors = Double.parseDouble(item[6]);
            int num = Integer.parseInt(item[7]);

            House house = new House(serviceName, usableArea, rentalCosts, peopleMaximum,
                    rentalType, romStandard, numberFloors);
            facilityIntegerMap.put(house, num);
        }

        /**
         * Room
         */
        list.clear();
        list = ReadAndWriteFileTask1.ReadFile(pathRoom);
        for (String[] item : list) {
            String serviceName = item[0];
            double usableArea = Double.parseDouble(item[1]);
            double rentalCosts = Double.parseDouble(item[2]);
            int peopleMaximum = Integer.parseInt(item[3]);
            String rentalType = item[0];
            String serviceFree = item[0];
            int num = Integer.parseInt(item[7]);

            Room room = new Room(serviceName, usableArea, rentalCosts,
                    peopleMaximum, rentalType, serviceFree);
            facilityIntegerMap.put(room, num);
        }
        for (Map.Entry<Facility, Integer> item : facilityIntegerMap.entrySet()) {
            System.out.println(item.getKey() + "So lan su dung" + item.getValue());
        }
    }

    @Override
    public void add() {
        List<String[]> list = ReadAndWriteFileTask1.ReadFile(pathVilla);
        /**
         * Villa....
         */
        ;
        facilityIntegerMap.clear();
        for (String[] item : list) {
            String serviceName = item[0];
            double usableArea = Double.parseDouble(item[1]);
            double rentalCosts = Double.parseDouble(item[2]);
            int peopleMaximum = Integer.parseInt(item[3]);
            String rentalType = item[4];
            String romStandard = item[5];
            double poolArea = Double.parseDouble(item[6]);
            int numberFloors = Integer.parseInt(item[7]);
            int num = Integer.parseInt(item[8]);
            ;

            Villa villa = new Villa(serviceName, usableArea, rentalCosts, peopleMaximum,
                    rentalType, romStandard, poolArea, numberFloors);
            facilityIntegerMap.put(villa, num);
        }

        /**
         * House
         */
        list.clear();
        list = ReadAndWriteFileTask1.ReadFile(pathHouse);
        for (String[] item : list) {
            String serviceName = item[0];
            double usableArea = Double.parseDouble(item[1]);
            double rentalCosts = Double.parseDouble(item[2]);
            int peopleMaximum = Integer.parseInt(item[3]);
            String rentalType = item[4];
            String romStandard = item[5];
            double numberFloors = Double.parseDouble(item[6]);
            int num = Integer.parseInt(item[7]);

            House house = new House(serviceName, usableArea, rentalCosts, peopleMaximum,
                    rentalType, romStandard, numberFloors);
            facilityIntegerMap.put(house, num);
        }

        /**
         * Room
         */
        list.clear();
        list = ReadAndWriteFileTask1.ReadFile(pathRoom);
        for (String[] item : list) {
            String serviceName = item[0];
            double usableArea = Double.parseDouble(item[1]);
            double rentalCosts = Double.parseDouble(item[2]);
            int peopleMaximum = Integer.parseInt(item[3]);
            String rentalType = item[0];
            String serviceFree = item[0];
            int num = Integer.parseInt(item[7]);

            Room room = new Room(serviceName, usableArea, rentalCosts,
                    peopleMaximum, rentalType, serviceFree);
            facilityIntegerMap.put(room, num);
        }

        do {
            try {
                System.out.println("---Ch???n ki???u mu???n th??m---\n" +
                        "1. Add Villa \n" +
                        "2. Add Huose \n" +
                        "3. Add Room \n" +
                        "4. Tho??t \n" );
                String input = scanner.nextLine();
                switch (input) {
                    case "1":
                        System.out.println("Nh???p t??n d???ch v???: " );
                        String serviceName = scanner.nextLine();

                        System.out.println("Nh???p Di???n t??ch s??? d???ng: " );
                        double usableArea = Double.parseDouble(scanner.nextLine());

                        System.out.println("Nh???p Chi ph?? thu??: " );
                        double rentalCosts = Double.parseDouble(scanner.nextLine());

                        System.out.println("Nh???p S??? l?????ng ng?????i t???i ??a: " );
                        int peopleMaximum = Integer.parseInt(scanner.nextLine());

                        System.out.println("Nh???p Ki???u thu??: " );
                        String rentalType = FacilityRentalType.rentalType();

                        System.out.println("Nh???p Ti??u chu???n ph??ng: " );
                        String romStandard = scanner.nextLine();

                        System.out.println("Nh???p Di???n t??ch h??? b??i: " );
                        double poolArea = Double.parseDouble(scanner.nextLine());

                        System.out.println("Nh???p S??? T???ng: " );
                        int numberFloors = Integer.parseInt(scanner.nextLine());

                        Villa villa = new Villa(serviceName, usableArea, rentalCosts, peopleMaximum,
                                rentalType, romStandard, poolArea, numberFloors);
                        villaIntegerMap.put(villa, 0);

                        String str = "";
                        for (Map.Entry<Villa, Integer> item : villaIntegerMap.entrySet()) {
                            String line = item.getKey().cover() + "," + item.getValue();
                            str += line + "\n";
                        }
                        ReadAndWriteFileTask1.WriteFile(pathVilla, str);
                        System.out.println("???? th??m th??nh c??ng" );
                        break;
                    case "2":
                        System.out.println("Nh???p t??n d???ch v???: " );
                        String serviceName1 = scanner.nextLine();

                        System.out.println("Nh???p Di???n t??ch s??? d???ng: " );
                        double usableArea1 = Double.parseDouble(scanner.nextLine());

                        System.out.println("Nh???p Chi ph?? thu??: " );
                        double rentalCosts1 = Double.parseDouble(scanner.nextLine());

                        System.out.println("Nh???p S??? l?????ng ng?????i t???i ??a: " );
                        int peopleMaximum1 = Integer.parseInt(scanner.nextLine());

                        System.out.println("Nh???p Ki???u thu??: " );
                        String rentalType1 = FacilityRentalType.rentalType();

                        System.out.println("Nh???p Ti??u chu???n ph??ng: " );
                        String romStandard1 = scanner.nextLine();

                        System.out.println("Di???n t??ch h??? b??i: " );
                        double numberFloors1 = Double.parseDouble(scanner.nextLine());

                        House house = new House(serviceName1, usableArea1, rentalCosts1, peopleMaximum1, rentalType1, romStandard1, numberFloors1);
                        houseIntegerMap.put(house, 0);

                        String str1 = "";
                        for (Map.Entry<House, Integer> item : houseIntegerMap.entrySet()) {
                            String line = item.getKey().cover() + "," + item.getValue();
                            str1 += line + "\n";
                        }
                        ReadAndWriteFileTask1.WriteFile(pathHouse, str1);
                        System.out.println("???? th??m th??nh c??ng" );
                        break;
                    case "3":
                        System.out.println("Nh???p t??n d???ch v???: " );
                        String serviceName2 = scanner.nextLine();

                        System.out.println("Nh???p Di???n t??ch s??? d???ng: " );
                        double usableArea2 = Double.parseDouble(scanner.nextLine());

                        System.out.println("Nh???p Chi ph?? thu??: " );
                        double rentalCosts2 = Double.parseDouble(scanner.nextLine());

                        System.out.println("Nh???p S??? l?????ng ng?????i t???i ??a: " );
                        int peopleMaximum2 = Integer.parseInt(scanner.nextLine());

                        System.out.println("Nh???p Ki???u thu??: " );
                        String rentalType2 = FacilityRentalType.rentalType();

                        System.out.println("D???ch v??? mi???n ph?? ??i k??m " );
                        String serviceFree = FacilityRentalType.rentalType();

                        Room room = new Room(serviceName2, usableArea2, rentalCosts2, peopleMaximum2, rentalType2, serviceFree);
                        roomIntegerMap.put(room, 0);

                        String str2 = "";
                        for (Map.Entry<Room, Integer> item : roomIntegerMap.entrySet()) {
                            str2 += item.getKey().cover() + "," + item.getValue() + "\n";

                        }
                        ReadAndWriteFileTask1.WriteFile(pathRoom, str2);
                        System.out.println("???? th??m m???i th??nh c??ng" );
                        break;
                    case "4":
                        System.out.println("Tho??t" );
                        return;
                    default:
                        System.err.println("Nh???p sai, Nh???p l???i 1--4" );
                }
            } catch (Exception e) {

                e.printStackTrace();
                System.err.println("--Nh???p sai ?????nh d???ng--" );
            }
        } while (true);
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void displayMaintain() {
        List<String[]> list =ReadAndWriteFileTask1.ReadFile(pathVilla);
        /**
         * Villa....
         */
        ;
        facilityIntegerMap.clear();
        for (String[] item : list) {
            String serviceName = item[0];
            double usableArea = Double.parseDouble(item[1]);
            double rentalCosts = Double.parseDouble(item[2]);
            int peopleMaximum = Integer.parseInt(item[3]);
            String rentalType = item[4];
            String romStandard = item[5];
            double poolArea = Double.parseDouble(item[6]);
            int numberFloors = Integer.parseInt(item[7]);
            int num = Integer.parseInt(item[8]);
            ;

            Villa villa = new Villa(serviceName, usableArea, rentalCosts, peopleMaximum,
                    rentalType, romStandard, poolArea, numberFloors);
            facilityIntegerMap.put(villa, num);
        }

        /**
         * House
         */
        list.clear();
        list = ReadAndWriteFileTask1.ReadFile(pathHouse);
        for (String[] item : list) {
            String serviceName = item[0];
            double usableArea = Double.parseDouble(item[1]);
            double rentalCosts = Double.parseDouble(item[2]);
            int peopleMaximum = Integer.parseInt(item[3]);
            String rentalType = item[4];
            String romStandard = item[5];
            double numberFloors = Double.parseDouble(item[6]);
            int num = Integer.parseInt(item[7]);

            House house = new House(serviceName, usableArea, rentalCosts, peopleMaximum,
                    rentalType, romStandard, numberFloors);
            facilityIntegerMap.put(house, num);
        }

        /**
         * Room
         */
        list.clear();
        list = ReadAndWriteFileTask1.ReadFile(pathRoom);
        for (String[] item : list) {
            String serviceName = item[0];
            double usableArea = Double.parseDouble(item[1]);
            double rentalCosts = Double.parseDouble(item[2]);
            int peopleMaximum = Integer.parseInt(item[3]);
            String rentalType = item[0];
            String serviceFree = item[0];
            int num = Integer.parseInt(item[7]);

            Room room = new Room(serviceName, usableArea, rentalCosts,
                    peopleMaximum, rentalType, serviceFree);
            facilityIntegerMap.put(room, num);
        }
        for (Map.Entry<Facility,Integer> item: facilityIntegerMap.entrySet()){

            if (item.getValue() >=5) {
                System.out.println("??ang ki???m tra...\n" + item.getKey()+ "\n ---Qu?? t???i c???n b???o tr??");
            }
        }
    }
}

