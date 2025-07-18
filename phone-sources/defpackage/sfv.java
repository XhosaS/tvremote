package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sfv extends sfj {
    public CharSequence a;

    public sfv() {
        super(R.layout.replaydialog_message);
    }

    @Override // defpackage.sfj
    protected final /* bridge */ /* synthetic */ void a(Context context, View view) {
        TextView textView = (TextView) view;
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            textView.setText(charSequence);
        }
    }
}
