/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package mountaineerman.kcp2.kkim.app;

import mountaineerman.kcp2.kkim.app.model.AnalogInput; //TODO replace with library?
import mountaineerman.kcp2.kkim.kmega.KMegaApi;
import mountaineerman.kcp2.kkim.list.LinkedList;

import static mountaineerman.kcp2.kkim.utilities.StringUtils.join;
import static mountaineerman.kcp2.kkim.utilities.StringUtils.split;

import java.io.IOException;
import java.util.Arrays;

import krpc.client.Connection;
import krpc.client.RPCException;
import krpc.client.services.KRPC;

//TODO Temporarily Serial Communication library for testing connection between KKIM and KMega:
import com.fazecast.jSerialComm.*;

import static mountaineerman.kcp2.kkim.app.MessageUtils.getMessage;

public class App
{
	public static void main(String[] args)
	{
		System.out.println("=======================================================================================");
		System.out.println(" Kerbal Control Panel 2");
		System.out.println("=======================================================================================");
		/*
		 * SETTINGS PLACEHOLDER
		 * 
		 * KMega
		 * 		COM port ("COM4")
		 * 		COM port BAUD rate
		 * 		Refresh frequency
		 * KNano
		 * 		COM port ("COM6")
		 * 		COM port BAUD rate
		 * 		Refresh frequency
		 * 
		 * KKIM
		 * 		Refresh frequency
		 * 		AnalogInput calibration limits
		 */
		
		

		
		/* 	High-level flow:
		 * 	
		 * 	Initial:
		 * 		-Establish connection to kRPC
		 * 		-Establish connection to kMega
		 * 		-Establish connection to kAndro
		 * 	Loop:
		 * 		-Confirm connection to kRPC
		 * 		-Confirm connection to kMega
		 * 		-Confirm connection between kMega and kNano 
		 * 		-Confirm connection to kAndro
		 *		 
		 * 		A-Fetch latest kRPC values
		 * 		B-Fetch latest kMega values
		 * 		C-Update KIM object states based on A and B
		 * 			-Send "packet" to kMega
		 * 			-Send controlling signals to kRPC
		 * 			-Send "packet" to kAndro
		 * 
		 * 		-Idle	
		 */
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		/*System.out.println(">>>>> kkim-app: In main method");
		LinkedList tokens;
		tokens = split(getMessage());
		System.out.println(join(tokens));
		System.out.println(KMegaApi.getHelloWorld());
		*/
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		/*System.out.println("Starting KKIM-kRPC connection test...");
		try (Connection connection = Connection.newInstance())
		{
			KRPC krpc = KRPC.newInstance(connection);
			System.out.println("Connected to kRPC version " + krpc.getStatus().getVersion());
		}
		catch (RPCException e) {System.out.println("Caught RPCException: " + e.getMessage());}
		catch (IOException e)  {System.out.println("Caught IOException: " + e.getMessage());}
		*/
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		/*//https://fazecast.github.io/jSerialComm/
		System.out.println("Starting KKIM-KMega connection test...");
		
		SerialPort comPort = SerialPort.getCommPort("COM4");
		
		comPort.openPort();
		comPort.addDataListener(new SerialPortDataListener()
			{
			   @Override
			   public int getListeningEvents() { return SerialPort.LISTENING_EVENT_DATA_AVAILABLE; }
			   @Override
			   public void serialEvent(SerialPortEvent event)
			   {
			      if (event.getEventType() != SerialPort.LISTENING_EVENT_DATA_AVAILABLE)
			         return;
			      byte[] newData = new byte[comPort.bytesAvailable()];
			      int numRead = comPort.readBytes(newData, newData.length);
			      System.out.println("Read " + numRead + " bytes: " + Arrays.toString(newData));
			   }
			}
		);*/
	}
}

