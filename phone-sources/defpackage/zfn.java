package defpackage;

import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zfn extends zfo {
    public static final boolean a;

    static {
        String property = System.getProperty("java.specification.version");
        Integer numU = property != null ? ylh.u(property) : null;
        boolean z = true;
        if (numU == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", null);
            } catch (NoSuchMethodException unused) {
            }
        } else if (numU.intValue() < 9) {
            z = false;
        }
        a = z;
    }

    @Override // defpackage.zfo
    public final String a(SSLSocket sSLSocket) {
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol != null) {
                if (!yks.e(applicationProtocol, "")) {
                    return applicationProtocol;
                }
            }
        } catch (UnsupportedOperationException unused) {
        }
        return null;
    }

    @Override // defpackage.zfo
    public final void c(SSLSocket sSLSocket, String str, List list) {
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        sSLParameters.setApplicationProtocols((String[]) wcq.aL(list).toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }
}
