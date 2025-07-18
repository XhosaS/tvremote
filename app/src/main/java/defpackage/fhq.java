package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fhq implements gyi {
    private final agow a;
    private final gyx b;
    private final Set c;
    private final Set d;

    public fhq(agow agowVar) {
        agowVar.getClass();
        this.a = agowVar;
        this.b = gyx.j;
        this.c = agqj.p(new hag[]{hag.d, hag.g});
        this.d = agrf.a;
    }

    @Override // defpackage.gzc
    public final int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.gzc
    public final gyx b() {
        return this.b;
    }

    @Override // defpackage.gyi
    public final Object c(agsw agswVar) {
        Object objA = ((fhi) this.a.a()).a(agswVar);
        return objA == agtg.a ? objA : agpu.a;
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
