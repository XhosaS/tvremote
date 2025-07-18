package defpackage;

import android.util.Pair;
import com.google.common.collect.ImmutableList;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ezk {
    public ezj g;
    public ezm h;
    public qza i;

    public ebf c() {
        throw null;
    }

    public ekd d() {
        throw null;
    }

    public void i() {
        throw null;
    }

    public void j(dyo dyoVar) {
        throw null;
    }

    public void k(ebf ebfVar) {
        throw null;
    }

    public void n() {
        throw null;
    }

    protected abstract Pair o(qza qzaVar, int[][][] iArr, int[] iArr2);

    public final void p(ezj ezjVar, ezm ezmVar) {
        a.ab(this.g == null);
        this.g = ezjVar;
        this.h = ezmVar;
    }

    protected final void q() {
        ezj ezjVar = this.g;
        if (ezjVar != null) {
            ezjVar.e();
        }
    }

    public final sro r(eke[] ekeVarArr, exi exiVar) {
        int length;
        boolean z;
        int length2;
        int[] iArr;
        exi exiVar2 = exiVar;
        boolean z2 = true;
        int length3 = ekeVarArr.length + 1;
        int[] iArr2 = new int[length3];
        eba[][] ebaVarArr = new eba[length3][];
        int[][][] iArr3 = new int[length3][][];
        for (int i = 0; i < length3; i++) {
            int i2 = exiVar2.c;
            ebaVarArr[i] = new eba[i2];
            iArr3[i] = new int[i2][];
        }
        int length4 = ekeVarArr.length;
        int[] iArr4 = new int[length4];
        for (int i3 = 0; i3 < length4; i3++) {
            iArr4[i3] = ekeVarArr[i3].dl();
        }
        int i4 = 0;
        while (i4 < exiVar2.c) {
            eba ebaVarB = exiVar2.b(i4);
            int i5 = ebaVarB.e;
            int length5 = ekeVarArr.length;
            boolean z3 = z2;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                length2 = ekeVarArr.length;
                if (i6 >= length2) {
                    break;
                }
                eke ekeVar = ekeVarArr[i6];
                boolean z4 = z2;
                int iMax = 0;
                for (int i8 = 0; i8 < ebaVarB.c; i8++) {
                    iMax = Math.max(iMax, clw.L(ekeVar.cJ(ebaVarB.c(i8))));
                }
                boolean z5 = iArr2[i6] == 0 ? z4 : false;
                if (iMax > i7) {
                    z3 = z5;
                    length5 = i6;
                    i7 = iMax;
                } else if (iMax == i7 && i5 == 5 && !z3 && z5) {
                    length5 = i6;
                    i7 = iMax;
                    z3 = z4;
                }
                i6++;
                z2 = z4;
            }
            boolean z6 = z2;
            if (length5 == length2) {
                iArr = new int[ebaVarB.c];
            } else {
                eke ekeVar2 = ekeVarArr[length5];
                int i9 = ebaVarB.c;
                int[] iArr5 = new int[i9];
                for (int i10 = 0; i10 < i9; i10++) {
                    iArr5[i10] = ekeVar2.cJ(ebaVarB.c(i10));
                }
                iArr = iArr5;
            }
            int i11 = iArr2[length5];
            ebaVarArr[length5][i11] = ebaVarB;
            iArr3[length5][i11] = iArr;
            iArr2[length5] = i11 + 1;
            i4++;
            exiVar2 = exiVar;
            z2 = z6;
        }
        boolean z7 = z2;
        int length6 = ekeVarArr.length;
        exi[] exiVarArr = new exi[length6];
        String[] strArr = new String[length6];
        int[] iArr6 = new int[length6];
        int i12 = 0;
        while (true) {
            length = ekeVarArr.length;
            if (i12 >= length) {
                break;
            }
            int i13 = iArr2[i12];
            exiVarArr[i12] = new exi((eba[]) edt.as(ebaVarArr[i12], i13));
            iArr3[i12] = (int[][]) edt.as(iArr3[i12], i13);
            strArr[i12] = ekeVarArr[i12].U();
            iArr6[i12] = ekeVarArr[i12].dk();
            i12++;
        }
        qza qzaVar = new qza(iArr6, exiVarArr, iArr4, iArr3, new exi((eba[]) edt.as(ebaVarArr[length], iArr2[length])));
        Pair pairO = o(qzaVar, iArr3, iArr4);
        ezi[] eziVarArr = (ezi[]) pairO.second;
        List[] listArr = new List[eziVarArr.length];
        for (int i14 = 0; i14 < eziVarArr.length; i14++) {
            ezi eziVar = eziVarArr[i14];
            listArr[i14] = eziVar != null ? ImmutableList.of(eziVar) : ImmutableList.of();
        }
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (int i15 = 0; i15 < qzaVar.a; i15++) {
            exi exiVarG = qzaVar.g(i15);
            List list = listArr[i15];
            int i16 = 0;
            while (i16 < exiVarG.c) {
                eba ebaVarB2 = exiVarG.b(i16);
                exi[] exiVarArr2 = (exi[]) qzaVar.c;
                int i17 = exiVarArr2[i15].b(i16).c;
                int[] iArr7 = new int[i17];
                int i18 = 0;
                for (int i19 = 0; i19 < i17; i19++) {
                    if (qzaVar.f(i15, i16, i19) == 4) {
                        iArr7[i18] = i19;
                        i18++;
                    }
                }
                int[] iArrCopyOf = Arrays.copyOf(iArr7, i18);
                String str = null;
                int iMin = 16;
                List[] listArr2 = listArr;
                int i20 = 0;
                boolean z8 = false;
                int i21 = 0;
                while (i20 < iArrCopyOf.length) {
                    int[] iArr8 = iArrCopyOf;
                    String str2 = exiVarArr2[i15].b(i16).c(iArrCopyOf[i20]).Y;
                    int i22 = i21 + 1;
                    if (i21 == 0) {
                        str = str2;
                    } else {
                        z8 |= !Objects.equals(str, str2);
                    }
                    iMin = Math.min(iMin, ((int[][][]) qzaVar.e)[i15][i16][i20] & 24);
                    i20++;
                    iArrCopyOf = iArr8;
                    i21 = i22;
                }
                if (z8) {
                    iMin = Math.min(iMin, ((int[]) qzaVar.d)[i15]);
                }
                boolean z9 = iMin != 0 ? z7 : false;
                int i23 = ebaVarB2.c;
                int[] iArr9 = new int[i23];
                boolean[] zArr = new boolean[i23];
                for (int i24 = 0; i24 < i23; i24++) {
                    iArr9[i24] = qzaVar.f(i15, i16, i24);
                    int i25 = 0;
                    while (true) {
                        if (i25 >= list.size()) {
                            z = false;
                            break;
                        }
                        ezi eziVar2 = (ezi) list.get(i25);
                        if (eziVar2.h().equals(ebaVarB2) && eziVar2.s(i24) != -1) {
                            z = z7;
                            break;
                        }
                        i25++;
                    }
                    zArr[i24] = z;
                }
                builder.add((ImmutableList.Builder) new ebg(ebaVarB2, z9, iArr9, zArr));
                i16++;
                listArr = listArr2;
            }
        }
        Object obj = qzaVar.f;
        int i26 = 0;
        while (true) {
            exi exiVar3 = (exi) obj;
            if (i26 >= exiVar3.c) {
                return new sro((ekf[]) pairO.first, (ezf[]) pairO.second, new ebh(builder.build()), qzaVar);
            }
            eba ebaVarB3 = exiVar3.b(i26);
            int i27 = ebaVarB3.c;
            int[] iArr10 = new int[i27];
            Arrays.fill(iArr10, 0);
            builder.add((ImmutableList.Builder) new ebg(ebaVarB3, false, iArr10, new boolean[i27]));
            i26++;
        }
    }
}
