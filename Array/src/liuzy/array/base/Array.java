package liuzy.array.base;

/**
 * @ClassName: Array
 * @Description: 数组
 * @author liuzy
 * @date 2018年9月16日
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
	 * @param capacity 容量
	 */
	public Array(int capacity) {
		array = new int[10];
		size = 0;
	}

	/**
	 * @Title: add
	 * @Description: 向数组中指定位置插入元素
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
	 * @Description: 删除指定位置的元素
	 * @param index
	 */
	public void delete(int index) {
		for (int i = index; i < array.length; i++) {
			array[i] = array[i + 1];
		}
		size--;
	}

	/**
	 * @Title: add
	 * @Description: 向数组结尾添加一个元素
	 * @param item
	 * @return int[]
	 */
	public int[] add(int item) {
		return add(array.length, item);
	}

	/**
	 * @Title: addFirst
	 * @Description: 向数组第一个位置插入一个元素，不会替换第一个元素
	 * @param item
	 * @return int[]
	 */
	public int[] addFirst(int item) {
		return add(0, item);
	}

	/**
	* @Title: deleteLast
	* @Description: 删除最后一个元素
	*/
	public void deleteLast() {
		delete(array.length - 1);
	}

	/**
	* @Title: deleteFirst
	* @Description: 删除第一个元素
	*/
	public void deleteFirst() {
		delete(0);
	}

	/**
	 * @Title: sort
	 * @Description: 排序，default:从小到大
	 * @return int[]
	 */
	public int[] sort() {
		return array;
	}
}
