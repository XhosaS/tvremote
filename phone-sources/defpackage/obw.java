package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class obw implements nww {
    final /* synthetic */ nwx a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public obw(nwx nwxVar, kwy kwyVar, int i) {
        this.c = i;
        this.a = nwxVar;
        this.b = kwyVar;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.nww
    public final void a(Status status) {
        if (this.c != 0) {
            ((pkg) this.b).a.remove(this.a);
        } else if (status.b()) {
            this.a.j(TimeUnit.MILLISECONDS);
            ((kwy) this.b).u(null);
        } else {
            ((kwy) this.b).t(ocv.aL(status));
        }
    }

    public obw(pkg pkgVar, BasePendingResult basePendingResult, int i) {
        this.c = i;
        this.a = basePendingResult;
        this.b = pkgVar;
    }
}
