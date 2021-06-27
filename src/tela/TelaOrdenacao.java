package tela;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dado.Dado;

import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class TelaOrdenacao extends JFrame {

	private static final long serialVersionUID = 1090740499685551266L;
	private JPanel contentPane;
	private JTextField tfUrl;
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
					frame.setLocationRelativeTo(null);
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
		setBackground(Color.DARK_GRAY);
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
		
		tfUrl = new JTextField();
		tfUrl.setBounds(38, 8, 686, 20);
		contentPane.add(tfUrl);
		tfUrl.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(10, 512, 714, 23);
		contentPane.add(btnBuscar);
		
		JButton btnOrdenar = new JButton("Ordenar");
		btnOrdenar.setBounds(10, 478, 714, 23);
		btnOrdenar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
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
		tfIndiceBusca.setEditable(false);
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
		tfTempo.setEditable(false);
		tfTempo.setBounds(407, 40, 150, 20);
		contentPane.add(tfTempo);
		tfTempo.setColumns(10);
		
		tfStatus = new JTextField();
		tfStatus.setEditable(false);
		tfStatus.setBounds(678, 39, 46, 20);
		contentPane.add(tfStatus);
		tfStatus.setColumns(10);
		
		JList lConteudo = new JList();
		lConteudo.setBounds(10, 104, 714, 329);
		contentPane.add(lConteudo);
		
		JButton btnListar = new JButton("Listar");
		btnListar.setBounds(10, 444, 714, 23);
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Dado dado = new Dado();
					List<String> lista = dado.listarDadosArquivo(tfUrl.getText());
					lConteudo.setListData(lista.toArray());
					int tempo = dado.getResultado().getTempoExecucao();
					tfTempo.setText(String.valueOf(tempo)+" ns");
					tfStatus.setBackground(Color.GREEN);
					tfStatus.setText("OK");
				} catch (Exception e2) {
					tfStatus.setBackground(Color.RED);
					tfStatus.setText("FALHA");
				}
			}
		});
		contentPane.add(btnListar);
		
	}
}
