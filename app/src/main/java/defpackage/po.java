package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class po {
    public final /* synthetic */ RecyclerView a;

    public po(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void a(View view) {
        qv qvVarM = RecyclerView.m(view);
        if (qvVarM != null) {
            this.a.ax(qvVarM, qvVarM.o);
            qvVarM.o = 0;
        }
    }

    public final void b(int i) {
        RecyclerView recyclerView = this.a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.G(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
