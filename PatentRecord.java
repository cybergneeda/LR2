public record PatentRecord(int number, String topic,Inventor inventor) implements Comparable<PatentRecord>
 {
    @Override
    public int compareTo(PatentRecord obj)
    {
        return this.number-obj.number;
    }

    public PatentRecord
    {
        if (number<0) throw new IllegalArgumentException("Number must be positive");
    }

    public PatentRecord(String topic,Inventor inventor)
    {
        this(7777777,topic,inventor);
    }

    @Override
    public String toString() {
        return "Патент-record " + number + ", тема: " + topic + ", изобретатель: " + inventor;
    }
    
}
