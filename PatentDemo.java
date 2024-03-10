import java.util.Arrays;
import java.util.Comparator;

public class PatentDemo {
    public static void main(String[] args)
    {
        System.out.print("\033[H\033[2J");
        Patent[] patents=new Patent[3];
        patents[0]=new Patent(2,"Машина времени",new Inventor("A"));
        patents[1]=new Patent(3,"Вакцина вечной жизни",new Inventor("B"));
        patents[2]=new Patent(1,"ЗВЕЗДА СМЕРТИ",new Inventor("C"));
        
        Arrays.sort(patents);
        System.out.println("Сортировка объектов класса по номеру с помощью интерфейса Comparable");
        System.out.println(Arrays.toString(patents));

        Comparator<Patent> byNumber = new Comparator<Patent>(){
            @Override
            public int compare(Patent obj1, Patent obj2)
            {
                return obj1.getNumber()-obj2.getNumber();
            }
        };

        Comparator<Patent> byTopic = new Comparator<Patent>(){
            @Override
            public int compare(Patent obj1, Patent obj2)
            {
                return obj1.getTopic().compareTo(obj2.getTopic());
            }
        };

        Comparator<Patent> byinventor = new Comparator<Patent>(){
            @Override
            public int compare(Patent obj1, Patent obj2)
            {
                return obj1.getInventor().getName().compareTo(obj2.getInventor().getName());
            }
        };
        
        Arrays.sort(patents,byTopic);
        System.out.println("Сортировка объектов класса по теме с помощью интерфейса Comparator");
        System.out.println(Arrays.toString(patents));

        Arrays.sort(patents,byinventor);
        System.out.println("Сортировка объектов класса по имени изобретателя с помощью интерфейса Comparator");
        System.out.println(Arrays.toString(patents));

        Arrays.sort(patents,byNumber);
        System.out.println("Сортировка объектов класса по номеру с помощью интерфейса Comparator");
        System.out.println(Arrays.toString(patents));

        PatentRecord[] patentRecords=new PatentRecord[3];
        patentRecords[0]=new PatentRecord(2,"Машина времени",new Inventor("A"));
        patentRecords[1]=new PatentRecord(3,"Вакцина вечной жизни",new Inventor("B"));
        patentRecords[2]=new PatentRecord(1,"ЗВЕЗДА СМЕРТИ",new Inventor("C"));
        
        Arrays.sort(patentRecords);
        System.out.println("Сортировка объектов record-класса по номеру с помощью интерфейса Comparable");
        System.out.println(Arrays.toString(patentRecords));

        Comparator<PatentRecord> byNumberRecord = new Comparator<PatentRecord>(){
            @Override
            public int compare(PatentRecord obj1, PatentRecord obj2)
            {
                return obj1.number()-obj2.number();
            }
        };

        Comparator<PatentRecord> byTopicRecord = new Comparator<PatentRecord>(){
            @Override
            public int compare(PatentRecord obj1, PatentRecord obj2)
            {
                return obj1.topic().compareTo(obj2.topic());
            }
        };

        Comparator<PatentRecord> byinventorRecord = new Comparator<PatentRecord>(){
            @Override
            public int compare(PatentRecord obj1, PatentRecord obj2)
            {
                return obj1.inventor().getName().compareTo(obj2.inventor().getName());
            }
        };

        Arrays.sort(patentRecords,byTopicRecord);
        System.out.println("Сортировка объектов record-класса по теме с помощью интерфейса Comparator");
        System.out.println(Arrays.toString(patentRecords));

        Arrays.sort(patentRecords,byinventorRecord);
        System.out.println("Сортировка объектов record-класса по имени изобретателя с помощью интерфейса Comparator");
        System.out.println(Arrays.toString(patentRecords));

        Arrays.sort(patentRecords,byNumberRecord);
        System.out.println("Сортировка объектов record-класса по номеру с помощью интерфейса Comparator");
        System.out.println(Arrays.toString(patentRecords));
    }
}
