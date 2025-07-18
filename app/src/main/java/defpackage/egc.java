package defpackage;

import android.support.v7.widget.GridLayoutManager;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
class egc extends GridLayoutManager {
    public egc(int i, int i2) {
        super(i, i2);
    }

    @Override // android.support.v7.widget.GridLayoutManager, defpackage.qd
    public final qe eH(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof eiy ? new egb((eiy) layoutParams) : super.eH(layoutParams);
    }
}
