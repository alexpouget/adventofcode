package day1

import com.sun.tools.classfile.Opcode
import java.io.File

/**
 * Created by alex on 05/12/2018.
 */

fun main(args: Array<String>) {
    var currentValue: Int = 0;
    val frequences: HashSet<Int> = hashSetOf(0)
    var find: Boolean = false;
    while (!find) {
        File("resource/day1/input2").forEachLine { line ->
            run {
                currentValue += line.toInt();
                if (frequences.contains(currentValue)) {
                    println(currentValue)
                    find = true;
                    return@forEachLine
                }
                frequences.add(currentValue)
            }
        }
    }
    println(frequences)
    println(currentValue)
}