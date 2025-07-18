package defpackage;

import android.support.v7.widget.LinearLayoutManager;

/* compiled from: PG */
/* loaded from: classes.dex */
class egz extends LinearLayoutManager {
    public egz(int i) {
        super(i);
        s(false);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.qd
    public final qe f() {
        return this.k == 1 ? new qe(-1, -2) : new qe(-2, -1);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.qd
    public final boolean v() {
        if (this.k == 0) {
            return false;
        }
        return super.v();
    }
}
