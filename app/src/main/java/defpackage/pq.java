package defpackage;

import android.view.ViewGroup;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class pq {
    public final pr a = new pr();
    public boolean b = false;
    public final int c = 1;

    public abstract int a();

    public int b(int i) {
        return 0;
    }

    public long c(int i) {
        return -1L;
    }

    public abstract qv d(ViewGroup viewGroup, int i);

    public abstract void f(qv qvVar, int i);

    public final void k(boolean z) {
        if (this.a.f()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.b = z;
    }

    public final void t(int i) {
        this.a.d(i, 1);
    }

    public void u(qv qvVar, int i, List list) {
        f(qvVar, i);
    }

    public void i(qv qvVar) {
    }

    public void j(qv qvVar) {
    }

    public void l(qv qvVar) {
    }

    public void v(qv qvVar) {
    }
}
