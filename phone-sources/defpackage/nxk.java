package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nxk extends nxg {
    private final oag a;
    private final oab b;
    private final kwy d;

    public nxk(int i, oag oagVar, kwy kwyVar, oab oabVar) {
        super(i);
        this.d = kwyVar;
        this.a = oagVar;
        this.b = oabVar;
        if (i == 2 && oagVar.c) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // defpackage.nxg
    public final boolean a(nzd nzdVar) {
        return this.a.c;
    }

    @Override // defpackage.nxg
    public final nvg[] b(nzd nzdVar) {
        return this.a.b;
    }

    @Override // defpackage.nxm
    public final void d(Status status) {
        this.d.v(this.b.a(status));
    }

    @Override // defpackage.nxm
    public final void e(Exception exc) {
        this.d.v(exc);
    }

    @Override // defpackage.nxm
    public final void f(nzd nzdVar) throws DeadObjectException {
        try {
            this.a.a(nzdVar.b, this.d);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            d(nxm.h(e2));
        } catch (RuntimeException e3) {
            e(e3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.nxm
    public final void g(pkg pkgVar, boolean z) {
        ?? r0 = pkgVar.b;
        kwy kwyVar = this.d;
        r0.put(kwyVar, Boolean.valueOf(z));
        ((onz) kwyVar.a).k(new nyd(pkgVar, kwyVar));
    }
}
