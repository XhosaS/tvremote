package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cz {
    public static final dg a = new df();
    public static final dg b;

    static {
        dg dgVar = null;
        try {
            Class<?> cls = Class.forName("androidx.transition.FragmentTransitionSupport");
            cls.getClass();
            dgVar = (dg) cls.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = dgVar;
    }

    public static final void a(bv bvVar, bv bvVar2, boolean z, ir irVar, boolean z2) {
        if ((z ? bvVar2.getEnterTransitionCallback() : bvVar.getEnterTransitionCallback()) != null) {
            ArrayList arrayList = new ArrayList(irVar.d);
            Iterator it = irVar.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add((View) ((Map.Entry) it.next()).getValue());
            }
            ArrayList arrayList2 = new ArrayList(irVar.d);
            Iterator it2 = irVar.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList2.add((String) ((Map.Entry) it2.next()).getKey());
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public static final void b(List list, int i) {
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i);
        }
    }
}
