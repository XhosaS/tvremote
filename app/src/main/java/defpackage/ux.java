package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ux {
    public final Map b = new LinkedHashMap();
    public final Map c = new LinkedHashMap();
    private final Map a = new LinkedHashMap();
    public final List d = new ArrayList();
    public final transient Map e = new LinkedHashMap();
    public final Map f = new LinkedHashMap();
    public final Bundle g = new Bundle();

    public static final Integer d() {
        agwt agwtVar = agwu.a;
        return Integer.valueOf(agwu.b.c() + 65536);
    }

    private final void h(String str) {
        if (((Integer) this.c.get(str)) == null) {
            Iterator itA = agxv.a(new agxr()).a();
            while (itA.hasNext()) {
                Number number = (Number) itA.next();
                if (!this.b.containsKey(Integer.valueOf(number.intValue()))) {
                    e(number.intValue(), str);
                    return;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    }

    public abstract void a(int i, vb vbVar, Object obj);

    public final ur b(String str, vb vbVar, uq uqVar) {
        h(str);
        this.e.put(str, new ut(uqVar, vbVar));
        Map map = this.f;
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            map.remove(str);
            uqVar.a(obj);
        }
        Bundle bundle = this.g;
        ActivityResult activityResult = (ActivityResult) fp.a(bundle, str, ActivityResult.class);
        if (activityResult != null) {
            bundle.remove(str);
            uqVar.a(vbVar.a(activityResult.a, activityResult.b));
        }
        return new uw(this, str, vbVar);
    }

    public final ur c(final String str, bcl bclVar, final vb vbVar, final uq uqVar) {
        bcg bcgVarEk = bclVar.ek();
        if (bcgVarEk.a().a(bcf.d)) {
            throw new IllegalStateException("LifecycleOwner " + bclVar + " is attempting to register while current state is " + bcgVarEk.a() + ". LifecycleOwners must call register before they are STARTED.");
        }
        h(str);
        Map map = this.a;
        uu uuVar = (uu) map.get(str);
        if (uuVar == null) {
            uuVar = new uu(bcgVarEk);
        }
        bcj bcjVar = new bcj() { // from class: us
            @Override // defpackage.bcj
            public final void a(bcl bclVar2, bce bceVar) {
                ux uxVar = this.a;
                String str2 = str;
                if (bce.ON_START != bceVar) {
                    if (bce.ON_STOP == bceVar) {
                        uxVar.e.remove(str2);
                        return;
                    } else {
                        if (bce.ON_DESTROY == bceVar) {
                            uxVar.f(str2);
                            return;
                        }
                        return;
                    }
                }
                vb vbVar2 = vbVar;
                uq uqVar2 = uqVar;
                uxVar.e.put(str2, new ut(uqVar2, vbVar2));
                Map map2 = uxVar.f;
                if (map2.containsKey(str2)) {
                    Object obj = map2.get(str2);
                    map2.remove(str2);
                    uqVar2.a(obj);
                }
                Bundle bundle = uxVar.g;
                ActivityResult activityResult = (ActivityResult) fp.a(bundle, str2, ActivityResult.class);
                if (activityResult != null) {
                    bundle.remove(str2);
                    uqVar2.a(new ActivityResult(activityResult.a, activityResult.b));
                }
            }
        };
        uuVar.a.b(bcjVar);
        uuVar.b.add(bcjVar);
        map.put(str, uuVar);
        return new uv(this, str, vbVar);
    }

    public final void e(int i, String str) {
        Map map = this.b;
        Integer numValueOf = Integer.valueOf(i);
        map.put(numValueOf, str);
        this.c.put(str, numValueOf);
    }

    public final void f(String str) {
        Integer num;
        if (!this.d.contains(str) && (num = (Integer) this.c.remove(str)) != null) {
            this.b.remove(num);
        }
        this.e.remove(str);
        Map map = this.f;
        if (map.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + map.get(str));
            map.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((ActivityResult) fp.a(bundle, str, ActivityResult.class)));
            bundle.remove(str);
        }
        Map map2 = this.a;
        uu uuVar = (uu) map2.get(str);
        if (uuVar != null) {
            List list = uuVar.b;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                uuVar.a.c((bcj) it.next());
            }
            list.clear();
            map2.remove(str);
        }
    }

    public final boolean g(int i, int i2, Intent intent) {
        String str = (String) this.b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        ut utVar = (ut) this.e.get(str);
        if ((utVar != null ? utVar.a : null) != null) {
            List list = this.d;
            if (list.contains(str)) {
                utVar.a.a(utVar.b.a(i2, intent));
                list.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new ActivityResult(i2, intent));
        return true;
    }
}
