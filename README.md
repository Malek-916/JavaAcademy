# JavaAcademy
Collection

    The root interface in the collection hierarchy. A collection represents a group of objects, known as its elements. Some collections allow duplicate elements and others do not. Some are ordered and others unordered. The JDK does not provide any direct implementations of this interface: it provides implementations of more specific subinterfaces like Set and List. This interface is typically used to pass collections around and manipulate them where maximum generality is desired.

List (extends Collection)

    An ordered collection (also known as a sequence). The user of this interface has precise control over where in the list each element is inserted. The user can access elements by their integer index (position in the list), and search for elements in the list.

    Unlike sets, lists typically allow duplicate elements. More formally, lists typically allow pairs of elements e1 and e2 such that e1.equals(e2), and they typically allow multiple null elements if they allow null elements at all. It is not inconceivable that someone might wish to implement a list that prohibits duplicates, by throwing runtime exceptions when the user attempts to insert them, but we expect this usage to be rare.

![XhKOu](https://user-images.githubusercontent.com/116810620/203954161-f2ae390f-ccb8-48a2-bbd9-f68f78feca6d.jpg)



_______________________________________________________________________________________________________________________________________________________________________________
- https://start.spring.io/
- project : --> assicurarsi che ci sia Maven project ==> https://mvnrepository.com/ --> per robe extra
- sito dove scaricare codici e librerie di altri coders.
- si prende la dependency per accedere alla libreria 
- project metadata : - group --> per chi?
			   - Arifact --> uguale a nome
			   - Descrizione --> quello che vuoi
			   - pachaging --> Jar vs War  --> scegliere war 
- war permette una facile esportazione sui server
- versione java 

						LIBRERIE DA IMPORTARE IN SPRINGBOOT

- *SpringBoot DevTools* :una volta messo in funzione, vedo in automatico i cambiamento senza riavviare 
(live reload)
- *Spring web* : include RESTful, MVC (model view controller)

- MVC: design pattern --> un modo per strutturarti la risoluzione di un problema.

- Thymeleaf : template engine fa comunicare java (backend) con html (frontend) e viceversa.

- libreria lombok: --> installare dal sito per eclipse (non basta importare in springboot) fa tutti i getter, setter e construttore senza bisogno di scriverli--> mettendo alcune annotazioni
		- va installato dal marketplace di eclipse più aggiunto nelle librerie di springboot
		----> per lombok mettere prima della classe i seguinte per fare il cost default, con paramenti, getters e setters

				**annotazione da mettere per integrare lombok**
				@Data
				@NoArgsConstructor
				@AllArgsConstructor

____________________________________________________________________________________________________________________________________________


							PROCEDURA DA SEGUIRE PER CONFIGURARE SPRINGBOOT
- generare il progetto 
- per varie cazzate fare update del project - tatso destro sul project --> maven --> update
- files html sempre sotto template
- controller --> rindrizza le richiesta
--> come si fa un controller 
- selezionare il pachage che ho creato --> 
	creare un package dentro quello principale aggiungendo ".controller"



________________________________________________________________________________________________________________________________________________
--> FETCH DATA --> scaricare in gergo tecnico

	richieste http--> tipo post --> sono io a fornire al server i dati 
				get --> sono io a fare richiesta di dati dal server
_________________________________________________________________________________________________________________________________________________


			API

--> mi arriva il file json che andrò a desrializzare 
--> costruisco gli attributi che mi servono dal json nella classe xxxx nel package model. (DOMINIO . NOME AZIENDA. NOMEPROGETTO . model) ES --> com.adecco.progettox.model
--> DESERIALIZZAZIONE il file json ---> fonderlo nella classe java


										ES DESERIALIZZAZIONE
--> 		RestTemplate restTemplate = new RestTemplate(); // oggetto per deserializzare
		Fox ris = restTemplate.getForObject( "https://randomfox.ca/floof/", Fox.class);     --> mi prende l'url del api e mi salva in oggetto gli atributi vhe voglio
--> integrazione  html e java per fetchare e visualizzare i dati 

______________________________________________________________________________________________________________________________________________________________

Classe service --> serve a gestire il lavoro sporco. modo tale controller che rimane pulito 
				RICORDA --> creare package service al interno es PersonaService 
					----> @Service nella classe PersonaService 
					----> @AutoWired nella classe Controller/RestController sopra l'oggetto PersonaService ()
_______________________________________________________________________________________________________________________________________________________________

ORM --> Object-relational mapping ---> metodo di programmazione 
Integrazione H2 con springboot --> https://www.baeldung.com/tag/h2
Hibernate --> è un ORM --> ponte per creare database senza sapere i comandi sql
--> Repository ---> li faccio se ho bisogno di accedere a detterminate col nel db.


Ordine delle classi da creare* --> model (@.. , attributi)  --> repo --> service --> RestController
	(Model) car -->(Repository) carRepo -->(Service) carServ --> (RestController) restController
________________________________________________________________________________________________________________________________________________________________

XXX.XXX/api/xxxx --> per chiedere dei parramenti in input dalla richiesta di get

---> XXX.XXX/api/xxxx ? parametro='numero' & parmatro2=9
________________________________________________________________________________________________________________________________________________________________
Comandi Angular 

Creare nuovo proj
	ng new nome-proj

Creare nuovo componente
	ng g c nome-comp
	ng genereate component nome-comp


procedura : routing su angular 
 - importare RouterModule in app.module.ts
	- creare app.routes.ts --> importiamo Routes e i componenti creati
	- nel app.module.ts mettere la funzione forRoot, RouterModule.forRoot(AppRoute)
	- per navigare nella pagina html nel tag inserire routerLink=" ' [/rotta] ' "
	- inoltre nel comp.html -->[rouoterLinkActiveOptions]="{ exact:true }"
	- nel comp.html --> tra i tag <mian> mettere <Router-outlet><Router-outlet>
______________________________________________________________________________________________________________________________________________________________



Risorse 

	--> www.primefaces.org/
	--> mvnrepository.com/
	--> start.spring.io/
	--> getbootstrap.com
	--> w3schools.com/
	--> mdbootstrap.com/
	--> ( libro abs java )  webéducation.com/wp-content/uploads/2018/09/Absolute-Java-6th-edition.pdf
	--> ( lista api free  )github.com/public-apis/public-apis
	--> ( pdf programmare con java )  s3.us-west-2.amazonaws.com/secure.notion-static.com/bb3b577f-b5b7-41b4-972c-ca20c67eacf2/Untitled.pdf?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20221118%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20221118T102645Z&X-Amz-Expires=86400&X-Amz-Signature=83e12ff788a372b438e506e506b639fdf78335bd7adc6e8037761c1e3be730ce&X-Amz-SignedHeaders=host&response-content-disposition=filename%3D%22Programmare%2520in%2520Java.pdf%22&x-id=GetObject
	--> (per deseriallizzare al ingrosso da json a pojo) https://json2csharp.com/
	--> https://www.typescriptlang.org/docs/handbook/typescript-in-5-minutes.html
	--> https://italiancoders.it/routing-delle-applicazioni-angular/#router-link
