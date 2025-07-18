package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agce extends agcf {
    private static final agcx d = new agcx(null, "setUseSessionTickets", Boolean.TYPE);
    private static final agcx e = new agcx(null, "setHostname", String.class);
    private static final agcx f = new agcx(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
    private static final agcx g = new agcx(null, "setAlpnProtocols", byte[].class);
    private static final agcx h = new agcx(byte[].class, "getNpnSelectedProtocol", new Class[0]);
    private static final agcx i = new agcx(null, "setNpnProtocols", byte[].class);
    private static final Method j;
    private static final Method k;
    private static final Method l;
    private static final Method m;
    private static final Method n;
    private static final Method o;
    private static final Constructor p;

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|63|3|(9:53|4|65|5|55|6|7|59|8)|37|57|38|61|39|51|52|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0117, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0119, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x011b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x011c, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011d, code lost:
    
        defpackage.agcf.a.logp(java.util.logging.Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 7.0+ APIs", (java.lang.Throwable) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x012c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x012d, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012e, code lost:
    
        defpackage.agcf.a.logp(java.util.logging.Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 7.0+ APIs", (java.lang.Throwable) r0);
     */
    static {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agce.<clinit>():void");
    }

    public agce(agdc agdcVar) {
        super(agdcVar);
    }

    @Override // defpackage.agcf
    public final String a(SSLSocket sSLSocket) {
        Method method = n;
        if (method != null) {
            try {
                return (String) method.invoke(sSLSocket, null);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                if (!(e3.getTargetException() instanceof UnsupportedOperationException)) {
                    throw new RuntimeException(e3);
                }
                agcf.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Socket unsupported for getApplicationProtocol, will try old methods");
            }
        }
        if (this.c.c() == 1) {
            try {
                byte[] bArr = (byte[]) f.a(sSLSocket, new Object[0]);
                if (bArr != null) {
                    return new String(bArr, agdf.b);
                }
            } catch (Exception e4) {
                agcf.a.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Failed calling getAlpnSelectedProtocol()", (Throwable) e4);
            }
        }
        if (this.c.c() != 3) {
            try {
                byte[] bArr2 = (byte[]) h.a(sSLSocket, new Object[0]);
                if (bArr2 != null) {
                    return new String(bArr2, agdf.b);
                }
            } catch (Exception e5) {
                agcf.a.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Failed calling getNpnSelectedProtocol()", (Throwable) e5);
            }
        }
        return null;
    }

    @Override // defpackage.agcf
    public final String b(SSLSocket sSLSocket, String str, List list) {
        String strA = a(sSLSocket);
        return strA == null ? super.b(sSLSocket, str, list) : strA;
    }

    @Override // defpackage.agcf
    protected final void c(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Constructor constructor;
        boolean z;
        Method method;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((agdd) it.next()).e);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        if (str != null) {
            try {
                try {
                    if (!str.contains("_")) {
                        try {
                            yqw.F(afrq.f(str).getAuthority().indexOf(64) == -1, "Userinfo must not be present on authority: '%s'", str);
                            Method method2 = j;
                            if (method2 == null || !((Boolean) method2.invoke(null, sSLSocket)).booleanValue()) {
                                d.c(sSLSocket, true);
                            } else {
                                k.invoke(null, sSLSocket, true);
                            }
                            Method method3 = o;
                            if (method3 == null || (constructor = p) == null || ztg.b(zte.b(str).a, null) != null) {
                                e.c(sSLSocket, str);
                            } else {
                                method3.invoke(sSLParameters, Collections.singletonList(constructor.newInstance(str)));
                            }
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(e2);
                } catch (InstantiationException e3) {
                    throw new RuntimeException(e3);
                }
            } catch (InvocationTargetException e4) {
                throw new RuntimeException(e4);
            }
        }
        Method method4 = n;
        if (method4 != null) {
            try {
                method4.invoke(sSLSocket, null);
                l.invoke(sSLParameters, strArr);
                z = true;
            } catch (InvocationTargetException e5) {
                if (!(e5.getTargetException() instanceof UnsupportedOperationException)) {
                    throw e5;
                }
                agcf.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "configureTlsExtensions", "setApplicationProtocol unsupported, will try old methods");
            }
        } else {
            z = false;
        }
        sSLSocket.setSSLParameters(sSLParameters);
        if (z && (method = m) != null && Arrays.equals(strArr, (String[]) method.invoke(sSLSocket.getSSLParameters(), null))) {
            return;
        }
        Object[] objArr = {agdc.e(list)};
        agdc agdcVar = this.c;
        if (agdcVar.c() == 1) {
            g.a(sSLSocket, objArr);
        }
        if (agdcVar.c() == 3) {
            throw new RuntimeException("We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS");
        }
        i.a(sSLSocket, objArr);
    }
}
