package defpackage;

import android.database.sqlite.SQLiteTransactionListener;

/* compiled from: PG */
/* loaded from: classes2.dex */
class upb implements SQLiteTransactionListener {
    final /* synthetic */ upc a;

    public upb(upc upcVar) {
        this.a = upcVar;
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onRollback() {
        if (!this.a.a) {
            throw new uqf();
        }
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onBegin() {
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onCommit() {
    }
}
