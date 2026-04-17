import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TicketTest {
    //
    @Test
    public void TicketSortingTest() {
        AviaSouls managers = new AviaSouls();
        Ticket ticket1 = new Ticket("DME", "SVO", 3500, 800, 930);
        Ticket ticket2 = new Ticket("DME", "SVO", 5200, 1030, 1220);
        Ticket ticket3 = new Ticket("SVO", "LED", 4800, 1400, 1550);
        Ticket ticket4 = new Ticket("DME", "SVO", 4900, 1800, 1950);
        Ticket ticket5 = new Ticket("VKO", "KZN", 6700, 620, 840);
        Ticket ticket6 = new Ticket("DME", "SVO", 7100, 1520, 1725);
        Ticket ticket7 = new Ticket("SVO", "KZN", 6950, 1930, 2135);
        Ticket ticket8 = new Ticket("DME", "SVO", 5200, 1620, 1810);
        managers.add(ticket1);
        managers.add(ticket2);
        managers.add(ticket3);
        managers.add(ticket4);
        managers.add(ticket5);
        managers.add(ticket6);
        managers.add(ticket7);
        managers.add(ticket8);
        Ticket[] actual = managers.search("DME", "SVO");
        Ticket[] expected = {ticket1, ticket4, ticket2, ticket8, ticket6};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void TicketSortingTestEmpty() {
        AviaSouls managers = new AviaSouls();
        Ticket ticket1 = new Ticket("DME", "SVO", 3500, 800, 930);
        Ticket ticket2 = new Ticket("DME", "SVO", 5200, 1030, 1220);
        Ticket ticket3 = new Ticket("SVO", "LED", 4800, 1400, 1550);
        Ticket ticket4 = new Ticket("DME", "SVO", 4900, 1800, 1950);
        Ticket ticket5 = new Ticket("VKO", "KZN", 6700, 620, 840);
        Ticket ticket6 = new Ticket("DME", "SVO", 7100, 1520, 1725);
        Ticket ticket7 = new Ticket("SVO", "KZN", 6950, 1930, 2135);
        Ticket ticket8 = new Ticket("DME", "SVO", 5200, 1620, 1810);
        managers.add(ticket1);
        managers.add(ticket2);
        managers.add(ticket3);
        managers.add(ticket4);
        managers.add(ticket5);
        managers.add(ticket6);
        managers.add(ticket7);
        managers.add(ticket8);
        Ticket[] actual = managers.search("SVO", "DME");
        Ticket[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void TicketSortingTestOneResult() {
        AviaSouls managers = new AviaSouls();
        Ticket ticket1 = new Ticket("DME", "SVO", 3500, 800, 930);
        Ticket ticket2 = new Ticket("DME", "SVO", 5200, 1030, 1220);
        Ticket ticket3 = new Ticket("SVO", "LED", 4800, 1400, 1550);
        Ticket ticket4 = new Ticket("DME", "SVO", 4900, 1800, 1950);
        Ticket ticket5 = new Ticket("VKO", "KZN", 6700, 620, 840);
        Ticket ticket6 = new Ticket("DME", "SVO", 7100, 1520, 1725);
        Ticket ticket7 = new Ticket("SVO", "KZN", 6950, 1930, 2135);
        Ticket ticket8 = new Ticket("DME", "SVO", 5200, 1620, 1810);
        managers.add(ticket1);
        managers.add(ticket2);
        managers.add(ticket3);
        managers.add(ticket4);
        managers.add(ticket5);
        managers.add(ticket6);
        managers.add(ticket7);
        managers.add(ticket8);
        Ticket[] actual = managers.search("VKO", "KZN");
        Ticket[] expected = {ticket5};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void TicketComparatorSortingTest() {
        AviaSouls managers = new AviaSouls();
        Ticket ticket1 = new Ticket("DME", "SVO", 3500, 11, 12);//1
        Ticket ticket2 = new Ticket("DME", "SVO", 5200, 9, 14);//5
        Ticket ticket3 = new Ticket("SVO", "LED", 4800, 7, 11);
        Ticket ticket4 = new Ticket("DME", "SVO", 4900, 22, 24);//2
        Ticket ticket5 = new Ticket("VKO", "KZN", 6700, 1, 5);
        Ticket ticket6 = new Ticket("DME", "SVO", 7100, 1, 12);//11
        Ticket ticket7 = new Ticket("SVO", "KZN", 6950, 4, 6);
        Ticket ticket8 = new Ticket("DME", "SVO", 5200, 2, 9);//7
        managers.add(ticket1);
        managers.add(ticket2);
        managers.add(ticket3);
        managers.add(ticket4);
        managers.add(ticket5);
        managers.add(ticket6);
        managers.add(ticket7);
        managers.add(ticket8);
        Ticket[] actual = managers.search("DME", "SVO");
        Ticket[] expected = {ticket1, ticket4, ticket2, ticket8, ticket6};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void TicketComparatorSortingTestEmpty() {
        AviaSouls managers = new AviaSouls();
        Ticket ticket1 = new Ticket("DME", "SVO", 3500, 11, 12);//1
        Ticket ticket2 = new Ticket("DME", "SVO", 5200, 9, 14);//5
        Ticket ticket3 = new Ticket("SVO", "LED", 4800, 7, 11);
        Ticket ticket4 = new Ticket("DME", "SVO", 4900, 22, 24);//2
        Ticket ticket5 = new Ticket("VKO", "KZN", 6700, 1, 5);
        Ticket ticket6 = new Ticket("DME", "SVO", 7100, 1, 12);//11
        Ticket ticket7 = new Ticket("SVO", "KZN", 6950, 4, 6);
        Ticket ticket8 = new Ticket("DME", "SVO", 5200, 2, 9);//70);
        managers.add(ticket1);
        managers.add(ticket2);
        managers.add(ticket3);
        managers.add(ticket4);
        managers.add(ticket5);
        managers.add(ticket6);
        managers.add(ticket7);
        managers.add(ticket8);
        Ticket[] actual = managers.search("SVO", "DME");
        Ticket[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void TicketComparatorSortingTestOneResult() {
        AviaSouls managers = new AviaSouls();
        Ticket ticket1 = new Ticket("DME", "SVO", 3500, 11, 12);//1
        Ticket ticket2 = new Ticket("DME", "SVO", 5200, 9, 14);//5
        Ticket ticket3 = new Ticket("SVO", "LED", 4800, 7, 11);
        Ticket ticket4 = new Ticket("DME", "SVO", 4900, 22, 24);//2
        Ticket ticket5 = new Ticket("VKO", "KZN", 6700, 1, 5);
        Ticket ticket6 = new Ticket("DME", "SVO", 7100, 1, 12);//11
        Ticket ticket7 = new Ticket("SVO", "KZN", 6950, 4, 6);
        Ticket ticket8 = new Ticket("DME", "SVO", 5200, 2, 9);//7
        managers.add(ticket1);
        managers.add(ticket2);
        managers.add(ticket3);
        managers.add(ticket4);
        managers.add(ticket5);
        managers.add(ticket6);
        managers.add(ticket7);
        managers.add(ticket8);
        Ticket[] actual = managers.search("VKO", "KZN");
        Ticket[] expected = {ticket5};
        Assertions.assertArrayEquals(expected, actual);
    }

}