package defpackage;

import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gny implements gyi {
    final /* synthetic */ gnz a;
    private final gyx b = gyx.C;
    private final Set c;
    private final Set d;

    public gny(gnz gnzVar) {
        this.a = gnzVar;
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
        gnz gnzVar = this.a;
        gnzVar.a.addOnActiveSessionsChangedListener(gnzVar.e, null, gnzVar.b);
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
