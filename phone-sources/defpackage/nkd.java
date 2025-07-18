package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nkd extends nkk {
    final /* synthetic */ String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nkd(nwu nwuVar, String str) {
        super(nwuVar);
        this.a = str;
    }

    @Override // defpackage.nkk, defpackage.nxr
    public final /* bridge */ /* synthetic */ void b(nwf nwfVar) {
        nrs nrsVar = (nrs) nwfVar;
        try {
            String str = this.a;
            nlc nlcVar = new nlc();
            nlcVar.a = false;
            nrsVar.u(this);
            nsa nsaVar = (nsa) nrsVar.L();
            if (!nrsVar.w()) {
                nrsVar.r(2016);
            } else {
                Context context = nrsVar.u;
                nsaVar.c(str, nlcVar, ocv.q());
            }
        } catch (IllegalStateException unused) {
            f();
        }
    }
}
