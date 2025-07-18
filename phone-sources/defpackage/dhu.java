package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dhu {
    public final int a;
    public final int b;
    public final long c;
    public final byte[] d;

    public dhu(int i, int i2, long j, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = bArr;
    }

    public static dhu b(String str) {
        byte[] bytes = (str + (char) 0).getBytes(dhw.h);
        return new dhu(2, bytes.length, bytes);
    }

    public static dhu c(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[dhw.f[4]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putInt((int) jArr[0]);
        return new dhu(4, 1, byteBufferWrap.array());
    }

    public static dhu d(dhv dhvVar, ByteOrder byteOrder) {
        dhv[] dhvVarArr = {dhvVar};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[dhw.f[5]]);
        byteBufferWrap.order(byteOrder);
        dhv dhvVar2 = dhvVarArr[0];
        byteBufferWrap.putInt((int) dhvVar2.a);
        byteBufferWrap.putInt((int) dhvVar2.b);
        return new dhu(5, 1, byteBufferWrap.array());
    }

    public static dhu e(int i, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[dhw.f[3]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putShort((short) new int[]{i}[0]);
        return new dhu(3, 1, byteBufferWrap.array());
    }

    public final int a(ByteOrder byteOrder) throws Throwable {
        Object objF = f(byteOrder);
        if (objF == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objF instanceof String) {
            return Integer.parseInt((String) objF);
        }
        if (objF instanceof long[]) {
            long[] jArr = (long[]) objF;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objF instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objF;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x013e: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:319), block:B:94:0x013e */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0141 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v10, types: [long[]] */
    /* JADX WARN: Type inference failed for: r5v11, types: [dhv[]] */
    /* JADX WARN: Type inference failed for: r5v12, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v13, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v14, types: [dhv[]] */
    /* JADX WARN: Type inference failed for: r5v15, types: [double[]] */
    /* JADX WARN: Type inference failed for: r5v17, types: [double[]] */
    /* JADX WARN: Type inference failed for: r5v9, types: [int[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.lang.Object f(java.nio.ByteOrder r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhu.f(java.nio.ByteOrder):java.lang.Object");
    }

    public final String g(ByteOrder byteOrder) throws Throwable {
        Object objF = f(byteOrder);
        if (objF == null) {
            return null;
        }
        if (objF instanceof String) {
            return (String) objF;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (objF instanceof long[]) {
            long[] jArr = (long[]) objF;
            while (true) {
                int length = jArr.length;
                if (i >= length) {
                    break;
                }
                sb.append(jArr[i]);
                i++;
                if (i != length) {
                    sb.append(",");
                }
            }
        } else if (objF instanceof int[]) {
            int[] iArr = (int[]) objF;
            while (true) {
                int length2 = iArr.length;
                if (i >= length2) {
                    break;
                }
                sb.append(iArr[i]);
                i++;
                if (i != length2) {
                    sb.append(",");
                }
            }
        } else if (objF instanceof double[]) {
            double[] dArr = (double[]) objF;
            while (true) {
                int length3 = dArr.length;
                if (i >= length3) {
                    break;
                }
                sb.append(dArr[i]);
                i++;
                if (i != length3) {
                    sb.append(",");
                }
            }
        } else {
            if (!(objF instanceof dhv[])) {
                return null;
            }
            dhv[] dhvVarArr = (dhv[]) objF;
            while (true) {
                int length4 = dhvVarArr.length;
                if (i >= length4) {
                    break;
                }
                sb.append(dhvVarArr[i].a);
                sb.append('/');
                sb.append(dhvVarArr[i].b);
                i++;
                if (i != length4) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    public final String toString() {
        return "(" + dhw.e[this.a] + ", data length:" + this.d.length + ")";
    }

    public dhu(int i, int i2, byte[] bArr) {
        this(i, i2, -1L, bArr);
    }
}
