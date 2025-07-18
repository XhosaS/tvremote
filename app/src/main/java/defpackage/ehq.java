package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
class ehq implements Runnable {
    final /* synthetic */ eiz a;

    public ehq(eiz eizVar) {
        this.a = eizVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        eiz eizVar = this.a;
        RecyclerView recyclerView = eizVar.s;
        if (recyclerView == null || !recyclerView.as()) {
            ell ellVar = eizVar.F;
            if (ellVar.d()) {
                ellVar.b(1);
            }
        } else {
            RecyclerView recyclerView2 = eizVar.s;
            if (recyclerView2.s && recyclerView2.getVisibility() != 8) {
                int i = eizVar.G;
                if (i >= 3) {
                    eizVar.G = 0;
                    ell ellVar2 = eizVar.F;
                    if (ellVar2.d()) {
                        ellVar2.b(1);
                        return;
                    }
                    return;
                }
                eizVar.G = i + 1;
                RecyclerView recyclerView3 = eizVar.s;
                Runnable runnable = eizVar.I;
                int[] iArr = ahj.a;
                recyclerView3.postOnAnimation(runnable);
                return;
            }
        }
        eizVar.G = 0;
    }
}
