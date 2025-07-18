package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdz implements fef {
    public final long a;
    public final ira b;
    public final ira c;

    public fdz(long[] jArr, long[] jArr2, long j) {
        int length = jArr.length;
        int length2 = jArr2.length;
        a.H(length == length2);
        if (length2 <= 0 || jArr2[0] <= 0) {
            this.b = new ira(length2);
            this.c = new ira(length2);
        } else {
            int i = length2 + 1;
            ira iraVar = new ira(i);
            this.b = iraVar;
            ira iraVar2 = new ira(i);
            this.c = iraVar2;
            iraVar.b(0L);
            iraVar2.b(0L);
        }
        this.b.c(jArr);
        this.c.c(jArr2);
        this.a = j;
    }

    @Override // defpackage.fef
    public final long a() {
        return this.a;
    }

    @Override // defpackage.fef
    public final fed b(long j) {
        ira iraVar = this.c;
        if (iraVar.b == 0) {
            feg fegVar = feg.a;
            return new fed(fegVar, fegVar);
        }
        String str = edt.a;
        int i = iraVar.b - 1;
        int i2 = 0;
        int i3 = 0;
        while (i3 <= i) {
            int i4 = (i3 + i) >>> 1;
            if (iraVar.a(i4) < j) {
                i3 = i4 + 1;
            } else {
                i = i4 - 1;
            }
        }
        int i5 = i + 1;
        if (i5 < iraVar.b && iraVar.a(i5) == j) {
            i2 = i5;
        } else if (i != -1) {
            i2 = i;
        }
        long jA = iraVar.a(i2);
        ira iraVar2 = this.b;
        feg fegVar2 = new feg(jA, iraVar2.a(i2));
        if (fegVar2.b == j || i2 == iraVar.b - 1) {
            return new fed(fegVar2, fegVar2);
        }
        int i6 = i2 + 1;
        return new fed(fegVar2, new feg(iraVar.a(i6), iraVar2.a(i6)));
    }

    @Override // defpackage.fef
    public final boolean z() {
        return this.c.b > 0;
    }
}
