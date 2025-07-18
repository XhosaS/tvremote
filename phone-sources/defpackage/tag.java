package defpackage;

import android.util.StateSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tag {
    public int a;
    public ulp c;
    int[][] b = new int[10][];
    public ulp[] d = new ulp[10];

    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.tag b(android.content.Context r17, android.content.res.TypedArray r18) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tag.b(android.content.Context, android.content.res.TypedArray):tag");
    }

    public final int a(int[] iArr) {
        int[][] iArr2 = this.b;
        for (int i = 0; i < this.a; i++) {
            if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                return i;
            }
        }
        return -1;
    }
}
