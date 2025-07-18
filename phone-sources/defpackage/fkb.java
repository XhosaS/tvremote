package defpackage;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fkb implements fji {
    private final edi a = new edi();
    private final edi b = new edi();
    private final fka c = new fka();
    private Inflater d;

    @Override // defpackage.fji
    public final int a() {
        return 2;
    }

    @Override // defpackage.fji
    public final /* synthetic */ fix b(byte[] bArr, int i, int i2) {
        return fki.a(this, bArr, i2);
    }

    @Override // defpackage.fji
    public final void c(byte[] bArr, int i, int i2, fjh fjhVar, ecq ecqVar) {
        eca ecaVarA;
        edi ediVar;
        int i3;
        int i4;
        edi ediVar2;
        int i5;
        int i6;
        int iL;
        edi ediVar3 = this.a;
        ediVar3.I(bArr, i + i2);
        ediVar3.K(i);
        if (this.d == null) {
            this.d = new Inflater();
        }
        edi ediVar4 = this.b;
        if (edt.ao(ediVar3, ediVar4, this.d)) {
            ediVar3.I(ediVar4.a, ediVar4.c);
        }
        fka fkaVar = this.c;
        fkaVar.a();
        ArrayList arrayList = new ArrayList();
        while (ediVar3.a() >= 3) {
            int i7 = ediVar3.c;
            int iJ = ediVar3.j();
            int iN = ediVar3.n();
            int i8 = ediVar3.b + iN;
            if (i8 > i7) {
                ediVar3.K(i7);
                ecaVarA = null;
            } else {
                if (iJ != 128) {
                    switch (iJ) {
                        case 20:
                            if (iN % 5 == 2) {
                                ediVar3.L(2);
                                int[] iArr = fkaVar.b;
                                Arrays.fill(iArr, 0);
                                int i9 = iN / 5;
                                int i10 = 0;
                                while (i10 < i9) {
                                    int iJ2 = ediVar3.j();
                                    int iJ3 = ediVar3.j();
                                    int iJ4 = ediVar3.j();
                                    double d = iJ3;
                                    double d2 = iJ4 - 128;
                                    int i11 = i9;
                                    double dJ = ediVar3.j() - 128;
                                    iArr[iJ2] = (edt.d((int) (d + (1.402d * d2)), 0, 255) << 16) | (ediVar3.j() << 24) | (edt.d((int) ((d - (0.34414d * dJ)) - (d2 * 0.71414d)), 0, 255) << 8) | edt.d((int) (d + (dJ * 1.772d)), 0, 255);
                                    i10++;
                                    i9 = i11;
                                    i8 = i8;
                                }
                                fkaVar.c = true;
                                break;
                            }
                            break;
                        case 21:
                            if (iN >= 4) {
                                ediVar3.L(3);
                                int i12 = iN - 4;
                                if ((128 & ediVar3.j()) == 0) {
                                    ediVar2 = fkaVar.a;
                                    i5 = ediVar2.b;
                                    i6 = ediVar2.c;
                                    if (i5 < i6 && i12 > 0) {
                                        int iMin = Math.min(i12, i6 - i5);
                                        ediVar3.F(ediVar2.a, i5, iMin);
                                        ediVar2.K(i5 + iMin);
                                        break;
                                    }
                                } else if (i12 >= 7 && (iL = ediVar3.l()) >= 4) {
                                    fkaVar.h = ediVar3.n();
                                    fkaVar.i = ediVar3.n();
                                    fkaVar.a.G(iL - 4);
                                    i12 = iN - 11;
                                    ediVar2 = fkaVar.a;
                                    i5 = ediVar2.b;
                                    i6 = ediVar2.c;
                                    if (i5 < i6) {
                                        int iMin2 = Math.min(i12, i6 - i5);
                                        ediVar3.F(ediVar2.a, i5, iMin2);
                                        ediVar2.K(i5 + iMin2);
                                    }
                                }
                            }
                            break;
                        case 22:
                            if (iN >= 19) {
                                fkaVar.d = ediVar3.n();
                                fkaVar.e = ediVar3.n();
                                ediVar3.L(11);
                                fkaVar.f = ediVar3.n();
                                fkaVar.g = ediVar3.n();
                                break;
                            }
                            break;
                    }
                    ecaVarA = null;
                } else {
                    if (fkaVar.d == 0 || fkaVar.e == 0 || fkaVar.h == 0 || fkaVar.i == 0 || (i3 = (ediVar = fkaVar.a).c) == 0 || ediVar.b != i3 || !fkaVar.c) {
                        ecaVarA = null;
                    } else {
                        ediVar.K(0);
                        int i13 = fkaVar.h * fkaVar.i;
                        int[] iArr2 = new int[i13];
                        int i14 = 0;
                        while (i14 < i13) {
                            int iJ5 = ediVar.j();
                            if (iJ5 != 0) {
                                i4 = i14 + 1;
                                iArr2[i14] = fkaVar.b[iJ5];
                            } else {
                                int iJ6 = ediVar.j();
                                if (iJ6 != 0) {
                                    int iJ7 = iJ6 & 63;
                                    if ((iJ6 & 64) != 0) {
                                        iJ7 = (iJ7 << 8) | ediVar.j();
                                    }
                                    i4 = iJ7 + i14;
                                    Arrays.fill(iArr2, i14, i4, (iJ6 & 128) == 0 ? fkaVar.b[0] : fkaVar.b[ediVar.j()]);
                                }
                            }
                            i14 = i4;
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr2, fkaVar.h, fkaVar.i, Bitmap.Config.ARGB_8888);
                        ebz ebzVar = new ebz();
                        ebzVar.c(bitmapCreateBitmap);
                        ebzVar.e = fkaVar.f / fkaVar.d;
                        ebzVar.f = 0;
                        ebzVar.d(fkaVar.g / fkaVar.e, 0);
                        ebzVar.d = 0;
                        ebzVar.g = fkaVar.h / fkaVar.d;
                        ebzVar.h = fkaVar.i / fkaVar.e;
                        ecaVarA = ebzVar.a();
                    }
                    fkaVar.a();
                    i8 = i8;
                }
                ediVar3.K(i8);
            }
            if (ecaVarA != null) {
                arrayList.add(ecaVarA);
            }
        }
        ecqVar.a(new fit(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // defpackage.fji
    public final /* synthetic */ void d() {
    }
}
