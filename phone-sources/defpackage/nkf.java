package defpackage;

import android.content.Context;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nkf extends nrx {
    public nkf(nwu nwuVar) {
        super(nwuVar);
    }

    @Override // defpackage.nrx, defpackage.nxr
    public final /* bridge */ /* synthetic */ void b(nwf nwfVar) {
        nrs nrsVar = (nrs) nwfVar;
        try {
            nrsVar.v(this);
            nsa nsaVar = (nsa) nrsVar.L();
            if (!nrsVar.w()) {
                nrsVar.t(2016);
                return;
            }
            Context context = nrsVar.u;
            nwl nwlVarQ = ocv.q();
            Parcel parcelK = nsaVar.k();
            ifl.c(parcelK, nwlVarQ);
            nsaVar.n(4, parcelK);
        } catch (IllegalStateException unused) {
            f();
        }
    }
}
