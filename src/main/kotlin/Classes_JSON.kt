import kotlin.collections.forEach


sealed interface JValue;

data class JField(val name: String, val value: JValue) {
    override fun toString(): String {
        return "$name : $value"
    }
}


data class JArray(val values: List<JValue>): JValue {
    override fun toString(): String {
        return "[" + values.map { it.toString() } + "]"
    }
}

data class JObject(val jfields: List<JField>): JValue {
    // Alínea E
    fun isValid(): Boolean {
        val memory = mutableListOf<String>()

        var result = true;

        jfields.forEach {
            if (!memory.contains(it.name))
                memory.add(it.name)
            else {
                result = false
                println("Duplicate variable name in json file")
            }
        }

        return result
    }

    // Alínea G
    fun prettyPrint(): String {
        var result = ""

        jfields.forEach { result += it.toString() + "\n\t" }

        return "{\n\t$result}"
    }

}

data class JString(val value: String): JValue {
    override fun toString(): String {
        return value
    }
}

data class JNumber(val value: Number): JValue {
    override fun toString(): String {
        return value.toString()
    }
}

data class JBoolean(val value: Boolean): JValue {
    override fun toString(): String {
        return if (value) "true" else "false"
    }
}

data object JNull: JValue {
    override fun toString(): String {
        return "null"
    }
}

