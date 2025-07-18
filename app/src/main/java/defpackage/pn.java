package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class pn implements afx {
    final /* synthetic */ RecyclerView a;

    public pn(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // defpackage.afx
    public final float a() {
        float f;
        RecyclerView recyclerView = this.a;
        if (recyclerView.o.ae()) {
            f = recyclerView.I;
        } else {
            if (!recyclerView.o.ad()) {
                return 0.0f;
            }
            f = recyclerView.H;
        }
        return -f;
    }

    @Override // defpackage.afx
    public final void b() {
        this.a.ao();
    }

    @Override // defpackage.afx
    public final boolean c(float f) {
        int i;
        int i2;
        RecyclerView recyclerView = this.a;
        if (recyclerView.o.ae()) {
            i2 = (int) f;
            i = 0;
        } else if (recyclerView.o.ad()) {
            i = (int) f;
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        if (i == 0) {
            if (i2 == 0) {
                return false;
            }
            i = 0;
        }
        recyclerView.ao();
        return recyclerView.ar(i, i2, 0, Integer.MAX_VALUE);
    }
}
