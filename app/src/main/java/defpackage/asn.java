package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public class asn {
    public final int a;
    public final int b;
    public final long c;
    public final byte[] d;

    public asn(int i, int i2, long j, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = bArr;
    }

    public static asn b(String str) {
        byte[] bytes = (str + (char) 0).getBytes(asr.i);
        return new asn(2, bytes.length, -1L, bytes);
    }

    public static asn c(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[asr.f[4]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putInt((int) jArr[0]);
        return new asn(4, 1, -1L, byteBufferWrap.array());
    }

    public static asn d(asp aspVar, ByteOrder byteOrder) {
        asp[] aspVarArr = {aspVar};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[asr.f[5]]);
        byteBufferWrap.order(byteOrder);
        asp aspVar2 = aspVarArr[0];
        byteBufferWrap.putInt((int) aspVar2.a);
        byteBufferWrap.putInt((int) aspVar2.b);
        return new asn(5, 1, -1L, byteBufferWrap.array());
    }

    public static asn e(int i, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[asr.f[3]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putShort((short) new int[]{i}[0]);
        return new asn(3, 1, -1L, byteBufferWrap.array());
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
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0146: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:327), block:B:94:0x0146 */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0149 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v10, types: [long[]] */
    /* JADX WARN: Type inference failed for: r5v11, types: [asp[]] */
    /* JADX WARN: Type inference failed for: r5v12, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v13, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v14, types: [asp[]] */
    /* JADX WARN: Type inference failed for: r5v15, types: [double[]] */
    /* JADX WARN: Type inference failed for: r5v17, types: [double[]] */
    /* JADX WARN: Type inference failed for: r5v9, types: [int[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.lang.Object f(java.nio.ByteOrder r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asn.f(java.nio.ByteOrder):java.lang.Object");
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
            if (!(objF instanceof asp[])) {
                return null;
            }
            asp[] aspVarArr = (asp[]) objF;
            while (true) {
                int length4 = aspVarArr.length;
                if (i >= length4) {
                    break;
                }
                sb.append(aspVarArr[i].a);
                sb.append('/');
                sb.append(aspVarArr[i].b);
                i++;
                if (i != length4) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    public final String toString() {
        return "(" + asr.e[this.a] + ", data length:" + this.d.length + ")";
    }
}
