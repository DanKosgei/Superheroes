import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Hero {

  private String mName;
  private int mAge;
  private String mStrength;
  private String mWeakness;
  private boolean mConcededDefeat;
  private LocalDateTime mCreatedAt;
  private static List<Hero> instances = new ArrayList<Hero>();
  private int mId;

  public Hero(String name, int age, String strength, String weakness){
    mName = name;
    mAge = age;
    mStrength = strength;
    mWeakness = weakness;
    mConcededDefeat = false;
    mCreatedAt = LocalDateTime.now();
    instances.add(this);
    mId = instances.size();
  }

  public String getName() {
    return mName;
  }

  public int getAge() {
    return mAge;
  }

  public String getStrength() {
    return mStrength;
  }

  public String getWeakness() {
    return mWeakness;
  }

  public boolean hasConcededDefeat() {
    return mConcededDefeat;
  }

  public LocalDateTime getCreatedAt() {
    return mCreatedAt;
  }

  public static List<Hero> all() {
    return instances;
  }

  public static void clear() {
    instances.clear();
  }

  public int getId() {
    return mId;
  }

  public static Hero find(int id) {
  return instances.get(id - 1);
  }
}
