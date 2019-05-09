class Main {
    public static void main(String[] args) {
        try {

            // print a message
            System.out.println("Executing notepad.exe");
   
            // create a process and execute notepad.exe
            Process process = Runtime.getRuntime().exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe https://www.google.com");
   
            // print another message
            System.out.println("Notepad should now open.");
   
         } catch (Exception ex) {
            ex.printStackTrace();
         }
    }
}