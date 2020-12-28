package ExploringTheWaters

fun addBorder(picture: MutableList<String>) =
    picture.map { "*$it*" }.toMutableList().apply {
        add(0, "*".repeat(picture[0].length + 2))
        add("*".repeat(picture[0].length + 2))
    }
