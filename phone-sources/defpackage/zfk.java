package defpackage;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import com.google.android.exoplayer2.ext.widevine.WVMediaCrypto;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zfk extends zfo {
    public static final boolean a;
    private final List c;
    private final aafi d;

    static {
        boolean z = false;
        if (wcq.aM() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        a = z;
    }

    public zfk() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        zfu zfuVar;
        Method method;
        Method method2;
        zfw[] zfwVarArr = new zfw[2];
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            cls.getClass();
            Class.forName("com.android.org.conscrypt.OpenSSLSocketFactoryImpl").getClass();
            Class.forName("com.android.org.conscrypt.SSLParametersImpl").getClass();
            zfuVar = new zfu(cls, null);
        } catch (Exception e) {
            zfo.b.k("unable to load android socket classes", 5, e);
            zfuVar = null;
        }
        zfwVarArr[0] = zfuVar;
        zfwVarArr[1] = new zfv(zfu.a);
        List listAW = yfm.aW(zfwVarArr);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listAW) {
            if (((zfw) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.c = arrayList;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", null);
            method2 = cls2.getMethod("open", String.class);
            method = cls2.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.d = new aafi(method3, method2, method);
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

    @Override // defpackage.zfo
    public final zgd e(X509TrustManager x509TrustManager) throws NoSuchMethodException, SecurityException {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            declaredMethod.getClass();
            return new zfj(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.e(x509TrustManager);
        }
    }

    @Override // defpackage.zfo
    public final void f(String str, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        aafi aafiVar = this.d;
        if (obj != null) {
            try {
                Object obj2 = aafiVar.a;
                obj2.getClass();
                ((Method) obj2).invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        zfo.l(this, str, 5, 4);
    }

    @Override // defpackage.zfo
    public final Object g() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        aafi aafiVar = this.d;
        Object obj = aafiVar.c;
        if (obj != null) {
            try {
                Object objInvoke = ((Method) obj).invoke(null, null);
                Object obj2 = aafiVar.b;
                obj2.getClass();
                ((Method) obj2).invoke(objInvoke, "response.body().close()");
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // defpackage.zfo
    public final void h(Socket socket, InetSocketAddress inetSocketAddress) throws IOException {
        socket.getClass();
        try {
            socket.connect(inetSocketAddress, WVMediaCrypto.TYPE);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e;
            }
            throw new IOException("Exception in connect", e);
        }
    }
}
