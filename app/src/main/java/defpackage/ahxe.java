package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahxe {
    public final void a(long j, ahwx ahwxVar, int i, List list, int i2, int i3, List list2) {
        int i4;
        long j2;
        List list3;
        int i5;
        int i6;
        int i7 = i;
        int i8 = i2;
        List list4 = list2;
        if (i8 >= i3) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i9 = i8; i9 < i3; i9++) {
            if (((ahxb) list.get(i9)).b() < i7) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        ahxb ahxbVar = (ahxb) list.get(i2);
        ahxb ahxbVar2 = (ahxb) list.get(i3 - 1);
        if (i7 == ahxbVar.b()) {
            int iIntValue = ((Number) list4.get(i8)).intValue();
            i8++;
            i4 = iIntValue;
            ahxbVar = (ahxb) list.get(i8);
        } else {
            i4 = -1;
        }
        int i10 = i8 + 1;
        long j3 = 4;
        if (ahxbVar.a(i7) == ahxbVar2.a(i7)) {
            int iMin = Math.min(ahxbVar.b(), ahxbVar2.b());
            int i11 = 0;
            for (int i12 = i7; i12 < iMin && ahxbVar.a(i12) == ahxbVar2.a(i12); i12++) {
                i11++;
            }
            long j4 = j + (ahwxVar.b / 4) + 2;
            long j5 = i11;
            ahwxVar.w(-i11);
            ahwxVar.w(i4);
            int i13 = i7 + i11;
            while (i7 < i13) {
                ahwxVar.w(ahxbVar.a(i7) & 255);
                i7++;
            }
            if (i10 == i3) {
                if (i13 != ((ahxb) list.get(i8)).b()) {
                    throw new IllegalStateException("Check failed.");
                }
                ahwxVar.w(((Number) list4.get(i8)).intValue());
                return;
            } else {
                long j6 = j4 + j5 + 1;
                ahwx ahwxVar2 = new ahwx();
                ahwxVar.w(-((int) ((ahwxVar2.b / 4) + j6)));
                a(j6, ahwxVar2, i13, list, i8, i3, list4);
                ahwxVar.t(ahwxVar2);
                return;
            }
        }
        int i14 = 1;
        while (i10 < i3) {
            if (((ahxb) list.get(i10 - 1)).a(i7) != ((ahxb) list.get(i10)).a(i7)) {
                i14++;
            }
            i10++;
        }
        long j7 = j + (ahwxVar.b / 4) + 2;
        int i15 = i14 + i14;
        ahwxVar.w(i14);
        ahwxVar.w(i4);
        for (int i16 = i8; i16 < i3; i16++) {
            byte bA = ((ahxb) list.get(i16)).a(i7);
            if (i16 == i8 || bA != ((ahxb) list.get(i16 - 1)).a(i7)) {
                ahwxVar.w(bA & 255);
            }
        }
        ahwx ahwxVar3 = new ahwx();
        int i17 = i8;
        while (i17 < i3) {
            int i18 = i7 + 1;
            byte bA2 = ((ahxb) list.get(i17)).a(i7);
            int i19 = i17 + 1;
            int i20 = i19;
            while (true) {
                if (i20 >= i3) {
                    j2 = j3;
                    i20 = i3;
                    break;
                } else {
                    j2 = j3;
                    if (bA2 != ((ahxb) list.get(i20)).a(i7)) {
                        break;
                    }
                    i20++;
                    j3 = j2;
                }
            }
            if (i19 == i20 && i18 == ((ahxb) list.get(i17)).b()) {
                ahwxVar.w(((Number) list4.get(i17)).intValue());
                int i21 = i20;
                list3 = list4;
                i5 = i21;
                i6 = i15;
            } else {
                long j8 = i15 + j7;
                ahwxVar.w(-((int) ((ahwxVar3.b / j2) + j8)));
                int i22 = i20;
                list3 = list4;
                i5 = i22;
                i6 = i15;
                a(j8, ahwxVar3, i18, list, i17, i5, list3);
            }
            i17 = i5;
            list4 = list3;
            i15 = i6;
            j3 = j2;
        }
        ahwxVar.t(ahwxVar3);
    }
}
