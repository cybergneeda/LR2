import java.util.Objects;

public class Patent implements Comparable<Patent>{
private int number;
private String topic;
private Inventor inventor;

public Patent(int number, String topic, Inventor inventor) {
    this.number = number;
    this.topic = topic;
    this.inventor = inventor;
}
public void setNumber(int number) {
    this.number = number;
}
public void setTopic(String topic) {
    this.topic = topic;
}
public void setInventor(Inventor inventor) {
    this.inventor = inventor;
}
public int getNumber() {
    return number;
}
public String getTopic() {
    return topic;
}
public Inventor getInventor() {
    return inventor;
}

@Override
public int hashCode() {
  return Objects.hash(number,topic,inventor);
}

@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Patent other = (Patent) obj;
    if (number != other.number)
        return false;
    if (topic == null) {
        if (other.topic != null)
            return false;
    } else if (!topic.equals(other.topic))
        return false;
    if (inventor == null) {
        if (other.inventor != null)
            return false;
    } else if (!inventor.equals(other.inventor))
        return false;
    return true;
}

@Override
public String toString() {
    return "Патент " + number + ", тема: " + topic + ", изобретатель: " + inventor;
}

@Override
public int compareTo(Patent obj) {
    return this.number-obj.number;
}
}
