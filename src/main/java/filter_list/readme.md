Desarrollar una función que toma una lista de valores enteros y/o palabras y devuelve una lista de sólo enteros, descartando las palabras. 

Por ejemplo:

    List.of(1, 2, "a", "b") => List.of(1,2)
    List.of(1, 2, "a", "b", 0, 15) => List.of(1,2,0,15)
    List.of(1, 2, "a", "b", "aasf", "1", "123", 231) => List.of(1, 2, 231)
