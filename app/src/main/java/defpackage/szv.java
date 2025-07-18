package defpackage;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class szv {
    public final ahbt a;
    public final Set b = new LinkedHashSet();
    public final Map c = new LinkedHashMap();
    private final sjp d;

    public szv(ahbt ahbtVar) {
        this.a = ahbtVar;
        this.d = new sjp(ahbtVar);
    }

    public final zyd a(agux aguxVar) {
        return this.d.a(new szt(this, aguxVar, null));
    }
}
