package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iev extends iez {
    private final long a;
    private final int b;
    private final Object c;
    private final ifc d;

    public iev(long j, int i, Object obj, ifc ifcVar) {
        this.a = j;
        this.b = i;
        this.c = obj;
        this.d = ifcVar;
    }

    @Override // defpackage.iez
    public final int a() {
        return this.b;
    }

    @Override // defpackage.iez
    public final int b(int i) {
        return this.d.c(this.c, i);
    }

    @Override // defpackage.iez
    public final long c(int i, long j) {
        return this.a + i;
    }

    @Override // defpackage.iez
    public final void d(int i, RecyclerView.ViewHolder viewHolder) {
        this.d.e(this.c, i, viewHolder);
    }

    @Override // defpackage.iez
    public final void e(RecyclerView.ViewHolder viewHolder) {
        this.d.f(viewHolder);
    }
}
