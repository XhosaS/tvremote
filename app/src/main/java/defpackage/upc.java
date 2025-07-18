package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
class upc implements Callable {
    volatile boolean a;
    final /* synthetic */ uqj b;
    final /* synthetic */ uqk c;
    final /* synthetic */ upe d;

    public upc(upe upeVar, uqj uqjVar, uqk uqkVar) {
        this.b = uqjVar;
        this.c = uqkVar;
        this.d = upeVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        SQLiteDatabase sQLiteDatabase = this.d.a;
        yqw.M(!sQLiteDatabase.inTransaction(), "Thread is already in a transaction! This should never happen, or this will be treated as a nested transaction.");
        sQLiteDatabase.beginTransactionWithListener(new upb(this));
        try {
            this.a = true;
            Object objA = this.b.a(this.c);
            uqk.b();
            sQLiteDatabase.setTransactionSuccessful();
            this.a = false;
            return objA;
        } finally {
            this.d.a.endTransaction();
        }
    }
}
