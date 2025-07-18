package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iew extends iez {
    private final long a;
    private final zuw b;

    public iew(long j, zuw zuwVar) {
        this.a = j;
        this.b = zuwVar;
    }

    @Override // defpackage.iez
    public final int a() {
        return 1;
    }

    @Override // defpackage.iez
    public final int b(int i) {
        return this.b.a;
    }

    @Override // defpackage.iez
    public final long c(int i, long j) {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [idy, java.lang.Object] */
    @Override // defpackage.iez
    public final void d(int i, RecyclerView.ViewHolder viewHolder) {
        this.b.b.c(viewHolder.itemView);
    }

    @Override // defpackage.iez
    public final void e(RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
    }
}
