package view;

import data.DataContainer;

public class TopLevelMenu extends javax.swing.JFrame {

    // This is the data model that will get passed to all forms. 
    DataContainer datamodel = new DataContainer();

    /**
     * Constructor
     */
    public TopLevelMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        saveButton = new javax.swing.JMenuItem();
        exitProgramButton = new javax.swing.JMenuItem();
        classroommenu = new javax.swing.JMenu();
        addClassroom = new javax.swing.JMenuItem();
        listclassrooms = new javax.swing.JMenuItem();
        studentmenu = new javax.swing.JMenu();
        addStudent = new javax.swing.JMenuItem();
        listStudents = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        addFaculty = new javax.swing.JMenuItem();
        listFaculty = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        addCourse = new javax.swing.JMenuItem();
        listCourse = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu2.setText("File");

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        jMenu2.add(saveButton);

        exitProgramButton.setText("Exit Program");
        exitProgramButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitProgramButtonActionPerformed(evt);
            }
        });
        jMenu2.add(exitProgramButton);

        jMenuBar1.add(jMenu2);

        classroommenu.setText("Classroom");

        addClassroom.setText("Add Classroom");
        addClassroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClassroomActionPerformed(evt);
            }
        });
        classroommenu.add(addClassroom);

        listclassrooms.setText("List Classrooms");
        listclassrooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listclassroomsActionPerformed(evt);
            }
        });
        classroommenu.add(listclassrooms);

        jMenuBar1.add(classroommenu);

        studentmenu.setText("Student");

        addStudent.setText("Add Student");
        addStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentActionPerformed(evt);
            }
        });
        studentmenu.add(addStudent);

        listStudents.setText("List Students");
        listStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listStudentsActionPerformed(evt);
            }
        });
        studentmenu.add(listStudents);

        jMenuBar1.add(studentmenu);

        jMenu3.setText("Faculty");

        addFaculty.setText("Add Faculty");
        addFaculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFacultyActionPerformed(evt);
            }
        });
        jMenu3.add(addFaculty);

        listFaculty.setText("List Faculty");
        listFaculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listFacultyActionPerformed(evt);
            }
        });
        jMenu3.add(listFaculty);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("Courses");

        addCourse.setText("Add Course");
        addCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCourseActionPerformed(evt);
            }
        });
        jMenu1.add(addCourse);

        listCourse.setText("List Courses");
        listCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listCourseActionPerformed(evt);
            }
        });
        jMenu1.add(listCourse);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listclassroomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listclassroomsActionPerformed
        ClassroomReportForm listClassroomForm = new ClassroomReportForm(datamodel);
        listClassroomForm.setSize(800, 300);
        listClassroomForm.setVisible(true);
    }//GEN-LAST:event_listclassroomsActionPerformed

    private void addClassroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClassroomActionPerformed
        InputClassroomForm addClassroomForm = new InputClassroomForm(datamodel);
        addClassroomForm.setSize(500, 250);
        addClassroomForm.setVisible(true);
    }//GEN-LAST:event_addClassroomActionPerformed

    private void addStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentActionPerformed
        // TODO add your handling code here:
        InputStudentForm addStudentForm = new InputStudentForm(datamodel);
        addStudentForm.setSize(700, 550);
        addStudentForm.setVisible(true);
    }//GEN-LAST:event_addStudentActionPerformed

    private void listStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listStudentsActionPerformed
        // TODO add your handling code here:

        StudentReportForm listStudentForm = new StudentReportForm(datamodel);
        listStudentForm.setSize(710, 500);
        listStudentForm.setVisible(true);
    }//GEN-LAST:event_listStudentsActionPerformed

    private void exitProgramButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitProgramButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitProgramButtonActionPerformed

    private void addFacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFacultyActionPerformed
        // TODO add your handling code here:
        InputFacultyForm addFacultyForm = new InputFacultyForm(datamodel);
        addFacultyForm.setSize(700, 800);
        addFacultyForm.setVisible(true);
    }//GEN-LAST:event_addFacultyActionPerformed

    private void listFacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listFacultyActionPerformed
        // TODO add your handling code here:

        FacultyReportForm listFacultyForm = new FacultyReportForm(datamodel);
        listFacultyForm.setSize(710, 500);
        listFacultyForm.setVisible(true);
    }//GEN-LAST:event_listFacultyActionPerformed

    private void addCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCourseActionPerformed
        // TODO add your handling code here:

        InputCourseForm addCourseForm = new InputCourseForm(datamodel);
        addCourseForm.setSize(700, 400);
        addCourseForm.setVisible(true);
    }//GEN-LAST:event_addCourseActionPerformed

    private void listCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listCourseActionPerformed
        // TODO add your handling code here:
        OfferedCourseReportForm listCourseForm = new OfferedCourseReportForm(datamodel);
        listCourseForm.setSize(710, 500);
        listCourseForm.setVisible(true);
    }//GEN-LAST:event_listCourseActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        String menuItemClicked = evt.getActionCommand();
        if (!menuItemClicked.equals("Save")) {
        } else {
            //datamodel.writeSerializedFile();
            datamodel.writeTextFile();
            //datamodel.writeXML();
    }//GEN-LAST:event_saveButtonActionPerformed
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addClassroom;
    private javax.swing.JMenuItem addCourse;
    private javax.swing.JMenuItem addFaculty;
    private javax.swing.JMenuItem addStudent;
    private javax.swing.JMenu classroommenu;
    private javax.swing.JMenuItem exitProgramButton;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem listCourse;
    private javax.swing.JMenuItem listFaculty;
    private javax.swing.JMenuItem listStudents;
    private javax.swing.JMenuItem listclassrooms;
    private javax.swing.JMenuItem saveButton;
    private javax.swing.JMenu studentmenu;
    // End of variables declaration//GEN-END:variables

    public static void main(String[] args) {
        TopLevelMenu topmenu = new TopLevelMenu();
        topmenu.setVisible(true);
    }
}
