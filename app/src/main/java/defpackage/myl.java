package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
class myl extends dxx {

    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    AtomicInteger a;

    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    AtomicReference b;

    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    AtomicReference c;

    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    AtomicReference d;

    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    AtomicReference e;

    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    AtomicReference f;

    @Override // defpackage.dxx
    public final void b(dxw dxwVar) {
        Object[] objArr = dxwVar.b;
        if (dxwVar.a != 0) {
            return;
        }
        dxz dxzVar = new dxz();
        dxzVar.a = this.a;
        dxzVar.a = new AtomicInteger(((Integer) objArr[0]).intValue());
        this.a = (AtomicInteger) dxzVar.a;
    }
}
