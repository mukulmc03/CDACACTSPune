package directory;

public class PhoneDirectory {
	private String[] names = new String[1];
	private String[] numbers = new String[1];
	private String[] addressArray = new String[1];
	private int count = 0;

	public  boolean changed;

	public String numberFor(String name) {
		// Get the phone number associated with the given name, if any.
		// If the name does not exist in the directory, null is returned.  The
		// name cannot be null.  (If it is, an IllegalArgumentException is thrown.)
		
		if (name == null)
			throw new IllegalArgumentException("Name cannot be null!");
		
		int position = indexOf(name);
		
		if (position == -1)
			return "User does not exists!";
		else
			return "Number : " + numbers[position] + ", Address : " + addressArray[position];
	}
	
	public String searchUsingNumber(String number) {
		if(number == null)
			throw new IllegalArgumentException("Number cannot be null!");
		
		int position = indexOfNumber(number);
		
		if(position == 1)
			return "User does not exists!";
		else
			return "Name : " + names[position] + ", Address : " + addressArray[position];
	}

	private int indexOfNumber(String number) {
		for (int i = 0 ; i < count; i++) {
			if (numbers[i].equalsIgnoreCase(number))
				return i;
		}
		return -1;	
	}

	public void addNewEntry(String name, String number, String address) {
		// Create a new entry in the directory for the given name and number.
		// An IllegalArgumentException is thrown if the name is already in
		// the directory or if either of the parameters is null.  If the
		// arrays, "names" and "numbers", that hold the data are full,
		// replace them with larger arrays.
		
		if (name == null)
			throw new IllegalArgumentException("Name cannot be null!");
		
		if (number == null)
			throw new IllegalArgumentException("Number cannot be null!");
		
		if(address == null)
			throw new IllegalArgumentException("Address cannot be null!");
		
		int position = indexOf(name);
		if (position != -1)
			throw new IllegalArgumentException("Name already exists!");
		
		if (count == names.length) {
			String[] tempNames = new String[ 2*count ];
			String[] tempNumbers = new String[ 2* count];
			String[] tempAddress = new String[2 * count];
			System.arraycopy(names, 0, tempNames, 0, count);
			System.arraycopy(numbers, 0, tempNumbers, 0, count);
			System.arraycopy(addressArray, 0, tempAddress, 0, count);
			names = tempNames;
			numbers = tempNumbers;
			addressArray = tempAddress;
		}
		names[count] = name;
		numbers[count] = number;
		addressArray[count] = address;
		count++;
		changed = true;
		System.out.println("User added succefully!");
	}

	public void deleteEntry(String name) {
		// Remove the entry for the specified name from the directory, if
		// there is one.  If the specified name does not exist in the
		// directory, nothing is done and no error occurs.
		
		if (name == null)
			return;
		int position = indexOf(name);
		if (position == -1)
			return;
		
		names[position] = names[count-1];
		numbers[position] = numbers[count-1];
		addressArray[position] = addressArray[count - 1];
		count--;
		changed = true;
		System.out.println("User deleted succefully!");
	}

	private int indexOf(String name) {
		// Finds and returns the position of the name in the names array,
		// ignoring case.  Returns -1 if the name does not occur in the
		// array.
		
		for (int i = 0 ; i < count; i++) {
			if (names[i].equalsIgnoreCase(name))
				return i;
		}
		return -1;
	}
}
