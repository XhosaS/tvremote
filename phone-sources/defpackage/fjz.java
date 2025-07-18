package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fjz implements fji {
    private static final byte[] a = {0, 7, 8, 15};
    private static final byte[] b = {0, 119, -120, -1};
    private static final byte[] c = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint d;
    private final Paint e;
    private final Canvas f;
    private final fjy g;
    private Bitmap h;
    private final fkc i;
    private final rld j;

    public fjz(List list) {
        edi ediVar = new edi((byte[]) list.get(0));
        int iN = ediVar.n();
        int iN2 = ediVar.n();
        Paint paint = new Paint();
        this.d = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.e = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f = new Canvas();
        this.i = new fkc(719, 575, 0, 719, 0, 575, null);
        this.j = new rld(0, h(), i(), j());
        this.g = new fjy(iN, iN2);
    }

    private static int e(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0202 A[LOOP:3: B:88:0x0164->B:119:0x0202, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void f(byte[] r22, int[] r23, int r24, int r25, int r26, android.graphics.Paint r27, android.graphics.Canvas r28) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fjz.f(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    private static byte[] g(int i, int i2, edh edhVar) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) edhVar.d(i2);
        }
        return bArr;
    }

    private static int[] h() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] i() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            int i2 = i & 4;
            int i3 = i & 2;
            int i4 = i & 1;
            if (i < 8) {
                iArr[i] = e(255, 1 != i4 ? 0 : 255, i3 != 0 ? 255 : 0, i2 != 0 ? 255 : 0);
            } else {
                iArr[i] = e(255, 1 != i4 ? 0 : 127, i3 != 0 ? 127 : 0, i2 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] j() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = e(63, 1 != (i & 1) ? 0 : 255, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i2 = i & 136;
                if (i2 == 0) {
                    iArr[i] = e(255, (1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 8) {
                    iArr[i] = e(127, (1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 128) {
                    iArr[i] = e(255, (1 != (i & 1) ? 0 : 43) + 127 + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + 127 + ((i & 64) == 0 ? 0 : 85));
                } else if (i2 == 136) {
                    iArr[i] = e(255, (1 != (i & 1) ? 0 : 43) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static rld k(edh edhVar, int i) {
        int iD;
        int iD2;
        int iD3;
        int iD4;
        edh edhVar2 = edhVar;
        int i2 = 8;
        int iD5 = edhVar2.d(8);
        edhVar2.n(8);
        int[] iArrH = h();
        int[] iArrI = i();
        int[] iArrJ = j();
        int i3 = i - 2;
        while (i3 > 0) {
            int iD6 = edhVar2.d(i2);
            int iD7 = edhVar2.d(i2);
            int[] iArr = (iD7 & 128) != 0 ? iArrH : (iD7 & 64) != 0 ? iArrI : iArrJ;
            if ((iD7 & 1) != 0) {
                iD3 = edhVar2.d(i2);
                iD4 = edhVar2.d(i2);
                iD = edhVar2.d(i2);
                iD2 = edhVar2.d(i2);
                i3 -= 6;
            } else {
                int iD8 = edhVar2.d(6) << 2;
                int iD9 = edhVar2.d(4) << 4;
                i3 -= 4;
                iD = edhVar2.d(4) << 4;
                iD2 = edhVar2.d(2) << 6;
                iD3 = iD8;
                iD4 = iD9;
            }
            if (iD3 == 0) {
                iD2 = 255;
            }
            if (iD3 == 0) {
                iD = 0;
            }
            if (iD3 == 0) {
                iD4 = 0;
            }
            double d = iD3;
            double d2 = iD4 - 128;
            double d3 = iD - 128;
            iArr[iD6] = e((byte) (255 - (iD2 & 255)), edt.d((int) (d + (1.402d * d2)), 0, 255), edt.d((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), edt.d((int) (d + (d3 * 1.772d)), 0, 255));
            edhVar2 = edhVar;
            iD5 = iD5;
            i2 = 8;
        }
        return new rld(iD5, iArrH, iArrI, iArrJ);
    }

    private static obk l(edh edhVar) {
        byte[] bArr;
        int iD = edhVar.d(16);
        edhVar.n(4);
        int iD2 = edhVar.d(2);
        boolean zP = edhVar.p();
        edhVar.n(1);
        byte[] bArr2 = edt.b;
        if (iD2 != 1) {
            if (iD2 == 0) {
                int iD3 = edhVar.d(16);
                int iD4 = edhVar.d(16);
                if (iD3 > 0) {
                    bArr2 = new byte[iD3];
                    edhVar.r(bArr2, iD3);
                }
                if (iD4 > 0) {
                    bArr = new byte[iD4];
                    edhVar.r(bArr, iD4);
                }
            }
            return new obk(iD, zP, bArr2, bArr);
        }
        edhVar.n(edhVar.d(8) * 16);
        bArr = bArr2;
        return new obk(iD, zP, bArr2, bArr);
    }

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
        boolean z;
        fit fitVar;
        Canvas canvas;
        char c2;
        char c3;
        char c4;
        int i3;
        fjy fjyVar;
        Canvas canvas2;
        int i4;
        int i5;
        int i6;
        fjx fjxVar;
        int iD;
        int iD2;
        int i7;
        int iD3;
        edh edhVar = new edh(bArr, i + i2);
        edhVar.l(i);
        while (true) {
            z = true;
            if (edhVar.a() >= 48 && edhVar.d(8) == 15) {
                fjy fjyVar2 = this.g;
                int iD4 = edhVar.d(8);
                int i8 = 16;
                int iD5 = edhVar.d(16);
                int iD6 = edhVar.d(16);
                int iB = edhVar.b() + iD6;
                if (iD6 * 8 > edhVar.a()) {
                    edb.e("DvbParser", "Data field length exceeds limit");
                    edhVar.n(edhVar.a());
                } else {
                    switch (iD4) {
                        case 16:
                            if (iD5 == fjyVar2.a) {
                                gb gbVar = fjyVar2.i;
                                edhVar.d(8);
                                int iD7 = edhVar.d(4);
                                int iD8 = edhVar.d(2);
                                edhVar.n(2);
                                SparseArray sparseArray = new SparseArray();
                                for (int i9 = iD6 - 2; i9 > 0; i9 -= 6) {
                                    int iD9 = edhVar.d(8);
                                    edhVar.n(8);
                                    sparseArray.put(iD9, new fkm(edhVar.d(16), edhVar.d(16), null));
                                }
                                gb gbVar2 = new gb(iD7, iD8, sparseArray, (byte[]) null);
                                if (gbVar2.b != 0) {
                                    fjyVar2.i = gbVar2;
                                    fjyVar2.c.clear();
                                    fjyVar2.d.clear();
                                    fjyVar2.e.clear();
                                    break;
                                } else if (gbVar != null) {
                                    if (gbVar.a != gbVar2.a) {
                                        fjyVar2.i = gbVar2;
                                        break;
                                    }
                                }
                            }
                            break;
                        case 17:
                            gb gbVar3 = fjyVar2.i;
                            if (iD5 == fjyVar2.a && gbVar3 != null) {
                                int iD10 = edhVar.d(8);
                                edhVar.n(4);
                                boolean zP = edhVar.p();
                                edhVar.n(3);
                                int iD11 = edhVar.d(16);
                                int iD12 = edhVar.d(16);
                                edhVar.d(3);
                                int iD13 = edhVar.d(3);
                                edhVar.n(2);
                                int iD14 = edhVar.d(8);
                                int iD15 = edhVar.d(8);
                                int iD16 = edhVar.d(4);
                                int iD17 = edhVar.d(2);
                                edhVar.n(2);
                                int i10 = iD6 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i10 > 0) {
                                    int iD18 = edhVar.d(i8);
                                    int iD19 = edhVar.d(2);
                                    edhVar.d(2);
                                    int iD20 = edhVar.d(12);
                                    edhVar.n(4);
                                    int iD21 = edhVar.d(12);
                                    int i11 = i10 - 6;
                                    if (iD19 == 1 || iD19 == 2) {
                                        edhVar.d(8);
                                        edhVar.d(8);
                                        i10 -= 8;
                                    } else {
                                        i10 = i11;
                                    }
                                    sparseArray2.put(iD18, new fkm(iD20, iD21, null));
                                    i8 = 16;
                                }
                                fjx fjxVar2 = new fjx(iD10, zP, iD11, iD12, iD13, iD14, iD15, iD16, iD17, sparseArray2);
                                if (gbVar3.b == 0 && (fjxVar = (fjx) fjyVar2.c.get(fjxVar2.a)) != null) {
                                    int i12 = 0;
                                    while (true) {
                                        SparseArray sparseArray3 = fjxVar.j;
                                        if (i12 < sparseArray3.size()) {
                                            fjxVar2.j.put(sparseArray3.keyAt(i12), (fkm) sparseArray3.valueAt(i12));
                                            i12++;
                                        }
                                    }
                                }
                                fjyVar2.c.put(fjxVar2.a, fjxVar2);
                                break;
                            }
                            break;
                        case 18:
                            if (iD5 == fjyVar2.a) {
                                rld rldVarK = k(edhVar, iD6);
                                fjyVar2.d.put(rldVarK.a, rldVarK);
                                break;
                            } else if (iD5 == fjyVar2.b) {
                                rld rldVarK2 = k(edhVar, iD6);
                                fjyVar2.f.put(rldVarK2.a, rldVarK2);
                                break;
                            }
                            break;
                        case 19:
                            if (iD5 == fjyVar2.a) {
                                obk obkVarL = l(edhVar);
                                fjyVar2.e.put(obkVarL.a, obkVarL);
                                break;
                            } else if (iD5 == fjyVar2.b) {
                                obk obkVarL2 = l(edhVar);
                                fjyVar2.g.put(obkVarL2.a, obkVarL2);
                                break;
                            }
                            break;
                        case 20:
                            if (iD5 == fjyVar2.a) {
                                edhVar.n(4);
                                boolean zP2 = edhVar.p();
                                edhVar.n(3);
                                int iD22 = edhVar.d(16);
                                int iD23 = edhVar.d(16);
                                if (zP2) {
                                    int iD24 = edhVar.d(16);
                                    iD = edhVar.d(16);
                                    iD3 = edhVar.d(16);
                                    iD2 = edhVar.d(16);
                                    i7 = iD24;
                                } else {
                                    iD = iD22;
                                    iD2 = iD23;
                                    i7 = 0;
                                    iD3 = 0;
                                }
                                fjyVar2.h = new fkc(iD22, iD23, i7, iD, iD3, iD2, null);
                                break;
                            }
                            break;
                    }
                    edhVar.o(iB - edhVar.b());
                }
            }
        }
        fjy fjyVar3 = this.g;
        gb gbVar4 = fjyVar3.i;
        if (gbVar4 == null) {
            fitVar = new fit(ImmutableList.of(), -9223372036854775807L, -9223372036854775807L);
        } else {
            fkc fkcVar = fjyVar3.h;
            if (fkcVar == null) {
                fkcVar = this.i;
            }
            Bitmap bitmap = this.h;
            if (bitmap == null || fkcVar.e + 1 != bitmap.getWidth() || fkcVar.c + 1 != this.h.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(fkcVar.e + 1, fkcVar.c + 1, Bitmap.Config.ARGB_8888);
                this.h = bitmapCreateBitmap;
                this.f.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            Object obj = gbVar4.c;
            int i13 = 0;
            while (true) {
                SparseArray sparseArray4 = (SparseArray) obj;
                if (i13 < sparseArray4.size()) {
                    Canvas canvas3 = this.f;
                    canvas3.save();
                    fkm fkmVar = (fkm) sparseArray4.valueAt(i13);
                    fjx fjxVar3 = (fjx) fjyVar3.c.get(sparseArray4.keyAt(i13));
                    int i14 = fkmVar.b + fkcVar.f;
                    int i15 = fkmVar.a + fkcVar.d;
                    int i16 = fjxVar3.c;
                    int i17 = i14 + i16;
                    int iMin = Math.min(i17, fkcVar.a);
                    boolean z2 = z;
                    int i18 = fjxVar3.d;
                    int i19 = i15 + i18;
                    canvas3.clipRect(i14, i15, iMin, Math.min(i19, fkcVar.b));
                    SparseArray sparseArray5 = fjyVar3.d;
                    int i20 = fjxVar3.f;
                    rld rldVar = (rld) sparseArray5.get(i20);
                    if (rldVar == null && (rldVar = (rld) fjyVar3.f.get(i20)) == null) {
                        rldVar = this.j;
                    }
                    SparseArray sparseArray6 = fjxVar3.j;
                    Object obj2 = obj;
                    int i21 = i13;
                    int i22 = 0;
                    while (i22 < sparseArray6.size()) {
                        int iKeyAt = sparseArray6.keyAt(i22);
                        int i23 = i22;
                        fkm fkmVar2 = (fkm) sparseArray6.valueAt(i22);
                        SparseArray sparseArray7 = sparseArray6;
                        obk obkVar = (obk) fjyVar3.e.get(iKeyAt);
                        if (obkVar == null) {
                            obkVar = (obk) fjyVar3.g.get(iKeyAt);
                        }
                        if (obkVar != null) {
                            Paint paint = obkVar.b ? null : this.d;
                            i5 = i16;
                            int i24 = fjxVar3.e;
                            fjyVar = fjyVar3;
                            int i25 = fkmVar2.b + i14;
                            int i26 = i15 + fkmVar2.a;
                            int[] iArr = (int[]) (i24 == 3 ? rldVar.b : i24 == 2 ? rldVar.c : rldVar.d);
                            i4 = i14;
                            i6 = i17;
                            canvas2 = canvas3;
                            f((byte[]) obkVar.d, iArr, i24, i25, i26, paint, canvas2);
                            f((byte[]) obkVar.c, iArr, i24, i25, i26 + 1, paint, canvas2);
                        } else {
                            fjyVar = fjyVar3;
                            canvas2 = canvas3;
                            i4 = i14;
                            i5 = i16;
                            i6 = i17;
                        }
                        i14 = i4;
                        i17 = i6;
                        i22 = i23 + 1;
                        i16 = i5;
                        canvas3 = canvas2;
                        sparseArray6 = sparseArray7;
                        fjyVar3 = fjyVar;
                    }
                    fjy fjyVar4 = fjyVar3;
                    Canvas canvas4 = canvas3;
                    int i27 = i14;
                    int i28 = i16;
                    int i29 = i17;
                    float f = i15;
                    float f2 = i27;
                    if (fjxVar3.b) {
                        int i30 = fjxVar3.e;
                        if (i30 == 3) {
                            i3 = ((int[]) rldVar.b)[fjxVar3.g];
                            c4 = 2;
                        } else {
                            c4 = 2;
                            i3 = i30 == 2 ? ((int[]) rldVar.c)[fjxVar3.h] : ((int[]) rldVar.d)[fjxVar3.i];
                        }
                        Paint paint2 = this.e;
                        paint2.setColor(i3);
                        float f3 = i29;
                        c2 = c4;
                        c3 = 3;
                        canvas = canvas4;
                        canvas.drawRect(f2, f, f3, i19, paint2);
                    } else {
                        canvas = canvas4;
                        c2 = 2;
                        c3 = 3;
                    }
                    ebz ebzVar = new ebz();
                    ebzVar.c(Bitmap.createBitmap(this.h, i27, i15, i28, i18));
                    float f4 = fkcVar.e;
                    ebzVar.e = f2 / f4;
                    ebzVar.f = 0;
                    float f5 = fkcVar.c;
                    ebzVar.d(f / f5, 0);
                    ebzVar.d = 0;
                    ebzVar.g = i28 / f4;
                    ebzVar.h = i18 / f5;
                    arrayList.add(ebzVar.a());
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    canvas.restore();
                    i13 = i21 + 1;
                    z = z2;
                    obj = obj2;
                    fjyVar3 = fjyVar4;
                } else {
                    fitVar = new fit(arrayList, -9223372036854775807L, -9223372036854775807L);
                }
            }
        }
        ecqVar.a(fitVar);
    }

    @Override // defpackage.fji
    public final void d() {
        fjy fjyVar = this.g;
        fjyVar.c.clear();
        fjyVar.d.clear();
        fjyVar.e.clear();
        fjyVar.f.clear();
        fjyVar.g.clear();
        fjyVar.h = null;
        fjyVar.i = null;
    }
}
