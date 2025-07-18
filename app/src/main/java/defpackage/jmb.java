package defpackage;

import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jmb implements gyi {
    private final agow a;
    private final agow b;
    private final gyx c;
    private final Set d;
    private final Set e;

    public jmb(agow agowVar, agow agowVar2) {
        agowVar.getClass();
        agowVar2.getClass();
        this.a = agowVar;
        this.b = agowVar2;
        this.c = gyx.v;
        Set setSingleton = Collections.singleton(hag.d);
        setSingleton.getClass();
        this.d = setSingleton;
        this.e = agrf.a;
    }

    @Override // defpackage.gzc
    public final int a() {
        return 0;
    }

    @Override // defpackage.gzc
    public final gyx b() {
        return this.c;
    }

    @Override // defpackage.gyi
    public final Object c(agsw agswVar) {
        agow agowVar = this.a;
        jlr jlrVar = (jlr) agowVar.a();
        agow agowVar2 = this.b;
        Object objA = agowVar2.a();
        objA.getClass();
        jlrVar.at((jlt) objA);
        ((jma) agowVar2.a()).l(((jlr) agowVar.a()).Z());
        return agpu.a;
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
