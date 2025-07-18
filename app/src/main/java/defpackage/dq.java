package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dq {
    public static final dy a = new dw();
    public static final dy b;

    static {
        dy dyVar = null;
        try {
            Class<?> cls = Class.forName("androidx.transition.FragmentTransitionSupport");
            cls.getClass();
            dyVar = (dy) cls.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = dyVar;
    }

    public static final String a(we weVar, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : weVar.entrySet()) {
            if (agvy.c(entry.getValue(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        return (String) agqq.o(arrayList);
    }

    public static final void b(List list, int i) {
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i);
        }
    }
}
