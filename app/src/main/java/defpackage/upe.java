package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class upe {
    public final SQLiteDatabase a;
    public final Executor b;
    public volatile boolean c = false;
    public final upn d;
    private final Executor e;

    public upe(SQLiteDatabase sQLiteDatabase, Executor executor, Executor executor2, upn upnVar) {
        this.a = sQLiteDatabase;
        this.b = executor;
        this.e = executor2;
        this.d = upnVar;
    }

    public final zyd a(uqj uqjVar) {
        b();
        wwc wwcVar = wwb.a;
        final uqk uqkVar = new uqk(this.a);
        wvx wvxVarF = wzg.f("Transaction", wwcVar, true);
        try {
            final zye zyeVar = new zye(wyo.i(new upc(this, uqjVar, uqkVar)));
            this.e.execute(zyeVar);
            zyeVar.a.a(new Runnable() { // from class: uoz
                @Override // java.lang.Runnable
                public final void run() {
                    if (zyeVar.isCancelled()) {
                        uqkVar.a.cancel();
                    }
                }
            }, zwk.a);
            wvxVarF.a(zyeVar);
            wvxVarF.close();
            return zyeVar;
        } catch (Throwable th) {
            try {
                wvxVarF.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b() {
        if (this.c) {
            throw new IllegalStateException("Already closed");
        }
    }
}
