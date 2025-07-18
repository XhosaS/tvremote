package defpackage;

import j$.util.DesugarCollections;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ewc {
    public final Set a;

    public ewc() {
        Set setSynchronizedSet = DesugarCollections.synchronizedSet(new LinkedHashSet());
        setSynchronizedSet.getClass();
        this.a = setSynchronizedSet;
    }

    public final void a(ewb ewbVar) {
        ewbVar.getClass();
        this.a.remove(ewbVar);
    }

    public final void b(ewb ewbVar) {
        ewbVar.getClass();
        this.a.add(ewbVar);
    }
}
