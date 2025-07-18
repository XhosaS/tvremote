package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fmi implements fdp {
    private boolean d;
    private boolean e;
    private boolean f;
    private long g;
    private fdr h;
    private boolean i;
    private fdf j;
    private final edo a = new edo(0);
    private final edi c = new edi(RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT);
    private final SparseArray b = new SparseArray();
    private final fmn k = new fmn(null);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    @Override // defpackage.fdp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(long r5, long r7) {
        /*
            r4 = this;
            edo r5 = r4.a
            long r0 = r5.f()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L21
            long r0 = r5.d()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 == 0) goto L24
        L21:
            r5.i(r7)
        L24:
            fdf r5 = r4.j
            r6 = 0
            if (r5 == 0) goto L2c
            r5.a(r7)
        L2c:
            r5 = r6
        L2d:
            android.util.SparseArray r7 = r4.b
            int r8 = r7.size()
            if (r5 >= r8) goto L45
            java.lang.Object r7 = r7.valueAt(r5)
            fmh r7 = (defpackage.fmh) r7
            r7.f = r6
            fln r7 = r7.a
            r7.e()
            int r5 = r5 + 1
            goto L2d
        L45:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fmi.d(long, long):void");
    }

    @Override // defpackage.fdp
    public final boolean e(fdq fdqVar) {
        byte[] bArr = new byte[14];
        fdqVar.i(bArr, 0, 14);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        fdqVar.g(bArr[13] & 7);
        fdqVar.i(bArr, 0, 3);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
    @Override // defpackage.fdp
    public final int g(fdq fdqVar, rsj rsjVar) {
        fdi fdiVar;
        long j;
        ?? r3;
        long jB;
        long j2;
        char c;
        fdi fdiVar2;
        fln flpVar;
        long j3;
        long j4;
        eci.e(this.h);
        fdi fdiVar3 = (fdi) fdqVar;
        long j5 = fdiVar3.a;
        if (j5 != -1) {
            fmn fmnVar = this.k;
            if (!fmnVar.c) {
                if (!fmnVar.e) {
                    int iMin = (int) Math.min(20000L, j5);
                    long j6 = j5 - iMin;
                    if (fdiVar3.b != j6) {
                        rsjVar.a = j6;
                        return 1;
                    }
                    edi ediVar = fmnVar.b;
                    ediVar.G(iMin);
                    fdqVar.k();
                    fdqVar.i(ediVar.a, 0, iMin);
                    int i = ediVar.b;
                    int i2 = ediVar.c - 4;
                    while (true) {
                        if (i2 < i) {
                            j4 = -9223372036854775807L;
                            break;
                        }
                        if (fmn.d(ediVar.a, i2) == 442) {
                            ediVar.K(i2 + 4);
                            long jB2 = fmn.b(ediVar);
                            if (jB2 != -9223372036854775807L) {
                                j4 = jB2;
                                break;
                            }
                        }
                        i2--;
                    }
                    fmnVar.g = j4;
                    fmnVar.e = true;
                    return 0;
                }
                if (fmnVar.g == -9223372036854775807L) {
                    fmnVar.c(fdqVar);
                    return 0;
                }
                if (fmnVar.d) {
                    long j7 = fmnVar.f;
                    if (j7 == -9223372036854775807L) {
                        fmnVar.c(fdqVar);
                        return 0;
                    }
                    edo edoVar = fmnVar.a;
                    fmnVar.h = edoVar.c(fmnVar.g) - edoVar.b(j7);
                    fmnVar.c(fdqVar);
                    return 0;
                }
                int iMin2 = (int) Math.min(20000L, j5);
                if (fdiVar3.b != 0) {
                    rsjVar.a = 0L;
                    return 1;
                }
                edi ediVar2 = fmnVar.b;
                ediVar2.G(iMin2);
                fdqVar.k();
                fdqVar.i(ediVar2.a, 0, iMin2);
                int i3 = ediVar2.b;
                int i4 = ediVar2.c;
                while (true) {
                    if (i3 >= i4 - 3) {
                        j3 = -9223372036854775807L;
                        break;
                    }
                    if (fmn.d(ediVar2.a, i3) == 442) {
                        ediVar2.K(i3 + 4);
                        long jB3 = fmn.b(ediVar2);
                        if (jB3 != -9223372036854775807L) {
                            j3 = jB3;
                            break;
                        }
                    }
                    i3++;
                }
                fmnVar.f = j3;
                fmnVar.d = true;
                return 0;
            }
        }
        if (this.i) {
            fdiVar = fdiVar3;
            j = 0;
            r3 = 1;
        } else {
            this.i = true;
            fmn fmnVar2 = this.k;
            long j8 = fmnVar2.h;
            if (j8 != -9223372036854775807L) {
                j = 0;
                fdiVar = fdiVar3;
                r3 = 1;
                fdf fdfVar = new fdf(new fda(), new fmg(fmnVar2.a), j8, j8 + 1, 0L, j5, 188L, 1000);
                this.j = fdfVar;
                this.h.r(fdfVar.a);
            } else {
                fdiVar = fdiVar3;
                j = 0;
                r3 = 1;
                this.h.r(new fee(-9223372036854775807L));
            }
        }
        fdf fdfVar2 = this.j;
        if (fdfVar2 != null && fdfVar2.b()) {
            return fdfVar2.f(fdqVar, rsjVar);
        }
        fdqVar.k();
        long jE = j5 != -1 ? j5 - fdqVar.e() : -1L;
        if (jE != -1 && jE < 4) {
            return -1;
        }
        edi ediVar3 = this.c;
        if (!fdqVar.n(ediVar3.a, 0, 4, r3)) {
            return -1;
        }
        ediVar3.K(0);
        int iE = ediVar3.e();
        if (iE == 441) {
            return -1;
        }
        if (iE == 442) {
            fdqVar.i(ediVar3.a, 0, 10);
            ediVar3.K(9);
            fdqVar.l((ediVar3.j() & 7) + 14);
            return 0;
        }
        if (iE == 443) {
            fdqVar.i(ediVar3.a, 0, 2);
            ediVar3.K(0);
            fdqVar.l(ediVar3.n() + 6);
            return 0;
        }
        if ((iE >> 8) != r3) {
            fdqVar.l(r3);
            return 0;
        }
        int i5 = iE & 255;
        SparseArray sparseArray = this.b;
        fmh fmhVar = (fmh) sparseArray.get(i5);
        if (!this.d) {
            if (fmhVar == null) {
                if (i5 == 189) {
                    flpVar = new flg("video/mp2p");
                    this.e = r3;
                    fdiVar2 = fdiVar;
                    this.g = fdiVar2.b;
                } else {
                    fdiVar2 = fdiVar;
                    if ((iE & 224) == 192) {
                        flpVar = new fma(null, 0, "video/mp2p");
                        this.e = r3;
                        this.g = fdiVar2.b;
                    } else if ((iE & 240) == 224) {
                        flpVar = new flp(null, "video/mp2p");
                        this.f = r3;
                        this.g = fdiVar2.b;
                    } else {
                        flpVar = null;
                    }
                }
                if (flpVar != null) {
                    flpVar.b(this.h, new fmr(i5, 256));
                    fmhVar = new fmh(flpVar, this.a);
                    sparseArray.put(i5, fmhVar);
                }
            } else {
                fdiVar2 = fdiVar;
            }
            long j9 = 1048576;
            if (this.e && this.f) {
                j9 = this.g + 8192;
            }
            if (fdiVar2.b > j9) {
                this.d = r3;
                this.h.j();
            }
        }
        fdqVar.i(ediVar3.a, 0, 2);
        ediVar3.K(0);
        int iN = ediVar3.n() + 6;
        if (fmhVar == null) {
            fdqVar.l(iN);
            return 0;
        }
        ediVar3.G(iN);
        fdqVar.j(ediVar3.a, 0, iN);
        ediVar3.K(6);
        edh edhVar = fmhVar.c;
        ediVar3.F((byte[]) edhVar.c, 0, 3);
        edhVar.l(0);
        edhVar.n(8);
        fmhVar.d = edhVar.p();
        fmhVar.e = edhVar.p();
        edhVar.n(6);
        ediVar3.F((byte[]) edhVar.c, 0, edhVar.d(8));
        edhVar.l(0);
        if (fmhVar.d) {
            edhVar.n(4);
            long jD = edhVar.d(3);
            edhVar.n(r3);
            int iD = edhVar.d(15) << 15;
            edhVar.n(r3);
            long jD2 = edhVar.d(15);
            edhVar.n(r3);
            if (fmhVar.f || !fmhVar.e) {
                j2 = jD;
                c = 30;
            } else {
                edhVar.n(4);
                c = 30;
                edhVar.n(r3);
                int iD2 = edhVar.d(15) << 15;
                edhVar.n(r3);
                j2 = jD;
                long jD3 = edhVar.d(15);
                edhVar.n(r3);
                fmhVar.b.b(iD2 | (edhVar.d(3) << 30) | jD3);
                fmhVar.f = r3;
            }
            jB = fmhVar.b.b((j2 << c) | iD | jD2);
        } else {
            jB = j;
        }
        fln flnVar = fmhVar.a;
        flnVar.d(jB, 4);
        flnVar.a(ediVar3);
        flnVar.c(false);
        ediVar3.J(ediVar3.b());
        return 0;
    }

    @Override // defpackage.fdp
    public final /* synthetic */ List x() {
        return ImmutableList.of();
    }

    @Override // defpackage.fdp
    public final void y(fdr fdrVar) {
        this.h = fdrVar;
    }

    @Override // defpackage.fdp
    public final void c() {
    }

    @Override // defpackage.fdp
    public final /* synthetic */ void f() {
    }
}
