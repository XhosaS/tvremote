package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jmc {
    public final Set a = new LinkedHashSet();

    public final Object a(jmd jmdVar, agux aguxVar, agsw agswVar) {
        Set set = this.a;
        if (!set.contains(jmdVar)) {
            set.add(jmdVar);
            Object objA = aguxVar.a(agswVar);
            if (objA == agtg.a) {
                return objA;
            }
        }
        return agpu.a;
    }
}
