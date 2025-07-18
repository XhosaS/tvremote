package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agm extends agq {
    protected final agt a;

    public agm(agt agtVar) {
        super(2);
        this.a = agtVar;
    }

    @Override // defpackage.agq
    public final void d(Status status) {
        try {
            this.a.j(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.agq
    public final void e(Exception exc) {
        try {
            this.a.j(new Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage()));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.agq
    public final void f(ahc ahcVar) {
        try {
            this.a.i(ahcVar.b);
        } catch (RuntimeException e) {
            e(e);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.agq
    public final void g(awy awyVar, boolean z) {
        agt agtVar = this.a;
        awyVar.b.put(agtVar, Boolean.valueOf(z));
        agtVar.e(new aiy(awyVar, agtVar, 1));
    }
}
