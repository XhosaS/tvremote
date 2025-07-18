package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hhi extends qi {
    public int a;
    private final hhh b;

    protected hhi(Bundle bundle, hhh hhhVar) {
        this.a = bundle != null ? bundle.getInt("y_offset_state", 0) : 0;
        this.b = hhhVar;
    }

    @Override // defpackage.qi
    public final void b(RecyclerView recyclerView, int i) {
        if (i == 0) {
            this.b.aC(this.a);
        }
    }

    public abstract int c(RecyclerView recyclerView);

    @Override // defpackage.qi
    public final void d(RecyclerView recyclerView, int i, int i2) {
        int iC = c(recyclerView);
        this.a = iC;
        this.b.aE(iC);
    }
}
