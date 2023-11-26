
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Smanage{
    private ArrayList<Member> members;
    private HashMap<String, Apartment> apartments;

    public Smanage() {
        members = new ArrayList<>();
        apartments = new HashMap<>();
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void addApartment(Apartment apartment) {
        apartments.put(apartment.getNumber(), apartment);
    }

    public void allocateApartment(Member member, Apartment apartment) {
        member.setApartment(apartment);
        apartment.setOccupant(member);
    }

    public void showMemberList() {
        System.out.println("List of Society Members:");
        for (Member member : members) {
            System.out.println(member);
        }
    }

    public void showApartmentList() {
        System.out.println("List of Society Apartments:");
        for (Apartment apartment : apartments.values()) {
            System.out.println(apartment);
        }
    }

public static void main(String[] args) {
        Smanage society = new Smanage();
        Scanner scanner = new Scanner(System.in);

        // Adding members
        society.addMember(new Member("John Doe", "A101"));
        society.addMember(new Member("Jane Doe", "B202"));
        society.addMember(new Member("Mike Smith", "C303"));

        // Adding apartments
        society.addApartment(new Apartment("A101", 2, 1000));
        society.addApartment(new Apartment("B202", 3, 2000));
        society.addApartment(new Apartment("C303", 1, 500));

        // Allocating apartments to members
        society.allocateApartment(society.members.get(0), society.apartments.get("A101"));
        society.allocateApartment(society.members.get(1), society.apartments.get("B202"));
        society.allocateApartment(society.members.get(2), society.apartments.get("C303"));

        // Showing member and apartment lists
        society.showMemberList();
        society.showApartmentList();

        scanner.close();
    }
}

class Member {
    private String name;
    private Apartment apartment;

    public Member(String name, String apartmentNumber) {
        this.name = name;
        this.apartment = null;
    }

    public void setApartment(Apartment apartment) {
        this.apartment = apartment;
    }

    public String getName() {
        return name;
    }

    public Apartment getApartment() {
        return apartment;
    }

    public String toString() {
        return name + " (Apartment: " + (apartment != null ? apartment.getNumber() : "N/A") + ")";
    }
}

class Apartment {
    private String number;
    private int numBedrooms;
    private double rent;
    private Member occupant;

    public Apartment(String number, int numBedrooms, double rent) {
        this.number = number;
        this.numBedrooms = numBedrooms;
        this.rent = rent;
        this.occupant = null;
    }

    public String getNumber() {
        return number;
    }

    public int getNumBedrooms() {
        return numBedrooms;
    }

    public double getRent() {
        return rent;
    }

    public Member getOccupant() {
        return occupant;
    }

    public void setOccupant(Member occupant)
    {
        this.occupant = occupant;
    }

    public String toString() {
        return "Apartment " + number; }
}

        
        
        