package defpackage;

import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jhi implements gyi {
    private final jhv a;
    private final gyx b;
    private final Set c;
    private final Set d;

    public jhi(jhv jhvVar) {
        jhvVar.getClass();
        this.a = jhvVar;
        this.b = gyx.b;
        Set setSingleton = Collections.singleton(hag.d);
        setSingleton.getClass();
        this.c = setSingleton;
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
        Object objA = this.a.a();
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
