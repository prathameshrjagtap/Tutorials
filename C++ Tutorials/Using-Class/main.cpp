#include <iostream>
using namespace std;

class person {
    char name[40];
    int age;
    char nationality[15];
    char location[15];

    public :
    void inputdata();
    void outputdata();
};

void person :: inputdata(void){
  
    std::cout << "Enter your name: " << "\n";
    std::cin >> name;
    std::cout << "Enter your age: " << "\n";
    std::cin >> age;
    std::cout << "Enter your nationality: " << "\n";
    std::cin >> nationality;
    std::cout << "Enter your locality: " << "\n";
    std::cin >> location;
  
}

void person :: outputdata(void){
  
    std::cout << "Your name is: \n" << name << "\n";
    std::cout << "Your age is: \n" << age << "\n";
    std::cout << "Your nationality is: \n" << nationality << "\n";
    std::cout << "Your locality is: \n" << location << "\n";
}
int main() {
  
    person p;
    p.inputdata();
    p.outputdata();
    return 0;
  
}
