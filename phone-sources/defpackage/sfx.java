package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sfx extends sfj {
    public CharSequence a;
    public int b;

    public sfx() {
        super(R.layout.replaydialog_title);
    }

    @Override // defpackage.sfj
    protected final /* bridge */ /* synthetic */ void a(Context context, View view) {
        TextView textView = (TextView) view;
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        int i = this.b;
        if (i != 0) {
            textView.setText(i);
        }
    }

    public final void b(CharSequence charSequence) {
        this.a = charSequence;
        this.b = 0;
    }
}
