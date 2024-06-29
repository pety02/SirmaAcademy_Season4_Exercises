package entryAcademyPart.entry_exam;

import java.util.*;

public class RohanCavalryFormation {
    private ArrayList<Integer> formation;
    private int size;

    private void remove(int index) {
        if(index < 0 || this.formation.size() < index) {
            return;
        }

        for (int i = index; i < this.size - 1; i++) {
            this.formation.add(i, this.formation.get(i + 1));
        }
        this.size--;
        System.out.printf("%s%n", this);
    }

    private void swap (int firstIndex, int secondIndex) {
        if(firstIndex == secondIndex) {
            return;
        }
        if(firstIndex < 0 || this.size < firstIndex) {
            return;
        }
        if(secondIndex < 0 || this.size < secondIndex) {
            return;
        }

        Collections.swap(this.formation, firstIndex, secondIndex);
        System.out.printf("%s%n", this);
    }

    private void add(int element) {
        this.formation.add(this.size++, element);
        System.out.printf("%s%n", this);
    }

    private void insert(int element, int index) {
        if(index < 0 || this.size < index) {
            return;
        }

        this.formation.add(this.size++, this.formation.get(this.formation.size() - 1));
        for (int i = this.formation.size() - 2; i >= index; i--) {
            this.formation.add(i, this.formation.get(i - 1));
        }
        this.formation.add(index, element);
        System.out.printf("%s%n", this);
    }

    private void center() {
        if(this.size <= 2) {
            return;
        }
        if(this.size % 2 == 0) {
            int fstCentralElement = this.formation.get(this.size / 2 - 1);
            int sndCentralElement = this.formation.get(this.size / 2);
            System.out.printf("%d %d%n", fstCentralElement, sndCentralElement);
        } else {
            int centralElement = this.formation.get(this.size / 2);
            System.out.printf("%d%n", centralElement);
        }
    }

    public RohanCavalryFormation(ArrayList<Integer> formation) {
        this.setFormation(formation);
        this.setSize(formation.size());
    }

    public void setFormation(ArrayList<Integer> formation) {
        this.formation = new ArrayList<>(formation);
    }

    public void setSize(int size) {
        this.size = Math.max(size, 0);
    }

    public void executeCommand(String commandLine) throws Exception{
        String[] params = commandLine.split(" ");
        String command = params[0];
        if(command.equals("destroy") && params.length == 2) {
            int index = Integer.parseInt(params[1]);
            this.remove(index);
        } else if(command.equals("swap") && params.length == 3) {
            int firstIndex = Integer.parseInt(params[1]);
            int secondIndex = Integer.parseInt(params[2]);
            this.swap(firstIndex, secondIndex);
        } else if(command.equals("add") && params.length == 2) {
            int element = Integer.parseInt(params[1]);
            this.add(element);
        } else if(command.equals("insert") && params.length == 3) {
            int element = Integer.parseInt(params[1]);
            int index = Integer.parseInt(params[2]);
            this.insert(element, index);
        } else if(command.equals("center") && params.length == 1) {
            this.center();
        } else {
            throw new Exception("Unknown command");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int index = 0; index < this.size; index++) {
            if(index == this.size - 1) {
                sb.append(String.format("%d", this.formation.get(index)));
                break;
            }
            sb.append(String.format("%d ", this.formation.get(index)));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] formationData = input.split(", ");
        ArrayList<Integer> formation = new ArrayList<>();
        for (String data : formationData) {
            formation.add(Integer.parseInt(data));
        }
        RohanCavalryFormation rohanCavalryFormation = new RohanCavalryFormation(formation);
        String currentCommandLine;
        List<String> commands = new LinkedList<>();
        do {
            currentCommandLine = scanner.nextLine();
            commands.add(currentCommandLine);
        } while(!currentCommandLine.equals("end"));
        for (String cmd : commands) {
            if(cmd.equals("end")) {
                break;
            }
            try {
                rohanCavalryFormation.executeCommand(cmd);
            } catch (Exception e) {
                // do not do anything - in real situation iy would be good to show
                // user-friendly message about the exception and to log it
            }
        }
    }
}