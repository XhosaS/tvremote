package defpackage;

import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gkn implements gyi {
    final /* synthetic */ gko a;
    private final gyx b = gyx.A;
    private final Set c;
    private final Set d;

    public gkn(gko gkoVar) {
        this.a = gkoVar;
        Set setSingleton = Collections.singleton(hag.d);
        setSingleton.getClass();
        this.c = setSingleton;
        this.d = agrf.a;
    }

    @Override // defpackage.gzc
    public final int a() {
        return 0;
    }

    @Override // defpackage.gzc
    public final gyx b() {
        return this.b;
    }

    @Override // defpackage.gyi
    public final Object c(agsw agswVar) {
        gko gkoVar = this.a;
        gkoVar.a.b(gkoVar);
        return agpu.a;
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
