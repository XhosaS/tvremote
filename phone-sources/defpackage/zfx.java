package defpackage;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zfx extends ProxySelector {
    public static final zfx a = new zfx();

    private zfx() {
    }

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        if (uri != null) {
            return yfm.p(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null");
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }
}
