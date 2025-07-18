package defpackage;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zfi extends zfo {
    public static final boolean a;
    private final List c;

    static {
        boolean z = false;
        if (wcq.aM() && Build.VERSION.SDK_INT >= 29) {
            z = true;
        }
        a = z;
    }

    public zfi() {
        zfw[] zfwVarArr = new zfw[2];
        zfwVarArr[0] = wcq.aK() ? new zfp() : null;
        zfwVarArr[1] = new zfv(zfu.a);
        List listAW = yfm.aW(zfwVarArr);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listAW) {
            if (((zfw) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.c = arrayList;
    }

    @Override // defpackage.zfo
    public final String a(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((zfw) next).d(sSLSocket)) {
                break;
            }
        }
        zfw zfwVar = (zfw) next;
        if (zfwVar != null) {
            return zfwVar.a(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.zfo
    public final zgb b(X509TrustManager x509TrustManager) {
        zfq zfqVarAJ = wcq.aJ(x509TrustManager);
        return zfqVarAJ != null ? zfqVarAJ : super.b(x509TrustManager);
    }

    @Override // defpackage.zfo
    public final void c(SSLSocket sSLSocket, String str, List list) {
        Object next;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((zfw) next).d(sSLSocket)) {
                    break;
                }
            }
        }
        zfw zfwVar = (zfw) next;
        if (zfwVar != null) {
            zfwVar.b(sSLSocket, str, list);
        }
    }

    @Override // defpackage.zfo
    public final boolean d(String str) {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
