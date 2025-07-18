package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ufh {
    public final String a;
    public final List b = new ArrayList();

    public ufh(String str, List list) {
        this.a = str;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ufj ufjVar = (ufj) it.next();
            int i = 0;
            while (true) {
                if (i >= this.b.size()) {
                    this.b.add(ufjVar);
                    break;
                } else {
                    if (((ufj) this.b.get(i)).a.equals(ufjVar.a)) {
                        this.b.set(i, ufjVar);
                        break;
                    }
                    i++;
                }
            }
        }
    }
}
