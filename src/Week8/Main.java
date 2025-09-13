package Week8;
import java.util.ArrayList;
import java.util.HashMap;
import Week8.interfaces.CivilService;
import Week8.interfaces.MilitaryService;

        public class Main {
            public static void main(String[] args) {
                RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
                RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
                RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");

                ArrayList<RegistrationPlate> finnish = new ArrayList<RegistrationPlate>();
                finnish.add(reg1);
                finnish.add(reg2);

                RegistrationPlate newPlate = new RegistrationPlate("FI", "ABC-123");
                if (!finnish.contains(newPlate)) {
                    finnish.add(newPlate);
                }
                System.out.println("Finnish: " + finnish);
                // if the equals method hasn't been overwritten, the same registration plate is repeated in the list

                HashMap<RegistrationPlate, String> owners = new HashMap<RegistrationPlate, String>();
                owners.put(reg1, "Arto");
                owners.put(reg3, "Jürgen");

                System.out.println("owners:");
                System.out.println(owners.get(new RegistrationPlate("FI", "ABC-123")));
                System.out.println(owners.get(new RegistrationPlate("D", "B WQ-431")));

                // Now using VehicleRegister instead of HashMap directly
                VehicleRegister register = new VehicleRegister();
                register.add(reg1, "Arto");
                register.add(reg3, "Jürgen");

                System.out.println("owners:");
                System.out.println(register.get(new RegistrationPlate("FI", "ABC-123")));
                System.out.println(register.get(new RegistrationPlate("D", "B WQ-431")));
                // if the hashCode hasn't been overwritten, the owners are not found
                System.out.println(register.delete(reg1));
                System.out.println(register.delete(reg2));

                System.out.println();
                register.printRegistrationPlates();
                System.out.println();
                register.printOwners();

                // Testing exercise 10

                System.out.println("Testing NationalService");

                CivilService civil = new CivilService(362);
                MilitaryService military = new MilitaryService(180);

                System.out.println("Civil service days: " + civil.getDaysLeft());
                System.out.println("Military service days: " + military.getDaysLeft());

                civil.work();
                military.work();

                System.out.println("After one day of work:");
                System.out.println("Civil service days: " + civil.getDaysLeft());
                System.out.println("Military service days: " + military.getDaysLeft());



            }


        }
