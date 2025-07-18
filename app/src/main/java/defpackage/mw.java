package defpackage;

import android.support.v7.widget.AppCompatTextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mw extends mv {
    final /* synthetic */ AppCompatTextView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw(AppCompatTextView appCompatTextView) {
        super(appCompatTextView);
        this.c = appCompatTextView;
    }

    @Override // defpackage.mu
    public final void c(int i, float f) {
        super/*android.widget.TextView*/.setLineHeight(i, f);
    }
}
