package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
class mur {
    public final agfx a;
    public final agfx b;
    public final AtomicReference c = new AtomicReference();
    public final AtomicBoolean d = new AtomicBoolean(true);
    public final muv e;

    public mur(muv muvVar, agfx agfxVar, agfx agfxVar2) {
        this.e = muvVar;
        this.a = agfxVar;
        this.b = agfxVar2;
    }

    final void a() {
        aggi aggiVar = (aggi) this.c.getAndSet(null);
        if (aggiVar != null) {
            aggiVar.dispose();
        }
    }
}
