package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zjb extends zjh {
    public static final zjs a = new ziz(zjb.class);
    private static final ConcurrentMap b = new ConcurrentHashMap();
    private final byte[] c;
    private String d;

    public zjb(byte[] bArr, String str) {
        this.c = bArr;
        this.d = str;
    }

    public static zjb g(byte[] bArr, boolean z) {
        j(bArr.length);
        zjb zjbVar = (zjb) b.get(new zja(bArr));
        if (zjbVar != null) {
            return zjbVar;
        }
        if (!zjj.i(bArr)) {
            throw new IllegalArgumentException("invalid OID contents");
        }
        if (z) {
            bArr = vxr.bd(bArr);
        }
        return new zjb(bArr, null);
    }

    public static zjb h(Object obj) {
        if (obj == null || (obj instanceof zjb)) {
            return (zjb) obj;
        }
        if (obj instanceof zih) {
            zjh zjhVarP = ((zih) obj).p();
            if (zjhVarP instanceof zjb) {
                return (zjb) zjhVarP;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (zjb) a.c((byte[]) obj);
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct object identifier from byte[]: ".concat(String.valueOf(e.getMessage())));
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: ".concat(String.valueOf(obj.getClass().getName())));
    }

    static void j(int i) {
        if (i > 4096) {
            throw new IllegalArgumentException("exceeded OID contents length limit");
        }
    }

    public static boolean m(String str) {
        char cCharAt;
        if (str.length() < 3 || str.charAt(1) != '.' || (cCharAt = str.charAt(0)) < '0' || cCharAt > '2' || !zjj.j(str, 2)) {
            return false;
        }
        if (cCharAt == '2' || str.length() == 3 || str.charAt(3) == '.') {
            return true;
        }
        return (str.length() == 4 || str.charAt(4) == '.') && str.charAt(2) < '4';
    }

    public static byte[] o(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        zlj zljVar = new zlj(str);
        int i = Integer.parseInt(zljVar.a()) * 40;
        String strA = zljVar.a();
        long j = i;
        if (strA.length() <= 18) {
            zjj.g(byteArrayOutputStream, j + Long.parseLong(strA));
        } else {
            zjj.h(byteArrayOutputStream, new BigInteger(strA).add(BigInteger.valueOf(j)));
        }
        while (zljVar.b()) {
            String strA2 = zljVar.a();
            if (strA2.length() <= 18) {
                zjj.g(byteArrayOutputStream, Long.parseLong(strA2));
            } else {
                zjj.h(byteArrayOutputStream, new BigInteger(strA2));
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // defpackage.zjh
    public final int a(boolean z) {
        return zjf.b(z, this.c.length);
    }

    public final synchronized String b() {
        long j;
        if (this.d == null) {
            byte[] bArr = this.c;
            StringBuilder sb = new StringBuilder();
            boolean z = true;
            long j2 = 0;
            BigInteger bigIntegerShiftLeft = null;
            for (int i = 0; i != bArr.length; i++) {
                byte b2 = bArr[i];
                long j3 = b2 & Byte.MAX_VALUE;
                int i2 = b2 & 128;
                if (j2 <= 72057594037927808L) {
                    long j4 = j2 + j3;
                    if (i2 == 0) {
                        if (z) {
                            if (j4 < 40) {
                                sb.append('0');
                            } else {
                                if (j4 < 80) {
                                    sb.append('1');
                                    j = -40;
                                } else {
                                    sb.append('2');
                                    j = -80;
                                }
                                j4 += j;
                            }
                        }
                        sb.append('.');
                        sb.append(j4);
                        z = false;
                        j2 = 0;
                    } else {
                        j2 = j4 << 7;
                    }
                } else {
                    if (bigIntegerShiftLeft == null) {
                        bigIntegerShiftLeft = BigInteger.valueOf(j2);
                    }
                    BigInteger bigIntegerOr = bigIntegerShiftLeft.or(BigInteger.valueOf(j3));
                    if (i2 == 0) {
                        if (z) {
                            sb.append('2');
                            bigIntegerOr = bigIntegerOr.subtract(BigInteger.valueOf(80L));
                        }
                        sb.append('.');
                        sb.append(bigIntegerOr);
                        z = false;
                        j2 = 0;
                        bigIntegerShiftLeft = null;
                    } else {
                        bigIntegerShiftLeft = bigIntegerOr.shiftLeft(7);
                    }
                }
            }
            this.d = sb.toString();
        }
        return this.d;
    }

    @Override // defpackage.zjh
    public final void c(zjf zjfVar, boolean z) throws IOException {
        zjfVar.j(z, 6, this.c);
    }

    @Override // defpackage.zjh
    public final boolean d(zjh zjhVar) {
        if (this == zjhVar) {
            return true;
        }
        if (zjhVar instanceof zjb) {
            return Arrays.equals(this.c, ((zjb) zjhVar).c);
        }
        return false;
    }

    @Override // defpackage.zjh
    public final boolean e() {
        return false;
    }

    public final zjb f(String str) {
        ConcurrentMap concurrentMap = zjj.a;
        if (str.length() > 16383) {
            throw new IllegalArgumentException("exceeded relative OID contents length limit");
        }
        if (!zjj.j(str, 0)) {
            throw new IllegalArgumentException("string " + str + " not a valid relative OID");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        zlj zljVar = new zlj(str);
        while (zljVar.b()) {
            String strA = zljVar.a();
            if (strA.length() <= 18) {
                zjj.g(byteArrayOutputStream, Long.parseLong(strA));
            } else {
                zjj.h(byteArrayOutputStream, new BigInteger(strA));
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byte[] bArr = this.c;
        j(bArr.length + byteArray.length);
        return new zjb(vxr.bf(bArr, byteArray), b() + "." + str);
    }

    @Override // defpackage.zix
    public final int hashCode() {
        return vxr.ba(this.c);
    }

    public final zjb i() {
        zja zjaVar = new zja(this.c);
        ConcurrentMap concurrentMap = b;
        zjb zjbVar = (zjb) concurrentMap.get(zjaVar);
        if (zjbVar != null) {
            return zjbVar;
        }
        synchronized (concurrentMap) {
            if (concurrentMap.containsKey(zjaVar)) {
                return (zjb) concurrentMap.get(zjaVar);
            }
            concurrentMap.put(zjaVar, this);
            return this;
        }
    }

    public final boolean n(zjb zjbVar) {
        byte[] bArr = zjbVar.c;
        int length = bArr.length;
        byte[] bArr2 = this.c;
        if (bArr2.length > length) {
            for (int i = 0; i < length; i++) {
                if (bArr2[i] == bArr[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        return b();
    }

    public zjb(String str) {
        if (str == null) {
            throw new NullPointerException("'identifier' cannot be null");
        }
        if (str.length() > 16385) {
            throw new IllegalArgumentException("exceeded OID contents length limit");
        }
        if (!m(str)) {
            throw new IllegalArgumentException(a.cg(str, "string ", " not a valid OID"));
        }
        byte[] bArrO = o(str);
        j(bArrO.length);
        this.c = bArrO;
        this.d = str;
    }
}
