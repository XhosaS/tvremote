package defpackage;

import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kfk extends kfo {
    protected final kfu a;

    public kfk(int i, kfu kfuVar) {
        super(i);
        this.a = kfuVar;
    }

    @Override // defpackage.kfo
    public final void d(Status status) {
        try {
            this.a.h(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.kfo
    public final void e(Exception exc) {
        try {
            this.a.h(new Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage(), null, null));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.kfo
    public final void f(kgq kgqVar) throws DeadObjectException {
        try {
            this.a.g(kgqVar.b);
        } catch (RuntimeException e) {
            e(e);
        }
    }

    @Override // defpackage.kfo
    public final void g(kgg kggVar, boolean z) {
        kfu kfuVar = this.a;
        kggVar.a.put(kfuVar, Boolean.valueOf(z));
        kfuVar.d(new kge(kggVar, kfuVar));
    }
}
