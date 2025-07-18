package defpackage;

import android.content.Context;
import com.bumptech.glide.manager.LifecycleLifecycle;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dnh {
    final Map a = new HashMap();
    private final dnk b;

    public dnh(dnk dnkVar) {
        this.b = dnkVar;
    }

    final czb a(Context context, cyg cygVar, bcg bcgVar, boolean z) {
        dqm.f();
        dqm.f();
        Map map = this.a;
        czb czbVar = (czb) map.get(bcgVar);
        if (czbVar != null) {
            return czbVar;
        }
        LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(bcgVar);
        czb czbVarA = this.b.a(cygVar, lifecycleLifecycle, new dng(), context);
        map.put(bcgVar, czbVarA);
        lifecycleLifecycle.a(new dnf(this, bcgVar));
        if (!z) {
            return czbVarA;
        }
        czbVarA.m();
        return czbVarA;
    }
}
