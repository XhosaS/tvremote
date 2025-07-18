package com.google.common.collect;

/* compiled from: PG */
/* loaded from: classes.dex */
final class Hashing {
    private static final long C1 = -862048943;
    private static final long C2 = 461845907;
    private static final int MAX_TABLE_SIZE = 1073741824;

    private Hashing() {
    }

    static int closedTableSize(int i, double d) {
        int iMax = Math.max(i, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax <= ((int) (d * iHighestOneBit))) {
            return iHighestOneBit;
        }
        int i2 = iHighestOneBit + iHighestOneBit;
        return i2 > 0 ? i2 : MAX_TABLE_SIZE;
    }

    static boolean needsResizing(int i, int i2, double d) {
        return ((double) i) > d * ((double) i2) && i2 < MAX_TABLE_SIZE;
    }

    static int smear(int i) {
        return (int) (Integer.rotateLeft((int) (i * C1), 15) * C2);
    }

    static int smearedHash(Object obj) {
        return smear(obj == null ? 0 : obj.hashCode());
    }
}
