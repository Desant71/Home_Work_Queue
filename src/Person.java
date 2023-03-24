public class Person {
    private String name;
    private String sureName;
    private int ticket;

    public Person(String name, String sureName, int ticket) {
        this.name = name;
        this.sureName = sureName;
        this.ticket = ticket;
    }

    public String getName() {
        return name;
    }
    public String getSureName() {
        return sureName;
    }
    public int getTicket() {
        return ticket;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

}
