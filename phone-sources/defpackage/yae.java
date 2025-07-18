package defpackage;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yae implements xte {
    public static final Logger a = Logger.getLogger(yae.class.getName());
    private static final ybn c = new ybn();
    private static final ttm b = new yad(0);

    public yae() {
        ttm ttmVar = b;
        ybn ybnVar = c;
        ttmVar.getClass();
        ybnVar.getClass();
    }

    public static final xtd a(InetSocketAddress inetSocketAddress) {
        try {
            URI uri = new URI("https", null, inetSocketAddress.getHostString(), inetSocketAddress.getPort(), null, null, null);
            ProxySelector proxySelector = ProxySelector.getDefault();
            if (proxySelector == null) {
                a.logp(Level.FINE, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "proxy selector is null, so continuing without proxy lookup");
                return null;
            }
            List<Proxy> listSelect = proxySelector.select(uri);
            if (listSelect.size() > 1) {
                a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "More than 1 proxy detected, gRPC will select the first one");
            }
            Proxy proxy = listSelect.get(0);
            if (proxy.type() == Proxy.Type.DIRECT) {
                return null;
            }
            InetSocketAddress inetSocketAddress2 = (InetSocketAddress) proxy.address();
            PasswordAuthentication passwordAuthenticationC = ybn.c(inetSocketAddress2.getHostString(), inetSocketAddress2.getAddress(), inetSocketAddress2.getPort());
            if (inetSocketAddress2.isUnresolved()) {
                inetSocketAddress2 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress2.getHostName()), inetSocketAddress2.getPort());
            }
            inetSocketAddress.getClass();
            inetSocketAddress2.getClass();
            if (passwordAuthenticationC == null) {
                return new xqy(inetSocketAddress2, inetSocketAddress, null, null);
            }
            return new xqy(inetSocketAddress2, inetSocketAddress, passwordAuthenticationC.getUserName(), passwordAuthenticationC.getPassword() != null ? new String(passwordAuthenticationC.getPassword()) : null);
        } catch (URISyntaxException e) {
            a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e);
            return null;
        }
    }
}
