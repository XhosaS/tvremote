package defpackage;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ib {
    private final List a;
    private final int[] b;
    private final int[] c;
    private final hz d;
    private final int e;
    private final int f;
    private final boolean g;

    public ib(hz hzVar, List list, int[] iArr, int[] iArr2, boolean z) {
        int i;
        ia iaVar;
        int i2;
        this.a = list;
        this.b = iArr;
        this.c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.d = hzVar;
        int iB = hzVar.b();
        this.e = iB;
        int iA = hzVar.a();
        this.f = iA;
        this.g = z;
        ia iaVar2 = list.isEmpty() ? null : (ia) list.get(0);
        if (iaVar2 == null || iaVar2.a != 0 || iaVar2.b != 0) {
            list.add(0, new ia(0, 0, 0));
        }
        list.add(new ia(iB, iA, 0));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ia iaVar3 = (ia) it.next();
            for (int i3 = 0; i3 < iaVar3.c; i3++) {
                int i4 = iaVar3.a + i3;
                int i5 = iaVar3.b + i3;
                int i6 = true != this.d.c(i4, i5) ? 2 : 1;
                this.b[i4] = (i5 << 4) | i6;
                this.c[i5] = (i4 << 4) | i6;
            }
        }
        if (this.g) {
            int i7 = 0;
            for (ia iaVar4 : this.a) {
                while (true) {
                    i = iaVar4.a;
                    if (i7 < i) {
                        if (this.b[i7] == 0) {
                            int size = this.a.size();
                            int i8 = 0;
                            int i9 = 0;
                            while (true) {
                                if (i8 < size) {
                                    iaVar = (ia) this.a.get(i8);
                                    while (true) {
                                        i2 = iaVar.b;
                                        if (i9 < i2) {
                                            if (this.c[i9] == 0 && this.d.d(i7, i9)) {
                                                int i10 = true != this.d.c(i7, i9) ? 4 : 8;
                                                this.b[i7] = (i9 << 4) | i10;
                                                this.c[i9] = i10 | (i7 << 4);
                                            } else {
                                                i9++;
                                            }
                                        }
                                    }
                                }
                                i9 = iaVar.c + i2;
                                i8++;
                            }
                        }
                        i7++;
                    }
                }
                i7 = iaVar4.c + i;
            }
        }
    }

    private static ic b(Collection collection, int i, boolean z) {
        ic icVar;
        Iterator it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                icVar = null;
                break;
            }
            icVar = (ic) it.next();
            if (icVar.a == i && icVar.c == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            ic icVar2 = (ic) it.next();
            if (z) {
                icVar2.b--;
            } else {
                icVar2.b++;
            }
        }
        return icVar;
    }

    public final void a(ig igVar) {
        int i;
        int i2;
        hx hxVar = igVar instanceof hx ? (hx) igVar : new hx(igVar);
        int i3 = this.e;
        ArrayDeque arrayDeque = new ArrayDeque();
        int i4 = this.f;
        List list = this.a;
        int size = list.size() - 1;
        int i5 = i4;
        int i6 = i3;
        while (size >= 0) {
            ia iaVar = (ia) list.get(size);
            int i7 = iaVar.a;
            int i8 = iaVar.c;
            int i9 = i7 + i8;
            int i10 = iaVar.b;
            int i11 = i10 + i8;
            while (true) {
                i = 0;
                if (i6 <= i9) {
                    break;
                }
                i6--;
                int i12 = this.b[i6];
                if ((i12 & 12) != 0) {
                    int i13 = i12 >> 4;
                    ic icVarB = b(arrayDeque, i13, false);
                    if (icVarB != null) {
                        int i14 = (i3 - icVarB.b) - 1;
                        hxVar.b(i6, i14);
                        if ((i12 & 4) != 0) {
                            this.d.e(i6, i13);
                            hxVar.d(i14, 1);
                        }
                    } else {
                        arrayDeque.add(new ic(i6, (i3 - i6) - 1, true));
                    }
                } else {
                    hxVar.c(i6, 1);
                    i3--;
                }
            }
            while (i5 > i11) {
                i5--;
                int i15 = this.c[i5];
                if ((i15 & 12) != 0) {
                    int i16 = i15 >> 4;
                    if (b(arrayDeque, i16, true) == null) {
                        i2 = 0;
                        arrayDeque.add(new ic(i5, i3 - i6, false));
                    } else {
                        i2 = 0;
                        hxVar.b((i3 - r13.b) - 1, i6);
                        if ((i15 & 4) != 0) {
                            this.d.e(i16, i5);
                            hxVar.d(i6, 1);
                        }
                        i = i2;
                    }
                    i = i2;
                } else {
                    hxVar.a(i6, 1);
                    i3++;
                }
            }
            int i17 = i10;
            int i18 = i7;
            while (i < i8) {
                if ((this.b[i18] & 15) == 2) {
                    this.d.e(i18, i17);
                    hxVar.d(i18, 1);
                }
                i18++;
                i17++;
                i++;
            }
            size--;
            i5 = i10;
            i6 = i7;
        }
        hxVar.e();
    }
}
