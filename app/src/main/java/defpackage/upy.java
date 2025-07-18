package defpackage;

import android.os.CancellationSignal;
import android.util.Log;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class upy extends zum implements Runnable {
    public static final /* synthetic */ int a = 0;
    private final upx b;

    public upy(upx upxVar) {
        this.b = upxVar;
    }

    @Override // defpackage.zum
    public final String a() {
        return "query=[" + this.b.b() + "]";
    }

    protected abstract void c(upx upxVar);

    public final void e(Executor executor) {
        executor.execute(wyo.h(this));
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (isCancelled()) {
            return;
        }
        try {
            if (Log.isLoggable("ASQLDB", 2)) {
                upx upxVar = this.b;
                upxVar.c();
                Log.v("ASQLDB", "The query's result is currently:");
                Log.v("ASQLDB", uqk.a(upxVar.a(new CancellationSignal())));
                Log.v("ASQLDB", "NOTE(b/171271240): If another thread commits in parallel with this query, the printed debug result above might be from an earlier snapshot than this query's Future<Cursor> iterates.");
            }
            upx upxVar2 = this.b;
            wvx wvxVarF = wzg.f("Query: " + upxVar2.b(), wwb.a, true);
            try {
                c(upxVar2);
                wvxVarF.close();
            } finally {
            }
        } catch (Throwable th) {
            q(th);
        }
    }
}
