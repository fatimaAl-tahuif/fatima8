public class Q2 {
    public static void main(String[] args) {
    circularlyLinkedList<Integer>list=new circularlyLinkedList<>();

        list.addFirst(11);
        list.addLast(12);
        list.addLast(13);
        list.addLast(14);
        list.addLast(15);
list.print();
        System.out.println("Size of list: "+list.methodSize(list));

        System.out.println("Size of list: "+list.size());

    }
}
/*
هذا الكود يقوم بإنشاء قائمة مرتبطة دائرية وإضافة عناصر إليها، ثم:

يطبع محتويات القائمة.
يحسب عدد العناصر باستخدام الدالة methodSize.
يُطبع عدد العناصر باستخدام الدالة size.
 */