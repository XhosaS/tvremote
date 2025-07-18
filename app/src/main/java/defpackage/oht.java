package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
class oht implements nzk {
    final /* synthetic */ ohu b;

    public oht(ohu ohuVar) {
        this.b = ohuVar;
    }

    @Override // defpackage.nzk
    public final nzm a(dru druVar, int i) {
        if (((oij) ohq.b.get(i)) != null) {
            ohu ohuVar = this.b;
            if (ohu.b.compareAndSet(true, false)) {
                final ohz ohzVar = ohuVar.g;
                ohzVar.b.execute(new Runnable() { // from class: ohy
                    @Override // java.lang.Runnable
                    public final void run() {
                        ohz ohzVar2;
                        Collection collection = abns.b;
                        ArrayList arrayList = new ArrayList(abns.c);
                        ArrayList arrayList2 = new ArrayList(abns.b);
                        oij oijVar = oij.COMPONENT_MATERIALIZATION;
                        Iterator it = ohz.a(arrayList).iterator();
                        while (true) {
                            ohzVar2 = ohzVar;
                            if (!it.hasNext()) {
                                break;
                            }
                            oig oigVar = (oig) it.next();
                            oigVar.b(oij.NATIVE_LIBRARY_CHECK.w);
                            ohzVar2.a.d(ohzVar2.c, oigVar.a());
                        }
                        for (oig oigVar2 : ohz.a(arrayList2)) {
                            oigVar2.b(oij.NATIVE_LIBRARY_LOAD.w);
                            ohzVar2.a.d(ohzVar2.c, oigVar2.a());
                        }
                    }
                });
            }
            ocd ocdVar = (ocd) druVar.h(ocd.class);
            if (ocdVar != null && ocdVar.b.compareAndSet(true, false)) {
                return new ohq(i, ohuVar.f, ohuVar.c, ohuVar.d, ohuVar.e, druVar);
            }
        }
        return nzm.a;
    }

    @Override // defpackage.nzk
    public final boolean b() {
        return true;
    }

    @Override // defpackage.nzk
    public final /* synthetic */ Map c(dzh dzhVar) {
        return nzi.a(this, dzhVar);
    }
}
