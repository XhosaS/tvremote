package defpackage;

import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class omm {
    protected final omi b;
    protected final String c;
    protected final AtomicBoolean d = new AtomicBoolean(false);

    public omm(omi omiVar, String str) {
        this.b = omiVar;
        this.c = str;
    }

    private final boolean b(String str, int i) {
        return i(str, i - 1);
    }

    @Deprecated
    protected void a(olu oluVar) {
        throw new IllegalStateException("Requires implementation");
    }

    protected String c() {
        return null;
    }

    public final void d(String str, oml omlVar) {
        Executor executor = ooc.a;
        ocv.aF(str);
        e(str, executor, omlVar, 3, 0L);
    }

    public final void e(String str, Executor executor, oml omlVar, int i, long j) {
        this.b.c(this.c, str, c()).l(executor, new omj(this, i, str, executor, omlVar, j, 1));
    }

    public final void f(final String str, final Executor executor, final oml omlVar, final int i, final long j) {
        if (j > 0) {
            new ogh(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: omk
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.e(str, executor, omlVar, i - 1, j);
                }
            }, 0L);
        } else {
            e(str, executor, omlVar, i - 1, 0L);
        }
    }

    protected boolean g(olu oluVar) {
        a(oluVar);
        return true;
    }

    protected final olu h(String str, String str2, String str3) {
        try {
            return (olu) osk.t(this.b.c(str, str2, str3), 2000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.e("PhenotypeFlagCommitter", a.cg(str, "Retrieving snapshot for ", " failed"), e);
            return null;
        }
    }

    public final boolean i(String str, int i) {
        if (i <= 0) {
            Log.w("PhenotypeFlagCommitter", "No more attempts remaining, giving up for ".concat(this.c));
            return false;
        }
        boolean z = this.d.get() && i > 1;
        String str2 = this.c;
        olu oluVarH = h(str2, str, c());
        if (oluVarH == null) {
            if (z) {
                return b(str, i);
            }
            return false;
        }
        if (!g(oluVarH)) {
            return false;
        }
        String str3 = oluVarH.a;
        if (str3 != null && !str3.isEmpty()) {
            try {
                osk.t(this.b.a(str3), 2000L, TimeUnit.MILLISECONDS);
                Uri uriA = rwt.a(str2);
                Map map = rwl.a;
                synchronized (rwl.class) {
                    rwl rwlVar = (rwl) rwl.a.get(uriA);
                    if (rwlVar != null) {
                        rwlVar.c();
                    }
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                Log.w("PhenotypeFlagCommitter", "Committing snapshot for " + this.c + " failed, retrying", e);
                return b(str, i);
            }
        }
        return true;
    }
}
