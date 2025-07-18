package defpackage;

import android.content.SharedPreferences;
import androidx.work.WorkerParameters;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mbx implements lxd {
    public final Executor a;
    public final Object b;
    public final Object c;
    public final Object d;
    private final /* synthetic */ int e;

    public mbx(ExecutorService executorService, SharedPreferences sharedPreferences, xbw xbwVar, lxc lxcVar, int i) {
        this.e = i;
        this.a = executorService;
        this.c = sharedPreferences;
        this.d = xbwVar;
        this.b = lxcVar;
    }

    @Override // defpackage.lxd
    public final uhp a(WorkerParameters workerParameters) {
        return this.e != 0 ? sfy.G(new osv(this, 1), this.a) : sfy.G(new lhx(this, workerParameters, 7), this.a);
    }

    public mbx(lhr lhrVar, ldv ldvVar, Executor executor, iea ieaVar, int i) {
        this.e = i;
        this.d = lhrVar;
        this.b = ldvVar;
        this.a = executor;
        this.c = ((ldy) ieaVar).a();
    }
}
