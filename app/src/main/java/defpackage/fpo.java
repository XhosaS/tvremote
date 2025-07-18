package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fpo implements gyi {
    private final agow a;
    private final gyx b = gyx.Q;
    private final Set c = agqj.p(new hag[]{hag.d, hag.g});
    private final Set d = agrf.a;

    public fpo(agow agowVar) {
        this.a = agowVar;
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
        Object objA = ((fpg) this.a.a()).a(agswVar);
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
