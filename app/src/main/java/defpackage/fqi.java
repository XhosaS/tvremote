package defpackage;

import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fqi implements gyi {
    private final agow a;
    private final gyx b;
    private final Set c;
    private final Set d;

    public fqi(agow agowVar) {
        agowVar.getClass();
        this.a = agowVar;
        this.b = gyx.R;
        Set setSingleton = Collections.singleton(hag.g);
        setSingleton.getClass();
        this.c = setSingleton;
        Set setSingleton2 = Collections.singleton(gyx.Q);
        setSingleton2.getClass();
        this.d = setSingleton2;
    }

    @Override // defpackage.gzc
    public final int a() {
        return -1073741824;
    }

    @Override // defpackage.gzc
    public final gyx b() {
        return this.b;
    }

    @Override // defpackage.gyi
    public final Object c(agsw agswVar) {
        fqm fqmVar = (fqm) this.a.a();
        fxu fxuVar = fqmVar.a;
        fxuVar.d(new fxk(fqa.b, new fqj(fqmVar)));
        fxuVar.d(new fxk(fqh.a, new fqk(fqmVar)));
        Object objA = fqm.a(fqmVar, agswVar);
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
