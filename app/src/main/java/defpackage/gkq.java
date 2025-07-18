package defpackage;

import j$.time.Duration;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gkq implements gyi {
    final /* synthetic */ agow a;
    private final gyx b = gyx.B;
    private final Set c;
    private final Set d;

    public gkq(agow agowVar) {
        this.a = agowVar;
        Set setSingleton = Collections.singleton(hag.d);
        setSingleton.getClass();
        this.c = setSingleton;
        this.d = agrf.a;
    }

    @Override // defpackage.gzc
    public final int a() {
        return 0;
    }

    @Override // defpackage.gzc
    public final gyx b() {
        return this.b;
    }

    @Override // defpackage.gyi
    public final Object c(agsw agswVar) {
        gks gksVar = (gks) this.a.a();
        Duration duration = gks.a;
        gksVar.c.b(gksVar);
        return agpu.a;
    }

    @Override // defpackage.gyi
    public final Set d() {
        return this.d;
    }

    @Override // defpackage.gyi
    public final Set e() {
        return this.c;
    }

    @Override // defpackage.gyi
    public final int f() {
        return 1;
    }
}
