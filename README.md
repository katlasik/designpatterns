#### Adapter

Klasa **NotificationDispatcher** zajmuje się zbieraniem informacji o zdarzeniach biznesowych. Używając
instancji klasy implementującej interfejs **NotificationSender** przekazanej w konstruktorze, **NotificationDispatcher**
wysyła wiadomości email oraz sms informujacej o owych zdarzeniach biznesowych.

Dysponujemy zewnętrznymi klasami umożliwiającymi wysyłanie wiadomości o nazwach **SmtpEmailSender** oraz **SmsSender**.

Stwórz klasę **NotificationSenderAdapter** implementującą interfejs **NotificationSender**, która jako argument otrzyma instancję obiektów **SmtpEmailSender** oraz **SmsSender**.

#### Builder

Stwórz klasę **builder** dla **Employee**.
Przerób metodę **parse** w **EmployeeReader** w ten sposób, aby korzystała z wzorca builder.

(Opcjonalnie) Stwórz **type-safe builder** dla **Employee**.

#### Decorator

Klasa **TemperatureSensorSource** pozwala pobrać bieżącą temperaturę z czujnika. Niestety sporadycznie podczas odczytu występuje błąd, 
powodujący wyrzucenie wyjątku **IllegalStateException**.

Stwórz dekorator, który będzie otrzymywał instancję TemperatureSensorSource. W przypadku wystąpnienia błędu, ma zwrócić ostatnią odczytaną wartość.

Stwórz dekorator, który będzie implementował klasę AveragingSensorSource, pozwalającą zwrócić średni wynik z n pomiarów.
Po wywołaniu metody average, klasa dekoratora powinna zebrać n wyników, a następnie zwrócić ich średnią.


#### Composite

Za pomocą wzorca **Composite** stwórz klasy **File** oraz **Directory** dziedziczące po **FileSystemEntry**.
Klasa **File** powinna przyjmować dwa argumenty: nazwę pliku oraz jego rozmiar.
Klasa **Directory** powinna przyjmować 2 argumenty: nazwę folderu oraz listę elementów (plików lub subfolderów), które
zawiera.

(*Opcjonalnie*) Zaimplementuj metodę **iterator()**, która będzie zwracała iterator przechodzący po wszystkich elementach katalogu,
najpierw zwracający sam katalog, a następnie jego elementy.

#### Factory method

Zaimplementuj metody fabrykujące:

* **fromCartesian** - tworzący punkt ze współrzędnych kartezjańskich **x** i **y**.
* **fromPolar** - tworzący punkt ze współrzędnych polarnych **r** i **alpha**:
  *x = r \* cos(alpha)*
  *y = r \* sin(alpha)*
  
* **fromRelative** - tworzący punkt z relatywnie do innego punktu  ze współrzędnych kartezjańskich **x** i **y**.

#### Factory

Używając wzorca strategia zaimplementuj metodę **getDiscountCalculatorByDay** w **DiscountCalculatorFactory**, tak by dla
zwracała odpowiednią klasę implementującą interfejs **DiscountCalculator**.

Klasa DiscountCalculatorFactory przyjmuje dwa parametry **christmasDiscount** oraz **fridayDiscount**.

* Dla ostatniego dnia listopada (*black friday*), co drugi przedmiot powinien być darmowy.
* Dla każdego piątku cena powinna być obniżona o wartość podaną jako **christmasDiscount**.
* Dla daty od 24 grudnia do końca roku cena powinna być obniżona o wartość procentową podaną jako **christmasDiscount**.
* Dla każdej innej daty cena nie powinna być obniżana.

#### Proxy

Zmodyfikuj klasę **FactorialCalculatorCreator** tak, by jeżeli parametr **caching** ustawiony jest na **true**,
o zwracała instancję proxy **SimpleFactorialCalculator**, który posiada wbudowany cache dla obliczonych już silni.

#### Singleton
Przerób klasę SystemProbe, tak aby metoda getInstance zwracała singleton.

#### Template method

Stwórz klasę **FileSystemScanner** implementującą interfejs **CallbackFileScanner**.
Skorzystaj z metody **nextFile** z klasy **FileLoader** aby pobierać kolejne pliki.
Zaprojektuj klasę, w ten sposób, że po każdym znalezionym elemencie będzie wywoływać metodę **onFoundFile**, a na zakończenie
wyszukiwania wywoła raz **onComplete**.

(*Opcjonalnie*) Stwórz wersję **FileSystemScanner**, która implementuje FileScanner, a jako argumenty otrzymuje
dwie instancję interfejsu funkcyjnego **Consumer**.

#### Visitor

Stwórz klasę **LoggingHandler** implementującą **NotificationHandler**, która w odpowiedzi na zdarzenia będzie wypisywać na konsolę komunikaty.
Każde ze zdarzeń: **UserConfirmed**, **UserCreated**, **UserLoggedIn** powinno być zalogowane za pomocą innego komunikatu.
Skorzystaj ze wzorca **Visitor**, aby w odpowiedni sposób obsłużyć komunikaty. W tym celu zmodyfikuj interfejs **Notification**
dodając metodę **visit** oraz stwórz nowy interfejs **NotificationVisitor**.
Zaimplementuj klasę **StatisticsHandler**, która będzie sumować liczbę użytkowników, którzy zostali stworzeni oraz tych, którzy potwierdzili konta
i będzie wyświetlać na konsoli tą statystykę.


#### Observer

Stwórz klasę **WaterLevelObservable** implementującą interfejs **Observable**.
Stwórz instancję **WaterLevelSensor**, przekazując jako argument funkcję wywołującą metodę **notifyObservers** w **WaterLevelObservable**.

Dokończ implementację **EmailSenderObserver** i **SmsSenderObserver** oraz dodaj obydwa obserwatory do **WaterLevelObservable**.
Klasa **WaterLevelObservable** powinna informować swoich obserwatorów tylko jeżeli poziom wody będzie wynosił powyżej **180 cm**.

#### Chain of responsibility

Używając wzorca **chain of resposibility** stwórz aplikację procesującą przełane przez klienta żądanie zwrotu produktu.
W tym celu stwórz klasy dziedziczące po interfejsie **RefundRequestHandler** oraz połącz jest w łańcuch przetważąjący obiekt typu **RefundRequest** i
zwracający obiekt typu **RefundDecision**.
W przypadku gdy produkt jest jest z przeceny (pole **fromSale** jest ustawione na true) decyzja powinna być negatywna.
W przypadku gdy produkt został zakupiony przez klienta premium oraz nie jest z wyprzedaży to decyzja powinna być pozytywna.
W przypadku gdy cena produktu jest poniżej 1000 oraz produkt był kupiony 60 lub mniej dni wcześniej to dezycja powinan być pozytywna.
