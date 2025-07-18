package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ger implements gyi {
    private final agow a;
    private final agow b;
    private final agow c;
    private final hag d;
    private final agow e;
    private final gyx f;
    private final Set g;
    private final Set h;

    public ger(agow agowVar, agow agowVar2, agow agowVar3, hag hagVar, agow agowVar4) {
        agowVar.getClass();
        agowVar2.getClass();
        agowVar3.getClass();
        hagVar.getClass();
        agowVar4.getClass();
        this.a = agowVar;
        this.b = agowVar2;
        this.c = agowVar3;
        this.d = hagVar;
        this.e = agowVar4;
        this.f = gyx.z;
        this.g = agqj.p(new hag[]{hag.d, hag.g});
        this.h = agrf.a;
    }

    @Override // defpackage.gzc
    public final int a() {
        return 1073741823;
    }

    @Override // defpackage.gzc
    public final gyx b() {
        return this.f;
    }

    @Override // defpackage.gyi
    public final Object c(agsw agswVar) {
        hag hagVar = this.d;
        if (hagVar == hag.d) {
            ((ghr) this.e.a()).V(2);
            ((gmd) this.b.a()).h();
            ((glk) this.a.a()).a();
            ((glg) this.c.a()).c(yea.IDLE);
        } else if (hagVar == hag.g) {
            ((ghr) this.e.a()).V(3);
            ((gmd) this.b.a()).i();
        }
        return agpu.a;
    }

    @Override // defpackage.gyi
    public final Set d() {
        return this.h;
    }

    @Override // defpackage.gyi
    public final Set e() {
        return this.g;
    }

    @Override // defpackage.gyi
    public final int f() {
        return 1;
    }
}
