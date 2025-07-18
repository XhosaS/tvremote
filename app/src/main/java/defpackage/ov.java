package defpackage;

import android.database.DataSetObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
class ov extends DataSetObserver {
    final /* synthetic */ oz a;

    public ov(oz ozVar) {
        this.a = ozVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        oz ozVar = this.a;
        if (ozVar.q.isShowing()) {
            ozVar.s();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.f();
    }
}
