/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * QuestionAnswering.java
 *
 * Created on Oct 3, 2013, 1:33:24 AM
 */

package qaiiitm;

import info.ephyra.OpenEphyra;
import info.ephyra.querygeneration.Query;
import info.ephyra.questionanalysis.AnalyzedQuestion;
import info.ephyra.questionanalysis.QuestionInterpretation;
import info.ephyra.search.Result;
import org.jdesktop.application.Action;

/**
 *
 * @author FoUkat
 */
public class QuestionAnswering extends javax.swing.JFrame {
   OpenEphyra OE = null;
    /** Creates new form QuestionAnswering */
    public QuestionAnswering() {
        initComponents();
        newsTextBox.setText("Write Text to extract Answer From");
        answerTypeTextBox.setText("Answer Box");
        interpretationsTextBox.setText("Question Interpretations");
        queryStringTextBox.setText("Query String");
        answerPatternTextBox.setText("Answer Pattern");
        answertypeTextBox.setText("Answer Type Filter");
        questionTextBox.setText("Question Box");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        newsTextBox = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        answertypeTextBox = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        interpretationsTextBox = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        questionTextBox = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        queryStringTextBox = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        answerTypeTextBox = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        answerPatternTextBox = new javax.swing.JTextArea();
        loadButton = new javax.swing.JButton();
        speakStop = new javax.swing.JButton();
        solveButton = new javax.swing.JButton();

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(qaiiitm.QAiiiTMApp.class).getContext().getResourceMap(QuestionAnswering.class);
        setTitle(resourceMap.getString("Question Answering System.title")); // NOI18N
        setName("Question Answering System"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        newsTextBox.setColumns(20);
        newsTextBox.setLineWrap(true);
        newsTextBox.setRows(5);
        newsTextBox.setText(resourceMap.getString("newsTextBox.text")); // NOI18N
        newsTextBox.setName("newsTextBox"); // NOI18N
        jScrollPane1.setViewportView(newsTextBox);

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        answertypeTextBox.setColumns(20);
        answertypeTextBox.setLineWrap(true);
        answertypeTextBox.setRows(5);
        answertypeTextBox.setText(resourceMap.getString("answertypeTextBox.text")); // NOI18N
        answertypeTextBox.setName("answertypeTextBox"); // NOI18N
        jScrollPane2.setViewportView(answertypeTextBox);

        jScrollPane3.setName("jScrollPane3"); // NOI18N

        interpretationsTextBox.setColumns(20);
        interpretationsTextBox.setLineWrap(true);
        interpretationsTextBox.setRows(5);
        interpretationsTextBox.setText(resourceMap.getString("interpretationsTextBox.text")); // NOI18N
        interpretationsTextBox.setName("interpretationsTextBox"); // NOI18N
        jScrollPane3.setViewportView(interpretationsTextBox);

        jScrollPane4.setName("jScrollPane4"); // NOI18N

        questionTextBox.setColumns(20);
        questionTextBox.setLineWrap(true);
        questionTextBox.setRows(5);
        questionTextBox.setText(resourceMap.getString("questionTextBox.text")); // NOI18N
        questionTextBox.setName("questionTextBox"); // NOI18N
        jScrollPane4.setViewportView(questionTextBox);

        jScrollPane5.setName("jScrollPane5"); // NOI18N

        queryStringTextBox.setColumns(20);
        queryStringTextBox.setLineWrap(true);
        queryStringTextBox.setRows(5);
        queryStringTextBox.setText(resourceMap.getString("queryStringTextBox.text")); // NOI18N
        queryStringTextBox.setName("queryStringTextBox"); // NOI18N
        jScrollPane5.setViewportView(queryStringTextBox);

        jScrollPane6.setName("jScrollPane6"); // NOI18N

        answerTypeTextBox.setColumns(20);
        answerTypeTextBox.setLineWrap(true);
        answerTypeTextBox.setRows(5);
        answerTypeTextBox.setText(resourceMap.getString("answerTypeTextBox.text")); // NOI18N
        answerTypeTextBox.setName("answerTypeTextBox"); // NOI18N
        jScrollPane6.setViewportView(answerTypeTextBox);

        jScrollPane7.setName("jScrollPane7"); // NOI18N

        answerPatternTextBox.setColumns(20);
        answerPatternTextBox.setLineWrap(true);
        answerPatternTextBox.setRows(5);
        answerPatternTextBox.setText(resourceMap.getString("answerPatternTextBox.text")); // NOI18N
        answerPatternTextBox.setName("answerPatternTextBox"); // NOI18N
        jScrollPane7.setViewportView(answerPatternTextBox);

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(qaiiitm.QAiiiTMApp.class).getContext().getActionMap(QuestionAnswering.class, this);
        loadButton.setAction(actionMap.get("LoadAll")); // NOI18N
        loadButton.setText(resourceMap.getString("loadButton.text")); // NOI18N
        loadButton.setName("loadButton"); // NOI18N

        speakStop.setAction(actionMap.get("close")); // NOI18N
        speakStop.setText(resourceMap.getString("speakStop.text")); // NOI18N
        speakStop.setName("speakStop"); // NOI18N

        solveButton.setAction(actionMap.get("solveQuestion")); // NOI18N
        solveButton.setText(resourceMap.getString("solveButton.text")); // NOI18N
        solveButton.setName("solveButton"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane3)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(loadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(speakStop, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(solveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)))
                .addGap(232, 232, 232))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(solveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(speakStop, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuestionAnswering().setVisible(true);
            }
        });
    }

    @Action
    public void LoadAll() {
        OE = new OpenEphyra("");
        speakStop.setEnabled(true);
        solveButton.setEnabled(true);
        loadButton.setEnabled(false);
        
    }

    @Action
    public void solveQuestion() {
        AnalyzedQuestion aq = OE.analyzer(questionTextBox.getText());
        String[] answerTypes = aq.getAnswerTypes();
        String pr = "";
        for(int i=0;i<answerTypes.length;i++)
        {
            pr+=answerTypes[i]+"\n";
        }
        answertypeTextBox.setText(pr);
        QuestionInterpretation[] interpret = aq.getInterpretations();
        pr = "";
        for(int i=0;i<interpret.length;i++)
        {
            pr+=interpret[i].toString()+"\n";
        }
        interpretationsTextBox.setText(pr);

        Query[] queries = OE.queryStrings(aq);
        pr = "";
        for(int i=0;i<queries.length;i++)
        {
            pr+=queries[i].getQueryString()+"\n";
        }
        queryStringTextBox.setText(pr);
        answertypeTextBox.setText(OE.questionAnalyse(newsTextBox.getText(), questionTextBox.getText()));
        Result[] rs = OE.answerType(newsTextBox.getText(), questionTextBox.getText());
        pr="";
        for(int i=queries.length;i<rs.length;i++)
        {
            pr+=rs[i].getAnswer()+"\n";
        }
        answerTypeTextBox.setText(pr);
        rs = OE.answerPattern(newsTextBox.getText(), questionTextBox.getText());
        pr="";
        for(int i=queries.length;i<rs.length;i++)
        {
            pr+=rs[i].getAnswer()+"\n";
        }
        answerPatternTextBox.setText(pr);
    }

    @Action
    public void close() {
        this.hide();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea answerPatternTextBox;
    private javax.swing.JTextArea answerTypeTextBox;
    private javax.swing.JTextArea answertypeTextBox;
    private javax.swing.JTextArea interpretationsTextBox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JButton loadButton;
    private javax.swing.JTextArea newsTextBox;
    private javax.swing.JTextArea queryStringTextBox;
    private javax.swing.JTextArea questionTextBox;
    private javax.swing.JButton solveButton;
    private javax.swing.JButton speakStop;
    // End of variables declaration//GEN-END:variables

}