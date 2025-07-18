package defpackage;

import java.security.GeneralSecurityException;
import java.util.EnumSet;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ycq extends xqu {
    static final ydp a;
    public static final long b;
    public static final xzo c;
    private static final ybp j;
    private final xyx k;
    private SSLSocketFactory l;
    public final upo i = ybx.i;
    public xzo d = c;
    public final xzo e = new ybr(xxc.o, 0);
    public final ydp f = a;
    public long g = Long.MAX_VALUE;
    public long h = xxc.j;

    static {
        Logger.getLogger(ycq.class.getName());
        ydo ydoVar = new ydo(ydp.a);
        ydoVar.a(ydn.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, ydn.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, ydn.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, ydn.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, ydn.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, ydn.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256);
        ydoVar.c(ydy.TLS_1_2);
        ydoVar.b();
        a = new ydp(ydoVar);
        b = TimeUnit.DAYS.toNanos(1000L);
        ycm ycmVar = new ycm(0);
        j = ycmVar;
        c = new ybr(ycmVar, 0);
        EnumSet.of(xts.MTLS, xts.CUSTOM_MANAGERS);
    }

    public ycq(String str) {
        this.k = new xyx(str, new yco(this, 0), new ycn(0));
    }

    @Override // defpackage.xqu
    public final wbb aa() {
        return this.k;
    }

    final SSLSocketFactory ab() {
        try {
            if (this.l == null) {
                this.l = SSLContext.getInstance("Default", ydw.b.c).getSocketFactory();
            }
            return this.l;
        } catch (GeneralSecurityException e) {
            throw new RuntimeException("TLS Provider failure", e);
        }
    }
}
