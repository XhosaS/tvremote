package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sml {
    public volatile boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    private final Executor e;

    public sml(SQLiteDatabase sQLiteDatabase, Executor executor, Executor executor2, zft zftVar) {
        this.a = false;
        this.b = sQLiteDatabase;
        this.c = executor;
        this.e = executor2;
        this.d = zftVar;
    }

    public final uhp a(smx smxVar) {
        b();
        tqo tqoVar = tqn.a;
        rzy rzyVar = new rzy((SQLiteDatabase) this.b);
        tql tqlVarP = szg.p("Transaction", tqoVar);
        try {
            uhq uhqVar = new uhq(trc.g(new smk(this, smxVar, rzyVar)));
            this.e.execute(uhqVar);
            uhqVar.c(new rmz(uhqVar, rzyVar, 14, null), ugk.a);
            tqlVarP.a(uhqVar);
            tqlVarP.close();
            return uhqVar;
        } catch (Throwable th) {
            try {
                tqlVarP.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b() {
        if (this.a) {
            throw new IllegalStateException("Already closed");
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.concurrent.Executor, java.util.concurrent.ExecutorService] */
    public final synchronized void c() {
        Object obj;
        Object obj2;
        this.a = true;
        this.e.shutdownNow();
        int i = 0;
        int i2 = 0;
        while (true) {
            obj = this.b;
            if (i2 >= ((ko) obj).d) {
                break;
            }
            ocs.b((Closeable) ((ko) obj).g(i2));
            i2++;
        }
        ((ko) obj).clear();
        int i3 = 0;
        while (true) {
            obj2 = this.c;
            if (i3 >= ((ko) obj2).d) {
                break;
            }
            ocs.b((Closeable) ((ko) obj2).g(i3));
            i3++;
        }
        ((ko) obj2).clear();
        while (true) {
            Object obj3 = this.d;
            if (i < ((ko) obj3).d) {
                oih oihVar = (oih) ((ko) obj3).g(i);
                ocs.a(oihVar.d);
                ocs.a(oihVar.g);
                i++;
            } else {
                ((ko) obj3).clear();
            }
        }
    }

    public sml() {
        ocv ocvVar = ogg.a;
        this.e = ocv.p(6);
        this.b = new ko();
        this.a = false;
        this.c = new ko();
        this.d = new ko();
    }
}
