package defpackage;

import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nxi extends nxm {
    protected final nxr a;

    public nxi(int i, nxr nxrVar) {
        super(i);
        this.a = nxrVar;
    }

    @Override // defpackage.nxm
    public final void d(Status status) {
        try {
            this.a.m(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.nxm
    public final void e(Exception exc) {
        try {
            this.a.m(new Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage()));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.nxm
    public final void f(nzd nzdVar) throws DeadObjectException {
        try {
            this.a.l(nzdVar.b);
        } catch (RuntimeException e) {
            e(e);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.nxm
    public final void g(pkg pkgVar, boolean z) {
        nxr nxrVar = this.a;
        pkgVar.a.put(nxrVar, Boolean.valueOf(z));
        nxrVar.g(new obw(pkgVar, nxrVar, 1));
    }
}
