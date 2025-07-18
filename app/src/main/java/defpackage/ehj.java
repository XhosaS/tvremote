package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
class ehj extends qg {
    final /* synthetic */ RecyclerView a;

    public ehj(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // defpackage.qg
    public final boolean e(int i, int i2) {
        if (Math.abs(i2) > 2) {
            this.a.aq(30, 30);
            return true;
        }
        if (Math.abs(i) <= 2) {
            return false;
        }
        this.a.aq(30, 30);
        return true;
    }
}
