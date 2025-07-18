package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jcw implements gyi {
    private final boolean a;
    private final Supplier b;
    private final agow c;
    private final agow d;
    private final gyx e;
    private final Set f;
    private final Set g;

    public jcw(boolean z, Supplier supplier, agow agowVar, agow agowVar2) {
        agowVar.getClass();
        agowVar2.getClass();
        this.a = z;
        this.b = supplier;
        this.c = agowVar;
        this.d = agowVar2;
        this.e = gyx.p;
        Set setSingleton = Collections.singleton(hag.d);
        setSingleton.getClass();
        this.f = setSingleton;
        this.g = agrf.a;
    }

    @Override // defpackage.gzc
    public final int a() {
        return 0;
    }

    @Override // defpackage.gzc
    public final gyx b() {
        return this.e;
    }

    @Override // defpackage.gyi
    public final Object c(agsw agswVar) {
        boolean z = false;
        if (this.a && ((Boolean) this.b.get()).booleanValue() && !((jcy) this.c.a()).b()) {
            z = true;
        }
        ((jdg) this.d.a()).a(z);
        return agpu.a;
    }

    @Override // defpackage.gyi
    public final Set d() {
        return this.g;
    }

    @Override // defpackage.gyi
    public final Set e() {
        return this.f;
    }

    @Override // defpackage.gyi
    public final int f() {
        return 1;
    }
}
