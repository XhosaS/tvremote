package defpackage;

import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gty implements gyi {
    private final agow a;
    private final gyx b = gyx.r;
    private final Set c = agqj.p(new hag[]{hag.d, hag.g});
    private final Set d;

    public gty(agow agowVar) {
        this.a = agowVar;
        Set setSingleton = Collections.singleton(gyx.Q);
        setSingleton.getClass();
        this.d = setSingleton;
    }

    @Override // defpackage.gzc
    public final int a() {
        return 1073741823;
    }

    @Override // defpackage.gzc
    public final gyx b() {
        return this.b;
    }

    @Override // defpackage.gyi
    public final Object c(agsw agswVar) {
        gva gvaVar = (gva) this.a.a();
        int i = gva.d;
        Object objS = gvaVar.s(agswVar);
        return objS == agtg.a ? objS : agpu.a;
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
