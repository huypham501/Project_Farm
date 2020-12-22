/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package processpackage;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author kazen
 */
public class Shop extends JPanel {
    
    JLabel background = new JLabel();
    JLabel seed = new JLabel();
    JLabel fertilizer = new JLabel();
    JLabel close = new JLabel();
    
    static final String PATH_BACKGROUND = "D:\\Project_Farm\\img\\Background\\Background-shop.png";
    static final String PATH_SEED = "D:\\Project_Farm\\img\\Button\\Shop\\Seed-tag-button.png";
    static final String PATH_SEED_LIGHTER = "D:\\Project_Farm\\img\\Button\\Shop\\Seed-tag-lighter-button.png";
    static final String PATH_FERTILIZER = "D:\\Project_Farm\\img\\Button\\Shop\\Fertilizer-tag-button.png";
    static final String PATH_FERTILIZER_LIGHTER = "D:\\Project_Farm\\img\\Button\\Shop\\Fertilizer-tag-lighter-button.png";
    static final String PATH_CLOSE = "D:\\Project_Farm\\img\\Button\\Shop\\Close-button.png";
    
    Shop() {
        setMaximumSize(new Dimension(800, 600));
        setMinimumSize(new Dimension(800, 600));
        setSize(new Dimension(800, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        setOpaque(false);
        
        background.setIcon(new ImageIcon(PATH_BACKGROUND));
        seed.setIcon(new ImageIcon(PATH_SEED_LIGHTER));
        fertilizer.setIcon(new ImageIcon(PATH_FERTILIZER));
        close.setIcon(new ImageIcon(PATH_CLOSE));
        
        add(seed, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 150, -1, -1));
        add(fertilizer, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 150, -1, -1));
        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 60, -1,-1));
        
        seed.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                seedClicked(evt);
            }
        });
        
        fertilizer.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                fertilizerClicked(evt);
            }
        });
        
        close.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                closeClicked(evt);
            }
        });
    }
    
    private void seedClicked(MouseEvent evt) {
        fertilizer.setIcon(new ImageIcon(PATH_FERTILIZER));
        seed.setIcon(new ImageIcon(PATH_SEED_LIGHTER));
        
        /* ADD GENERATE CODE HERE */
    }
    
    private void fertilizerClicked(MouseEvent evt) {
        fertilizer.setIcon(new ImageIcon(PATH_FERTILIZER_LIGHTER));
        seed.setIcon(new ImageIcon(PATH_SEED));
    
        /* ADD GENERATE CODE HERE */
    }
    
    private void closeClicked(MouseEvent evt) {
        ModuleManager.plugOut(Main.mainFrame, this);
        
        ModuleManager.revalidate(Main.mainFrame);
        ModuleManager.repaint(Main.mainFrame);
    }

}
