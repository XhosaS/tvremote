package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import com.google.android.katniss.R;
import defpackage.bah;
import defpackage.bai;
import defpackage.baz;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SearchEditText extends baz {
    public bai a;

    public SearchEditText(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && this.a != null) {
            post(new bah());
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    public SearchEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.style.TextAppearance_Leanback_SearchTextEdit);
    }

    public SearchEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
