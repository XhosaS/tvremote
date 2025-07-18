package defpackage;

import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gwi implements gyi {
    private final agow a;
    private final agow b;
    private final gyx c;
    private final Set d;
    private final Set e;

    public gwi(agow agowVar, agow agowVar2) {
        agowVar.getClass();
        agowVar2.getClass();
        this.a = agowVar;
        this.b = agowVar2;
        this.c = gyx.N;
        Set setSingleton = Collections.singleton(hag.d);
        setSingleton.getClass();
        this.d = setSingleton;
        Set setSingleton2 = Collections.singleton(gyx.Q);
        setSingleton2.getClass();
        this.e = setSingleton2;
    }

    @Override // defpackage.gzc
    public final int a() {
        return ((Boolean) this.a.a()).booleanValue() ? 1073741823 : -1073741824;
    }

    @Override // defpackage.gzc
    public final gyx b() {
        return this.c;
    }

    @Override // defpackage.gyi
    public final Object c(agsw agswVar) {
        Object objB = ((gvy) this.b.a()).b(agswVar);
        return objB == agtg.a ? objB : agpu.a;
    }

    @Override // defpackage.gyi
    public final Set d() {
        return this.e;
    }

    @Override // defpackage.gyi
    public final Set e() {
        return this.d;
    }

    @Override // defpackage.gyi
    public final int f() {
        return 1;
    }
}
