# SpringDataJPA

By default from CrudRepository

findAllbyId
findById
findAll


Drived Query Methods/Custom Finder Methods
data by name
data by name and password
data by name or passsword
data name starting with prefix
data by name like 'keyword'

Select * from user where name='something';
public List<User> findByName(String name)

findByNameStartingWith(String prefix)
findByNameEndingWith(String suffix)
findByNameContaining(String words)
findByNameLike(String likePattern)
findByAgeLessThan(int age)
findByAgeGreaterThanEqual(int age)
findByAgeIn(Collection<Integer> ages)
findByNameOrderByName(String name)

