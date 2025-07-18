package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
class bio implements Runnable {
    final /* synthetic */ bit a;

    public bio(bit bitVar) {
        this.a = bitVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.a.c;
        recyclerView.focusableViewAvailable(recyclerView);
    }
}
