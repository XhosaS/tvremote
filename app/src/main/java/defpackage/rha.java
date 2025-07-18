package defpackage;

import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.Flag;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class rha implements luj {
    @Override // defpackage.luj
    public final Object a(lvf lvfVar) {
        int i;
        int i2;
        int i3;
        rgx rgxVar;
        int i4;
        Configurations configurations = (Configurations) lvfVar.e();
        rgu rguVar = rgu.a;
        rgt rgtVar = new rgt();
        String str = configurations.a;
        int i5 = Integer.MIN_VALUE;
        if ((rgtVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rgtVar.y();
        }
        rgu rguVar2 = (rgu) rgtVar.b;
        str.getClass();
        int i6 = 1;
        rguVar2.b |= 1;
        rguVar2.c = str;
        String str2 = configurations.c;
        if ((rgtVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rgtVar.y();
        }
        rgu rguVar3 = (rgu) rgtVar.b;
        str2.getClass();
        int i7 = 4;
        rguVar3.b |= 4;
        rguVar3.e = str2;
        boolean z = configurations.f;
        if ((rgtVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rgtVar.y();
        }
        rgu rguVar4 = (rgu) rgtVar.b;
        rguVar4.b |= 8;
        rguVar4.h = z;
        long j = configurations.g;
        if ((rgtVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rgtVar.y();
        }
        rgu rguVar5 = (rgu) rgtVar.b;
        rguVar5.b |= 16;
        rguVar5.i = j;
        byte[] bArr = configurations.b;
        int i8 = 2;
        int i9 = 0;
        if (bArr != null) {
            abvo abvoVarU = abvo.u(bArr, 0, bArr.length);
            if ((rgtVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                rgtVar.y();
            }
            rgu rguVar6 = (rgu) rgtVar.b;
            rguVar6.b |= 2;
            rguVar6.d = abvoVarU;
        }
        Configuration[] configurationArr = configurations.d;
        int length = configurationArr.length;
        int i10 = 0;
        while (i10 < length) {
            Configuration configuration = configurationArr[i10];
            Flag[] flagArr = configuration.b;
            int length2 = flagArr.length;
            int i11 = i9;
            while (i11 < length2) {
                Flag flag = flagArr[i11];
                int i12 = flag.g;
                if (i12 == i6) {
                    i = i5;
                    int i13 = i6;
                    i2 = i8;
                    rgx rgxVar2 = rgx.a;
                    rgv rgvVar = new rgv();
                    String str3 = flag.a;
                    if ((rgvVar.b.memoizedSerializedSize & i) == 0) {
                        rgvVar.y();
                    }
                    rgx rgxVar3 = (rgx) rgvVar.b;
                    str3.getClass();
                    rgxVar3.b |= 1;
                    rgxVar3.e = str3;
                    i3 = i13;
                    if (i12 != i3) {
                        throw new IllegalArgumentException("Not a long type");
                    }
                    long j2 = flag.b;
                    if ((rgvVar.b.memoizedSerializedSize & i) == 0) {
                        rgvVar.y();
                    }
                    rgx rgxVar4 = (rgx) rgvVar.b;
                    rgxVar4.c = i3;
                    rgxVar4.d = Long.valueOf(j2);
                    rgxVar = (rgx) rgvVar.v();
                } else if (i12 != i8) {
                    if (i12 == 3) {
                        i = i5;
                        i4 = i6;
                        rgx rgxVar5 = rgx.a;
                        rgv rgvVar2 = new rgv();
                        String str4 = flag.a;
                        if ((rgvVar2.b.memoizedSerializedSize & i) == 0) {
                            rgvVar2.y();
                        }
                        rgx rgxVar6 = (rgx) rgvVar2.b;
                        str4.getClass();
                        rgxVar6.b |= 1;
                        rgxVar6.e = str4;
                        if (i12 != 3) {
                            throw new IllegalArgumentException("Not a double type");
                        }
                        double d = flag.d;
                        if ((rgvVar2.b.memoizedSerializedSize & i) == 0) {
                            rgvVar2.y();
                        }
                        rgx rgxVar7 = (rgx) rgvVar2.b;
                        rgxVar7.c = 3;
                        rgxVar7.d = Double.valueOf(d);
                        rgxVar = (rgx) rgvVar2.v();
                    } else if (i12 == i7) {
                        i = i5;
                        i4 = i6;
                        rgx rgxVar8 = rgx.a;
                        rgv rgvVar3 = new rgv();
                        String str5 = flag.a;
                        if ((rgvVar3.b.memoizedSerializedSize & i) == 0) {
                            rgvVar3.y();
                        }
                        rgx rgxVar9 = (rgx) rgvVar3.b;
                        str5.getClass();
                        rgxVar9.b |= 1;
                        rgxVar9.e = str5;
                        if (i12 != 4) {
                            throw new IllegalArgumentException("Not a String type");
                        }
                        String str6 = flag.e;
                        kkk.k(str6);
                        if ((rgvVar3.b.memoizedSerializedSize & i) == 0) {
                            rgvVar3.y();
                        }
                        rgx rgxVar10 = (rgx) rgvVar3.b;
                        i7 = 4;
                        rgxVar10.c = 4;
                        rgxVar10.d = str6;
                        rgxVar = (rgx) rgvVar3.v();
                    } else {
                        if (i12 != 5) {
                            throw new IllegalArgumentException(a.b(i12, "Unrecognized flag type: "));
                        }
                        rgx rgxVar11 = rgx.a;
                        i = i5;
                        rgv rgvVar4 = new rgv();
                        int i14 = i6;
                        String str7 = flag.a;
                        if ((rgvVar4.b.memoizedSerializedSize & i) == 0) {
                            rgvVar4.y();
                        }
                        rgx rgxVar12 = (rgx) rgvVar4.b;
                        str7.getClass();
                        rgxVar12.b |= 1;
                        rgxVar12.e = str7;
                        if (i12 != 5) {
                            throw new IllegalArgumentException("Not a bytes type");
                        }
                        byte[] bArr2 = flag.f;
                        kkk.k(bArr2);
                        abvo abvoVarU2 = abvo.u(bArr2, i9, bArr2.length);
                        if ((rgvVar4.b.memoizedSerializedSize & i) == 0) {
                            rgvVar4.y();
                        }
                        rgx rgxVar13 = (rgx) rgvVar4.b;
                        rgxVar13.c = 5;
                        rgxVar13.d = abvoVarU2;
                        rgxVar = (rgx) rgvVar4.v();
                        i3 = i14;
                        i2 = 2;
                        i7 = 4;
                    }
                    i3 = i4;
                    i2 = 2;
                } else {
                    i = i5;
                    int i15 = i6;
                    rgx rgxVar14 = rgx.a;
                    rgv rgvVar5 = new rgv();
                    String str8 = flag.a;
                    if ((rgvVar5.b.memoizedSerializedSize & i) == 0) {
                        rgvVar5.y();
                    }
                    rgx rgxVar15 = (rgx) rgvVar5.b;
                    str8.getClass();
                    rgxVar15.b |= 1;
                    rgxVar15.e = str8;
                    i2 = 2;
                    if (i12 != 2) {
                        throw new IllegalArgumentException("Not a boolean type");
                    }
                    boolean z2 = flag.c;
                    if ((rgvVar5.b.memoizedSerializedSize & i) == 0) {
                        rgvVar5.y();
                    }
                    rgx rgxVar16 = (rgx) rgvVar5.b;
                    rgxVar16.c = 2;
                    rgxVar16.d = Boolean.valueOf(z2);
                    rgxVar = (rgx) rgvVar5.v();
                    i3 = i15;
                }
                if ((rgtVar.b.memoizedSerializedSize & i) == 0) {
                    rgtVar.y();
                }
                rgu rguVar7 = (rgu) rgtVar.b;
                rgxVar.getClass();
                abxs abxsVar = rguVar7.f;
                if (!abxsVar.c()) {
                    int size = abxsVar.size();
                    rguVar7.f = abxsVar.d(size + size);
                }
                rguVar7.f.add(rgxVar);
                i11++;
                i8 = i2;
                i6 = i3;
                i9 = 0;
                i5 = i;
            }
            int i16 = i5;
            int i17 = i6;
            int i18 = i8;
            String[] strArr = configuration.c;
            if (strArr != null) {
                for (String str9 : strArr) {
                    if ((rgtVar.b.memoizedSerializedSize & i16) == 0) {
                        rgtVar.y();
                    }
                    rgu rguVar8 = (rgu) rgtVar.b;
                    str9.getClass();
                    abxs abxsVar2 = rguVar8.g;
                    if (!abxsVar2.c()) {
                        int size2 = abxsVar2.size();
                        rguVar8.g = abxsVar2.d(size2 + size2);
                    }
                    rguVar8.g.add(str9);
                }
            }
            i10++;
            i8 = i18;
            i6 = i17;
            i9 = 0;
            i5 = i16;
        }
        return (rgu) rgtVar.v();
    }
}
