package defpackage;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class npx implements nsl {
    public nkn a;
    final /* synthetic */ nqj b;
    private final AtomicLong c = new AtomicLong((nrv.b.nextLong() & 65535) * 10000);

    public npx(nqj nqjVar) {
        this.b = nqjVar;
    }

    @Override // defpackage.nsl
    public final long a() {
        return this.c.getAndIncrement();
    }

    @Override // defpackage.nsl
    public final void b(String str, String str2, long j) {
        Object obj = this.a;
        if (obj == null) {
            throw new IllegalStateException("Device is not connected");
        }
        nrv.h(str);
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("The message payload cannot be null or empty");
        }
        int i = 0;
        if (str2.length() > 524288) {
            nla.a.d("Message send failed. Message exceeds maximum size", new Object[0]);
            throw new IllegalArgumentException("Message exceeds maximum size524288");
        }
        oaf oafVar = new oaf();
        oafVar.a = new nkv(obj, str, str2, 3);
        oafVar.c = 8405;
        ((nwq) obj).t(oafVar.a()).p(new npw(this, j, i));
    }
}
