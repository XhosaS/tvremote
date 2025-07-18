package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mvh extends sfj {
    private CharSequence a;
    private View.OnClickListener b;
    private CharSequence c;
    private View.OnClickListener d;

    public mvh() {
        super(R.layout.dialog_buttons_layout);
    }

    @Override // defpackage.sfj
    protected final /* bridge */ /* synthetic */ void a(Context context, View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        Button button = (Button) linearLayout.findViewById(R.id.primary_button);
        Button button2 = (Button) linearLayout.findViewById(R.id.secondary_button);
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            button.setText(charSequence);
            button.setVisibility(0);
        }
        button.setOnClickListener(this.b);
        button.setEnabled(true);
        CharSequence charSequence2 = this.c;
        if (charSequence2 != null) {
            button2.setText(charSequence2);
            button2.setVisibility(0);
        }
        button2.setOnClickListener(this.d);
        button2.setEnabled(true);
    }

    public final void b(CharSequence charSequence, View.OnClickListener onClickListener) {
        this.a = charSequence;
        this.b = onClickListener;
    }

    public final void c(CharSequence charSequence, View.OnClickListener onClickListener) {
        this.c = charSequence;
        this.d = onClickListener;
    }
}
