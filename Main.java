class Main {
  public static void main(String[] args) {
    Hotel cali = new Hotel("Cali", 3);
    cali.requestRoom("andrew");
    cali.requestRoom("sherry");
    cali.requestRoom("dave");
    cali.requestRoom("tate");
    cali.requestRoom("catherine");
    cali.printCurrentReservations();
    cali.printCurrentWaitlist();
    cali.cancelAndReassign(cali.getRooms()[0]);
    cali.printCurrentReservations();
    cali.printCurrentWaitlist();
  }
}