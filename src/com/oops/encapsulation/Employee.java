package com.oops.encapsulation;

import java.util.Objects;

public class Employee {
	private String name;
	private int id;
	private float salary;
	
	public String getName() {
		return this.name;
	}
	
	public int getId() {
		return this.id;
	}
	
	public float getSalary() {
		return this.salary;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public void setSalary(float salary) {
		this.salary=salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id;
	}
	
	/* 1. The Problem: Comparing Objects

Let’s say you create two Employee objects with the same data:

Employee e1 = new Employee();
e1.setId(2076);
e1.setName("Tilak");
e1.setSalary(15000);

Employee e2 = new Employee();
e2.setId(2076);
e2.setName("Tilak");
e2.setSalary(15000);


Now, if you compare them:

System.out.println(e1 == e2);    // ?
System.out.println(e1.equals(e2)); // ?

➤ Output (without overriding equals()):
false
false

❓Why?

== compares memory locations (are both references pointing to the same object?).

equals() (if not overridden) also behaves like == by default (from Object class).

So even though both employees look identical, Java says they’re different — because they’re two different objects in memory.

🧠 2. The Solution: Overriding equals()

You can override equals() to compare the contents (the data inside the objects) rather than memory addresses.

In your code:

@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;  // Same reference
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Employee other = (Employee) obj;
    return id == other.id;
}

What happens here:

this == obj → if both references point to the same object → return true

obj == null → if you’re comparing with null, return false

getClass() check → ensures both are Employee objects

(Employee) obj → type cast so you can access other.id

id == other.id → compares based on employee ID

So if two employees have the same id, they’re considered equal.

✅ Now:

System.out.println(e1.equals(e2)); // true

⚙️ 3. The hashCode() Method

When you override equals(), you must also override hashCode() — it’s part of Java’s contract between these two methods.

🔹 Why?

Because Java uses hash codes to quickly locate objects in hash-based collections like:

HashSet

HashMap

HashTable

When you store or search an object in those collections:

Java first calls hashCode() to find a “bucket”.

Then, if multiple objects share the same hash, it calls equals() to verify equality.

In your code:
@Override
public int hashCode() {
    return Objects.hash(id);
}


This simply generates a unique integer hash value based on the id.
So two employees with the same id will produce the same hash value.

🧪 Example Demonstration
import java.util.HashSet;

public class Demo {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setId(2076);
        e1.setName("Tilak");

        Employee e2 = new Employee();
        e2.setId(2076);
        e2.setName("Tilak");

        HashSet<Employee> set = new HashSet<>();
        set.add(e1);
        set.add(e2);

        System.out.println(set.size());
    }
}

🧾 Output:
1

🧠 Explanation:

Because e1.equals(e2) → true (same ID)

and both have the same hashCode()

The HashSet treats them as duplicates and stores only one.

If you didn’t override these methods, the output would be:

2


because Java would treat them as two different objects (based on memory address).

✅ In Summary
Method	Purpose	Default Behavior	After Override
equals()	Compares two objects for equality	Compares memory addresses	Compares field values (like id)
hashCode()	Returns integer hash for quick lookup	Different for each object	Same for logically equal objects
🧩 Simple Analogy

Think of a voter ID:

Every voter (person) has a unique voter ID number.

Even if two people have the same name, the system identifies them using their ID.

Similarly:

id acts as the unique identifier in your Employee class.

equals() says: two employees are equal if they have the same ID.

hashCode() ensures that those employees go into the same “bucket” in collections like HashSet.
*/
	
	
}
