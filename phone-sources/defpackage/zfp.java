package defpackage;

import android.net.ssl.SSLSockets;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zfp implements zfw {
    @Override // defpackage.zfw
    public final String a(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || yks.e(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // defpackage.zfw
    public final void b(SSLSocket sSLSocket, String str, List list) throws IOException {
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            zfo zfoVar = zfo.b;
            sSLParameters.setApplicationProtocols((String[]) wcq.aL(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }

    @Override // defpackage.zfw
    public final boolean c() {
        return wcq.aK();
    }

    @Override // defpackage.zfw
    public final boolean d(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }
}
