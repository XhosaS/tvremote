package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
class mlo extends dxx {

    @eat(a = 3)
    int a;

    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    mos b;

    @Override // defpackage.dxx
    public final void b(dxw dxwVar) {
        Object[] objArr = dxwVar.b;
        if (dxwVar.a != 0) {
            return;
        }
        dxz dxzVar = new dxz();
        dxzVar.a = Integer.valueOf(this.a);
        mpp mppVar = mmd.a;
        Integer num = (Integer) dxzVar.a;
        dxzVar.a = Integer.valueOf((num == null ? 0 : num.intValue()) + 1);
        this.a = ((Integer) dxzVar.a).intValue();
    }
}
