package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gmw implements Runnable {
    private final int a;
    private final RecyclerView b;

    public gmw(int i, RecyclerView recyclerView) {
        this.a = i;
        this.b = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.smoothScrollToPosition(this.a);
    }
}
