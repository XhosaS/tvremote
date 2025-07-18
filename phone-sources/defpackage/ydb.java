package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ydb extends ydc {
    private static final Method d;
    private static final Method e;
    private static final Method f;
    private static final Method g;
    private static final Method h;
    private static final Method i;
    private static final Constructor j;
    private static final aafi k = new aafi((Object) null, "setUseSessionTickets", new Class[]{Boolean.TYPE}, (byte[]) null);
    private static final aafi l = new aafi((Object) null, "setHostname", new Class[]{String.class}, (byte[]) null);
    private static final aafi m = new aafi(byte[].class, "getAlpnSelectedProtocol", new Class[0], (byte[]) null);
    private static final aafi n = new aafi((Object) null, "setAlpnProtocols", new Class[]{byte[].class}, (byte[]) null);
    private static final aafi o = new aafi(byte[].class, "getNpnSelectedProtocol", new Class[0], (byte[]) null);
    private static final aafi p = new aafi((Object) null, "setNpnProtocols", new Class[]{byte[].class}, (byte[]) null);

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
    
        defpackage.ydc.a.logp(java.util.logging.Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 7.0+ APIs", (java.lang.Throwable) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x012c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x012d, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012e, code lost:
    
        defpackage.ydc.a.logp(java.util.logging.Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 7.0+ APIs", (java.lang.Throwable) r0);
     */
    static {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ydb.<clinit>():void");
    }

    public ydb(ydw ydwVar) {
        super(ydwVar);
    }

    @Override // defpackage.ydc
    public final String a(SSLSocket sSLSocket) {
        Method method = h;
        if (method != null) {
            try {
                return (String) method.invoke(sSLSocket, null);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                if (!(e3.getTargetException() instanceof UnsupportedOperationException)) {
                    throw new RuntimeException(e3);
                }
                ydc.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Socket unsupported for getApplicationProtocol, will try old methods");
            }
        }
        if (this.c.c() == 1) {
            try {
                byte[] bArr = (byte[]) m.b(sSLSocket, new Object[0]);
                if (bArr != null) {
                    return new String(bArr, ydz.b);
                }
            } catch (Exception e4) {
                ydc.a.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Failed calling getAlpnSelectedProtocol()", (Throwable) e4);
            }
        }
        if (this.c.c() != 3) {
            try {
                byte[] bArr2 = (byte[]) o.b(sSLSocket, new Object[0]);
                if (bArr2 != null) {
                    return new String(bArr2, ydz.b);
                }
            } catch (Exception e5) {
                ydc.a.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Failed calling getNpnSelectedProtocol()", (Throwable) e5);
            }
        }
        return null;
    }

    @Override // defpackage.ydc
    public final String b(SSLSocket sSLSocket, String str, List list) {
        String strA = a(sSLSocket);
        return strA == null ? super.b(sSLSocket, str, list) : strA;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0176 A[Catch: InstantiationException -> 0x01f1, InvocationTargetException -> 0x01fa, IllegalAccessException -> 0x0203, TryCatch #4 {InvocationTargetException -> 0x01fa, blocks: (B:8:0x0030, B:11:0x003a, B:15:0x004e, B:16:0x0053, B:18:0x0058, B:20:0x0068, B:22:0x0085, B:24:0x0089, B:27:0x008f, B:29:0x0099, B:31:0x009f, B:33:0x00a7, B:57:0x0125, B:59:0x012b, B:71:0x0151, B:73:0x0162, B:60:0x0130, B:64:0x0139, B:70:0x014c, B:35:0x00b5, B:39:0x00c0, B:44:0x00d6, B:46:0x00e7, B:56:0x011c, B:47:0x00ee, B:51:0x00f7, B:52:0x00fe, B:54:0x0104, B:55:0x0114, B:74:0x0176, B:21:0x0078, B:75:0x017f, B:85:0x01aa, B:87:0x01af, B:89:0x01b3, B:80:0x0192, B:82:0x019a, B:83:0x01a8), top: B:116:0x0030 }] */
    @Override // defpackage.ydc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void c(javax.net.ssl.SSLSocket r18, java.lang.String r19, java.util.List r20) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ydb.c(javax.net.ssl.SSLSocket, java.lang.String, java.util.List):void");
    }
}
