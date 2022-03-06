package OOP.Generic

import java.util.*

class MyArrayList<T> : MyList<T> {
    private var arrayList: Array<Any?> = arrayOfNulls<Any>(10)
    private var size: Int = 0

    companion object {
        fun <T> myArrayListOf(vararg elements: T): MyArrayList<T> {
            val arrayList = MyArrayList<T>()
            for (element in elements) {
                arrayList.add(element)
            }
            return arrayList
        }
    }

    override fun get(index: Int): T {
        if (index in 0..size) {
            arrayList[index]?.let {
                return it as T
            }
        }
        throw IndexOutOfBoundsException()
    }

    override fun add(element: T) {
        if (size >= arrayList.size) {
            arrayList = arrayList.copyOf(size * 2)
        }
        arrayList[size] = element
        size++
    }

    override fun remove(element: T) {
        for ((index, string) in arrayList.withIndex()) {
            if (string == element) {
                removeAt(index)
                return
            }
        }
    }

    override fun removeAt(index: Int) {
        if (index in 0 until size) {
            for (i in index until size) {
                arrayList[i] = arrayList[i + 1]
            }
            size--
        } else {
            throw IndexOutOfBoundsException()
        }
    }

    override fun size(): Int {
        return size
    }
}