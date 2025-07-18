package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
class eeh extends dxx {

    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    efb a;

    @eat(a = 3)
    boolean b;

    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    eeo c;

    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    egy d;

    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    eek e;

    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    eel f;

    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    edf g;

    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    rh h;

    @Override // defpackage.dxx
    public final void b(dxw dxwVar) {
        Object[] objArr = dxwVar.b;
        int i = dxwVar.a;
        if (i == Integer.MIN_VALUE) {
            this.b = ((Boolean) objArr[0]).booleanValue();
            return;
        }
        if (i != 0) {
            return;
        }
        dxz dxzVar = new dxz();
        dxzVar.a = this.e;
        eek eekVar = (eek) objArr[0];
        eeq eeqVar = een.a;
        dxzVar.a = eekVar;
        this.e = (eek) dxzVar.a;
    }
}
