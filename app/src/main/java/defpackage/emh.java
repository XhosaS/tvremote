package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class emh implements elz {
    private Map a;
    private List b;
    private Map c;
    public final int d;
    private List e;

    public emh(int i) {
        List list = Collections.EMPTY_LIST;
        List list2 = Collections.EMPTY_LIST;
        this.d = i;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e((emg) it.next());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            d((emg) it2.next());
        }
    }

    private static void a(Map map, List list, emg emgVar) {
        emf emfVar = emgVar.a;
        if (((emg) map.put(emfVar.getClass(), emgVar)) != null) {
            int size = list.size();
            do {
                size--;
                if (size < 0) {
                    throw new IllegalStateException("Extension Map and Extension List out of sync!");
                }
            } while (((emg) list.get(size)).a.getClass() != emfVar.getClass());
            list.remove(size);
        }
        list.add(emgVar);
    }

    @Override // defpackage.elz
    public final boolean ae() {
        throw null;
    }

    public final void d(emg emgVar) {
        if (this.e == null) {
            this.e = new ArrayList();
            if (this.c != null) {
                throw new IllegalStateException("Extension Map and Extension List out of sync!");
            }
            this.c = new HashMap();
        }
        a(this.c, this.e, emgVar);
    }

    public final void e(emg emgVar) {
        if (this.b == null) {
            this.b = new ArrayList();
            if (this.a != null) {
                throw new IllegalStateException("Extension Map and Extension List out of sync!");
            }
            this.a = new HashMap();
        }
        a(this.a, this.b, emgVar);
    }

    @Override // defpackage.elz
    public final elw v() {
        throw null;
    }

    @Override // defpackage.elz
    public final Object w(Context context) {
        throw null;
    }

    @Override // defpackage.elz
    public final Object z() {
        throw null;
    }
}
