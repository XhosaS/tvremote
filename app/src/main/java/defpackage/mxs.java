package defpackage;

import android.text.Layout;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mxs implements View.OnLayoutChangeListener {
    final /* synthetic */ CharSequence a;
    final /* synthetic */ mxx b;

    public mxs(mxx mxxVar, CharSequence charSequence) {
        this.a = charSequence;
        this.b = mxxVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        mxx mxxVar = this.b;
        Layout layout = mxxVar.getLayout();
        if (layout == null) {
            return;
        }
        if (mxxVar.a == null) {
            mxxVar.a = new mxq();
        }
        mxxVar.a.b(layout, this.a);
    }
}
