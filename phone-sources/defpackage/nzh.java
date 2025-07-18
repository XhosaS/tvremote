package defpackage;

import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nzh extends nyf {
    private final nwq b;

    public nzh(nwq nwqVar) {
        this.b = nwqVar;
    }

    @Override // defpackage.nwu
    public final Looper a() {
        return this.b.A;
    }

    @Override // defpackage.nwu
    public final nxr b(nxr nxrVar) {
        this.b.u(1, nxrVar);
        return nxrVar;
    }

    @Override // defpackage.nwu
    public final void j(nxr nxrVar) {
        this.b.u(0, nxrVar);
    }
}
