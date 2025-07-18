package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yxv {
    static int a(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static int b(Object obj) {
        return a(obj == null ? 0 : obj.hashCode());
    }

    static int c(int i) {
        int iMax = Math.max(i, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax <= iHighestOneBit) {
            return iHighestOneBit;
        }
        int i2 = iHighestOneBit + iHighestOneBit;
        if (i2 > 0) {
            return i2;
        }
        return 1073741824;
    }
}
