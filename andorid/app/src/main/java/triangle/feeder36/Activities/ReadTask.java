package triangle.feeder36.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

import triangle.feeder36.Calender.DateTime;
import triangle.feeder36.R;

public class ReadTask extends AppCompatActivity {

    RelativeLayout read_task;
    TextView course_code,course_name,task_tag,task_detail,task_deadline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.read_task);

        Bundle dataFromTaskItem = getIntent().getExtras();
        String courseCode = dataFromTaskItem.getString("courseCode");
        String courseName = dataFromTaskItem.getString("courseName");
        String taskTag = dataFromTaskItem.getString("taskTag");
        String taskDetail = dataFromTaskItem.getString("taskDetail");
        String taskDeadlineStored = dataFromTaskItem.getString("taskDeadline");
        String taskDeadlineFormatted;

        /* Deadline converted to better forms of representation */

        DateTime deadlineDateTime = new DateTime(taskDeadlineStored,"/",":"," ");
        taskDeadlineFormatted = deadlineDateTime.formal12Representation();

        read_task = (RelativeLayout) findViewById(R.id.read_task);
        course_code = (TextView) read_task.findViewById(R.id.task_course_code);
        course_name = (TextView) read_task.findViewById(R.id.course_name);
        task_tag = (TextView) read_task.findViewById(R.id.task_tag);
        task_detail = (TextView) read_task.findViewById(R.id.task_detail);
        task_deadline = (TextView) read_task.findViewById(R.id.task_deadline);

        course_code.setText(courseCode);
        course_name.setText(courseName);
        task_tag.setText(taskTag);
        task_detail.setText(taskDetail);
        task_deadline.setText(taskDeadlineFormatted);
    }


}