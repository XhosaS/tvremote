package defpackage;

import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import android.content.res.loader.ResourcesProvider;
import android.os.ParcelFileDescriptor;
import android.system.Os;
import android.util.Log;
import j$.util.DesugarArrays;
import j$.util.function.Predicate$CC;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sir {
    public static int a(int i, int i2) {
        return (i2 * 31) + i;
    }

    public static int b(Object obj, int i) {
        return a(obj == null ? 0 : obj.hashCode(), i);
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, java.util.List] */
    public static boolean c(Context context, Map map) throws Throwable {
        FileDescriptor fileDescriptorMemfd_create;
        zuw zuwVar;
        ResourcesLoader resourcesLoader = null;
        try {
        } catch (Exception e) {
            Log.e("ColorResLoaderCreator", "Failed to create the ColorResourcesTableCreator.", e);
        }
        if (map.entrySet().isEmpty()) {
            throw new IllegalArgumentException("No color resources provided for harmonization.");
        }
        zuw zuwVar2 = new zuw(127, context.getPackageName());
        HashMap map2 = new HashMap();
        srk srkVar = null;
        for (Map.Entry entry : map.entrySet()) {
            srk srkVar2 = new srk(((Integer) entry.getKey()).intValue(), context.getResources().getResourceEntryName(((Integer) entry.getKey()).intValue()), ((Integer) entry.getValue()).intValue());
            if (!context.getResources().getResourceTypeName(((Integer) entry.getKey()).intValue()).equals("color")) {
                throw new IllegalArgumentException("Non color resource found: name=" + srkVar2.d + ", typeId=" + Integer.toHexString(srkVar2.b & 255));
            }
            byte b = srkVar2.a;
            if (b == 1) {
                zuwVar = srq.c;
            } else {
                if (b != Byte.MAX_VALUE) {
                    throw new IllegalArgumentException("Not supported with unknown package id: " + ((int) srkVar2.a));
                }
                zuwVar = zuwVar2;
            }
            if (!map2.containsKey(zuwVar)) {
                map2.put(zuwVar, new ArrayList());
            }
            ((List) map2.get(zuwVar)).add(srkVar2);
            srkVar = srkVar2;
        }
        byte b2 = srkVar.b;
        srq.a = b2;
        if (b2 == 0) {
            throw new IllegalArgumentException("No color resources found for harmonization.");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        srp srpVar = new srp(map2);
        ((srl) srpVar.b).a(byteArrayOutputStream);
        byteArrayOutputStream.write(srq.c(srpVar.a));
        ((srn) srpVar.d).a(byteArrayOutputStream);
        for (yyh yyhVar : srpVar.c) {
            ((srl) yyhVar.e).a(byteArrayOutputStream);
            Object obj = yyhVar.d;
            byteArrayOutputStream.write(srq.c(((zuw) obj).a));
            char[] charArray = ((String) ((zuw) obj).b).toCharArray();
            for (int i = 0; i < 128; i++) {
                if (i < charArray.length) {
                    byteArrayOutputStream.write(srq.a(charArray[i]));
                } else {
                    byteArrayOutputStream.write(srq.a((char) 0));
                }
            }
            byteArrayOutputStream.write(srq.c(288));
            byteArrayOutputStream.write(srq.c(0));
            Object obj2 = yyhVar.c;
            byteArrayOutputStream.write(srq.c(((srn) obj2).a + 288));
            byteArrayOutputStream.write(srq.c(0));
            byteArrayOutputStream.write(srq.c(0));
            ((srn) obj2).a(byteArrayOutputStream);
            ((srn) yyhVar.a).a(byteArrayOutputStream);
            Object obj3 = yyhVar.b;
            ((srl) ((srp) obj3).b).a(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{srq.a, 0, 0, 0});
            byteArrayOutputStream.write(srq.c(((srp) obj3).a));
            Object obj4 = ((srp) obj3).c;
            int length = ((int[]) obj4).length;
            for (int i2 = 0; i2 < length; i2++) {
                byteArrayOutputStream.write(srq.c(((int[]) obj4)[i2]));
            }
            Object obj5 = ((srp) obj3).d;
            ((srl) ((sro) obj5).b).a(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{srq.a, 0, 0, 0});
            byteArrayOutputStream.write(srq.c(((sro) obj5).a));
            byteArrayOutputStream.write(srq.c(((sro) obj5).b()));
            byteArrayOutputStream.write((byte[]) ((sro) obj5).c);
            Object obj6 = ((sro) obj5).d;
            int length2 = ((int[]) obj6).length;
            for (int i3 = 0; i3 < length2; i3++) {
                byteArrayOutputStream.write(srq.c(((int[]) obj6)[i3]));
            }
            Object obj7 = ((sro) obj5).e;
            int length3 = ((srm[]) obj7).length;
            for (int i4 = 0; i4 < length3; i4++) {
                srm srmVar = ((srm[]) obj7)[i4];
                byteArrayOutputStream.write(srq.d((short) 8));
                byteArrayOutputStream.write(srq.d((short) 2));
                byteArrayOutputStream.write(srq.c(srmVar.a));
                byteArrayOutputStream.write(srq.d((short) 8));
                byteArrayOutputStream.write(new byte[]{0, 28});
                byteArrayOutputStream.write(srq.c(srmVar.b));
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray.length != 0) {
            try {
                fileDescriptorMemfd_create = Os.memfd_create("temp.arsc", 0);
            } catch (Throwable th) {
                th = th;
                fileDescriptorMemfd_create = null;
            }
            try {
                if (fileDescriptorMemfd_create == null) {
                    Log.w("ColorResLoaderCreator", "Cannot create memory file descriptor.");
                } else {
                    FileOutputStream fileOutputStream = new FileOutputStream(fileDescriptorMemfd_create);
                    try {
                        fileOutputStream.write(byteArray);
                        ParcelFileDescriptor parcelFileDescriptorDup = ParcelFileDescriptor.dup(fileDescriptorMemfd_create);
                        try {
                            ResourcesLoader resourcesLoader2 = new ResourcesLoader();
                            resourcesLoader2.addProvider(ResourcesProvider.loadFromTable(parcelFileDescriptorDup, null));
                            if (parcelFileDescriptorDup != null) {
                                parcelFileDescriptorDup.close();
                            }
                            fileOutputStream.close();
                            Os.close(fileDescriptorMemfd_create);
                            resourcesLoader = resourcesLoader2;
                        } finally {
                        }
                    } finally {
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (fileDescriptorMemfd_create != null) {
                    Os.close(fileDescriptorMemfd_create);
                }
                throw th;
            }
        }
        if (resourcesLoader == null) {
            return false;
        }
        context.getResources().addLoaders(resourcesLoader);
        return true;
    }

    public static final void d(int i, DataOutputStream dataOutputStream) throws IOException {
        try {
            dataOutputStream.writeShort(i);
        } catch (IOException unused) {
        }
    }

    public static int e(int i) {
        if (i == 200) {
            return 200;
        }
        switch (i) {
            case 400:
                return 400;
            case 401:
                return 401;
            case 402:
                return 402;
            default:
                return 0;
        }
    }

    public static zmv f(PublicKey publicKey) throws NoSuchAlgorithmException {
        zmw zmwVarB = zmw.b(publicKey.getEncoded());
        try {
            return new zmv(MessageDigest.getInstance("SHA-1").digest(zmwVarB.b.m()));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Could not get SHA-1 digest instance", e);
        }
    }

    public static SSLSocketFactory g(KeyManager[] keyManagerArr, TrustManager trustManager) throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        if (trustManager == null) {
            trustManager = new tiy();
        }
        sSLContext.init(keyManagerArr, new TrustManager[]{trustManager}, null);
        return sSLContext.getSocketFactory();
    }

    public static void h(SSLSocket sSLSocket) {
        final int i = 0;
        sSLSocket.setEnabledProtocols((String[]) DesugarArrays.stream(sSLSocket.getEnabledProtocols()).filter(Predicate$CC.isEqual("TLSv1").or(Predicate$CC.isEqual("TLSv1.1")).mo438negate()).toArray(new IntFunction() { // from class: tix
            @Override // java.util.function.IntFunction
            public final Object apply(int i2) {
                return i != 0 ? new String[i2] : new String[i2];
            }
        }));
        final int i2 = 1;
        sSLSocket.setEnabledCipherSuites((String[]) DesugarArrays.stream(sSLSocket.getEnabledCipherSuites()).filter(new pbd(5)).toArray(new IntFunction() { // from class: tix
            @Override // java.util.function.IntFunction
            public final Object apply(int i22) {
                return i2 != 0 ? new String[i22] : new String[i22];
            }
        }));
        sSLSocket.setNeedClientAuth(true);
        sSLSocket.setUseClientMode(true);
    }
}
