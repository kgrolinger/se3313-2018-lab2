package ca.uwo.eng.se3313.lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    /**
     * View that showcases the image
     */
    private ImageView ivDisplay;

    /**
     * Skip button
     */
    private ImageButton skipBtn;

    /**
     * Progress bar showing how many seconds left (percentage).
     */
    private ProgressBar pbTimeLeft;

    /**
     * Label showing the seconds left.
     */
    private TextView tvTimeLeft;

    /**
     * Control to change the interval between switching images.
     */
    private SeekBar sbWaitTime;

    /**
     * Editable text to change the interval with {@link #sbWaitTime}.
     */
    private EditText etWaitTime;


    /**
     * Used to download images from the {@link #urlList}.
     */
    private IImageDownloader imgDownloader;

    /**
     * List of image URLs of cute animals that will be displayed.
     */
    private static final List<String> urlList = new ArrayList<String>() {{
        add("http://i.imgur.com/CPqbVW8.jpg");
        add("http://i.imgur.com/Ckf5OeO.jpg");
        add("http://i.imgur.com/3jq1bv7.jpg");
        add("http://i.imgur.com/8bSITuc.jpg");
        add("http://i.imgur.com/JfKH8wd.jpg");
        add("http://i.imgur.com/KDfJruL.jpg");
        add("http://i.imgur.com/o6c6dVb.jpg");
        add("http://i.imgur.com/B1bUG2K.jpg");
        add("http://i.imgur.com/AfxvVuq.jpg");
        add("http://i.imgur.com/DSDtm.jpg");
        add("http://i.imgur.com/SAVYw7S.jpg");
        add("http://i.imgur.com/4HznKil.jpg");
        add("http://i.imgur.com/meeB00V.jpg");
        add("http://i.imgur.com/CPh0SRT.jpg");
        add("http://i.imgur.com/8niPBvE.jpg");
        add("http://i.imgur.com/dci41f3.jpg");
    }};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Insert your code here (and within the class!)
    }
}
