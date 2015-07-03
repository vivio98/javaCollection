package stack;

public class StackImpl implements Stack {
	/*
	 * �ڷᱸ���� �ڵ��� ���� �������̽��� �����ϸ鼭 �ݵ�� �޼ҵ尡 �������� ó���Ѱ��� �δ� �迭�̳� �ڷᱸ���� �ʵ忡 �ξ�� �Ѵ�,
	 */
	private Object[] objcets; // �ʵ忡 Object Ÿ�� �迭����
	private int pointer;

	public StackImpl() {
		this(10);
	}

	public StackImpl(int capacity) {
		objcets = new Object[capacity]; // �迭 �� �����ϴµ� �ּ��� �ణ�� �������� ����
		pointer = 0;// �ε��� �ʱ�ȭ�� 0����
	}

	@Override
	public void push(Object obj) {
		if (isFull()) {
			System.out.println("���� �뷮�� �ʰ��Ͽ����ϴ�.");// ������ ��->�� �� �ƴ϶� ��-> ������ ���̴�
													// ����
			return;
		} else {
			objcets[pointer++] = obj;

		}

	}

	@Override
	public Object pop() {
		if (isEmpty()) {
			System.out.println("���ÿ� ����� ��ü�� �����ϴ�.");
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
		// objects �� �迭�̹Ƿ� indec ũ�Ⱚ�� ��Ÿ���� length ���
		return pointer == objcets.length;
	}

	@Override
	public int size() {

		return pointer;
	}

}
