package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgi implements cgl {
    public final cfy a;
    public final List b;
    public final List d;
    public final yft c = ybn.g(3, new awa(this, 16));
    private final yft e = ybn.g(3, new awa(this, 17));

    public cgi(cfy cfyVar, chc chcVar, List list, clx clxVar, esn esnVar) {
        String strSubstring;
        cfx cfxVar;
        int i;
        int i2;
        cfy cfyVar2 = cfyVar;
        chc chcVar2 = chcVar;
        this.a = cfyVar2;
        this.b = list;
        cgm cgmVar = chcVar2.c;
        int i3 = cfz.a;
        List list2 = cfyVar2.d;
        List listAj = list2 != null ? yfm.aj(list2, new ade(7)) : yhb.a;
        ArrayList arrayList = new ArrayList();
        ygx ygxVar = new ygx();
        int size = listAj.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            cfx cfxVar2 = (cfx) listAj.get(i5);
            cfx cfxVarA = cfx.a(cfxVar2, cgmVar.a((cgm) cfxVar2.a), 0, 0, 14);
            while (true) {
                i2 = cfxVarA.b;
                if (i4 >= i2 || ygxVar.isEmpty()) {
                    break;
                }
                cfx cfxVar3 = (cfx) ygxVar.e();
                int i6 = cfxVarA.b;
                int i7 = cfxVar3.c;
                if (i6 < i7) {
                    arrayList.add(new cfx(cfxVar3.a, i4, i6));
                    i4 = cfxVarA.b;
                } else {
                    arrayList.add(new cfx(cfxVar3.a, i4, i7));
                    i4 = cfxVar3.c;
                    while (!ygxVar.isEmpty() && i4 == ((cfx) ygxVar.e()).c) {
                        ygxVar.removeLast();
                    }
                }
            }
            if (i4 < i2) {
                arrayList.add(new cfx(cgmVar, i4, i2));
                i4 = cfxVarA.b;
            }
            cfx cfxVar4 = (cfx) ygxVar.f();
            if (cfxVar4 != null) {
                int i8 = cfxVar4.b;
                if (i8 == cfxVarA.b && cfxVar4.c == cfxVarA.c) {
                    ygxVar.removeLast();
                    ygxVar.add(new cfx(((cgm) cfxVar4.a).a((cgm) cfxVarA.a), cfxVarA.b, cfxVarA.c));
                } else {
                    int i9 = cfxVar4.c;
                    if (i8 == i9) {
                        arrayList.add(new cfx(cfxVar4.a, i8, i9));
                        ygxVar.removeLast();
                        ygxVar.add(new cfx(cfxVarA.a, cfxVarA.b, cfxVarA.c));
                    } else {
                        if (i9 < cfxVarA.c) {
                            throw new IllegalArgumentException();
                        }
                        ygxVar.add(new cfx(((cgm) cfxVar4.a).a((cgm) cfxVarA.a), cfxVarA.b, cfxVarA.c));
                    }
                }
            } else {
                ygxVar.add(new cfx(cfxVarA.a, cfxVarA.b, cfxVarA.c));
            }
        }
        while (i4 <= cfyVar2.b.length() && !ygxVar.isEmpty()) {
            cfx cfxVar5 = (cfx) ygxVar.e();
            arrayList.add(new cfx(cfxVar5.a, i4, cfxVar5.c));
            i4 = cfxVar5.c;
            while (!ygxVar.isEmpty() && i4 == ((cfx) ygxVar.e()).c) {
                ygxVar.removeLast();
            }
        }
        if (i4 < cfyVar2.b.length()) {
            arrayList.add(new cfx(cgmVar, i4, cfyVar2.b.length()));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new cfx(cgmVar, 0, 0));
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        int i10 = 0;
        while (i10 < size2) {
            cfx cfxVar6 = (cfx) arrayList.get(i10);
            int i11 = cfxVar6.b;
            int i12 = cfxVar6.c;
            if (i11 != i12) {
                strSubstring = cfyVar2.b.substring(i11, i12);
                strSubstring.getClass();
            } else {
                strSubstring = "";
            }
            List listA = cfz.a(cfyVar2, i11, i12, new aru(20));
            cfy cfyVar3 = new cfy(strSubstring, listA == null ? yhb.a : listA);
            cgm cgmVar2 = (cgm) cfxVar6.a;
            if (a.r(cgmVar2.b, Integer.MIN_VALUE)) {
                cfxVar = cfxVar6;
                cgmVar2 = new cgm(cgmVar2.a, cgmVar.b, cgmVar2.c, cgmVar2.d, cgmVar2.e, cgmVar2.f, cgmVar2.g, cgmVar2.h, cgmVar2.i);
            } else {
                cfxVar = cfxVar6;
            }
            String str = cfyVar3.b;
            chc chcVar3 = new chc(chcVar2.b, chcVar2.c.a(cgmVar2));
            List list3 = cfyVar3.a;
            List list4 = list3 == null ? yhb.a : list3;
            List list5 = this.b;
            int i13 = cfxVar.b;
            int i14 = cfxVar.c;
            ArrayList arrayList3 = new ArrayList(list5.size());
            int size3 = list5.size();
            int i15 = 0;
            while (i15 < size3) {
                int i16 = i15;
                cfx cfxVar7 = (cfx) list5.get(i15);
                cgm cgmVar3 = cgmVar;
                int i17 = cfxVar7.b;
                ArrayList arrayList4 = arrayList;
                int i18 = cfxVar7.c;
                if (cfz.b(i13, i14, i17, i18)) {
                    if (i13 > i17 || i18 > i14) {
                        cko.a("placeholder can not overlap with paragraph.");
                    }
                    i = size2;
                    arrayList3.add(new cfx(cfxVar7.a, cfxVar7.b - i13, cfxVar7.c - i13));
                } else {
                    i = size2;
                }
                i15 = i16 + 1;
                cgmVar = cgmVar3;
                arrayList = arrayList4;
                size2 = i;
            }
            arrayList2.add(new cgk(new cku(str, chcVar3, list4, arrayList3, esnVar, clxVar), cfxVar.b, cfxVar.c));
            i10++;
            cfyVar2 = cfyVar;
            chcVar2 = chcVar;
            cgmVar = cgmVar;
        }
        this.d = arrayList2;
    }

    @Override // defpackage.cgl
    public final float a() {
        return ((Number) this.e.a()).floatValue();
    }

    @Override // defpackage.cgl
    public final float b() {
        throw null;
    }

    @Override // defpackage.cgl
    public final boolean c() {
        List list = this.d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((cgk) list.get(i)).a.c()) {
                return true;
            }
        }
        return false;
    }
}
