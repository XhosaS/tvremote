package defpackage;

import java.security.Provider;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class udt extends Provider {
    public udt() {
        throw null;
    }

    public udt(byte[] bArr) {
        super("Ssl_Guard", 1.01d, "Makes SSL Connections wait for security patches.");
        String name = udq.class.getName();
        put("SSLContext.SSL", name);
        put("SSLContext.SSLv3", name);
        put("SSLContext.TLS", name);
        put("SSLContext.TLSv1", name);
        put("SSLContext.TLSv1.1", name);
        put("SSLContext.TLSv1.2", name);
        put("SSLContext.Default", name);
    }
}
