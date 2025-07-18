package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nlu implements nxd {
    final /* synthetic */ nlv a;
    private final long b;

    public nlu(nlv nlvVar, long j) {
        this.a = nlvVar;
        this.b = j;
    }

    @Override // defpackage.nxd
    public final /* bridge */ /* synthetic */ void a(nxc nxcVar) {
        Status status = (Status) nxcVar;
        if (status.b()) {
            return;
        }
        nlv nlvVar = this.a;
        nlvVar.b.b.l(this.b, status.f);
    }
}
