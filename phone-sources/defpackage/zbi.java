package defpackage;

import j$.util.Objects;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zbi {
    public final zbz a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final zbp e;
    public final zbk f;
    public final ProxySelector g;
    public final zce h;
    public final List i;
    public final List j;

    public zbi(String str, int i, zbz zbzVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, zbp zbpVar, zbk zbkVar, List list, List list2, ProxySelector proxySelector) {
        list.getClass();
        list2.getClass();
        proxySelector.getClass();
        this.a = zbzVar;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = zbpVar;
        this.f = zbkVar;
        this.g = proxySelector;
        zcd zcdVar = new zcd();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (ylh.y(str2, "http", true)) {
            zcdVar.a = "http";
        } else {
            if (!ylh.y(str2, "https", true)) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            zcdVar.a = "https";
        }
        char[] cArr = zce.a;
        String strK = wbb.K(wbb.O(str, 0, 0, false, 7));
        if (strK == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        zcdVar.d = strK;
        if (i <= 0) {
            throw new IllegalArgumentException(a.cf(i, "unexpected port: "));
        }
        zcdVar.e = i;
        this.h = zcdVar.a();
        this.i = zcr.n(list);
        this.j = zcr.n(list2);
    }

    public final boolean a(zbi zbiVar) {
        zbiVar.getClass();
        if (yks.e(this.a, zbiVar.a) && yks.e(this.f, zbiVar.f) && yks.e(this.i, zbiVar.i) && yks.e(this.j, zbiVar.j) && yks.e(this.g, zbiVar.g) && yks.e(null, null) && yks.e(this.c, zbiVar.c) && yks.e(this.d, zbiVar.d) && yks.e(this.e, zbiVar.e)) {
            return this.h.d == zbiVar.h.d;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zbi)) {
            return false;
        }
        zbi zbiVar = (zbi) obj;
        return yks.e(this.h, zbiVar.h) && a(zbiVar);
    }

    public final int hashCode() {
        return ((((((((((((((((((this.h.hashCode() + 527) * 31) + this.a.hashCode()) * 31) + this.f.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.g.hashCode()) * 31) + Objects.hashCode(null)) * 31) + Objects.hashCode(this.c)) * 31) + Objects.hashCode(this.d)) * 31) + Objects.hashCode(this.e);
    }

    public final String toString() {
        ProxySelector proxySelector = this.g;
        java.util.Objects.toString(proxySelector);
        String strConcat = "proxySelector=".concat(proxySelector.toString());
        StringBuilder sb = new StringBuilder("Address{");
        zce zceVar = this.h;
        sb.append(zceVar.c);
        sb.append(":");
        sb.append(zceVar.d);
        sb.append(", ");
        sb.append(strConcat);
        sb.append("}");
        return sb.toString();
    }
}
