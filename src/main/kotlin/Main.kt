import kotlin.random.Random

val namesArray = arrayOf("Анастасий", "Аникей", "Аристарх", "Арнольд", "Арсений", "Артур", "Ахмад",
    "Витольд", "Вольдемар", "Вальдемар", "Гелий", "Генрих", "Геральд", "Герман", "Глеб", "Густав",
    "Жак", "Жан", "Жорж", "Казимир", "Карл", "Каспар", "Кир", "Кирилл", "Корней", "Корнил", "Лавр",
    "Лазарь", "Леонтий", "Леопольд", "Лукьян", "Людвиг", "Назар", "Наум", "Нестор", "Никандр", "Никодим",
    "Нифонт", "Пантелеймон", "Панфил", "Патрикей", "Пафнутий", "Пахом", "Пимен", "Платон", "Потап", "Пров",
    "Прокл", "Прокофий", "Протас"
)

val foodArray = arrayOf("Салат из морской капусты", "Борщ", "Суп из грибов", "Омлет", "Курица на гриле",
    "Рыба на пару", "Стейк", "Творог", "Яблочный пирог", "Тарталетка")

fun main() {
    println("Введите количество философов за круглым столом:")
    val countPhilosophers = readln().toInt()

    val philosophers = ArrayList<Philosopher>()
    val forks = ArrayList<Fork>()

    for (i in 0..< countPhilosophers){
        val name = namesArray[i % namesArray.size]
        val foodType = foodArray[i % foodArray.size]
        philosophers.add(Philosopher(i, name, foodType))
        forks.add(Fork(i))
    }

    philosophers.shuffle(Random)

    for (i in 0 ..< countPhilosophers){
        philosophers[i].takeFork(forks)
    }
}