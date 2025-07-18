package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class edm {
    public final ecf a;

    public edm(ecf ecfVar) {
        this.a = ecfVar;
    }

    public static List a(int i, List list) {
        ArrayList arrayList = new ArrayList(i);
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            ejb ejbVar = (ejb) it.next();
            int i3 = i2 + 1;
            if (i2 == i) {
                break;
            }
            arrayList.add(ejbVar.a);
            i2 = i3;
        }
        return arrayList;
    }

    public static List b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((dtd) it.next()).b);
        }
        return arrayList;
    }

    public static List c(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((dtd) it.next()).a);
        }
        return arrayList;
    }
}
