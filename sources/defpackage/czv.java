package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class czv extends dab {
    public static final dam a = new czt(czv.class);
    private static final ConcurrentMap b = new ConcurrentHashMap();
    private final byte[] c;
    private String d;

    public czv(byte[] bArr, String str) {
        this.c = bArr;
        this.d = str;
    }

    public static czv g(byte[] bArr, boolean z) {
        j(bArr.length);
        czv czvVar = (czv) b.get(new czu(bArr));
        if (czvVar != null) {
            return czvVar;
        }
        if (!dad.i(bArr)) {
            throw new IllegalArgumentException("invalid OID contents");
        }
        if (z) {
            bArr = dos.p(bArr);
        }
        return new czv(bArr, null);
    }

    public static czv h(Object obj) {
        if (obj == null || (obj instanceof czv)) {
            return (czv) obj;
        }
        if (obj instanceof czb) {
            dab dabVarP = ((czb) obj).p();
            if (dabVarP instanceof czv) {
                return (czv) dabVarP;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (czv) a.c((byte[]) obj);
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
        if (str.length() < 3 || str.charAt(1) != '.' || (cCharAt = str.charAt(0)) < '0' || cCharAt > '2' || !dad.j(str, 2)) {
            return false;
        }
        if (cCharAt == '2' || str.length() == 3 || str.charAt(3) == '.') {
            return true;
        }
        return (str.length() == 4 || str.charAt(4) == '.') && str.charAt(2) < '4';
    }

    public static byte[] o(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        aei aeiVar = new aei(str);
        int i = Integer.parseInt(aeiVar.j()) * 40;
        String strJ = aeiVar.j();
        long j = i;
        if (strJ.length() <= 18) {
            dad.g(byteArrayOutputStream, j + Long.parseLong(strJ));
        } else {
            dad.h(byteArrayOutputStream, new BigInteger(strJ).add(BigInteger.valueOf(j)));
        }
        while (aeiVar.k()) {
            String strJ2 = aeiVar.j();
            if (strJ2.length() <= 18) {
                dad.g(byteArrayOutputStream, Long.parseLong(strJ2));
            } else {
                dad.h(byteArrayOutputStream, new BigInteger(strJ2));
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // defpackage.dab
    public final int a(boolean z) {
        return czz.b(z, this.c.length);
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

    @Override // defpackage.dab
    public final void c(czz czzVar, boolean z) throws IOException {
        czzVar.j(z, 6, this.c);
    }

    @Override // defpackage.dab
    public final boolean d(dab dabVar) {
        if (this == dabVar) {
            return true;
        }
        if (dabVar instanceof czv) {
            return Arrays.equals(this.c, ((czv) dabVar).c);
        }
        return false;
    }

    @Override // defpackage.dab
    public final boolean e() {
        return false;
    }

    public final czv f(String str) {
        ConcurrentMap concurrentMap = dad.a;
        if (str.length() > 16383) {
            throw new IllegalArgumentException("exceeded relative OID contents length limit");
        }
        if (!dad.j(str, 0)) {
            throw new IllegalArgumentException("string " + str + " not a valid relative OID");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        aei aeiVar = new aei(str);
        while (aeiVar.k()) {
            String strJ = aeiVar.j();
            if (strJ.length() <= 18) {
                dad.g(byteArrayOutputStream, Long.parseLong(strJ));
            } else {
                dad.h(byteArrayOutputStream, new BigInteger(strJ));
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byte[] bArr = this.c;
        j(bArr.length + byteArray.length);
        return new czv(dos.r(bArr, byteArray), b() + "." + str);
    }

    @Override // defpackage.czr
    public final int hashCode() {
        return dos.m(this.c);
    }

    public final czv i() {
        czu czuVar = new czu(this.c);
        ConcurrentMap concurrentMap = b;
        czv czvVar = (czv) concurrentMap.get(czuVar);
        if (czvVar != null) {
            return czvVar;
        }
        synchronized (concurrentMap) {
            if (concurrentMap.containsKey(czuVar)) {
                return (czv) concurrentMap.get(czuVar);
            }
            concurrentMap.put(czuVar, this);
            return this;
        }
    }

    public final boolean n(czv czvVar) {
        byte[] bArr = czvVar.c;
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

    public czv(String str) {
        if (str == null) {
            throw new NullPointerException("'identifier' cannot be null");
        }
        if (str.length() > 16385) {
            throw new IllegalArgumentException("exceeded OID contents length limit");
        }
        if (!m(str)) {
            throw new IllegalArgumentException(b.c(str, "string ", " not a valid OID"));
        }
        byte[] bArrO = o(str);
        j(bArrO.length);
        this.c = bArrO;
        this.d = str;
    }
}
