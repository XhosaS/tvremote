package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class emc extends ebv {
    public int[] e;
    private int[] f;

    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e9  */
    @Override // defpackage.ebu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.nio.ByteBuffer r15) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.emc.e(java.nio.ByteBuffer):void");
    }

    @Override // defpackage.ebv
    public final ebs i(ebs ebsVar) throws ebt {
        int[] iArr = this.e;
        if (iArr == null) {
            return ebs.a;
        }
        int i = ebsVar.d;
        if (!edt.ak(i)) {
            throw new ebt(ebsVar);
        }
        int i2 = ebsVar.c;
        boolean z = i2 != iArr.length;
        int i3 = 0;
        while (true) {
            int length = iArr.length;
            if (i3 >= length) {
                return z ? new ebs(ebsVar.b, length, i) : ebs.a;
            }
            int i4 = iArr[i3];
            if (i4 >= i2) {
                throw new ebt("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", ebsVar);
            }
            z |= i4 != i3;
            i3++;
        }
    }

    @Override // defpackage.ebv
    protected final void k() {
        this.f = this.e;
    }

    @Override // defpackage.ebv
    protected final void m() {
        this.f = null;
        this.e = null;
    }
}
