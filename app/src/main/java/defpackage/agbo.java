package defpackage;

import java.security.GeneralSecurityException;
import java.util.EnumSet;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agbo extends affz {
    static final agcs a;
    static final afvo b;
    public static final /* synthetic */ int i = 0;
    private static final afzt j;
    public final afuv c;
    public final agad d = agae.a;
    public afvo e = b;
    public afvo f = new afzv(afrq.n);
    public final agcs g = a;
    public final long h = afrq.j;
    private SSLSocketFactory k;

    static {
        Logger.getLogger(agbo.class.getName());
        agcr agcrVar = new agcr(agcs.a);
        agcrVar.a(agcq.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, agcq.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, agcq.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, agcq.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, agcq.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, agcq.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256);
        agcrVar.b(agde.TLS_1_2);
        agcrVar.c = true;
        a = new agcs(agcrVar);
        TimeUnit.DAYS.toNanos(1000L);
        agbj agbjVar = new agbj();
        j = agbjVar;
        b = new afzv(agbjVar);
        EnumSet.of(afke.MTLS, afke.CUSTOM_MANAGERS);
    }

    public agbo(String str) {
        this.c = new afuv(str, new agbl(this), new agbk());
    }

    @Override // defpackage.affz
    public final afhs b() {
        return this.c;
    }

    final SSLSocketFactory c() {
        try {
            if (this.k == null) {
                this.k = SSLContext.getInstance("Default", agdc.b.c).getSocketFactory();
            }
            return this.k;
        } catch (GeneralSecurityException e) {
            throw new RuntimeException("TLS Provider failure", e);
        }
    }
}
