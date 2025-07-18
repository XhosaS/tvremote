package defpackage;

import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftx implements gyi {
    private final agow a;
    private final gyx b;
    private final Set c;
    private final Set d;

    public ftx(agow agowVar) {
        agowVar.getClass();
        this.a = agowVar;
        this.b = gyx.E;
        Set setSingleton = Collections.singleton(hag.d);
        setSingleton.getClass();
        this.c = setSingleton;
        Set setSingleton2 = Collections.singleton(gyx.Q);
        setSingleton2.getClass();
        this.d = setSingleton2;
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
        fub fubVar = (fub) this.a.a();
        ahnm ahnmVar = new ahnm(false);
        fxu fxuVar = fubVar.a;
        fxuVar.d(new fxk(fqa.a, new fty(ahnmVar, fubVar)));
        fxuVar.d(new fxk(ftu.a, new ftz(ahnmVar, fubVar)));
        Object objA = fub.a(ahnmVar, fubVar, agswVar);
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
