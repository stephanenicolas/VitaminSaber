/*
 * Copyright 2013 Jake Wharton
 * Copyright 2014 Prateek Srivastava (@f2prateek)
 * Copyright 2015 Wentao Ji
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.w2ji.vitaminsaber.example;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.InjectView;
import com.w2ji.vitaminsaber.InjectResource;
import com.w2ji.vitaminsaber.VitaminSaber;

public class SampleActivity extends Activity {

    @InjectView(R.id.string) TextView testString;
    @InjectView(R.id.image) ImageView imageView;

    @InjectResource(R.string.app_name) String appName;
    @InjectResource(R.dimen.spacing_tiny) float tinySpacing;
    @InjectResource(R.integer.ten) int ten;
    @InjectResource(R.color.green) int color;
    @InjectResource(R.drawable.example_drawable) Drawable exampleDrawable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        VitaminSaber.inject(this);
        testString.setTextColor(color);
        imageView.setImageDrawable(exampleDrawable);

        SampleUtil util = new SampleUtil(this);

        testString.setText(appName + "\n" + tinySpacing + "\n" + ten + "\n" + util.appName);
    }
}
