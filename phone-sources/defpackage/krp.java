package defpackage;

import com.google.common.collect.HashMultimap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class krp {
    public final HashMultimap a = HashMultimap.create();
    public yjk b = new jzm(16);
    public yjk c = new jzm(17);

    public final ids a(Object obj) {
        Set set = this.a.get(obj);
        set.getClass();
        ksb ksbVar = (ksb) yfm.T(set);
        if (ksbVar != null) {
            return ksbVar;
        }
        ksb ksbVar2 = new ksb();
        ksbVar2.b = new kfy(this, obj, ksbVar2, 3);
        ksbVar2.c = new kfy(this, obj, ksbVar2, 4);
        return ksbVar2;
    }

    public final void b(Object obj) {
        Set set = this.a.get(obj);
        set.getClass();
        Iterator it = yfm.al(set).iterator();
        while (it.hasNext()) {
            Iterator it2 = yfm.al(((ksb) it.next()).a).iterator();
            while (it2.hasNext()) {
                ((iej) it2.next()).dM();
            }
        }
    }
}
