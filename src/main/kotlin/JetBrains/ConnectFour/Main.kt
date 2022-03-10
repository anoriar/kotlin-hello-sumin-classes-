package JetBrains.ConnectFour

lateinit var game: Game
fun main() {
    println("Connect Four")
    println("First player's name:")
    val firstPlayer: Player = Player(readLine() ?: "")
    println("Second player's name:")
    val secondPlayer: Player = Player(readLine() ?: "")
    val board = createBoard()

    game = Game(firstPlayer, secondPlayer, board)
    println("${game.firstPlayer.name} VS ${game.secondPlayer.name}")
    println("${game.board.rows} X ${game.board.columns} board")
}

fun createBoard(): Board {
    while (true) {
        try {
            println("Set the board dimensions (Rows x Columns)")
            println("Press Enter for default (6 x 7)")
            var input: String = readLine() ?: ""
            input = input.replace("\\s".toRegex(), "").lowercase()
            if (input.isEmpty()) {
                return Board()
            }
            if (!input.matches(Regex("\\d+x\\d+"))) {
                throw Exception("Invalid input")
            }
            val regex = Regex("(\\d+)x(\\d+)")
            val matchResultDestructured: MatchResult.Destructured? = regex.find(input)?.destructured
            matchResultDestructured?.let {
                val raws: Int = matchResultDestructured.component1().toInt()
                val columns: Int = matchResultDestructured.component2().toInt()
                if (raws !in 5..9) {
                    throw Exception("Board rows should be from 5 to 9")
                }
                if (columns !in 5..9) {
                    throw Exception("Board columns should be from 5 to 9")
                }
                return Board(raws, columns)
            }
        } catch (ex: Exception) {
            println(ex.message)
        }
    }
}