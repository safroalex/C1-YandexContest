import Foundation

func formatPath(path: String) -> String {
    var mutablePath = path
    
    // check on last "/"
    if mutablePath.hasSuffix("/") {
        mutablePath.removeLast()
    }
    
    //check on double "//"
    var cnt = 0
    while cnt < mutablePath.count - 1 {
        let currentIndex = mutablePath.index(mutablePath.startIndex, offsetBy: cnt)
        let nextIndex = mutablePath.index(after: currentIndex)
        
        if mutablePath[currentIndex] == "/" && mutablePath[nextIndex] == "/" {
            mutablePath.remove(at: nextIndex)
        }
        else {
            cnt += 1
        }
    }
   
    // check on "/.."
    return mutablePath
}
    
func testCanonicalPath(_ function: (String) -> String) {
    // Тест 1: Проверка простого пути
    assert(function("/a/b/c") == "/a/b/c", "Test Case 1 Failed")

    // Тест 2: Удаление одного уровня вложенности
    assert(function("/a/b/../c") == "/a/c", "Test Case 2 Failed")

    // Тест 3: Удаление нескольких уровней вложенности
    assert(function("/a/b/c/../../d") == "/a/d", "Test Case 3 Failed")

    // Тест 4: Преобразование пути, состоящего только из символов "."
    assert(function("/././.") == "/", "Test Case 4 Failed")

    // Тест 5: Обработка пути с директорией, имя которой состоит из нескольких точек
    assert(function("/a/.../b") == "/a/.../b", "Test Case 5 Failed")

    // Тест 6: Обработка пути с несколькими последовательными разделителями "/"
    assert(function("//a///b////c") == "/a/b/c", "Test Case 6 Failed")

    // Тест 7: Проверка пути, содержащего только символы ".."
    assert(function("/a/b/c/../../..") == "/", "Test Case 7 Failed")

    // Тест 8: Проверка пути, содержащего только символы "..", с переходом выше корневой директории
    assert(function("/a/b/c/../../../..") == "/", "Test Case 8 Failed")

    // Тест 9: Проверка пути, который содержит специальные символы
    assert(function("/a/$#^/b/..") == "/a/$#^", "Test Case 9 Failed")

    // Тест 10: Проверка пути, оканчивающегося на разделитель
    assert(function("/a/b/c/") == "/a/b/c", "Test Case 10 Failed")

    print("All test cases passed")
}

testCanonicalPath(formatPath)

   

 


