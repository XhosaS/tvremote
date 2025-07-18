package defpackage;

import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsc implements gyi {
    private final agow a;
    private final gyx b;
    private final Set c;
    private final Set d;

    public fsc(agow agowVar) {
        agowVar.getClass();
        this.a = agowVar;
        this.b = gyx.k;
        this.c = hag.a;
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
        fsg fsgVar = (fsg) this.a.a();
        ahnm ahnmVar = new ahnm(false);
        fxu fxuVar = fsgVar.a;
        fxuVar.d(new fxk(fqa.a, new fsd(ahnmVar, fsgVar)));
        fxuVar.d(new fxk(fry.a, new fse(ahnmVar, fsgVar)));
        Object objB = fsg.b(ahnmVar, fsgVar, agswVar);
        agtg agtgVar = agtg.a;
        if (objB != agtgVar) {
            objB = agpu.a;
        }
        return objB == agtgVar ? objB : agpu.a;
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
