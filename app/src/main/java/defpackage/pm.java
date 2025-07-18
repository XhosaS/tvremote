package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class pm {
    public final /* synthetic */ RecyclerView a;

    public pm(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void a(qv qvVar, pw pwVar, pw pwVar2) {
        RecyclerView recyclerView = this.a;
        recyclerView.e.n(qvVar);
        recyclerView.x(qvVar);
        qvVar.m(false);
        if (recyclerView.F.p(qvVar, pwVar, pwVar2)) {
            recyclerView.W();
        }
    }

    public final void b(qv qvVar) {
        RecyclerView recyclerView = this.a;
        qd qdVar = recyclerView.o;
        View view = qvVar.a;
        qdVar.t.j(view);
        recyclerView.e.j(view);
    }
}
