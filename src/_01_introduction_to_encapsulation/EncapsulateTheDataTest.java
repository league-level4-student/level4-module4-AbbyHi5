package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EncapsulateTheDataTest {
	EncapsulateTheData otherClass = new EncapsulateTheData();
	
	@Test
	public void TestItemsReceived() {
		otherClass.setItemsReceived(2);
		assertTrue(otherClass.getItemsReceived() == 2);
		otherClass.setItemsReceived(-1);
		assertTrue(otherClass.getItemsReceived() == 2);
	}
	
	@Test
	public void TestDegreesTurned() {
		otherClass.setDegreesTurned(37.21f);
		assertTrue(otherClass.getDegreesTurned() == 37.21f);
		otherClass.setDegreesTurned(-1.2f);
		assertTrue(otherClass.getDegreesTurned() == 37.21f);	
	}
	
	@Test
	public void TestNomenclature() {
		otherClass.setNomenclature("Iambadwihtrandomstrings");
		assertTrue(otherClass.getNomenclature() == "Iambadwihtrandomstrings");
		otherClass.setNomenclature("");
		//System.out.println(otherClass.getNomenclature());
		assertTrue(otherClass.getNomenclature() == " ");	
	}
	
	@Test
	public void TestMemberObj() {
		otherClass.setMemberObj("thisshouldnotwork");
		assertFalse(otherClass.getMemberObj().equals(toString()));
		otherClass.setMemberObj(new Object());
		assertFalse(otherClass.getMemberObj().equals(toString()));	
	}

}
