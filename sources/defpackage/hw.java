package defpackage;

import android.database.DataSetObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hw extends DataSetObserver {
    final /* synthetic */ hz a;

    public hw(hz hzVar) {
        this.a = hzVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        hz hzVar = this.a;
        if (hzVar.u()) {
            hzVar.s();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.k();
    }
}
