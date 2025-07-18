package defpackage;

import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fti implements gyi {
    private final agow a;
    private final gyx b;
    private final Set c;
    private final Set d;

    public fti(agow agowVar) {
        agowVar.getClass();
        this.a = agowVar;
        this.b = gyx.t;
        this.c = hag.a;
        Set setSingleton = Collections.singleton(gyx.Q);
        setSingleton.getClass();
        this.d = setSingleton;
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
        ftl ftlVar = (ftl) this.a.a();
        ahnm ahnmVar = new ahnm(false);
        ftlVar.a.d(new fxk(fth.a, new ftj(ahnmVar, ftlVar)));
        Object objA = ftl.a(ahnmVar, ftlVar, agswVar);
        agtg agtgVar = agtg.a;
        if (objA != agtgVar) {
            objA = agpu.a;
        }
        return objA == agtgVar ? objA : agpu.a;
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
