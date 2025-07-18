package defpackage;

import android.database.DataSetObserver;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mvt extends DataSetObserver {
    final /* synthetic */ mvu a;

    public mvt(mvu mvuVar) {
        this.a = mvuVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.a.a(false);
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        onChanged();
    }
}
