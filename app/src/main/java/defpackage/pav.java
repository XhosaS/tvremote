package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pav implements paw {
    public final zyg a;
    public final Set b;

    public pav(zyg zygVar, Set set) {
        this.a = zygVar;
        this.b = set;
    }

    @Override // defpackage.paw
    public final zyd a(final pbd pbdVar) {
        return zxn.l(wyo.b(new zvh() { // from class: pat
            @Override // defpackage.zvh
            public final zyd a() {
                final ArrayList arrayList = new ArrayList(1);
                pav pavVar = this.a;
                zaq zaqVar = new zaq(((zdd) pavVar.b).b);
                while (zaqVar.hasNext()) {
                    arrayList.add(((paw) zaqVar.next()).a(pbdVar));
                }
                return zxn.c(arrayList).a(new Callable() { // from class: pau
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Iterator it = arrayList.iterator();
                        par parVar = null;
                        while (it.hasNext()) {
                            par parVar2 = (par) zxn.o((zyd) it.next());
                            if (parVar2 != null) {
                                yqw.M(parVar == null, "More than one auth provider provided result.");
                                parVar = parVar2;
                            }
                        }
                        if (parVar != null) {
                            return parVar;
                        }
                        throw new UnsupportedOperationException("Unknown LogAuthSpec or Missing Module.");
                    }
                }, pavVar.a);
            }
        }), this.a);
    }
}
