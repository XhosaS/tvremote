package defpackage;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fmp implements fmj {
    final /* synthetic */ fmq a;
    private final edh b = new edh(new byte[5]);
    private final SparseArray c = new SparseArray();
    private final SparseIntArray d = new SparseIntArray();
    private final int e;

    public fmp(fmq fmqVar, int i) {
        this.a = fmqVar;
        this.e = i;
    }

    @Override // defpackage.fmj
    public final void a(edi ediVar) {
        char c;
        edh edhVar;
        int i;
        int i2;
        if (ediVar.j() == 2) {
            fmq fmqVar = this.a;
            int i3 = fmqVar.a;
            if (i3 != 1) {
                i3 = 2;
            }
            edo edoVar = (edo) fmqVar.b.get(0);
            if ((ediVar.j() & 128) != 0) {
                ediVar.L(1);
                int iN = ediVar.n();
                int i4 = 3;
                ediVar.L(3);
                edh edhVar2 = this.b;
                ediVar.E(edhVar2, 2);
                edhVar2.n(3);
                int i5 = 13;
                fmqVar.j = edhVar2.d(13);
                ediVar.E(edhVar2, 2);
                int i6 = 4;
                edhVar2.n(4);
                int i7 = 12;
                ediVar.L(edhVar2.d(12));
                if (i3 == 2 && fmqVar.i == null) {
                    fmqVar.i = fmqVar.k.j(21, new maj(21, null, 0, null, edt.b));
                    fms fmsVar = fmqVar.i;
                    if (fmsVar != null) {
                        fmsVar.b(edoVar, fmqVar.f, new fmr(iN, 21, 8192));
                    }
                }
                SparseArray sparseArray = this.c;
                sparseArray.clear();
                SparseIntArray sparseIntArray = this.d;
                sparseIntArray.clear();
                int iA = ediVar.a();
                while (iA > 0) {
                    ediVar.E(edhVar2, 5);
                    int iD = edhVar2.d(8);
                    edhVar2.n(i4);
                    int iD2 = edhVar2.d(i5);
                    edhVar2.n(i6);
                    int iD3 = edhVar2.d(i7);
                    int i8 = ediVar.b;
                    int i9 = i8 + iD3;
                    String str = null;
                    ArrayList arrayList = null;
                    int i10 = -1;
                    int iJ = 0;
                    while (ediVar.b < i9) {
                        int iJ2 = ediVar.j();
                        int iJ3 = ediVar.b + ediVar.j();
                        if (iJ3 > i9) {
                            break;
                        }
                        int i11 = iA;
                        if (iJ2 == 5) {
                            long jR = ediVar.r();
                            if (jR != 1094921523) {
                                if (jR != 1161904947) {
                                    if (jR != 1094921524) {
                                        if (jR == 1212503619) {
                                            i2 = 36;
                                            i10 = i2;
                                        }
                                        edhVar = edhVar2;
                                        i = iJ3;
                                    }
                                    edhVar = edhVar2;
                                    i = iJ3;
                                    i10 = 172;
                                }
                                edhVar = edhVar2;
                                i = iJ3;
                                i10 = 135;
                            }
                            edhVar = edhVar2;
                            i = iJ3;
                            i10 = 129;
                        } else {
                            if (iJ2 != 106) {
                                if (iJ2 != 122) {
                                    if (iJ2 == 127) {
                                        int iJ4 = ediVar.j();
                                        if (iJ4 != 21) {
                                            if (iJ4 == 14) {
                                                i2 = 136;
                                            } else {
                                                if (iJ4 == 33) {
                                                    i2 = 139;
                                                }
                                                edhVar = edhVar2;
                                                i = iJ3;
                                            }
                                        }
                                        edhVar = edhVar2;
                                        i = iJ3;
                                        i10 = 172;
                                    } else if (iJ2 == 123) {
                                        i2 = 138;
                                    } else if (iJ2 == 10) {
                                        String strTrim = ediVar.y(3).trim();
                                        iJ = ediVar.j();
                                        edhVar = edhVar2;
                                        str = strTrim;
                                        i = iJ3;
                                    } else if (iJ2 == 89) {
                                        ArrayList arrayList2 = new ArrayList();
                                        while (ediVar.b < iJ3) {
                                            String strTrim2 = ediVar.y(3).trim();
                                            ediVar.j();
                                            int i12 = iJ3;
                                            byte[] bArr = new byte[4];
                                            ediVar.F(bArr, 0, 4);
                                            arrayList2.add(new fse(strTrim2, bArr));
                                            edhVar2 = edhVar2;
                                            iJ3 = i12;
                                        }
                                        edhVar = edhVar2;
                                        i = iJ3;
                                        arrayList = arrayList2;
                                        i10 = 89;
                                    } else {
                                        edhVar = edhVar2;
                                        i = iJ3;
                                        if (iJ2 == 111) {
                                            i10 = 257;
                                        }
                                    }
                                    i10 = i2;
                                    edhVar = edhVar2;
                                    i = iJ3;
                                }
                                edhVar = edhVar2;
                                i = iJ3;
                                i10 = 135;
                            }
                            edhVar = edhVar2;
                            i = iJ3;
                            i10 = 129;
                        }
                        ediVar.L(i - ediVar.b);
                        edhVar2 = edhVar;
                        iA = i11;
                    }
                    int i13 = iA;
                    edh edhVar3 = edhVar2;
                    ediVar.K(i9);
                    maj majVar = new maj(i10, str, iJ, arrayList, Arrays.copyOfRange(ediVar.a, i8, i9));
                    if (iD == 6 || iD == 5) {
                        iD = majVar.b;
                    }
                    iA = i13 - (iD3 + 5);
                    int i14 = i3 == 2 ? iD : iD2;
                    if (fmqVar.d.get(i14)) {
                        c = 21;
                    } else {
                        c = 21;
                        fms fmsVarJ = (i3 == 2 && iD == 21) ? fmqVar.i : fmqVar.k.j(iD, majVar);
                        if (i3 != 2 || iD2 < sparseIntArray.get(i14, 8192)) {
                            sparseIntArray.put(i14, iD2);
                            sparseArray.put(i14, fmsVarJ);
                        }
                    }
                    i4 = 3;
                    i5 = 13;
                    i6 = 4;
                    edhVar2 = edhVar3;
                    i7 = 12;
                }
                int size = sparseIntArray.size();
                for (int i15 = 0; i15 < size; i15++) {
                    int iKeyAt = sparseIntArray.keyAt(i15);
                    int iValueAt = sparseIntArray.valueAt(i15);
                    fmqVar.d.put(iKeyAt, true);
                    fmqVar.e.put(iValueAt, true);
                    fms fmsVar2 = (fms) sparseArray.valueAt(i15);
                    if (fmsVar2 != null) {
                        if (fmsVar2 != fmqVar.i) {
                            fmsVar2.b(edoVar, fmqVar.f, new fmr(iN, iKeyAt, 8192));
                        }
                        fmqVar.c.put(iValueAt, fmsVar2);
                    }
                }
                if (i3 != 2) {
                    fmqVar.c.remove(this.e);
                    fmqVar.g = 0;
                    fmqVar.f.j();
                    fmqVar.h = true;
                    return;
                }
                if (fmqVar.h) {
                    return;
                }
                fmqVar.f.j();
                fmqVar.g = 0;
                fmqVar.h = true;
            }
        }
    }

    @Override // defpackage.fmj
    public final void b(edo edoVar, fdr fdrVar, fmr fmrVar) {
    }
}
