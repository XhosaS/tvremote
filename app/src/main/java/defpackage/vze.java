package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vze extends beb {
    public final Map a = new HashMap();
    public final Map b = new HashMap();
    public final vrn c = new vrn("SubscriptionMixinVM");
    public final Set d = new HashSet();
    public final vrl e;
    public final vyl f;
    public final Executor g;
    public final mcw i;

    public vze(mcw mcwVar, vyl vylVar, Executor executor) {
        this.i = mcwVar;
        this.f = vylVar;
        this.g = executor;
        vrl vrlVar = new vrl(executor);
        this.e = vrlVar;
        vrlVar.c();
    }

    @Override // defpackage.beb
    protected final void c() {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((vzq) it.next()).a();
        }
        Iterator it2 = this.b.values().iterator();
        while (it2.hasNext()) {
            ((vzq) it2.next()).a();
        }
        this.e.a().clear();
    }
}
