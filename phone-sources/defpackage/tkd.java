package defpackage;

import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.HandshakeCompletedListener;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class tkd implements HandshakeCompletedListener {
    private final /* synthetic */ int a;

    @Override // javax.net.ssl.HandshakeCompletedListener
    public final void handshakeCompleted(HandshakeCompletedEvent handshakeCompletedEvent) {
        if (this.a != 0) {
            ((tug) ((tug) tjx.a.b()).j("com/google/android/tv/remote/support/core/TcpClient", "onSslCompleted", 302, "TcpClient.java")).s("SSL Handshake completed");
        } else {
            ((tug) ((tug) tkg.a.e()).j("com/google/android/tv/remote/support/core/TcpWakePortClient", "onSslCompleted", 209, "TcpWakePortClient.java")).s("SSL Handshake completed");
        }
    }
}
