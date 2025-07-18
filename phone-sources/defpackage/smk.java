package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class smk implements Callable {
    volatile boolean a;
    final /* synthetic */ smx b;
    final /* synthetic */ sml c;
    final /* synthetic */ rzy d;

    public smk(sml smlVar, smx smxVar, rzy rzyVar) {
        this.b = smxVar;
        this.d = rzyVar;
        this.c = smlVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object obj = this.c.b;
        sij.x(!r1.inTransaction(), "Thread is already in a transaction! This should never happen, or this will be treated as a nested transaction.");
        ((SQLiteDatabase) obj).beginTransactionWithListener(new smj(this));
        try {
            this.a = true;
            Object objA = this.b.a(this.d);
            rzy.z();
            ((SQLiteDatabase) obj).setTransactionSuccessful();
            this.a = false;
            return objA;
        } finally {
            ((SQLiteDatabase) this.c.b).endTransaction();
        }
    }
}
