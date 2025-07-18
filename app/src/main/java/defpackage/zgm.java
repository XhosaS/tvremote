package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zgm extends zgo {
    public final int[] a;
    public final int b;
    private final zfx c;
    private final zfx d;

    public zgm(zfx zfxVar, zfx zfxVar2) {
        int iH;
        this.c = zfxVar;
        this.d = zfxVar2;
        int iA = zfxVar2.a();
        int i = 0;
        ziu.a(iA <= 28, "metadata size too large");
        int[] iArr = new int[iA];
        this.a = iArr;
        long j = 0;
        int i2 = 0;
        while (i < iArr.length) {
            zer zerVarE = e(i);
            long j2 = zerVarE.e | j;
            if (j2 != j || (iH = h(zerVarE, iArr, i2)) == -1) {
                iArr[i2] = i;
                i2++;
            } else {
                iArr[iH] = zerVarE.c ? iArr[iH] | (1 << (i + 4)) : i;
            }
            i++;
            j = j2;
        }
        this.b = i2;
    }

    private final int h(zer zerVar, int[] iArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (zerVar.equals(e(iArr[i2] & 31))) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.zgo
    public final int a() {
        return this.b;
    }

    @Override // defpackage.zgo
    public final Object b(zer zerVar) {
        ziu.a(!zerVar.c, "key must be single valued");
        int[] iArr = this.a;
        int iH = h(zerVar, iArr, this.b);
        if (iH < 0) {
            return null;
        }
        return zerVar.b.cast(f(iArr[iH]));
    }

    @Override // defpackage.zgo
    public final Set c() {
        return new zgk(this);
    }

    @Override // defpackage.zgo
    public final void d(zge zgeVar, Object obj) {
        for (int i = 0; i < this.b; i++) {
            int i2 = this.a[i];
            zer zerVarE = e(i2 & 31);
            if (zerVarE.c) {
                zgeVar.b(zerVarE, new zgl(this, zerVarE, i2), obj);
            } else {
                zgeVar.a(zerVarE, zerVarE.b.cast(f(i2)), obj);
            }
        }
    }

    public final zer e(int i) {
        return (i >= 0 ? this.d : this.c).b(i);
    }

    public final Object f(int i) {
        return (i >= 0 ? this.d : this.c).d(i);
    }
}
