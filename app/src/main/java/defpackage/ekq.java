package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
class ekq extends dxx {

    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    Integer a;

    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    AtomicReference b;

    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    AtomicReference c;

    @Override // defpackage.dxx
    public final void b(dxw dxwVar) {
        Object[] objArr = dxwVar.b;
        if (dxwVar.a != 0) {
            return;
        }
        dxz dxzVar = new dxz();
        dxzVar.a = this.a;
        int i = ekx.i;
        dxzVar.a = Integer.valueOf(((Integer) dxzVar.a).intValue() + 1);
        this.a = (Integer) dxzVar.a;
    }
}
