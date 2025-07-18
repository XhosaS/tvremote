package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oxf {
    public static final abgg a() {
        abgg abggVar = abgg.a;
        abgf abgfVar = new abgf();
        DesugarCollections.unmodifiableList(((abgg) abgfVar.b).b).getClass();
        oxm[] oxmVarArrValues = oxm.values();
        ArrayList arrayList = new ArrayList(oxmVarArrValues.length);
        for (oxm oxmVar : oxmVarArrValues) {
            arrayList.add(oxmVar.b);
        }
        if ((abgfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abgfVar.y();
        }
        abgg abggVar2 = (abgg) abgfVar.b;
        abxs abxsVar = abggVar2.b;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            abggVar2.b = abxsVar.d(size + size);
        }
        abus.m(arrayList, abggVar2.b);
        DesugarCollections.unmodifiableList(((abgg) abgfVar.b).c).getClass();
        oxl[] oxlVarArrValues = oxl.values();
        ArrayList arrayList2 = new ArrayList(oxlVarArrValues.length);
        for (oxl oxlVar : oxlVarArrValues) {
            arrayList2.add(oxlVar.u);
        }
        if ((abgfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abgfVar.y();
        }
        abgg abggVar3 = (abgg) abgfVar.b;
        abxs abxsVar2 = abggVar3.c;
        if (!abxsVar2.c()) {
            int size2 = abxsVar2.size();
            abggVar3.c = abxsVar2.d(size2 + size2);
        }
        abus.m(arrayList2, abggVar3.c);
        DesugarCollections.unmodifiableList(((abgg) abgfVar.b).d).getClass();
        owi[] owiVarArrValues = owi.values();
        ArrayList arrayList3 = new ArrayList(owiVarArrValues.length);
        for (owi owiVar : owiVarArrValues) {
            arrayList3.add(owiVar.n);
        }
        if ((abgfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abgfVar.y();
        }
        abgg abggVar4 = (abgg) abgfVar.b;
        abxs abxsVar3 = abggVar4.d;
        if (!abxsVar3.c()) {
            int size3 = abxsVar3.size();
            abggVar4.d = abxsVar3.d(size3 + size3);
        }
        abus.m(arrayList3, abggVar4.d);
        abxd abxdVarV = abgfVar.v();
        abxdVarV.getClass();
        return (abgg) abxdVarV;
    }
}
