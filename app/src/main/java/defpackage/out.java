package defpackage;

import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class out implements aejg {
    public static zyh b() {
        zyw zywVar = new zyw();
        zywVar.b("GhaSingleThread-%d");
        zyh zyhVarB = zyn.b(Executors.newSingleThreadScheduledExecutor(zyw.a(zywVar)));
        zyhVarB.getClass();
        return zyhVarB;
    }

    @Override // defpackage.agow
    public final /* bridge */ /* synthetic */ Object a() {
        throw null;
    }
}
