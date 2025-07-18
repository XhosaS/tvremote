package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aacj extends aacq {
    public static final aacj a = new aacj(0);
    public static final aacj b = new aacj(1);
    public static final aacj c = new aacj(2);
    public static final aacj d = new aacj(3);
    public static final aacj e = new aacj(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    public static final aacj f = new aacj(Integer.MIN_VALUE);
    private static final long serialVersionUID = 87525275727380868L;

    static {
        List listSubList;
        aafp aafpVar;
        if (vxr.a == null) {
            int i = aafr.a;
            ArrayList arrayList = new ArrayList();
            aafl[] aaflVarArr = new aafl[10];
            aafn aafnVar = new aafn();
            aafr.e(aafnVar, aafnVar, arrayList);
            aafr.c(0, arrayList, aaflVarArr);
            aafr.d("Y", arrayList, aaflVarArr);
            aafr.c(1, arrayList, aaflVarArr);
            aafr.d("M", arrayList, aaflVarArr);
            aafr.c(2, arrayList, aaflVarArr);
            aafr.d("W", arrayList, aaflVarArr);
            aafr.c(3, arrayList, aaflVarArr);
            aafr.d("D", arrayList, aaflVarArr);
            if (arrayList.size() == 0) {
                aafp aafpVar2 = new aafp();
                aafr.e(aafpVar2, aafpVar2, arrayList);
            } else {
                int size = arrayList.size();
                while (true) {
                    int i2 = size - 1;
                    if (i2 < 0) {
                        listSubList = arrayList;
                        aafpVar = null;
                        break;
                    } else {
                        if (arrayList.get(i2) instanceof aafp) {
                            aafpVar = (aafp) arrayList.get(i2);
                            listSubList = arrayList.subList(size, arrayList.size());
                            break;
                        }
                        size -= 2;
                    }
                }
                if (aafpVar != null && listSubList.size() == 0) {
                    throw new IllegalStateException("Cannot have two adjacent separators");
                }
                Object[] objArrA = aafr.a(listSubList);
                listSubList.clear();
                aafp aafpVar3 = new aafp();
                listSubList.add(aafpVar3);
                listSubList.add(aafpVar3);
            }
            aafr.c(4, arrayList, aaflVarArr);
            aafr.d("H", arrayList, aaflVarArr);
            aafr.c(5, arrayList, aaflVarArr);
            aafr.d("M", arrayList, aaflVarArr);
            aafr.c(9, arrayList, aaflVarArr);
            aafr.d("S", arrayList, aaflVarArr);
            aafi aafiVarB = aafr.b(arrayList);
            for (int i3 = 0; i3 < 10; i3++) {
                aafl aaflVar = aaflVarArr[i3];
                if (aaflVar != null) {
                    HashSet hashSet = new HashSet();
                    HashSet hashSet2 = new HashSet();
                    for (int i4 = 0; i4 < 10; i4++) {
                        aafl aaflVar2 = aaflVarArr[i4];
                        if (aaflVar2 != null && !aaflVar.equals(aaflVar2)) {
                            hashSet.add(null);
                            hashSet2.add(aaflVar2.b);
                        }
                    }
                    aafo aafoVar = aaflVar.b;
                    if (aafoVar != null) {
                        aafoVar.b(hashSet2);
                    }
                }
            }
            vxr.a = aafiVarB;
        }
        aafi aafiVar = vxr.a;
        Object obj = aafiVar.c;
        aace.a();
        Object obj2 = aafiVar.a;
        Object obj3 = aafiVar.b;
    }

    private aacj(int i) {
        super(i);
    }

    public static aacj d(int i) {
        return i != Integer.MIN_VALUE ? i != Integer.MAX_VALUE ? i != 0 ? i != 1 ? i != 2 ? i != 3 ? new aacj(i) : d : c : b : a : e : f;
    }

    private Object readResolve() {
        return d(this.g);
    }

    @Override // defpackage.aacq, defpackage.aaci
    public final aace a() {
        return aace.a();
    }

    @Override // defpackage.aacq
    public final aabw c() {
        return aabw.d;
    }

    public final String toString() {
        return "P" + String.valueOf(this.g) + "Y";
    }
}
