import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Set 인터페이스 : 순서 X, index X, 중복데이터 X
		
		//Set<String> set= new Set(); //error : 인터페이스는 객체생성 불가
		
		//Set 인터페이스를 구현한 하위클래스들 : HashSet, TreeSet, LinkedHashSet
		
		//HashSet<String> set= new HashSet<String>(); //성능이 가장 우수함
		//TreeSet<String> set= new TreeSet<>(); //값의 오름차순으로 저장되어짐. [성능은 중간]
		LinkedHashSet<String> set= new LinkedHashSet<>(); //값을 저장한 순서 [성능은 최하]
		
		//요소 추가
		set.add( new String("aaa") );
		set.add( "eee" );
		set.add( "ccc" );
		set.add( "kkk" );
		set.add( "bbb" );
		set.add( "ccc" ); // 중복데이터를 추가해보기 - 무시됨
		
		//요소개수 출력 및 요소값 확인
		System.out.println( set.size() + " : " + set.toString() );
		
		//요소값을 얻어오는 기능 .get() 이 없음
		//set.get(); //error - why? 인덱스번호가 없어서..
		
		//일반적으로는 set의 요소 하나를 얻어오기보다는.
		//모든 요소들을 순차적으로 얻어오는 경우가 많음.
		
		// 순차적으로 요소값을 얻어오기
		//방법1. for이용 불가! - 인덱스번호 없어서..
		//방법2. 확장된 for문
		for( String t : set ) {
			System.out.println(t);						
		}
		System.out.println();
		
		//방법3. iterator(반복자)를 이용
		Iterator<String> datas= set.iterator();
		while( datas.hasNext() ) {
			String s= datas.next();
			System.out.println(s);
		}
		System.out.println();
		
		//방법4. 배열로 변환하여 접근
		String[] aaa= new String[set.size()];
		set.toArray(aaa);
		System.out.println( aaa[0] );
		System.out.println( aaa[1] );
		System.out.println( aaa[2] );
		
		//사용자 정의 클래스를 Set의 요소로 사용해보기
		//중복체크가 될까?
		HashSet<Person> people= new HashSet<>();
		people.add( new Person("sam", 20) );
		people.add( new Person("sam", 20) );
		
		System.out.println( people.size() );
		//Set이 객체가 중복되었다고 판단하는 기준은.
		//그 객체의 기능메소드 중 .hashCode()와 .equals()메소드의 결과가 같을때임.
		

	}

}

class Person{
	String name;
	int age;
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.age;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Person p= (Person)obj;
		return this.name.equals(p.name);
	}
	
	public Person(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name= name;
		this.age= age;
	}
}
