package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ago extends agk {
    private final ahr a;
    private final adx b;

    public ago(int i, ahr ahrVar, adx adxVar) {
        super(i);
        this.b = adxVar;
        this.a = ahrVar;
        if (i == 2 && ahrVar.b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // defpackage.agk
    public final boolean a(ahc ahcVar) {
        return this.a.b;
    }

    @Override // defpackage.agk
    public final aes[] b(ahc ahcVar) {
        return this.a.a;
    }

    @Override // defpackage.agq
    public final void d(Status status) {
        this.b.g(qp.t(status));
    }

    @Override // defpackage.agq
    public final void e(Exception exc) {
        this.b.g(exc);
    }

    @Override // defpackage.agq
    public final void f(ahc ahcVar) throws DeadObjectException {
        try {
            ahr ahrVar = this.a;
            ahrVar.d.a.a(ahcVar.b, this.b);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            d(agq.h(e2));
        } catch (RuntimeException e3) {
            e(e3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.agq
    public final void g(awy awyVar, boolean z) {
        ?? r0 = awyVar.a;
        adx adxVar = this.b;
        r0.put(adxVar, Boolean.valueOf(z));
        ((ami) adxVar.a).f(new agy(awyVar, adxVar));
    }
}
