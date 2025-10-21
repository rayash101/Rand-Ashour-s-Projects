import random
from abc import ABC, abstractmethod

class StoreSection(ABC):
    def __init__(self, sportCategory):
        self.__sportCategory = sportCategory
        self.__products = []

    def addProduct(self, product):
        self.__products.append(product)

    def findProduct(self, name):
        for product in self.__products:
            if product.getName().lower() == name.lower():
                return product
        return None

    def getSportCategory(self):
        return self.__sportCategory

    def getProducts(self):
        return self.__products
    
class Product:
    def __init__(self, name: str, price: int, availability: bool):
        self.__name = name
        self.__price = price
        self.__availability = availability

    def getName(self):
        return self.__name

    def getPrice(self):
        return self.__price

    def is_available(self):
        return self.__availability

class Outdoor(StoreSection):
    def __init__(self, sportCategory):
        super().__init__(sportCategory)

    @staticmethod
    def apply_discount(total_price, team_size):
        discount = 2 if team_size < 10 else 5
        return total_price - discount if team_size >= 5 else total_price

    @classmethod
    def soccer(cls):
        sportCategory = "Soccer"
        section = cls(sportCategory)

        ball = Product("Soccer Ball", 5, True)
        net = Product("Net", 15, True)

        material_choices = ["leather", "synthetic"]
        while True:
            material = input("Enter what material you want for your soccer ball (leather/synthetic): ").lower()
            if material in material_choices:
                break
            print("Invalid material, enter leather or synthetic")

        size_choices = ["small", "medium", "large"]
        while True:
            size = input("Enter the size of the soccer net (small/medium/large): ").lower()
            if size in size_choices:
                break
            print("Invalid size, enter small, medium, or large")

        while True:
            try:
                team_size = int(input("How many people are on your team? "))
                total_price = ball.getPrice() + net.getPrice()
                final_price = cls.apply_discount(total_price, team_size)
                print(f"Total Price after discount (if eligible): ${final_price}")
                break
            except ValueError:
                print("Invalid input, enter a valid number")

        section.addProduct(ball)
        section.addProduct(net)
        return section
    @classmethod
    def camping(cls):
        sportCategory = "Camping"
        section = cls(sportCategory)

        tent = Product("Tent", 40, True)
        sleeping_bag = Product("Sleeping Bag", 20, True)
        stove = Product("Stove", 20, True)

        while True:
            try:
                num_tents = int(input("How many tents do you need? "))
                if num_tents < 1:
                    print("You need at least 1 tent")
                    continue
                break
            except ValueError:
                print("Invalid input, enter a valid number")

        size_choices = ["small", "medium", "large"]
        while True:
            size = input("Enter the size of the tent you want (small/medium/large): ").lower()
            if size in size_choices:
                break
            print("Invalid size, enter small, medium, or large")

        durability_choices = ["low", "medium", "high"]
        while True:
            durability = input("Enter the durability of the tent (low/medium/high): ").lower()
            if durability in durability_choices:
                break
            print("Invalid input, enter low, medium, or high")

        print("What else do you want?:")
        print("1 - Stove ($20)")
        print("2 - Sleeping Bag ($20)")
        print("3 - Both ($40)")
        print("4 - None")

        items_price = 0
        while True:
            try:
                choice = int(input("Put what you want (1-4): "))
                if choice == 1:
                    items_price = stove.getPrice()
                    print("Stove was added to your order")
                elif choice == 2:
                    items_price = sleeping_bag.getPrice()
                    print("Sleeping bag was added to your order")
                elif choice == 3:
                    items_price = stove.getPrice() + sleeping_bag.getPrice()
                    print("Both were added to your order")
                elif choice == 4:
                    print("You got nothing")
                else:
                    print("Please enter a number between 1 and 4")
                    continue
                break
            except ValueError:
                print("Please enter a number between 1 and 4")

        final_price = (tent.getPrice() * num_tents) + items_price
        print(f"Total cost of your Camping gear: ${final_price}")

        section.addProduct(tent)
        section.addProduct(sleeping_bag)
        section.addProduct(stove)

        return section

class Indoor(StoreSection):
    def __init__(self, sportCategory):
        super().__init__(sportCategory)

    @classmethod
    def volleyball(cls):
        sportCategory = "Volleyball"
        section = cls(sportCategory)

        ball = Product("Volley Ball", 5, True)
        net = Product("Net", 15, True)

        material_choices = ["leather", "synthetic"]
        while True:
            material = input("Enter the material you want for your volleyball (leather/synthetic): ").lower()
            if material in material_choices:
                break
            print("Please enter leather or synthetic")

        size_choices = ["small", "medium", "large"]
        while True:
            size = input("Enter the size of the volleyball (small/medium/large): ").lower()
            if size in size_choices:
                break
            print("Invalid size, please enter small, medium, or large")

        net_choices = ["training", "professional"]
        while True:
            net_type = input("Would you like a training or professional net? ").lower()
            if net_type in net_choices:
                break
            print("Please enter training or professional")

        total_price = ball.getPrice() + net.getPrice()
        if random.random() <= 0.25:
            discount = total_price * 0.10  # 10% Discount
            final_price = total_price - discount
            print(f"You got a 10% discount: ${final_price:.2f}")
        else:
            final_price = total_price
            print(f"Total price: ${final_price:.2f}")

        section.addProduct(ball)
        section.addProduct(net)
        return section

    @classmethod
    def table_tennis(cls):
        sportCategory = "Table Tennis"
        section = cls(sportCategory)

        ball = Product("Tennis Ball", 5, True)
        paddles = Product("Paddles", 10, True)
        table = Product("Table", 50, True)

        material_choices = ["plywood", "particle board"]
        while True:
            material = input("Enter the material you want for your tennis table (plywood/particle board): ").lower()
            if material in material_choices:
                break
            print("Please enter plywood or particle board")

        style_choices = ["left", "right"]
        while True:
            paddle_style = input("Enter your paddle style (left/right): ").lower()
            if paddle_style in style_choices:
                break
            print("Please enter left or right")

        while True:
            try:
                num_paddles = int(input("How many paddles do you want to buy? (At least 2 required): "))
                if num_paddles < 2:
                    print("You need at least 2 paddles for a full game setup")
                    continue
                break
            except ValueError:
                print("Please enter a valid number")

        while True:
            try:
                num_balls = int(input("How many balls do you want to buy? You need to buy at least 1: "))
                if num_balls < 1:
                    print("You need at least 1 ball for a full game setup.")
                    continue
                break
            except ValueError:
                print("Please enter a valid number")

        while True:
            try:
                num_tables = int(input("How many tables do you want to buy? You need to buy at least 1: "))
                if num_tables < 1:
                    print("At least 1 :(")
                    continue
                break
            except ValueError:
                print("Please enter a valid number")

        total_price = (num_paddles * paddles.getPrice()) + (num_balls * ball.getPrice()) + (num_tables * table.getPrice())
        print(f"Total cost of your Table Tennis gear: ${total_price}")

        section.addProduct(ball)
        section.addProduct(paddles)
        section.addProduct(table)
        return section
    
def main():
        print("Please select what you would like to buy")
        print("1 - Buy Soccer Gear")
        print("2- Buy Camping Gear")
        print("3 - Buy Volleyball Gear")
        print("4 - Buy Table Tennis Gear")
        print("5 - Exit")

        while True:
            try:
                choice = int(input("Pick a number 1-5: "))
                if choice == 1:
                    section = Outdoor.soccer()
                elif choice==2:
                    section=Outdoor.camping()
                elif choice == 3:
                    section = Indoor.volleyball()
                elif choice == 4:
                    section = Indoor.table_tennis()
                elif choice == 5:
                    print("Exiting")
                    break
                else:
                    print("Please pick a number between 1 and 5")
            except ValueError:
                print("Please enter a valid number")

if __name__ == "__main__":
    main()
