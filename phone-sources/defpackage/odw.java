package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class odw extends nxr {
    final /* synthetic */ odz a;
    final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public odw(nwu nwuVar, odz odzVar, long j) {
        super(odx.b, nwuVar);
        this.a = odzVar;
        this.b = j;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ nxc a(Status status) {
        return status == null ? Status.c : status;
    }

    @Override // defpackage.nxr
    protected final /* bridge */ /* synthetic */ void b(nwf nwfVar) {
        ((oei) nwfVar).m(this.a, this.b);
        q(Status.a);
    }

    @Override // defpackage.nxr, defpackage.nxs
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        super.q((nxc) obj);
    }
}
