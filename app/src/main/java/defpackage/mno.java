package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
class mno extends dxx {

    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    AtomicInteger a;

    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    AtomicInteger b;

    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    AtomicReference c;

    @Override // defpackage.dxx
    public final void b(dxw dxwVar) {
        Object[] objArr = dxwVar.b;
        int i = dxwVar.a;
    }
}
