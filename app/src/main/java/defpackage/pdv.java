package defpackage;

import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pdv {
    public static final void a(int i, boolean z, zoq[] zoqVarArr, pdi pdiVar, Map map, zlu zluVar, zmq zmqVar) {
        zoq zoqVar = zoqVarArr[i];
        abxc abxcVar = zmi.a;
        if (zoqVar.d(abxcVar)) {
            z = true;
        } else if (z) {
            zot zotVar = (zot) zoqVar.b;
            zoqVar.f(abxcVar, Long.valueOf((zotVar.c << 32) | (zotVar.d & 4294967295L)));
        }
        boolean z2 = z;
        Iterator it = DesugarCollections.unmodifiableList(((zot) zoqVar.b).e).iterator();
        while (it.hasNext()) {
            a(((Integer) it.next()).intValue(), z2, zoqVarArr, pdiVar, map, zluVar, zmqVar);
        }
    }

    public static final void b(zpn zpnVar, pdh pdhVar, pdi pdiVar, zlu zluVar) {
        if (pdiVar.b.size() == 1) {
            if ((zluVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                zluVar.y();
            }
            zlv zlvVar = (zlv) zluVar.b;
            zlv zlvVar2 = zlv.a;
            zlvVar.e = zpnVar;
            zlvVar.b |= 2;
            return;
        }
        zpk zpkVar = pde.a(pdhVar).d;
        if (zpkVar == null) {
            zpkVar = zpk.a;
        }
        zpn zpnVar2 = zpkVar.f;
        if (zpnVar2 == null) {
            zpnVar2 = zpn.a;
        }
        if ((zluVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zluVar.y();
        }
        zlv zlvVar3 = (zlv) zluVar.b;
        zlv zlvVar4 = zlv.a;
        zpnVar2.getClass();
        zlvVar3.e = zpnVar2;
        zlvVar3.b |= 2;
    }

    public static final void c(zmm zmmVar, zoq[] zoqVarArr) {
        if (zoqVarArr == null) {
            return;
        }
        int iA = zmo.a(((zmp) zmmVar.b).d);
        if (iA == 0) {
            iA = 1;
        }
        zlz zlzVar = zlz.a;
        zly zlyVar = new zly();
        for (int i = iA != 4 ? 0 : 1; i < zoqVarArr.length; i++) {
            zot zotVar = (zot) zoqVarArr[i].v();
            if ((zlyVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                zlyVar.y();
            }
            zlz zlzVar2 = (zlz) zlyVar.b;
            zotVar.getClass();
            abxs abxsVar = zlzVar2.b;
            if (!abxsVar.c()) {
                int size = abxsVar.size();
                zlzVar2.b = abxsVar.d(size + size);
            }
            zlzVar2.b.add(zotVar);
        }
        zmmVar.f(zma.a, (zlz) zlyVar.v());
    }
}
