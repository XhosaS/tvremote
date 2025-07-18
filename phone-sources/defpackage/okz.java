package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class okz implements oje {
    private final Status a;
    private final oai b;

    public okz(Status status, oai oaiVar) {
        this.a = status;
        this.b = oaiVar;
    }

    @Override // defpackage.nwz
    public final void a() {
        oai oaiVar = this.b;
        if (oaiVar != null) {
            oaiVar.a();
        }
    }

    @Override // defpackage.oje
    public final oai b() {
        return this.b;
    }

    @Override // defpackage.nxc
    public final Status e() {
        return this.a;
    }
}
