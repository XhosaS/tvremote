package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfo {
    public static final /* synthetic */ int a = 0;
    private static final Comparator[] b;
    private static final yjz c;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new acs(new cfn(i == 0 ? bxy.d : bxy.c, bys.b), 6);
            i++;
        }
        b = comparatorArr;
        c = cfh.j;
    }

    public static final List a(cff cffVar, yjv yjvVar, yjv yjvVar2, List list) {
        int i;
        ArrayList arrayList;
        jc jcVar = jd.a;
        jc jcVar2 = new jc((byte[]) null);
        ArrayList arrayList2 = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            b((cff) list.get(i2), arrayList2, yjvVar, yjvVar2, jcVar2);
        }
        char c2 = cffVar.b.q == cmi.b ? (char) 0 : (char) 1;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() / 2);
        int iQ = yfm.q(arrayList2);
        if (iQ >= 0) {
            int i3 = 0;
            while (true) {
                cff cffVar2 = (cff) arrayList2.get(i3);
                if (i3 != 0) {
                    float f = cffVar2.d().c;
                    float f2 = cffVar2.d().e;
                    int iQ2 = yfm.q(arrayList3);
                    if (iQ2 >= 0) {
                        int i4 = 0;
                        while (true) {
                            bmy bmyVar = (bmy) ((yfw) arrayList3.get(i4)).a;
                            i = 0;
                            float f3 = bmyVar.c;
                            float f4 = bmyVar.e;
                            if (f < f2 && f3 < f4 && Math.max(f, f3) < Math.min(f2, f4)) {
                                arrayList = arrayList2;
                                arrayList3.set(i4, new yfw(new bmy(Math.max(bmyVar.b, 0.0f), Math.max(f3, f), Math.min(bmyVar.d, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((yfw) arrayList3.get(i4)).b));
                                ((List) ((yfw) arrayList3.get(i4)).b).add(cffVar2);
                                break;
                            }
                            arrayList = arrayList2;
                            if (i4 == iQ2) {
                                break;
                            }
                            i4++;
                            arrayList2 = arrayList;
                        }
                    } else {
                        arrayList = arrayList2;
                        i = 0;
                    }
                } else {
                    arrayList = arrayList2;
                    i = 0;
                    i3 = 0;
                }
                bmy bmyVarD = cffVar2.d();
                cff[] cffVarArr = new cff[1];
                cffVarArr[i] = cffVar2;
                arrayList3.add(new yfw(bmyVarD, yfm.t(cffVarArr)));
                if (i3 == iQ) {
                    break;
                }
                i3++;
                arrayList2 = arrayList;
            }
        } else {
            i = 0;
        }
        yfm.C(arrayList3, bxy.e);
        ArrayList arrayList4 = new ArrayList();
        Comparator comparator = b[c2];
        int size2 = arrayList3.size();
        for (int i5 = i; i5 < size2; i5++) {
            Object obj = ((yfw) arrayList3.get(i5)).b;
            yfm.C((List) obj, comparator);
            arrayList4.addAll((Collection) obj);
        }
        yfm.C(arrayList4, new acs(c, 5, null));
        int size3 = i;
        while (size3 <= yfm.q(arrayList4)) {
            List list2 = (List) jcVar2.a(((cff) arrayList4.get(size3)).e);
            if (list2 != null) {
                if (((Boolean) yjvVar2.a(arrayList4.get(size3))).booleanValue()) {
                    size3++;
                } else {
                    arrayList4.remove(size3);
                }
                arrayList4.addAll(size3, list2);
                size3 += list2.size();
            } else {
                size3++;
            }
        }
        return arrayList4;
    }

    private static final void b(cff cffVar, ArrayList arrayList, yjv yjvVar, yjv yjvVar2, jc jcVar) {
        boolean zBooleanValue = ((Boolean) cffVar.c.c(cfi.m, cmu.b)).booleanValue();
        if (zBooleanValue || ((Boolean) yjvVar2.a(cffVar)).booleanValue()) {
            if (((Boolean) yjvVar.a(cffVar)).booleanValue()) {
                arrayList.add(cffVar);
            }
            if (zBooleanValue) {
                jcVar.f(cffVar.e, a(cffVar, yjvVar, yjvVar2, cffVar.i()));
                return;
            }
        }
        List listI = cffVar.i();
        int size = listI.size();
        for (int i = 0; i < size; i++) {
            b((cff) listI.get(i), arrayList, yjvVar, yjvVar2, jcVar);
        }
    }
}
