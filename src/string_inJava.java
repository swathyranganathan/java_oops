public class string_inJava {
    public static void main(String[] args) {
        String st =new String("Swathy");
        System.out.println(st);
        //String are generally immutable
        //using StringBuffer to mutable the data of the string
        StringBuffer sb=new StringBuffer("swathy");
        System.out.println(sb.capacity());
        System.out.println(sb.append(" ranganathan"));
        System.out.println(sb.charAt(3));
        System.out.println(sb.insert(5,"i"));
        System.out.println(sb.length());
        System.out.println(sb.deleteCharAt(2));
        System.out.println(sb.replace(3,5,"ok"));
    }
}
