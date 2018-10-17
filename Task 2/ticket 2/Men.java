package patient;


public class Men extends Animal {
    public Birthday birthday;
    public Name name;
    Men(Birthday birthday,Name name) {
    this.birthday = birthday;
    this.name = name;

    birthday.displayInfoBirthday();
    name.displayInfoName();
}
}





