package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Multimap;
import com.google.common.collect.MultimapBuilder;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eyi implements eze {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.eze
    public final ezf[] a(epm[] epmVarArr, ezm ezmVar) {
        int length;
        long j;
        int[] iArr;
        int length2;
        int i;
        long j2;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = epmVarArr.length;
            if (i3 >= length) {
                break;
            }
            epm epmVar = epmVarArr[i3];
            if (epmVar == null || ((int[]) epmVar.b).length <= 1) {
                arrayList.add(null);
            } else {
                ImmutableList.Builder builder = ImmutableList.builder();
                builder.add((ImmutableList.Builder) new eyh(0L, 0L));
                arrayList.add(builder);
            }
            i3++;
        }
        long[][] jArr = new long[length][];
        int i4 = 0;
        while (true) {
            j = -1;
            if (i4 >= epmVarArr.length) {
                break;
            }
            epm epmVar2 = epmVarArr[i4];
            if (epmVar2 == null) {
                jArr[i4] = new long[0];
            } else {
                int[] iArr2 = (int[]) epmVar2.b;
                jArr[i4] = new long[iArr2.length];
                for (int i5 = 0; i5 < iArr2.length; i5++) {
                    long j3 = ((eba) epmVar2.a).c(iArr2[i5]).T;
                    long[] jArr2 = jArr[i4];
                    if (j3 == -1) {
                        j3 = 0;
                    }
                    jArr2[i5] = j3;
                }
                Arrays.sort(jArr[i4]);
            }
            i4++;
        }
        int[] iArr3 = new int[length];
        long[] jArr3 = new long[length];
        for (int i6 = 0; i6 < length; i6++) {
            long[] jArr4 = jArr[i6];
            jArr3[i6] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        eyj.k(arrayList, jArr3);
        Multimap multimapBuild = MultimapBuilder.treeKeys().arrayListValues().build();
        int i7 = 0;
        while (i7 < length) {
            int length3 = jArr[i7].length;
            if (length3 <= 1) {
                i = i2;
                j2 = j;
            } else {
                double[] dArr = new double[length3];
                int i8 = i2;
                while (true) {
                    long[] jArr5 = jArr[i7];
                    i = i2;
                    double dLog = 0.0d;
                    if (i8 >= jArr5.length) {
                        break;
                    }
                    long j4 = j;
                    long j5 = jArr5[i8];
                    if (j5 != j4) {
                        dLog = Math.log(j5);
                    }
                    dArr[i8] = dLog;
                    i8++;
                    i2 = i;
                    j = j4;
                }
                j2 = j;
                int i9 = length3 - 1;
                double d = dArr[i9] - dArr[i];
                int i10 = i;
                while (i10 < i9) {
                    double d2 = dArr[i10];
                    i10++;
                    multimapBuild.put(Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i10]) * 0.5d) - dArr[i]) / d), Integer.valueOf(i7));
                }
            }
            i7++;
            i2 = i;
            j = j2;
        }
        int i11 = i2;
        ImmutableList immutableListCopyOf = ImmutableList.copyOf(multimapBuild.values());
        for (int i12 = i11; i12 < immutableListCopyOf.size(); i12++) {
            int iIntValue = ((Integer) immutableListCopyOf.get(i12)).intValue();
            int i13 = iArr3[iIntValue] + 1;
            iArr3[iIntValue] = i13;
            jArr3[iIntValue] = jArr[iIntValue][i13];
            eyj.k(arrayList, jArr3);
        }
        for (int i14 = i11; i14 < epmVarArr.length; i14++) {
            if (arrayList.get(i14) != null) {
                long j6 = jArr3[i14];
                jArr3[i14] = j6 + j6;
            }
        }
        eyj.k(arrayList, jArr3);
        ImmutableList.Builder builder2 = ImmutableList.builder();
        for (int i15 = i11; i15 < arrayList.size(); i15++) {
            ImmutableList.Builder builder3 = (ImmutableList.Builder) arrayList.get(i15);
            builder2.add((ImmutableList.Builder) (builder3 == null ? ImmutableList.of() : builder3.build()));
        }
        ImmutableList immutableListBuild = builder2.build();
        ezf[] ezfVarArr = new ezf[epmVarArr.length];
        for (int i16 = i11; i16 < epmVarArr.length; i16++) {
            epm epmVar3 = epmVarArr[i16];
            if (epmVar3 != null && (length2 = (iArr = (int[]) epmVar3.b).length) != 0) {
                ezfVarArr[i16] = length2 == 1 ? new ezg((eba) epmVar3.a, iArr[i11]) : b((eba) epmVar3.a, iArr, ezmVar, (ImmutableList) immutableListBuild.get(i16));
            }
        }
        return ezfVarArr;
    }

    protected eyj b(eba ebaVar, int[] iArr, ezm ezmVar, ImmutableList immutableList) {
        return new eyj(ebaVar, iArr, ezmVar, 10000L, 25000L, 25000L, 0.7f, immutableList);
    }
}
