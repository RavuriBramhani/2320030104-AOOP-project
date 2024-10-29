public class Server {
	
	Socket socket;

    
    public static Vector clients = new Vector();


    public Server(Socket s){
        try {
            
            socket =s;
        } catch (Exception e) {
            
            System.out.println(e);
        }
    }

    public void run(){
        try {
          
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

            clients.add(dataOutputStream);

            while (true) {
               String msgInput = dataInputStream.readUTF();
               System.out.println("received "+msgInput);

                System.out.println(clients.size());
         
            for (int i = 0; i < clients.size(); i++) {
                try {
                    DataOutputStream dos = (DataOutputStream)clients.get(i);
                    System.out.println(dos);
                    dos.writeUTF(msgInput);
                    System.out.println("hey i  am in try");
                    
                } catch (Exception e) {
                    System.out.println(e);
                }
                
            }

            }


        } catch (Exception e) {
            
            System.out.println(e);
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = new ServerSocket(6001);

       
        while (true) {
           
            Socket socket = serverSocket.accept();
        
            Server server = new Server(socket);
           
            Thread thread = new Thread(server);
          
            thread.start();
        }

	}

}
