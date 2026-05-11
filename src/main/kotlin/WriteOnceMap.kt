import java.io.File

class WriteOnceMap<K, V> : HashMap<K, V>() {
    override fun put(key: K, value: V): V? {
        if (containsKey(key)) {
            throw RuntimeException("Key '$key' is already defined and cannot be updated.")
        }
        return super.put(key, value)
    }

    override fun get(key: K): V? = super.get(key)

    // Adicionado public remove para o Local Scoping suportar purgar variaveis entre for-loops no Interpreter.
    override fun remove(key: K): V? = super.remove(key)

    fun toMap(): Map<K, V> = super.entries.associate { it.key to it.value }
}