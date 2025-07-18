package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class awe extends aze {
    final /* synthetic */ int a;
    final /* synthetic */ bbd b;
    final /* synthetic */ awj c;

    public awe(awj awjVar, int i, bbd bbdVar) {
        this.c = awjVar;
        this.a = i;
        this.b = bbdVar;
    }

    @Override // defpackage.aze
    public final void a(RecyclerView recyclerView, qv qvVar, int i, int i2) {
        if (i == this.a) {
            this.c.ad.V(this);
            this.b.a(qvVar);
        }
    }
}
