Proyecto de SPringBOOt y JPA
En este caso se uso la aplicación MySQLWorkbench
La BD se llama Test_BD y la tabla users
La estructura dle proyecto es la siguiente:

*Paquete controller: contiene la clase UserCOntroller, que procesa las request mediante APi que mapea las solicitudes a los respectivos métodos par ale CRUD,
                    por ello crea una referencia a USerService aplicando el principio de inversión de depndencias(IoD).

*Paquete entity:(model) contiene el POJO User

*Paquete repository: contiene la Interfaz UserRepository, la cual es una interfaz que hereda de la interfaz JPARepository<User,Long>.
Su objetivo es permitir crear una referencia(inyección de dependencia) en la clase UserServImpl, que use los métodos de JPARepository como
findAll, finadAll(Pageable pg), findByID(id), save y delete. Permitiendo el CRUD con la BD.

*Paquete service: contiene la interfaz UserService<--interfaz que define los métodos abtractos del CRUD(los anteriores, findaAll, save, etc)
                  También contiene ña Clase USerSServiceImpl, que implementa la interfaz anterior(UserService) y sobreescribe sus métodos ↑
                  Esta clase crea una referencia de tipo UserRepository(inyección de dependencias).
                  
                 

***Pra probar el proyecto se recomenda hacer pruebas con PostMan y editar el archivo aplication.properties se´gun se rquiera, ya sea para crear la BD y la tabla o Update
si se desea trabajar con la BD existente.
