class WriteOnceMap<K, V> {
    private val map = mutableMapOf<K, V>()

    fun put(key: K, value: V) {
        if (map.containsKey(key)) {
            throw IllegalStateException("Key '$key' is already defined and cannot be updated.")
        }
        map[key] = value
    }

    fun get(key: K): V? = map[key]

    fun toMap(): Map<K, V> = map.toMap()

    fun containsKey(key: K) = map.containsKey(key)

    fun containsValue(value: V) = map.containsValue(value)
}