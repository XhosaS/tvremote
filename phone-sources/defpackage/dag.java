package defpackage;

import android.database.DataSetObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dag extends DataSetObserver {
    final /* synthetic */ dah a;

    public dag(dah dahVar) {
        this.a = dahVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        dah dahVar = this.a;
        dahVar.mDataValid = true;
        dahVar.notifyDataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        dah dahVar = this.a;
        dahVar.mDataValid = false;
        dahVar.notifyDataSetInvalidated();
    }
}
