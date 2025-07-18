package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ikv extends Dialog {
    private final String a;
    private final String b;
    private final String c;

    public ikv(Context context, String str, String str2, String str3) {
        super(context);
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // android.app.Dialog
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.setup_informational_dialog_amati);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        ((TextView) findViewById(R.id.info_dialog_title)).setText(this.a);
        ((TextView) findViewById(R.id.info_dialog_content_header)).setText(this.b);
        ((TextView) findViewById(R.id.info_dialog_content_body)).setText(this.c);
        TextView textView = (TextView) findViewById(R.id.info_dialog_btn);
        textView.setOnClickListener(new View.OnClickListener() { // from class: iku
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.dismiss();
            }
        });
        textView.requestFocus();
    }
}
