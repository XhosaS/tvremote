package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class adg {
    private final jc a;

    public adg() {
        jc jcVar = jd.a;
        this.a = new jc((byte[]) null);
    }

    public abstract add b(int i, int i2, int i3, long j);

    public final List e(adc adcVar, int i, long j) {
        jc jcVar = this.a;
        List list = (List) jcVar.a(i);
        List list2 = list;
        if (list == null) {
            jc jcVar2 = adcVar.c;
            List listQ = (List) jcVar2.a(i);
            if (listQ == null) {
                acy acyVar = adcVar.b;
                Object objD = acyVar.d(i);
                listQ = adcVar.a.q(objD, adcVar.d.o(i, objD, acyVar.c(i)));
                jcVar2.f(i, listQ);
            }
            int size = listQ.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((bvs) listQ.get(i2)).u(j));
            }
            jcVar.f(i, arrayList);
            list2 = arrayList;
        }
        return list2;
    }
}
