package SP.service.Impl;


import SP.models.facility.House;
import SP.models.facility.Room;
import SP.models.facility.Vila;
import SP.service.FacilityService;
import SP.utils.ReadAndWrite;
import SP.utils.RegexData;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    public static final String REGEX_STR = "[A-Z][a-z]+";
    public static final String REGEX_ID_VILLA = "(SVVL)[-][\\d]{4}";
    public static final String REGEX_ID_HOUSE = "(SVHO)[-][\\d]{4}";
    public static final String REGEX_ID_ROOM = "(SVRO)[-][\\d]{4}";
    public static final String REGEX_AMOUNT = "^[1-9]|([1][0-9])|(20)$";
    public static final String REGEX_INT = "^[0-9]+$";
    public static final String REGEX_AREA = "^([3-9]\\d|[1-9]\\d{2,})$";

    private static Map<Vila, Integer> villaList = new LinkedHashMap<>();
    private static Map<House, Integer> houseList = new LinkedHashMap<>();
    private static Map<Room, Integer> roomList = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        Set<Vila> vilaSet = villaList.keySet();
        readFileVilla();
        for (Vila vila : vilaSet) {
            System.out.println(vila + " " + villaList.get(vila));
        }
        Set<House> houseSet = houseList.keySet();
        readFileHouse();
        for (House house : houseSet) {
            System.out.println(house + " " + houseList.get(house));
        }
        Set<Room> roomSet = roomList.keySet();
        readFileRoom();
        for (Room room : roomSet) {
            System.out.println(room);
        }
    }

    @Override
    public void displayMaintain() {
        Set<Vila> vilaSet = villaList.keySet();
        for (Vila vila : vilaSet) {
            if (villaList.get(vila) >= 5) {
                System.out.println(vila);
            }
        }
        Set<House> houseSet = houseList.keySet();
        for (House house : houseSet) {
            if (houseList.get(house) >= 5) {
                System.out.println(house);
            }
        }
        Set<Room> roomSet = roomList.keySet();
        for (Room room : roomSet) {
            if (roomList.get(room) >= 5) {
                System.out.println(room);
            }
        }
    }

    public String getStyleRental() {
        do {
            System.out.println("Ch???n ki???u thu??");
            System.out.println("1.N??m");
            System.out.println("2.Th??ng");
            System.out.println("3.Ng??y");
            System.out.println("1.Gi???");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    return "N??m";
                case 2:
                    return "Th??ng";
                case 3:
                    return "Ng??y";
                case 4:
                    return "Gi???";
                default:
                    System.out.println("Ch???n sai r???i!! Ch???n l???i ??i");
                    getStyleRental();
            }
        } while (true);
    }

    @Override
    public void addNewVilla() {
        String id = inputIdVilla();
        String name = inputName();
        double areaUse = Double.parseDouble(inputAreaUse());
        int rentalPrice = Integer.parseInt(inputRentalPrice());
        int rentalPeopleMax = Integer.parseInt(inputRentalPeopleMax());
        String styleRental = getStyleRental();
        String standardVilla = inputStandard();
        double areaPool = Double.parseDouble(inputAreaPool());
        int floor = Integer.parseInt(inputFloor());
        Vila vila = new Vila(id, name, areaUse, rentalPrice, rentalPeopleMax, styleRental, standardVilla, areaPool, floor);
        villaList.put(vila, 0);
        writeFileVilla();
        System.out.println("???? th??m m???i th??nh c??ng");
    }

    public void writeFileVilla() {
        Set<Vila> vilaSet = villaList.keySet();
        for (Vila vila : vilaSet) {
            String line = vila.getIdFacility() + "," + vila.getNamService() + "," + vila.getAreaUse() + "," + vila.getRentalPrice() + ","
                    + vila.getRentalPeopleMax() + "," + vila.getStyleRental() + "," + vila.getStandardVilla() + "," + vila.getAreaPool() + ","
                    + vila.getFloor() + "," + villaList.get(vila);
            ReadAndWrite.writeFile("src\\casestudy\\data\\villa.csv", line);
        }
    }

    public void readFileVilla() {
        Set<Vila> vilaSet = villaList.keySet();
        List<String[]> listStr = ReadAndWrite.readFile("src\\casestudy\\data\\villa.csv");
        villaList.clear();
        for (String[] item : listStr) {
            if (item.length != 1) {
                Vila vila = new Vila(item[0], item[1], Double.parseDouble(item[2]), Integer.parseInt(item[3]), Integer.parseInt(item[4]), item[5],
                        item[6], Double.parseDouble(item[7]), Integer.parseInt(item[8]));
                villaList.put(vila, Integer.parseInt(item[9]));
            }
        }
    }

    private String inputIdVilla() {
        System.out.println("Nh???p id, m?? d???ch v???: ");
        return RegexData.regexStr(REGEX_ID_VILLA);
    }

    private String inputIdHouse() {
        System.out.println("Nh???p id, m?? d???ch v???: ");
        return RegexData.regexStr1(REGEX_ID_HOUSE);
    }

    private String inputIdRoom() {
        System.out.println("Nh???p id, m?? d???ch v???: ");
        return RegexData.regexStr2(REGEX_ID_ROOM);
    }

    private String inputName() {
        System.out.println("Nh???p t??n d???ch v???: ");
        return RegexData.regexStr3(REGEX_STR);
    }

    private String inputRentalPrice() {
        System.out.println("Nh???p gi?? ti???n: ");
        return RegexData.regexStr6(REGEX_INT);
    }

    private String inputAreaUse() {
        System.out.println("Nh???p di???n t??ch: ");
        return RegexData.regexStr5(REGEX_AREA);
    }

    private String inputRentalPeopleMax() {
        System.out.println("Nh???p s??? l?????ng ng?????i: ");
        return RegexData.regexStr4(REGEX_AMOUNT);
    }

    private String inputStandard() {
        System.out.println("Nh???p ti??u chu???n d???ch v???: ");
        return RegexData.regexStr3(REGEX_STR);
    }

    private String inputAreaPool() {
        System.out.println("Nh???p di???n t??ch h??? b??i: ");
        return RegexData.regexStr5(REGEX_AREA);
    }

    private String inputFloor() {
        System.out.println("Nh???p s??? t???ng: ");
        return RegexData.regexStr6(REGEX_INT);
    }


    @Override
    public void addNewHouse() {
        String id = inputIdHouse();
        String name = inputName();
        double areaUse = Double.parseDouble(inputAreaUse());
        int rentalPrice = Integer.parseInt(inputRentalPrice());
        int rentalPeopleMax = Integer.parseInt(inputRentalPeopleMax());
        String styleRental = getStyleRental();
        String standardRoom = inputStandard();
        int floor = Integer.parseInt(inputFloor());
        House house = new House(id, name, areaUse, rentalPrice, rentalPeopleMax, styleRental, standardRoom, floor);
        houseList.put(house, 0);
        writeFileHouse();
        System.out.println("???? th??m m???i th??nh c??ng");
    }

    public void writeFileHouse() {
        Set<House> houseSet = houseList.keySet();
        for (House house : houseSet) {
            String line = house.getIdFacility() + "," + house.getNamService() + "," + house.getAreaUse() + "," + house.getRentalPrice() + "," + house.getRentalPeopleMax()
                    + "," + house.getStyleRental() + "," + house.getStandardRoom() + "," + house.getFloor() + "," + houseList.get(house);
            ReadAndWrite.writeFile("src\\casestudy\\data\\house.csv", line);
        }
    }

    public void readFileHouse() {
        Set<House> houseSet = houseList.keySet();
        List<String[]> list = ReadAndWrite.readFile("src\\casestudy\\data\\house.csv");
        houseList.clear();
        for (String[] strings : list) {
            if (strings.length != 1) {
                House house = new House(strings[0], strings[1], Double.parseDouble(strings[2]), Integer.parseInt(strings[3]), Integer.parseInt(strings[4]), strings[5],
                        strings[6], Integer.parseInt(strings[7]));
                houseList.put(house, Integer.parseInt(strings[8]));
            }
        }
    }

    @Override
    public void addNewRoom() {
        String id = inputIdRoom();
        String name = inputName();
        double areaUse = Double.parseDouble(inputAreaUse());
        int rentalPrice = Integer.parseInt(inputRentalPrice());
        int rentalPeopleMax = Integer.parseInt(inputRentalPeopleMax());
        String styleRental = getStyleRental();
        String freeService = inputStandard();
        Room room = new Room(id, name, areaUse, rentalPrice, rentalPeopleMax, styleRental, freeService);
        roomList.put(room, 0);
        writeFileRoom();
        System.out.println("???? th??m m???i th??nh c??ng");
    }

    public void writeFileRoom() {
        Set<Room> roomSet = roomList.keySet();
        for (Room room : roomSet) {
            String line = room.getIdFacility() + "," + room.getNamService() + "," + room.getAreaUse() + "," + room.getRentalPrice() + "," + room.getRentalPeopleMax() + "," +
                    room.getStyleRental() + "," + room.getFreeService() + "," + roomList.get(room);
            ReadAndWrite.writeFile("src\\casestudy\\data\\room.csv", line);
        }
    }

    public void readFileRoom() {
        List<String[]> list1 = ReadAndWrite.readFile("src\\casestudy\\data\\room.csv");
        roomList.clear();
        for (String[] string : list1) {
            if (string.length != 1) {
                Room room = new Room(string[0], string[1], Double.parseDouble(string[2]), Integer.parseInt(string[3]), Integer.parseInt(string[4]), string[5], string[6]);
                roomList.put(room, Integer.parseInt(string[7]));
            }
        }
    }
}
