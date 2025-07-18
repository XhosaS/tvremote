package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fuu extends fux {
    public final Map a;
    private final List t;

    public fuu(fuw fuwVar, String str, String str2) {
        super(fuwVar, str, str2, false);
        this.t = new ArrayList();
        this.a = new ir();
    }

    final void a(Collection collection) {
        this.s.clear();
        List list = this.t;
        list.clear();
        Map map = this.a;
        map.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            fui fuiVar = (fui) it.next();
            fux fuxVarB = this.b.b(fuiVar.a.n());
            if (fuxVarB != null) {
                list.add(fuxVarB);
                map.put(fuxVarB.d, fuiVar);
                int i = fuiVar.b;
                if (i == 2 || i == 3) {
                    this.s.add(fuxVarB);
                }
            }
        }
        fuy.a().a.a(259, this);
    }

    public final boolean b() {
        fuy.e();
        ftw ftwVarA = fuy.a();
        ArrayList arrayList = new ArrayList();
        Iterator it = ftwVarA.j.values().iterator();
        while (it.hasNext()) {
            fuu fuuVar = ((ftv) it.next()).b;
        }
        return arrayList.contains(this);
    }

    public final boolean c(fux fuxVar) {
        fui fuiVar = (fui) this.a.get(fuxVar.d);
        return fuiVar != null && fuiVar.d;
    }

    public final boolean d(fux fuxVar) {
        fui fuiVar = (fui) this.a.get(fuxVar.d);
        return fuiVar != null && fuiVar.e;
    }

    public final boolean e(fux fuxVar) {
        fui fuiVar = (fui) this.a.get(fuxVar.d);
        return fuiVar != null && fuiVar.c;
    }
}
