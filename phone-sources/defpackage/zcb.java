package defpackage;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zcb {
    public final zcp a;
    public final zbr b;
    public final List c;
    private final yft d;

    public zcb(zcp zcpVar, zbr zbrVar, List list, yjk yjkVar) {
        zcpVar.getClass();
        this.a = zcpVar;
        this.b = zbrVar;
        this.c = list;
        this.d = new yga(new ovo(yjkVar, 6));
    }

    public static final List b(yjk yjkVar) {
        try {
            return (List) yjkVar.a();
        } catch (SSLPeerUnverifiedException unused) {
            return yhb.a;
        }
    }

    private static final String c(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        type.getClass();
        return type;
    }

    public final List a() {
        return (List) this.d.a();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zcb)) {
            return false;
        }
        zcb zcbVar = (zcb) obj;
        return zcbVar.a == this.a && yks.e(zcbVar.b, this.b) && yks.e(zcbVar.a(), a()) && yks.e(zcbVar.c, this.c);
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + a().hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        List listA = a();
        ArrayList arrayList = new ArrayList(yfm.z(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(c((Certificate) it.next()));
        }
        String string = arrayList.toString();
        zcp zcpVar = this.a;
        zbr zbrVar = this.b;
        List list = this.c;
        ArrayList arrayList2 = new ArrayList(yfm.z(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(c((Certificate) it2.next()));
        }
        return "Handshake{tlsVersion=" + zcpVar + " cipherSuite=" + zbrVar + " peerCertificates=" + string + " localCertificates=" + arrayList2 + "}";
    }
}
