package defpackage;

import java.util.IdentityHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afef {
    public afeh a;
    public IdentityHashMap b;

    public afef(afeh afehVar) {
        this.a = afehVar;
    }

    public final afeh a() {
        if (this.b != null) {
            afeh afehVar = this.a;
            afeh afehVar2 = afeh.a;
            for (Map.Entry entry : afehVar.b.entrySet()) {
                if (!this.b.containsKey(entry.getKey())) {
                    this.b.put((afeg) entry.getKey(), entry.getValue());
                }
            }
            this.a = new afeh(this.b);
            this.b = null;
        }
        return this.a;
    }

    public final void b(afeg afegVar, Object obj) {
        if (this.b == null) {
            this.b = new IdentityHashMap(1);
        }
        this.b.put(afegVar, obj);
    }
}
