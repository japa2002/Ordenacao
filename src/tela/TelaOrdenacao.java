package tela;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.JComboBox;

public class TelaOrdenacao extends JFrame {

	private static final long serialVersionUID = 1090740499685551266L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField tfCampoPesquisaLista;
	private JTextField tfIndiceBusca;
	private JTextField tfTempo;
	private JTextField tfStatus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaOrdenacao frame = new TelaOrdenacao();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaOrdenacao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 750, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUrl = new JLabel("URL:");
		lblUrl.setBounds(10, 11, 46, 14);
		contentPane.add(lblUrl);
		
		textField = new JTextField();
		textField.setBounds(38, 8, 686, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(10, 512, 714, 23);
		contentPane.add(btnBuscar);
		
		JButton btnOrdenar = new JButton("Ordenar");
		btnOrdenar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnOrdenar.setBounds(10, 478, 714, 23);
		contentPane.add(btnOrdenar);
		
		JComboBox cbTipoPesquisa = new JComboBox();
		cbTipoPesquisa.setBounds(567, 71, 157, 22);
		contentPane.add(cbTipoPesquisa);
		
		JComboBox cbTipoOrdenacao = new JComboBox();
		cbTipoOrdenacao.setBounds(119, 39, 164, 22);
		contentPane.add(cbTipoOrdenacao);
		
		JLabel lblTipoOrdenacao = new JLabel("Tipo ordena\u00E7\u00E3o:");
		lblTipoOrdenacao.setBounds(10, 43, 99, 14);
		contentPane.add(lblTipoOrdenacao);
		
		JLabel lblTipoPesquisa = new JLabel("Tipo de pesquisa:");
		lblTipoPesquisa.setBounds(447, 75, 120, 14);
		contentPane.add(lblTipoPesquisa);
		
		JLabel lblStatus = new JLabel("Status: ");
		lblStatus.setBounds(613, 43, 55, 14);
		contentPane.add(lblStatus);
		
		tfCampoPesquisaLista = new JTextField();
		tfCampoPesquisaLista.setBounds(175, 72, 108, 20);
		contentPane.add(tfCampoPesquisaLista);
		tfCampoPesquisaLista.setColumns(10);
		
		JLabel lblCampoPesquisaLista = new JLabel("Campo de pesquisa da lista:");
		lblCampoPesquisaLista.setBounds(10, 75, 164, 14);
		contentPane.add(lblCampoPesquisaLista);
		
		tfIndiceBusca = new JTextField();
		tfIndiceBusca.setEnabled(false);
		tfIndiceBusca.setBounds(355, 72, 74, 20);
		contentPane.add(tfIndiceBusca);
		tfIndiceBusca.setColumns(10);
		
		JLabel lblIndiceBusca = new JLabel("\u00CDndice:");
		lblIndiceBusca.setBounds(294, 75, 51, 14);
		contentPane.add(lblIndiceBusca);
		
		JLabel lblTempo = new JLabel("Tempo:");
		lblTempo.setBounds(337, 43, 65, 14);
		contentPane.add(lblTempo);
		
		tfTempo = new JTextField();
		tfTempo.setEnabled(false);
		tfTempo.setBounds(407, 40, 150, 20);
		contentPane.add(tfTempo);
		tfTempo.setColumns(10);
		
		JList lConteudo = new JList();
		lConteudo.setBounds(50, 431, 634, -302);
		contentPane.add(lConteudo);
		
		tfStatus = new JTextField();
		tfStatus.setEnabled(false);
		tfStatus.setBounds(678, 39, 46, 20);
		contentPane.add(tfStatus);
		tfStatus.setColumns(10);
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnListar.setBounds(10, 444, 714, 23);
		contentPane.add(btnListar);
	}
}
