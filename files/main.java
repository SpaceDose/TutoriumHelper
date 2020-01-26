package view
import javax.swing.JFrame
import javax.swing.JPanel
import javax.swing.JLabel
import javax.swing.JComboBox
import java.awt.BorderLayout
import java.awt.Dimension

class MainFrame : JFrame() {
    
    init {
        createUI()
    }
    
    private fun createUI() {
        setTitle("Example Code")
        
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        setSize(640, 480)
        setLocationRelativeTo(null)
        setVisible(true)
        
        openProfileSelection()
    }
    
    private fun openProfileSelection() {
        add(ProfileSelection())
        validate()
    }
}