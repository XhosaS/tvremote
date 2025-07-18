package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xn implements bvt {
    private final /* synthetic */ int h;
    public static final xn g = new xn(7);
    public static final xn f = new xn(6);
    public static final xn e = new xn(5);
    public static final xn d = new xn(3);
    public static final xn c = new xn(2);
    public static final xn b = new xn(1);
    public static final xn a = new xn(0);

    public xn(int i) {
        this.h = i;
    }

    private static final void f(List list, yld yldVar, bvv bvvVar, List list2, List list3, yld yldVar2, List list4, yld yldVar3, yld yldVar4) {
        if (!list.isEmpty()) {
            yldVar.a += bvvVar.cu(12.0f);
        }
        list.add(0, yfm.al(list2));
        list3.add(Integer.valueOf(yldVar2.a));
        list4.add(Integer.valueOf(yldVar.a));
        yldVar.a += yldVar2.a;
        yldVar3.a = Math.max(yldVar3.a, yldVar4.a);
        list2.clear();
        yldVar4.a = 0;
        yldVar2.a = 0;
    }

    @Override // defpackage.bvt
    public final /* synthetic */ int a(buz buzVar, List list, int i) {
        switch (this.h) {
        }
        return fh.W(this, buzVar, list, i);
    }

    @Override // defpackage.bvt
    public final /* synthetic */ int b(buz buzVar, List list, int i) {
        switch (this.h) {
        }
        return fh.X(this, buzVar, list, i);
    }

    @Override // defpackage.bvt
    public final /* synthetic */ int c(buz buzVar, List list, int i) {
        switch (this.h) {
        }
        return fh.Y(this, buzVar, list, i);
    }

    @Override // defpackage.bvt
    public final /* synthetic */ int d(buz buzVar, List list, int i) {
        switch (this.h) {
        }
        return fh.Z(this, buzVar, list, i);
    }

    @Override // defpackage.bvt
    public final bvu e(bvv bvvVar, List list, long j) {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z = true;
        int i = 0;
        switch (this.h) {
            case 0:
                return bvvVar.cz(clv.d(j), clv.c(j), yhc.a, new pl(12));
            case 1:
                return bvvVar.cz(clv.d(j), clv.c(j), yhc.a, new pl(3));
            case 2:
                ArrayList arrayList3 = new ArrayList(list.size());
                int size = list.size();
                while (i < size) {
                    arrayList3.add(((bvs) list.get(i)).u(j));
                    i++;
                }
                return bvvVar.cz(clv.b(j), clv.a(j), yhc.a, new zn(arrayList3, 13));
            case 3:
                ArrayList arrayList4 = new ArrayList(list.size());
                int size2 = list.size();
                int i2 = Integer.MIN_VALUE;
                int iCs = Integer.MIN_VALUE;
                int iCs2 = Integer.MIN_VALUE;
                int iMax = 0;
                for (int i3 = 0; i3 < size2; i3++) {
                    bwj bwjVarU = ((bvs) list.get(i3)).u(j);
                    arrayList4.add(bwjVarU);
                    bus busVar = bue.a;
                    if (bwjVarU.cs(busVar) != Integer.MIN_VALUE && (iCs == Integer.MIN_VALUE || bwjVarU.cs(busVar) < iCs)) {
                        iCs = bwjVarU.cs(busVar);
                    }
                    bus busVar2 = bue.b;
                    if (bwjVarU.cs(busVar2) != Integer.MIN_VALUE && (iCs2 == Integer.MIN_VALUE || bwjVarU.cs(busVar2) > iCs2)) {
                        iCs2 = bwjVarU.cs(busVar2);
                    }
                    iMax = Math.max(iMax, bwjVarU.b);
                }
                if (iCs == Integer.MIN_VALUE) {
                    z = false;
                } else if (iCs2 != Integer.MIN_VALUE) {
                    i2 = iCs;
                } else {
                    iCs2 = Integer.MIN_VALUE;
                    i2 = iCs;
                    z = false;
                }
                int iMax2 = Math.max(bvvVar.cu((i2 == iCs2 || !z) ? 48.0f : 68.0f), iMax);
                return bvvVar.cz(clv.b(j), iMax2, yhc.a, new aps(arrayList4, iMax2, i));
            case 4:
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                yld yldVar = new yld();
                yld yldVar2 = new yld();
                ArrayList arrayList8 = new ArrayList();
                yld yldVar3 = new yld();
                int i4 = 0;
                yld yldVar4 = new yld();
                int size3 = list.size();
                while (i4 < size3) {
                    bwj bwjVarU2 = ((bvs) list.get(i4)).u(j);
                    if (!arrayList8.isEmpty()) {
                        ArrayList arrayList9 = arrayList5;
                        if (yldVar3.a + bvvVar.cu(8.0f) + bwjVarU2.a > clv.b(j)) {
                            arrayList5 = arrayList9;
                            f(arrayList5, yldVar2, bvvVar, arrayList8, arrayList6, yldVar4, arrayList7, yldVar, yldVar3);
                        } else {
                            arrayList5 = arrayList9;
                        }
                    }
                    if (arrayList8.isEmpty()) {
                        arrayList2 = arrayList5;
                    } else {
                        arrayList2 = arrayList5;
                        yldVar3.a += bvvVar.cu(8.0f);
                    }
                    arrayList8.add(bwjVarU2);
                    yldVar3.a += bwjVarU2.a;
                    yldVar4.a = Math.max(yldVar4.a, bwjVarU2.b);
                    i4++;
                    arrayList5 = arrayList2;
                }
                ArrayList arrayList10 = arrayList5;
                if (arrayList8.isEmpty()) {
                    arrayList = arrayList10;
                } else {
                    arrayList = arrayList10;
                    f(arrayList, yldVar2, bvvVar, arrayList8, arrayList6, yldVar4, arrayList7, yldVar, yldVar3);
                }
                int iMax3 = Math.max(yldVar.a, clv.d(j));
                return bvvVar.cz(iMax3, Math.max(yldVar2.a, clv.c(j)), yhc.a, new ajg(arrayList, bvvVar, iMax3, arrayList7, 3));
            case 5:
                ArrayList arrayList11 = new ArrayList(list.size());
                int size4 = list.size();
                int iC = 0;
                int iD = 0;
                while (i < size4) {
                    bwj bwjVarU3 = ((bvs) list.get(i)).u(j);
                    iD = Math.max(iD, bwjVarU3.a);
                    iC = Math.max(iC, bwjVarU3.b);
                    arrayList11.add(bwjVarU3);
                    i++;
                }
                if (list.isEmpty()) {
                    iD = clv.d(j);
                    iC = clv.c(j);
                }
                return bvvVar.cz(iD, iC, yhc.a, new cbq(arrayList11, 15));
            case 6:
                int size5 = list.size();
                if (size5 == 0) {
                    return bvvVar.cz(0, 0, yhc.a, ccu.o);
                }
                if (size5 == 1) {
                    bwj bwjVarU4 = ((bvs) list.get(0)).u(j);
                    return bvvVar.cz(bwjVarU4.a, bwjVarU4.b, yhc.a, new cbq(bwjVarU4, 18));
                }
                ArrayList arrayList12 = new ArrayList(list.size());
                int size6 = list.size();
                int iMax4 = 0;
                int iMax5 = 0;
                while (i < size6) {
                    bwj bwjVarU5 = ((bvs) list.get(i)).u(j);
                    iMax4 = Math.max(iMax4, bwjVarU5.a);
                    iMax5 = Math.max(iMax5, bwjVarU5.b);
                    arrayList12.add(bwjVarU5);
                    i++;
                }
                return bvvVar.cz(iMax4, iMax5, yhc.a, new cbq(arrayList12, 19));
            default:
                bvvVar.getClass();
                return bvvVar.cz(clv.d(j), clv.c(j), yhc.a, new gwp(i));
        }
    }
}
