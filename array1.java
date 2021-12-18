import java.io.DataInputStream;
class array1
    {
        public static void main(String args[])
            {
                DataInputStream in = new DataInputStream(System.in);
                final int size = 5;
                int i;
                int marks[] = new int[size];
                try{
                    for(i=0; i < size ; i++)
                    {System.out.println("Enter marks of student "+(i+1)+":");
                     marks[i] = Integer.parseInt(in.readLine());
                    }
                }
                catch (Exception e) {}
                for(i=0;i<size;i++)
                System.out.println("Marks["+(i)+"]="+ marks[i]);
            }
}