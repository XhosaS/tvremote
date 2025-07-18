package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nke extends nkk {
    final /* synthetic */ String a;
    final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nke(nwu nwuVar, String str, String str2) {
        super(nwuVar);
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.nkk, defpackage.nxr
    public final /* bridge */ /* synthetic */ void b(nwf nwfVar) {
        nrs nrsVar = (nrs) nwfVar;
        try {
            String str = this.a;
            String str2 = this.b;
            nrsVar.u(this);
            nlb nlbVar = new nlb(0);
            nsa nsaVar = (nsa) nrsVar.L();
            if (!nrsVar.w()) {
                nrsVar.r(2016);
            } else {
                Context context = nrsVar.u;
                nsaVar.b(str, str2, nlbVar, ocv.q());
            }
        } catch (IllegalStateException unused) {
            f();
        }
    }
}
