package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public class bjg extends qx {
    final RecyclerView f;
    final afn g;
    final afn h;

    public bjg(RecyclerView recyclerView) {
        super(recyclerView);
        this.g = this.b;
        this.h = new bjf(this);
        this.f = recyclerView;
    }

    @Override // defpackage.qx
    public final afn j() {
        return this.h;
    }
}
