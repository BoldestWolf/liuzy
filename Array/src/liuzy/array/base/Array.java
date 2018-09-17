package liuzy.array.base;

/**
 * @ClassName: Array
 * @Description: ����
 * @author liuzy
 * @date 2018��9��16��
 */
public class Array {
	private static int[] array;
	private static int size;

	/**
	 * create a new Array instance.
	 */
	public Array() {
		array = new int[10];
		size = 0;
	}

	/**
	 * create a new Array instance.
	 * @param capacity ����
	 */
	public Array(int capacity) {
		array = new int[10];
		size = 0;
	}

	/**
	 * @Title: add
	 * @Description: ��������ָ��λ�ò���Ԫ��
	 * @param index
	 * @param item
	 * @return int[]
	 */
	public int[] add(int index, int item) {
		for (int i = array.length - 1; i >= index; i--) {
			array[i + 1] = array[i];
		}
		array[index] = item;
		size++;
		return array;
	}

	/**
	 * @Title: delete
	 * @Description: ɾ��ָ��λ�õ�Ԫ��
	 * @param index
	 */
	public void delete(int index) {
		for (int i = index; i < array.length; i++) {
			array[i] = array[i + 1];
		}
		size--;
	}

	/**
	 * @Title: update
	 * @Description: ����һ��ָ��λ�õ�Ԫ��
	 * @param index
	 * @param item
	 * @return int[]
	 */
	public int[] update(int index, int item) {
		array[index] = item;
		return array;
	}

	/**
	 * @Title: get
	 * @Description: ��ȡָ��λ�õ�Ԫ��
	 * @param @param index
	 * @return int
	 */
	public int get(int index) {
		return array[index];
	}

	/**
	 * @Title: add
	 * @Description: �������β���һ��Ԫ��
	 * @param item
	 * @return int[]
	 */
	public int[] add(int item) {
		return add(array.length, item);
	}

	/**
	 * @Title: addFirst
	 * @Description: �������һ��λ�ò���һ��Ԫ�أ������滻��һ��Ԫ��
	 * @param item
	 * @return int[]
	 */
	public int[] addFirst(int item) {
		return add(0, item);
	}

	/**
	* @Title: deleteLast
	* @Description: ɾ�����һ��Ԫ��
	*/
	public void deleteLast() {
		delete(array.length - 1);
	}

	/**
	* @Title: deleteFirst
	* @Description: ɾ����һ��Ԫ��
	*/
	public void deleteFirst() {
		delete(0);
	}

}
