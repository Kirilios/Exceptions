# try-with-resources для чтения и записи(в потоках)
brackets
try(FileReader test = new Filereader()); (FileWriter write = new FileWriter()){
test.read();
обязательно закрыть по окончания использования. 
Не надо самому закрывать файл потом
даже без catch можно
# throws
на уровне метода и перечисляет те 
Исключения которые могут быть выброшены за пределы метода(только на Checked Exceptions)
если можно обработать исключение в этом же методе и нам не над
заниматься им в каком-то другом стеке по использованию, то мы это делаем(try-catch)
если инфу нужно пробросить дальше для анализа и предпринятия каких-то действий
то мы делаем throws Exception и проводим проверку там, где вызываем этот метод через
try-catch
# Созданипе нового типа исключения
делаем класс наследуем от Исключения и там конструктор и что он принимает
либо собщение, ничего, сообщение и то Исключение на которое ссылается при catch