var x = 1
var y = 2
val direction = Direction.LEFT

// 2D
enum class Direction {
    LEFT, RIGHT
}

// 발사체
data class Projectile(
    private var x: Int,
    private var y: Int,
    private var direction: Direction
)

class OurHero {
    private var direction = Direction.LEFT
    private var x: Int = 42
    private var y: Int = 173
    fun shoot(): Projectile {
        return Projectile(x, y, direction)
    }
}

interface Weapon {
    fun shoot(
        x: Int,
        y: Int,
        direction: Direction
    ): Projectile
}

class Peashooter : Weapon {
    override fun shoot(x: Int, y: Int, direction: Direction): Projectile {
        return Projectile(x, y, direction)
    }
}

class Banana : Weapon {
    override fun shoot(x: Int, y: Int, direction: Direction): Projectile {
        return Projectile(x, y, direction)
    }
}

object Weapons {
    fun peashooter(x: Int, y: Int, direction: Direction): Projectile {
        return Projectile(x, y, direction)
    }

    fun banana(x: Int, y: Int, direction: Direction): Projectile {
        return Projectile(x, y, direction)
    }
    //....
}

class OurHero2 {
    var currentWeapon = Weapons::peashooter
    fun shoot() = fun() {
        currentWeapon(x, y, direction)
    }
}

fun main(){
    val hero = OurHero2()
    hero.shoot()
    hero.currentWeapon = Weapons::banana
    hero.shoot()
}


