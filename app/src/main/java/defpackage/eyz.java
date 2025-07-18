package defpackage;

import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eyz implements gyi {
    private final agow a;
    private final gyx b;
    private final Set c;
    private final Set d;

    public eyz(agow agowVar) {
        agowVar.getClass();
        this.a = agowVar;
        this.b = gyx.w;
        Set setSingleton = Collections.singleton(hag.g);
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
        eyp eypVar = (eyp) this.a.a();
        eypVar.a.registerActivityLifecycleCallbacks(new eyo(eypVar));
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
