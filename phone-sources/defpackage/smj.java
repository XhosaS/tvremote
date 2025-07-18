package defpackage;

import android.database.sqlite.SQLiteTransactionListener;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class smj implements SQLiteTransactionListener {
    final /* synthetic */ smk a;

    public smj(smk smkVar) {
        this.a = smkVar;
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onRollback() {
        if (!this.a.a) {
            throw new smw();
        }
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onBegin() {
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onCommit() {
    }
}
