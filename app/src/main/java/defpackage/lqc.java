package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lqc extends lnu {
    final /* synthetic */ lnk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lqc(kev kevVar, lnk lnkVar) {
        super(kevVar);
        this.a = lnkVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ kfc a(Status status) {
        return new lqb(status);
    }

    @Override // defpackage.kfu
    protected final /* bridge */ /* synthetic */ void b(kdz kdzVar) {
        ((lpy) kdzVar).L(this, this.a.a);
    }
}
