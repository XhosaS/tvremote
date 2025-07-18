package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
class mph extends dxx {

    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    Boolean a;

    @Override // defpackage.dxx
    public final void b(dxw dxwVar) {
        Object[] objArr = dxwVar.b;
        if (dxwVar.a != 0) {
            return;
        }
        dxz dxzVar = new dxz();
        dxzVar.a = this.a;
        Boolean bool = (Boolean) dxzVar.a;
        boolean z = false;
        if (bool != null && !bool.booleanValue()) {
            z = true;
        }
        dxzVar.a = Boolean.valueOf(z);
        this.a = (Boolean) dxzVar.a;
    }
}
