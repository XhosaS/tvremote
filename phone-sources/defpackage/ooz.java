package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ooz extends oov {
    private final nxs a;
    private final oow b;
    private final njq c;

    public ooz(oow oowVar, nxs nxsVar, njq njqVar) {
        this.b = oowVar;
        this.a = nxsVar;
        this.c = njqVar;
    }

    @Override // defpackage.oov
    public final void b(Status status) {
        if (status.b()) {
            this.a.c(Status.a);
        } else {
            this.a.c(status);
        }
    }

    @Override // defpackage.oov
    public final void c(Status status) {
        if (!status.b()) {
            this.a.c(status);
            return;
        }
        njq njqVar = this.c;
        if (njqVar == null) {
            this.a.c(Status.a);
        } else {
            this.b.a(njqVar, this);
        }
    }
}
