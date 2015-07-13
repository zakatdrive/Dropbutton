package atdrive.chat.com.dropbutton;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Created by zeeshan.ahmad on 7/10/2015.
 */

public class ButtonReplaceActivity extends Activity implements View.OnClickListener{
    int flag0=0,flag1=0,flag2=0,flag3=0,flag4=0,flag5=0,flag6=0,flag7=0,flag8=0,flag9=0;
    int oNumber=10;
    int buttonsize=40;
    LinearLayout l[]=new LinearLayout[oNumber];
    LinearLayout ll[]=new LinearLayout[oNumber];
    Button btn[] = new Button[oNumber];
    LinearLayout buttonall;
    LinearLayout btnsetll;
    int w=0;
    @Override
    public void onCreate(Bundle savedInstancestate){
        super.onCreate(savedInstancestate);
        setContentView(R.layout.buttonset);
         buttonall=(LinearLayout)findViewById(R.id.buttonall);
         btnsetll=(LinearLayout)findViewById(R.id.btnsetll);
        updateSizeInfo();
        for (int z=0;z<oNumber;z++){

            ll[z] = new LinearLayout(this); // initialize it
            LinearLayout.LayoutParams lp=new LinearLayout.LayoutParams(100,100);
            ll[z].setLayoutParams(lp);
            ll[z].setId(z);
            //  btn[i].setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT));
            buttonall.addView(ll[z]);
        }

        for (int i=0;i<oNumber;i++){
        btn[i] = new Button(this); // initialize it
  //  btn[i].setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT));
        btn[i].setText(String.valueOf(i));
            btn[i].setTextSize(28);
        btn[i].setOnClickListener(this);
            btn[i].setId(i);
        ll[i].addView(btn[i]);
}

        for (int p=0;p<oNumber;p++){

            l[p] = new LinearLayout(this); // initialize it
            LinearLayout.LayoutParams lp=new LinearLayout.LayoutParams(100,100);
            l[p].setLayoutParams(lp);
            l[p].setId(p);
            //  btn[i].setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT));
            btnsetll.addView(l[p]);
        }



    }

    @Override
    public void onClick(View v) {
       switch (v.getId()){
           case 0:if(flag0==0) {
               ll[0].removeView(btn[0]);
               //    runAnimation(btn[0]);
               l[0].addView(btn[0]);
               flag0=1;
           }
               else{
               l[0].removeView(btn[0]);
               //    runAnimation(btn[0]);
               ll[0].addView(btn[0]);
               flag0=0;
           }
               break;
           case 1:
if(flag1==0) {
    ll[1].removeView(btn[1]);
    //  runAnimation(btn[1]);
    l[1].addView(btn[1]);
    flag1=1;
}
  else{
    l[1].removeView(btn[1]);
    //  runAnimation(btn[1]);
    ll[1].addView(btn[1]);
    flag1=0;
}
               break;
           case 2:
               if(flag2==0) {
                   ll[2].removeView(btn[2]);
                   // runAnimation(btn[2]);
                   l[2].addView(btn[2]);
                   flag2=1;
               }
               else{
                   l[2].removeView(btn[2]);
                   // runAnimation(btn[2]);
                   ll[2].addView(btn[2]);
                   flag2=0;
           }
               break;
           case 3:
               if(flag3==0) {
                   ll[3].removeView(btn[3]);
                   // runAnimation(btn[3]);
                   l[3].addView(btn[3]);
                   flag3 = 1;
               }
               else{
                   l[3].removeView(btn[3]);
                   // runAnimation(btn[3]);
                   ll[3].addView(btn[3]);
                   flag3 = 0;
               }
               break;
           case 4:
               if(flag4==0) {
                   ll[4].removeView(btn[4]);
                   //  runAnimation(btn[1]);
                   l[4].addView(btn[4]);
                   flag4 = 1;
               }
               else{
                   l[4].removeView(btn[4]);
                   //  runAnimation(btn[1]);
                   ll[4].addView(btn[4]);
                   flag4 = 0;
               }
               break;
           case 5:
               if(flag5==0) {
                   ll[5].removeView(btn[5]);
                   // runAnimation(btn[2]);
                   l[5].addView(btn[5]);
                   flag5=1;
               }
               else{
                   l[5].removeView(btn[5]);
                   // runAnimation(btn[2]);
                   ll[5].addView(btn[5]);
                   flag5=0;
               }
               break;
           case 6:
if(flag6==0) {
    ll[6].removeView(btn[6]);
    // runAnimation(btn[3]);
    l[6].addView(btn[6]);
    flag6=1;
}
               else{
    l[6].removeView(btn[6]);
    // runAnimation(btn[3]);
    ll[6].addView(btn[6]);
    flag6=0;
               }
               break;
           case 7:
               if(flag7==0) {
                   ll[7].removeView(btn[7]);
                   //  runAnimation(btn[1]);
                   l[7].addView(btn[7]);
                   flag7 = 1;
               }
               else{
                   l[7].removeView(btn[7]);
                   //  runAnimation(btn[1]);
                   ll[7].addView(btn[7]);
                   flag7 = 0;
               }
               break;
           case 8:
               if(flag8==0) {
                   ll[8].removeView(btn[8]);
                   // runAnimation(btn[2]);
                   l[8].addView(btn[8]);
                   flag8=1;
               }
               else{
                   l[8].removeView(btn[8]);
                   // runAnimation(btn[2]);
                   ll[8].addView(btn[8]);
                   flag8=0;
               }
               break;
           case 9:
               if(flag9==0) {
                   ll[9].removeView(btn[9]);
                   // runAnimation(btn[3]);
                   l[9].addView(btn[9]);
                   flag9=1;
               }
               else{
                   l[9].removeView(btn[9]);
                   // runAnimation(btn[3]);
                   ll[9].addView(btn[9]);
                   flag9=0;
               }
               break;





       }
    }




    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        // TODO Auto-generated method stub
        super.onWindowFocusChanged(hasFocus);
        updateSizeInfo();
    }
    private void updateSizeInfo() {

        w = btnsetll.getWidth();
       buttonsize=w/10;

    }
}
