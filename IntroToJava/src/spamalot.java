import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;

public class spamalot implements ActionListener
{
	// 3. Add these variables to the top of your class and fill in your fake
	// account details.
	final String FAKE_USERNAME = "spammerroflcopter69@outlook.com";
	final String FAKE_PASSWORD = "lolboy123";
	JFrame Window;
	JPanel Drawer;
	JButton Bad;
	JButton Good;
	JTextField PhoneNumber;
	JTextField Email;

	public static void main(String[] args)
	{

		// 1. Create the user interface for your spammer that looks something
		// like this:
		JFrame Window = new JFrame();
		spamalot j = new spamalot();

		// 5. Add the sendSpam() method below to send nasty/nice messages
		// depending on which button is clicked. (Command + Shift + O will add
		// all the required imports in one fell swoop.)
	}

	public spamalot()
	{
		JPanel panel = new JPanel();
		Window = new JFrame();
		Window.setVisible(true);
		Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Window.add(panel);
		JButton Bad = new JButton("Bad");
		panel.add(Bad);
		JButton Good = new JButton("Good");
		panel.add(Good);
		JTextField PhoneNumber = new JTextField(20);
		panel.add(PhoneNumber);
		JTextField Email = new JTextField(20);
		panel.add(Email);
		Good.addActionListener(this);
		Bad.addActionListener(this);
		Window.setSize(500, 500);
		Window.pack();
	}

	// 7. [Optional] Allow your program to also spam cell phones.

	String sendTextMessage(String phoneNumber, String message)
	{
		if (sendSpam(phoneNumber + "@tmomail.net", "", message))
			return "T-Mobile";
		if (sendSpam(phoneNumber + "@vmobl.com", "", message))
			return "Virgin Mobile";
		if (sendSpam(phoneNumber + "@cingularme.com", "", message))
			return "Cingular";
		if (sendSpam(phoneNumber + "@messaging.sprintpcs.com", "", message))
			return "Sprint";
		if (sendSpam(phoneNumber + "@vtext.com", "", message))
			return "Verizon";
		if (sendSpam(phoneNumber + "@messaging.nextel.com", "", message))
			return "Nextel";
		return "FAIL!";
	}

	private boolean sendSpam(String recipient, String subject, String content)
	{
		for (int i = 0; i < 1; i++)
		{

			Properties props = new Properties();
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.port", "587");

			Session session = Session.getInstance(props, new javax.mail.Authenticator()
			{
				protected javax.mail.PasswordAuthentication getPasswordAuthentication()
				{
					return new javax.mail.PasswordAuthentication(FAKE_USERNAME, FAKE_PASSWORD);
				}
			});

			try
			{

				Message message = new MimeMessage(session);
				message.setFrom(new InternetAddress(FAKE_USERNAME));
				message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
				message.setSubject(subject);
				message.setText(content);
				Transport.send(message);
				return true;

			} catch (MessagingException e)
			{
				e.printStackTrace();
				PhoneNumber.setBackground(Color.RED);
				return false;
			}
		}
		return true;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		if (e.getSource() == Bad)
		{
			Email.setBackground(Color.GREEN);
			sendSpam(Email.getText(), "I'm Sorry. I hate you. Face LIFE", "This is the truth: U Suck");
			// PhoneNumber.setBackground(Color.GREEN);
			// sendTextMessage(PhoneNumber.getText(), "me");
		}
		if (e.getSource() == Good)
		{
			Email.setBackground(Color.GREEN);
			sendSpam(Email.getText(), "I'm Sorry. I hate you. Face LIFE", "This is the truth: U Suck");
			// PhoneNumber.setBackground(Color.GREEN);
			// sendTextMessage(PhoneNumber.getText(), "me");
		}
	}
}
