package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
class uue extends aze {
    final /* synthetic */ uuj a;
    private int b = -1;

    public uue(uuj uujVar) {
        this.a = uujVar;
    }

    @Override // defpackage.aze
    public final void a(RecyclerView recyclerView, qv qvVar, int i, int i2) {
        int i3 = this.b;
        if (i3 == -1) {
            this.b = i;
        } else if (i3 != i) {
            this.a.o = true;
        }
        if (recyclerView.getScrollState() == 0) {
            this.a.b();
        }
    }
}
