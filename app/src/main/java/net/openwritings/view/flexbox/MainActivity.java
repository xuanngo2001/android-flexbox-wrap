package net.openwritings.view.flexbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.Button;

import com.google.android.flexbox.FlexboxLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FlexboxLayout flexboxLayout = this.findViewById(R.id.flexbox_view);


        // Add a lot of buttons.
        for(int i=0; i<70; i++) {
            Button button = new Button(this);
            int btnHeight = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, 40,
                                                        this.getResources().getDisplayMetrics());
            int btnWidth = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, 70,
                                                        this.getResources().getDisplayMetrics());
            button.setWidth(btnWidth);
            button.setHeight(btnHeight);
            button.setText(String.valueOf(i));

            flexboxLayout.addView(button);
        }
    }
}

/*
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FlexboxLayout flexboxLayout = this.findViewById(R.id.flexbox_view);
        this.addDifferentSizeViews(flexboxLayout);

    }
    private void addDifferentSizeViews(FlexboxLayout flexboxLayout){

        for(int i=0; i<70; i++){
            flexboxLayout.addView(this.createButton(i));
        }
    }
    private Button createButton(int position){

        // Get different width.
        int diffWidth=(position%60)+40; // Limit max width to 99.

        // Create button.
        Button button = new Button(this);
        int btnHeight = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, 40, this.getResources().getDisplayMetrics());
        int btnWidth = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, diffWidth, this.getResources().getDisplayMetrics());
        button.setWidth(btnWidth);
        button.setHeight(btnHeight);
        button.setText(String.valueOf(position));

        return button;
    }
}
*/