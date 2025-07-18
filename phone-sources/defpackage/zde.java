package defpackage;

import com.google.android.exoplayer2.ext.widevine.WVMediaCrypto;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zde extends zeh {
    public static final /* synthetic */ int n = 0;
    public final zco a;
    public Socket b;
    public Socket c;
    public zcb d;
    public zci e;
    public zeu f;
    public zgm g;
    public zgl h;
    public boolean i;
    public int j;
    public int k;
    public final List l;
    public long m;
    private boolean p;
    private int q;
    private int r;

    public zde(zco zcoVar) {
        zcoVar.getClass();
        this.a = zcoVar;
        this.k = 1;
        this.l = new ArrayList();
        this.m = Long.MAX_VALUE;
    }

    public final Socket a() {
        Socket socket = this.c;
        socket.getClass();
        return socket;
    }

    public final void b() {
        Socket socket = this.b;
        if (socket != null) {
            zcr.p(socket);
        }
    }

    public final synchronized void c() {
        this.q++;
    }

    public final synchronized void d() {
        this.p = true;
    }

    public final synchronized void e() {
        this.i = true;
    }

    @Override // defpackage.zeh
    public final void f(zfb zfbVar) {
        zfbVar.j(8, null);
    }

    public final synchronized void g(zdc zdcVar, IOException iOException) {
        if (iOException instanceof zfh) {
            int i = ((zfh) iOException).a;
            if (i == 8) {
                int i2 = this.r + 1;
                this.r = i2;
                if (i2 > 1) {
                    this.i = true;
                    this.j++;
                }
            } else if (i != 9 || !zdcVar.l) {
                this.i = true;
                this.j++;
            }
        } else if (!i() || (iOException instanceof zdz)) {
            this.i = true;
            if (this.q == 0) {
                zch zchVar = zdcVar.a;
                zco zcoVar = this.a;
                Proxy proxy = zcoVar.b;
                if (proxy.type() != Proxy.Type.DIRECT) {
                    zbi zbiVar = zcoVar.a;
                    zbiVar.g.connectFailed(zbiVar.h.f(), proxy.address(), iOException);
                }
                zchVar.q.q(zcoVar);
                this.j++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(defpackage.zbi r11, java.util.List r12) {
        /*
            r10 = this;
            byte[] r0 = defpackage.zcr.a
            java.util.List r0 = r10.l
            int r0 = r0.size()
            int r1 = r10.k
            r2 = 0
            if (r0 >= r1) goto Lb4
            boolean r0 = r10.i
            if (r0 == 0) goto L13
            goto Lb4
        L13:
            zco r0 = r10.a
            zbi r1 = r0.a
            boolean r3 = r1.a(r11)
            if (r3 == 0) goto Lb4
            zce r3 = r11.h
            zce r1 = r1.h
            java.lang.String r4 = r3.c
            java.lang.String r5 = r1.c
            boolean r6 = defpackage.yks.e(r4, r5)
            r7 = 1
            if (r6 == 0) goto L2d
            return r7
        L2d:
            zeu r6 = r10.f
            if (r6 != 0) goto L32
            return r2
        L32:
            if (r12 == 0) goto Lb4
            boolean r6 = r12.isEmpty()
            if (r6 == 0) goto L3c
            goto Lb4
        L3c:
            java.util.Iterator r12 = r12.iterator()
        L40:
            boolean r6 = r12.hasNext()
            if (r6 == 0) goto Lb4
            java.lang.Object r6 = r12.next()
            zco r6 = (defpackage.zco) r6
            java.net.Proxy r8 = r6.b
            java.net.Proxy$Type r8 = r8.type()
            java.net.Proxy$Type r9 = java.net.Proxy.Type.DIRECT
            if (r8 != r9) goto L40
            java.net.Proxy r8 = r0.b
            java.net.Proxy$Type r8 = r8.type()
            java.net.Proxy$Type r9 = java.net.Proxy.Type.DIRECT
            if (r8 != r9) goto L40
            java.net.InetSocketAddress r8 = r0.c
            java.net.InetSocketAddress r6 = r6.c
            boolean r6 = defpackage.yks.e(r8, r6)
            if (r6 == 0) goto L40
            javax.net.ssl.HostnameVerifier r12 = r11.d
            zgc r0 = defpackage.zgc.a
            if (r12 != r0) goto Lb4
            int r12 = r3.d
            int r0 = r1.d
            if (r12 == r0) goto L77
            goto Lb4
        L77:
            boolean r12 = defpackage.yks.e(r4, r5)
            if (r12 == 0) goto L7e
            goto L9f
        L7e:
            boolean r12 = r10.p
            if (r12 != 0) goto Lb4
            zcb r12 = r10.d
            if (r12 == 0) goto Lb4
            java.util.List r12 = r12.a()
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto Lb4
            java.lang.Object r12 = r12.get(r2)
            r12.getClass()
            java.security.cert.X509Certificate r12 = (java.security.cert.X509Certificate) r12
            boolean r12 = defpackage.zgc.b(r4, r12)
            if (r12 == 0) goto Lb4
        L9f:
            zbp r11 = r11.e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lb4
            r11.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lb4
            zcb r12 = r10.d     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lb4
            r12.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lb4
            java.util.List r12 = r12.a()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lb4
            r12.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lb4
            r11.a()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lb4
            return r7
        Lb4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zde.h(zbi, java.util.List):boolean");
    }

    public final boolean i() {
        return this.f != null;
    }

    public final void j() {
        this.i = true;
    }

    public final void k() throws SocketException {
        Socket socket = this.c;
        socket.getClass();
        zgm zgmVar = this.g;
        zgmVar.getClass();
        zgl zglVar = this.h;
        zglVar.getClass();
        socket.setSoTimeout(0);
        zcv zcvVar = zcv.a;
        zef zefVar = new zef(zcvVar);
        zefVar.b = socket;
        zefVar.c = zcr.e + " " + this.a.a.h.c;
        zefVar.d = zgmVar;
        zefVar.e = zglVar;
        zefVar.f = this;
        zeu zeuVar = new zeu(zefVar);
        this.f = zeuVar;
        this.k = zeu.t.f();
        zcvVar.getClass();
        zfc zfcVar = zeuVar.q;
        zfcVar.a();
        zlj zljVar = zeuVar.u;
        zfcVar.k(zljVar);
        if (zljVar.e() != 65535) {
            zfcVar.f(0, r2 - 65535);
        }
        zcvVar.a().e(new zct(zeuVar.c, zeuVar.r));
    }

    public final void l() throws IOException {
        Socket socket;
        int i;
        zco zcoVar = this.a;
        Proxy proxy = zcoVar.b;
        Proxy.Type type = proxy.type();
        if (type != null && ((i = zdd.a[type.ordinal()]) == 1 || i == 2)) {
            socket = zcoVar.a.b.createSocket();
            socket.getClass();
        } else {
            socket = new Socket(proxy);
        }
        this.b = socket;
        socket.setSoTimeout(WVMediaCrypto.TYPE);
        try {
            zfo.b.h(socket, zcoVar.c);
            try {
                this.g = new zhi(zhb.d(socket));
                this.h = new zhg(zhb.a(socket));
            } catch (NullPointerException e) {
                if (yks.e(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            InetSocketAddress inetSocketAddress = this.a.c;
            Objects.toString(inetSocketAddress);
            ConnectException connectException = new ConnectException("Failed to connect to ".concat(inetSocketAddress.toString()));
            connectException.initCause(e2);
            throw connectException;
        }
    }

    @Override // defpackage.zeh
    public final synchronized void m(zlj zljVar) {
        zljVar.getClass();
        this.k = zljVar.f();
    }

    public final String toString() {
        zcb zcbVar = this.d;
        String str = zcbVar != null ? zcbVar.b : "none";
        zco zcoVar = this.a;
        zci zciVar = this.e;
        StringBuilder sb = new StringBuilder("Connection{");
        zce zceVar = zcoVar.a.h;
        sb.append(zceVar.c);
        sb.append(":");
        sb.append(zceVar.d);
        sb.append(", proxy=");
        sb.append(zcoVar.b);
        sb.append(" hostAddress=");
        sb.append(zcoVar.c);
        sb.append(" cipherSuite=");
        sb.append(str);
        sb.append(" protocol=");
        sb.append(zciVar);
        sb.append("}");
        return sb.toString();
    }
}
