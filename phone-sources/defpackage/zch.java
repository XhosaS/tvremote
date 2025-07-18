package defpackage;

import java.net.ProxySelector;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zch implements Cloneable, zbn {
    public static final List a = zcr.m(zci.d, zci.b);
    public static final List b = zcr.m(zbt.a, zbt.b);
    public final zbx c;
    public final List d;
    public final List e;
    public final zbw f;
    public final zbz g;
    public final ProxySelector h;
    public final zbk i;
    public final SocketFactory j;
    public final SSLSocketFactory k;
    public final List l;
    public final List m;
    public final HostnameVerifier n;
    public final zbp o;
    public final zft p;
    public final upq q;
    public final upq r;
    private final X509TrustManager s;
    private final zgb t;

    public zch() throws NoSuchAlgorithmException, KeyStoreException {
        zbx zbxVar = new zbx();
        upq upqVar = new upq((char[]) null);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        zca zcaVar = zca.a;
        byte[] bArr = zcr.a;
        zft zftVar = new zft(zcaVar);
        zbk zbkVar = zbk.a;
        zbw zbwVar = zbw.a;
        zbz zbzVar = zbz.a;
        SocketFactory socketFactory = SocketFactory.getDefault();
        socketFactory.getClass();
        List list = b;
        List list2 = a;
        zgc zgcVar = zgc.a;
        zbp zbpVar = zbp.a;
        this.c = zbxVar;
        this.r = upqVar;
        this.d = zcr.n(arrayList);
        this.e = zcr.n(arrayList2);
        this.p = zftVar;
        this.f = zbwVar;
        this.g = zbzVar;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.h = proxySelector == null ? zfx.a : proxySelector;
        this.i = zbkVar;
        this.j = socketFactory;
        this.l = list;
        this.m = list2;
        this.n = zgcVar;
        this.q = new upq((byte[]) null);
        if ((list instanceof Collection) && list.isEmpty()) {
            this.k = null;
            this.t = null;
            this.s = null;
            this.o = zbpVar;
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((zbt) it.next()).c) {
                    zfo zfoVar = zfo.b;
                    TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                    trustManagerFactory.init((KeyStore) null);
                    TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                    trustManagers.getClass();
                    if (trustManagers.length == 1) {
                        TrustManager trustManager = trustManagers[0];
                        if (trustManager instanceof X509TrustManager) {
                            trustManager.getClass();
                            X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                            this.s = x509TrustManager;
                            zfo zfoVar2 = zfo.b;
                            x509TrustManager.getClass();
                            this.k = zfoVar2.j(x509TrustManager);
                            x509TrustManager.getClass();
                            zgb zgbVarB = zfo.b.b(x509TrustManager);
                            this.t = zgbVarB;
                            zgbVarB.getClass();
                            this.o = yks.e(zbpVar.c, zgbVarB) ? zbpVar : new zbp(zbpVar.b, zgbVarB);
                        }
                    }
                    String string = Arrays.toString(trustManagers);
                    string.getClass();
                    throw new IllegalStateException("Unexpected default trust managers: ".concat(string));
                }
            }
            this.k = null;
            this.t = null;
            this.s = null;
            this.o = zbpVar;
        }
        if (this.d.contains(null)) {
            List list3 = this.d;
            Objects.toString(list3);
            throw new IllegalStateException("Null interceptor: ".concat(list3.toString()));
        }
        if (this.e.contains(null)) {
            List list4 = this.e;
            Objects.toString(list4);
            throw new IllegalStateException("Null network interceptor: ".concat(list4.toString()));
        }
        List list5 = this.l;
        if (!(list5 instanceof Collection) || !list5.isEmpty()) {
            Iterator it2 = list5.iterator();
            while (it2.hasNext()) {
                if (((zbt) it2.next()).c) {
                    if (this.k == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (this.t == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (this.s == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (this.k != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.t != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.s != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!yks.e(this.o, zbpVar)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @Override // defpackage.zbn
    public final zdc a(zcj zcjVar) {
        zcjVar.getClass();
        return new zdc(this, zcjVar);
    }

    public final Object clone() {
        return super.clone();
    }
}
