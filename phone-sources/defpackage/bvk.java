package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bvk implements bvu {
    final /* synthetic */ bvp a;
    final /* synthetic */ int b;
    final /* synthetic */ bvu c;
    private final /* synthetic */ bvu d;
    private final /* synthetic */ int e;

    public bvk(bvu bvuVar, bvp bvpVar, int i, bvu bvuVar2, int i2) {
        this.e = i2;
        this.a = bvpVar;
        this.b = i;
        this.c = bvuVar2;
        this.d = bvuVar;
    }

    @Override // defpackage.bvu
    public final int a() {
        return this.e != 0 ? this.d.a() : this.d.a();
    }

    @Override // defpackage.bvu
    public final int b() {
        return this.e != 0 ? this.d.b() : this.d.b();
    }

    @Override // defpackage.bvu
    public final Map e() {
        return this.e != 0 ? this.d.e() : this.d.e();
    }

    @Override // defpackage.bvu
    public final void f() {
        int i;
        if (this.e == 0) {
            int i2 = this.b;
            bvp bvpVar = this.a;
            bvpVar.d = i2;
            this.c.f();
            bvpVar.h(bvpVar.d);
            return;
        }
        int i3 = this.b;
        bvp bvpVar2 = this.a;
        bvpVar2.e = i3;
        this.c.f();
        ki kiVar = bvpVar2.o;
        long[] jArr = kiVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            long j = jArr[i4];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = i4 - length;
                int i6 = 0;
                while (true) {
                    i = 8 - ((~i5) >>> 31);
                    if (i6 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        int i7 = (i4 << 3) + i6;
                        Object obj = kiVar.b[i7];
                        bwv bwvVar = (bwv) kiVar.c[i7];
                        int iA = bvpVar2.h.a(obj);
                        if (iA < 0 || iA >= bvpVar2.e) {
                            bwvVar.b();
                            kiVar.h(i7);
                        }
                    }
                    j >>= 8;
                    i6++;
                }
                if (i != 8) {
                    return;
                }
            }
            if (i4 == length) {
                return;
            } else {
                i4++;
            }
        }
    }

    @Override // defpackage.bvu
    public final void g() {
        if (this.e != 0) {
            this.d.g();
        } else {
            this.d.g();
        }
    }
}
