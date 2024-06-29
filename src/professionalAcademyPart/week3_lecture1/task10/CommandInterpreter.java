package professionalAcademyPart.week3_lecture1.task10;

public class CommandInterpreter<T extends Comparable<T>> {
    private CustomList<T> list;

    public CommandInterpreter(CustomList<T> list) {
        this.setList(list);
    }

    public void interpret(String command) {
        String[] cmdComponents = command.split(" ");
        if(cmdComponents.length == 1) {
            switch (cmdComponents[0]) {
                case "Max" -> System.out.println(this.list.getMax());
                case "Min" -> System.out.println(this.list.getMin());
                case "Print" -> System.out.println(this.list);
            }
        } else if(cmdComponents.length == 2) {
            switch (cmdComponents[0]) {
                case "Add" -> this.list.add((T) cmdComponents[1]);
                case "Remove" -> this.list.remove(Integer.parseInt(cmdComponents[1]));
                case "Greater" -> System.out.println(this.list.countGreaterThan((T) cmdComponents[1]));
                case "Contains" -> System.out.println(this.list.contains((T) cmdComponents[1]));
            }
        } else if(cmdComponents.length == 3){
            this.list.swap(Integer.parseInt(cmdComponents[1]), Integer.parseInt(cmdComponents[2]));
        }
    }

    public CustomList<T> getList() {
        return list;
    }

    public void setList(CustomList<T> list) {
        this.list = list;
    }
}