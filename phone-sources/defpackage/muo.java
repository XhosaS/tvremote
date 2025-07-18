package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class muo extends sfj {
    public CharSequence a;
    public CharSequence b;
    public View.OnClickListener c;
    public boolean d;

    public muo() {
        super(R.layout.chooserdialog_text_option);
        this.d = false;
    }

    @Override // defpackage.sfj
    protected final /* bridge */ /* synthetic */ void a(Context context, View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        TextView textView = (TextView) linearLayout.findViewById(R.id.title);
        TextView textView2 = (TextView) linearLayout.findViewById(R.id.subtitle);
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            textView.setText(charSequence);
        }
        textView2.setVisibility(8);
        CharSequence charSequence2 = this.b;
        if (charSequence2 != null) {
            linearLayout.setContentDescription(charSequence2);
        }
        if (this.d) {
            linearLayout.setBackgroundColor(context.getResources().getColor(R.color.gray_800));
        }
        linearLayout.setOnClickListener(this.c);
    }
}
