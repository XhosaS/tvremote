package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ufj {
    public final String a;
    public final List b = new ArrayList();

    public ufj(String str, List list) {
        this.a = str;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ufl uflVar = (ufl) it.next();
            int i = 0;
            while (true) {
                if (i >= this.b.size()) {
                    this.b.add(uflVar);
                    break;
                } else {
                    if (((ufl) this.b.get(i)).a.equals(uflVar.a)) {
                        this.b.set(i, uflVar);
                        break;
                    }
                    i++;
                }
            }
        }
    }
}
