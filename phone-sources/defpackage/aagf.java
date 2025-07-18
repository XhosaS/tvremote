package defpackage;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.security.AccessController;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aagf implements aagc {
    public final ClassLoader a;
    private final String b;
    private final Map c;
    private final Set d;

    public aagf() {
        this(null);
    }

    private final InputStream c(String str) throws IOException {
        String strConcat = this.b.concat(str);
        InputStream inputStream = (InputStream) AccessController.doPrivileged(new aage(this, strConcat, 0));
        if (inputStream != null) {
            return inputStream;
        }
        StringBuilder sb = new StringBuilder(40);
        sb.append("Resource not found: \"");
        sb.append(strConcat);
        sb.append("\" ClassLoader: ");
        ClassLoader classLoader = this.a;
        sb.append(classLoader != null ? classLoader.toString() : "system");
        throw new IOException(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0029: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:42), block:B:12:0x0029 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.aabs d(java.lang.String r6) throws java.lang.Throwable {
        /*
            r5 = this;
            r0 = 0
            java.io.InputStream r1 = r5.c(r6)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            boolean r2 = r1 instanceof java.io.DataInput     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2b
            if (r2 == 0) goto L11
            r2 = r1
            java.io.DataInput r2 = (java.io.DataInput) r2     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2b
            aabs r2 = defpackage.vxr.at(r2, r6)     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2b
            goto L1a
        L11:
            java.io.DataInputStream r2 = new java.io.DataInputStream     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2b
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2b
            aabs r2 = defpackage.vxr.at(r2, r6)     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2b
        L1a:
            java.util.Map r3 = r5.c     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2b
            java.lang.ref.SoftReference r4 = new java.lang.ref.SoftReference     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2b
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2b
            r3.put(r6, r4)     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2b
            r1.close()     // Catch: java.io.IOException -> L27
        L27:
            return r2
        L28:
            r6 = move-exception
            r0 = r1
            goto L3f
        L2b:
            r2 = move-exception
            goto L31
        L2d:
            r6 = move-exception
            goto L3f
        L2f:
            r2 = move-exception
            r1 = r0
        L31:
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L28
            java.util.Map r2 = r5.c     // Catch: java.lang.Throwable -> L28
            r2.remove(r6)     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L3e
            r1.close()     // Catch: java.io.IOException -> L3e
        L3e:
            return r0
        L3f:
            if (r0 == 0) goto L44
            r0.close()     // Catch: java.io.IOException -> L44
        L44:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aagf.d(java.lang.String):aabs");
    }

    private static void e(DataInputStream dataInputStream, Map map) throws IOException {
        int unsignedShort = dataInputStream.readUnsignedShort();
        String[] strArr = new String[unsignedShort];
        for (int i = 0; i < unsignedShort; i++) {
            strArr[i] = dataInputStream.readUTF().intern();
        }
        int unsignedShort2 = dataInputStream.readUnsignedShort();
        for (int i2 = 0; i2 < unsignedShort2; i2++) {
            try {
                map.put(strArr[dataInputStream.readUnsignedShort()], strArr[dataInputStream.readUnsignedShort()]);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new IOException("Corrupt zone info map");
            }
        }
    }

    @Override // defpackage.aagc
    public final Set a() {
        return this.d;
    }

    @Override // defpackage.aagc
    public final aabs b(String str) {
        Object obj;
        if (str == null || (obj = this.c.get(str)) == null) {
            return null;
        }
        if (!(obj instanceof SoftReference)) {
            return str.equals(obj) ? d(str) : b((String) obj);
        }
        aabs aabsVar = (aabs) ((SoftReference) obj).get();
        return aabsVar != null ? aabsVar : d(str);
    }

    public aagf(byte[] bArr) throws IOException {
        this.b = "org/joda/time/tz/data/";
        this.a = getClass().getClassLoader();
        InputStream inputStreamC = c("ZoneInfoMap");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        DataInputStream dataInputStream = new DataInputStream(inputStreamC);
        try {
            e(dataInputStream, concurrentHashMap);
            concurrentHashMap.put("UTC", new SoftReference(aabs.b));
            this.c = concurrentHashMap;
            this.d = DesugarCollections.unmodifiableSortedSet(new TreeSet(concurrentHashMap.keySet()));
        } finally {
            try {
                dataInputStream.close();
            } catch (IOException unused) {
            }
        }
    }
}
