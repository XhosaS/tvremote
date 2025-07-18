package defpackage;

import java.io.DataInput;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aafy extends aabs {
    private static final long serialVersionUID = 7811976468055766265L;
    private final long[] a;
    private final int[] g;
    private final int[] h;
    private final String[] i;
    private final aafw j;

    private aafy(String str, long[] jArr, int[] iArr, int[] iArr2, String[] strArr, aafw aafwVar) {
        super(str);
        this.a = jArr;
        this.g = iArr;
        this.h = iArr2;
        this.i = strArr;
        this.j = aafwVar;
    }

    public static aafy c(DataInput dataInput, String str) throws IOException {
        int unsignedByte;
        int unsignedShort = dataInput.readUnsignedShort();
        String[] strArr = new String[unsignedShort];
        for (int i = 0; i < unsignedShort; i++) {
            strArr[i] = dataInput.readUTF();
        }
        int i2 = dataInput.readInt();
        long[] jArr = new long[i2];
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        String[] strArr2 = new String[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            jArr[i3] = vxr.as(dataInput);
            iArr[i3] = (int) vxr.as(dataInput);
            iArr2[i3] = (int) vxr.as(dataInput);
            if (unsignedShort < 256) {
                try {
                    unsignedByte = dataInput.readUnsignedByte();
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw new IOException("Invalid encoding");
                }
            } else {
                unsignedByte = dataInput.readUnsignedShort();
            }
            strArr2[i3] = strArr[unsignedByte];
        }
        return new aafy(str, jArr, iArr, iArr2, strArr2, dataInput.readBoolean() ? new aafw(str, (int) vxr.as(dataInput), aafz.c(dataInput), aafz.c(dataInput)) : null);
    }

    @Override // defpackage.aabs
    public final int a(long j) {
        long[] jArr = this.a;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch >= 0) {
            return this.g[iBinarySearch];
        }
        int i = ~iBinarySearch;
        if (i >= jArr.length) {
            aafw aafwVar = this.j;
            return aafwVar == null ? this.g[i - 1] : aafwVar.a(j);
        }
        if (i > 0) {
            return this.g[i - 1];
        }
        return 0;
    }

    @Override // defpackage.aabs
    public final int b(long j) {
        long[] jArr = this.a;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch >= 0) {
            return this.h[iBinarySearch];
        }
        int i = ~iBinarySearch;
        if (i >= jArr.length) {
            aafw aafwVar = this.j;
            return aafwVar == null ? this.h[i - 1] : aafwVar.a;
        }
        if (i > 0) {
            return this.h[i - 1];
        }
        return 0;
    }

    @Override // defpackage.aabs
    public final long d(long j) {
        long[] jArr = this.a;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        int i = iBinarySearch >= 0 ? iBinarySearch + 1 : ~iBinarySearch;
        int length = jArr.length;
        if (i < length) {
            return jArr[i];
        }
        aafw aafwVar = this.j;
        if (aafwVar == null) {
            return j;
        }
        long j2 = jArr[length - 1];
        if (j < j2) {
            j = j2;
        }
        return aafwVar.d(j);
    }

    @Override // defpackage.aabs
    public final long e(long j) {
        long[] jArr = this.a;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch >= 0) {
            if (j > Long.MIN_VALUE) {
                return j - 1;
            }
            return Long.MIN_VALUE;
        }
        int i = ~iBinarySearch;
        if (i >= jArr.length) {
            aafw aafwVar = this.j;
            if (aafwVar != null) {
                long jE = aafwVar.e(j);
                if (jE < j) {
                    return jE;
                }
            }
            long j2 = jArr[i - 1];
            if (j2 > Long.MIN_VALUE) {
                return j2 - 1;
            }
        } else if (i > 0) {
            long j3 = jArr[i - 1];
            if (j3 > Long.MIN_VALUE) {
                return j3 - 1;
            }
        }
        return j;
    }

    @Override // defpackage.aabs
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aafy) {
            aafy aafyVar = (aafy) obj;
            if (this.e.equals(aafyVar.e) && Arrays.equals(this.a, aafyVar.a) && Arrays.equals(this.i, aafyVar.i) && Arrays.equals(this.g, aafyVar.g) && Arrays.equals(this.h, aafyVar.h)) {
                aafw aafwVar = this.j;
                aafw aafwVar2 = aafyVar.j;
                if (aafwVar != null ? aafwVar.equals(aafwVar2) : aafwVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.aabs
    public final String g(long j) {
        long[] jArr = this.a;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch >= 0) {
            return this.i[iBinarySearch];
        }
        int i = ~iBinarySearch;
        if (i < jArr.length) {
            return i > 0 ? this.i[i - 1] : "UTC";
        }
        aafw aafwVar = this.j;
        return aafwVar == null ? this.i[i - 1] : aafwVar.g(j);
    }

    @Override // defpackage.aabs
    public final boolean h() {
        return false;
    }

    @Override // defpackage.aabs
    public final int hashCode() {
        return this.e.hashCode();
    }
}
