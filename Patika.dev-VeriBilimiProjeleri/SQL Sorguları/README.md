
<a href='#Ödev 1'>Ödev 1</a><br>
<a href='#Ödev 2'>Ödev 2</a><br>
<a href='#Ödev 3'>Ödev 3</a><br>
<a href='#Ödev 4'>Ödev 4</a><br>
<a href='#Ödev 5'>Ödev 5</a><br>
<a href='#Ödev 6'>Ödev 6</a><br>
<a href='#Ödev 7'>Ödev 7</a><br>
<a href='#Ödev 8'>Ödev 8</a><br>
<a href='#Ödev 9'>Ödev 9</a><br>
<a href='#Ödev 10'>Ödev 10</a><br>
<a href='#Ödev 11'>Ödev 11</a><br>
<a href='#Ödev 12'>Ödev 12</a><br>










## <p id = 'Ödev 1' > Ödev 1 </p> 


```sql
Soru 1-  SELECT title, description FROM film;
```

```sql
Soru 2- SELECT * FROM filmWHERE  length > 60 AND length <75;
```
```sql
Srou 3- SELECT * FROM filmWHERE rental_rate = 0.99 AND replacement_cost = 12.99 OR replacement_cost = 28.99;
```

```sql
Soru 4- SELECT * FROM customerWHERE first_name = 'Mary';
```

```sql
Soru 5- SELECT * FROM film WHERE  length < 50 AND  NOT rental_RATE = 2.99 OR NOT rental_rate = 4.99
```


## <p id = 'Ödev 2' > Ödev 2 </p> 

```sh
Soru 1 - SELECT * FROM filmWHERE replacement_cost BETWEEN  12.99 AND 16.99;
```

```sh
Soru 2 - SELECT first_name,last_name FROM Actor WHERE first_name IN('Penelope','Nick','Ed');
```

```sh
Soru 3 - SELECT * FROM film WHERE rental_rate IN (0.99, 2.99, 4.99) AND replacement_cost IN (12.99, 15.99, 28.99);
```

## <p id = 'Ödev 3' > Ödev 3 </p> 

```sql
Soru 1 - SELECT * FROM country WHERE country  LIKE 'A%a';
```

```sql
Soru 2 - SELECT * FROM country WHERE LENGTH(country) > 6 AND country  LIKE '%n';
```

```sql
Soru 3 - SELECT title FROM film WHERE title ILIKE 'T%T%T%T%';
```

```sql
Soru 4 - SELECT * FROM film WHERE title LIKE 'C%'AND LENGTH > 90 AND rental_rate = 2.99;
```


## <p id = 'Ödev 4' > Ödev 4 </p> 


```sql
Soru 1 - SELECT DISTINCT replacement_cost FROM film;
```

```sql
Soru 2 - SELECT COUNT(DISTINCT replacement_cost) FROM film;
```

```sql
Soru 3 - SELECT COUNT(*) FROM film WHERE title = 'T%' AND rating = 'G';
```

```sql
Soru 4 - SELECT COUNT(*) FROM country WHERE LENGTH(country) = 5;
```

```sql
Soru 5 - SELECT COUNT(*) FROM city WHERE city ILIKE 'R%';
```



## <p id = 'Ödev 5' > Ödev 5  </p

```sh
Soru 1 - SELECT * FROM film
WHERE title LIKE '%n'
ORDER BY length DESC
LIMIT 5;
```

```sh
Soru 2 - SELECT * FROM film
WHERE title LIKE '%n'
ORDER BY length 
LIMIT 5;
```

```sh
Soru 3 - SELECT last_name FROM customer
WHERE store_id = 1
ORDER BY last_name DESC
LIMIT 4;
```


## <p id = 'Ödev 6' > Ödev 6  </p

```sql
Soru 1 - SELECT ROUND(AVG(rental_rate),2) FROM film;
```

```sql
Soru 2 - SELECT COUNT(*) FROM film WHERE title LIKE 'C%';
```

```sql
Soru 3 - SELECT MAX(length) FROM film WHERE rental_rate = 0.99;
```

```sql
Soru 4 - SELECT COUNT(DISTINCT replacement_cost) FROM film WHERE length > 150;
```

## <p id = 'Ödev 7' > Ödev 7  </p

```sql
Soru 1 - SELECT rating  FROM film GROUP BY rating;
```

```sql
Soru 2 - SELECT replacement_cost,COUNT(*) FROM film
GROUP BY replacement_cost
HAVING COUNT(*) > 50;
```

```sql
Soru 3 - SELECT store_id, COUNT(*) FROM customer GROUP BY store_id;
```

```sql
Soru 4 - SELECT country_id,COUNT(*) FROM city 
GROUP BY country_id 
ORDER BY COUNT(*) DESC 
LIMIT 1;
```


## <p id = 'Ödev 8' > Ödev 8  </p

```sql
Soru 1 - CREATE TABLE employee(
            id SERIAL PRIMARY KEY,
	          name VARCHAR(50) NOT NULL,
	          email VARCHAR(100),
	          birthday DATE
);
```


```sql
Soru 2 -  insert into employee (name, email, birthday) values ('Myrlene', 'malvares0@mapy.cz', '1967-09-05');
insert into employee (name, email, birthday) values ('Forester', 'fgummow1@utexas.edu', '1984-02-02');
insert into employee (name, email, birthday) values ('Owen', 'obrookhouse2@posterous.com', '1989-09-13');
insert into employee (name, email, birthday) values ('Kristi', 'ktinto3@bbb.org', '1984-07-23');
insert into employee (name, email, birthday) values ('Shepperd', 'sraftery4@github.com', '1979-09-28');
insert into employee (name, email, birthday) values ('Jenna', 'jmacneil5@berkeley.edu', '1982-12-10');
insert into employee (name, email, birthday) values ('Noam', 'nmatteris6@home.pl', '1981-03-23');
insert into employee (name, email, birthday) values ('Wilfrid', 'wsimmen7@tripadvisor.com', '1972-05-10');
insert into employee (name, email, birthday) values ('Gusty', 'geleshenar8@cargocollective.com', '1977-06-25');
insert into employee (name, email, birthday) values ('Christal', 'cmablestone9@hibu.com', '1981-10-23');
insert into employee (name, email, birthday) values ('Delia', 'dramea@ow.ly', '1991-03-18');
insert into employee (name, email, birthday) values ('Judith', 'jskedb@smugmug.com', '1968-01-18');
insert into employee (name, email, birthday) values ('Neille', 'ndonwellc@sakura.ne.jp', '1998-05-24');
insert into employee (name, email, birthday) values ('Codie', 'ccunradid@skype.com', '1967-09-14');
insert into employee (name, email, birthday) values ('Parsifal', 'pderingtone@opera.com', '1982-12-12');
insert into employee (name, email, birthday) values ('Hatti', 'hallchornef@hugedomains.com', '1999-05-30');
insert into employee (name, email, birthday) values ('Damara', 'dnewberryg@wikispaces.com', '1990-11-29');
insert into employee (name, email, birthday) values ('Sybil', 'swarreh@nih.gov', '1987-05-17');
insert into employee (name, email, birthday) values ('Patrizio', 'pdeverali@arizona.edu', '1999-08-02');
insert into employee (name, email, birthday) values ('Dorella', 'dscothronj@weebly.com', '1992-11-25');
insert into employee (name, email, birthday) values ('Heinrik', 'hgrcick@sakura.ne.jp', '1989-01-12');
insert into employee (name, email, birthday) values ('Uta', 'ucaskeyl@networkadvertising.org', '1969-01-14');
insert into employee (name, email, birthday) values ('Ari', 'acoverdillm@list-manage.com', '1967-01-15');
insert into employee (name, email, birthday) values ('Elsbeth', 'ecamockn@admin.ch', '1981-08-21');
insert into employee (name, email, birthday) values ('Krishna', 'kjordisono@xinhuanet.com', '1997-01-19');
insert into employee (name, email, birthday) values ('Tammara', 'tferrierip@uol.com.br', '1975-09-12');
insert into employee (name, email, birthday) values ('Elna', 'etoftsq@histats.com', '1988-06-11');
insert into employee (name, email, birthday) values ('Augusta', 'aloachheadr@qq.com', '1970-09-05');
insert into employee (name, email, birthday) values ('Rachel', 'rhaskells@sakura.ne.jp', '1999-12-11');
insert into employee (name, email, birthday) values ('Ariel', 'acarillot@goo.ne.jp', '1995-06-07');
insert into employee (name, email, birthday) values ('Edee', 'eannottu@go.com', '1997-03-05');
insert into employee (name, email, birthday) values ('Ferguson', 'fkasherv@wix.com', '1985-11-07');
insert into employee (name, email, birthday) values ('Erina', 'ecorballisw@paginegialle.it', '1976-03-07');
insert into employee (name, email, birthday) values ('Nancee', 'nbignoldx@howstuffworks.com', '1980-01-26');
insert into employee (name, email, birthday) values ('Oliy', 'opersencey@sitemeter.com', '1979-02-10');
insert into employee (name, email, birthday) values ('Pate', 'pchritchleyz@hugedomains.com', '1978-04-21');
insert into employee (name, email, birthday) values ('Filip', 'ffairbank10@toplist.cz', '1997-05-02');
insert into employee (name, email, birthday) values ('Peri', 'pwillman11@webs.com', '1976-03-23');
insert into employee (name, email, birthday) values ('Josephine', 'joxley12@go.com', '1971-03-09');
insert into employee (name, email, birthday) values ('Giordano', 'ggoodbairn13@is.gd', '1989-04-10');
insert into employee (name, email, birthday) values ('Robbie', 'rbesant14@dedecms.com', '1992-02-18');
insert into employee (name, email, birthday) values ('Sula', 'slaming15@imageshack.us', '1980-09-15');
insert into employee (name, email, birthday) values ('Denni', 'dpinilla16@cnbc.com', '1967-11-29');
insert into employee (name, email, birthday) values ('Quinn', 'qgravett17@multiply.com', '1979-04-25');
insert into employee (name, email, birthday) values ('Bron', 'bosorio18@github.com', '1995-10-03');
insert into employee (name, email, birthday) values ('Bren', 'bmaryan19@unc.edu', '1978-01-02');
insert into employee (name, email, birthday) values ('Melitta', 'mbramsen1a@symantec.com', '1988-07-08');
insert into employee (name, email, birthday) values ('Florencia', 'fthireau1b@weibo.com', '1969-01-21');
insert into employee (name, email, birthday) values ('Terence', 'tlosemann1c@xing.com', '1984-04-12');
insert into employee (name, email, birthday) values ('Elbertine', 'ecottier1d@storify.com', '1970-09-18');

```

```sql
Soru 3 - UPDATE employee SET name = 'Yusuf' WHERE id = 2;
         UPDATE employee SET email = 'yusufbaykal@.com' WHERE name = 'Yusuf';
         UPDATE employee SET birthday = '1970-09-18'  WHERE email = 'yusuf19@gmail.com';
         UPDATE employee SET name = 'Osman' WHERE id = 3;
         UPDATE employee SET email = 'osmanbaykal@.com' WHERE name = 'Osman';
```


```sql
Soru 4 - DELETE FROM employee WHERE name = 'Bren';
	 DELETE FROM employee WHERE id = 2;
	 DELETE FROM employee WHERE birthday = '1967-11-29';
	 DELETE FROM employee WHERE name = 'Osman';
	 DELETE FROM employee WHERE email = 'osmanbaykal@.com';
```


## <p id = 'Ödev 9' > Ödev 9  </p

```sql
Soru 1 - SELECT city , country FROM city cit JOIN country coun ON(cit.country_id = coun.country_id);
```

```sql
Soru 2 - SELECT first_name,last_name,payment_id FROM customer cus JOIN payment pay ON (pay.customer_id = cus.customer_id);
```

```sql
Soru 3 - SELECT first_name,last_name,rental_id FROM customer cus JOIN rental ren ON(cus.customer_id = ren.customer_id);
```


## <p id = 'Ödev 10' > Ödev 10  </p


```sql
Soru 1 - SELECT city,country FROM city cit LEFT JOIN country cou ON (cit.country_id = cou.country_id);
```


```sql
Soru 2 - SELECT first_name,last_name,payment_id FROM customer cus RIGHT JOIN payment pay ON (pay.customer_id = cus.customer_id);
```


```sql
Soru 3 - SELECT first_name,last_name,rental_id FROM customer cus FULL JOIN rental ren ON (cus.customer_id = ren.customer_id);
```


## <p id = 'Ödev 11' > Ödev 11  </p


```sql
Soru 1 - (
SELECT first_name FROM actor
UNION
SELECT first_name FROM customer
);
```

```sql
Soru 2 - (
SELECT first_name FROM actor
INTERSECT
SELECT first_name FROM customer
);

```

```sql
Soru 3 - (
SELECT first_name FROM actor
EXCEPT
SELECT first_name FROM customer
);
```


```sql
Soru 4 -  (
SELECT first_name FROM actor
UNION ALL
SELECT first_name FROM customer
);


(
SELECT first_name FROM actor
INTERSECT ALL
SELECT first_name FROM customer
);

(
SELECT first_name FROM actor
EXCEPT ALL
SELECT first_name FROM customer
);
```


## <p id = 'Ödev 12' > Ödev 12  </p


```sql
Soru 1 - SELECT COUNT(*) FROM film WHERE length > (SELECT AVG(length)FROM film);
```


```sql
Soru 2 - SELECT COUNT(*) FROM film WHERE rental_rate = (SELECT MAX(rental_rate)FROM film);
```


```sql
Soru 3 - SELECT COUNT(*) FROM film 
	 WHERE rental_rate   = (SELECT MIN(rental_rate)FROM film)
	 AND replacement_cost =  (SELECT MIN(replacement_cost)FROM film);
```


```sql
Soru 4 - SELECT first_name,last_name 
	 FROM customer cus JOIN payment pay 
	 ON (pay.customer_id = cus.customer_id) 
	 WHERE amount = (SELECT MAX(amount) FROM payment);
```
