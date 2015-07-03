package stack;

public class StackImpl implements Stack {
	/*
	 * 자료구조를 코딩할 때는 인터페이스를 구현하면서 반드시 메소드가 공통으로 처리한값을 두는 배열이나 자료구조를 필드에 두어야 한다,
	 */
	private Object[] objcets; // 필드에 Object 타입 배열선언
	private int pointer;

	public StackImpl() {
		this(10);
	}

	public StackImpl(int capacity) {
		objcets = new Object[capacity]; // 배열 을 선언하는데 최소한 약간의 동적개념 적용
		pointer = 0;// 인덱스 초기화는 0부터
	}

	@Override
	public void push(Object obj) {
		if (isFull()) {
			System.out.println("스택 용량을 초과하였습니다.");// 스택을 좌->우 가 아니라 하-> 상으로 쌓이는
													// 구조
			return;
		} else {
			objcets[pointer++] = obj;

		}

	}

	@Override
	public Object pop() {
		if (isEmpty()) {
			System.out.println("스택에 저장된 객체가 없습니다.");
			return null;
		} else {
			Object obj = objcets[--pointer];
			objcets[pointer] = null;
			return obj;
		}
	}

	@Override
	public boolean isEmpty() {

		return pointer == 0;
	}

	@Override
	public boolean isFull() {
		// objects 는 배열이므로 indec 크기값을 나타내는 length 사용
		return pointer == objcets.length;
	}

	@Override
	public int size() {

		return pointer;
	}

}
