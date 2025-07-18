package defpackage;

import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class our implements aejg {
    public static zyh b(boolean z, agow agowVar) {
        zyh zyhVarB;
        agowVar.getClass();
        if (z) {
            Object objA = agowVar.a();
            objA.getClass();
            zyhVarB = (zyh) objA;
        } else {
            zyw zywVar = new zyw();
            zywVar.b("GhaBackgroundThread-%d");
            zyhVarB = zyn.b(Executors.newScheduledThreadPool(4, zyw.a(zywVar)));
            zyhVarB.getClass();
        }
        zyhVarB.getClass();
        return zyhVarB;
    }

    @Override // defpackage.agow
    public final /* bridge */ /* synthetic */ Object a() {
        throw null;
    }
}
