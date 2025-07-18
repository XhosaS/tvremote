package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class olf extends ojj {
    final /* synthetic */ ydk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public olf(nwu nwuVar, ydk ydkVar) {
        super(nwuVar);
        this.a = ydkVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ nxc a(Status status) {
        return new ole(status);
    }

    @Override // defpackage.nxr
    protected final /* bridge */ /* synthetic */ void b(nwf nwfVar) {
        ((olb) nwfVar).r(this, this.a.a);
    }
}
