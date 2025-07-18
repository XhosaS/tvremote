package defpackage;

import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wcl implements wey {
    final /* synthetic */ wbm a;
    final /* synthetic */ wbm b;

    public wcl(wbm wbmVar, wbm wbmVar2) {
        this.a = wbmVar;
        this.b = wbmVar2;
    }

    @Override // defpackage.wey
    public final zyd a() {
        final zyd zydVarA = this.a.a();
        final zyd zydVarA2 = this.b.a();
        return xab.d(zydVarA, zydVarA2).a(new Callable() { // from class: wck
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object objO = zxn.o(zydVarA);
                objO.getClass();
                Object objO2 = zxn.o(zydVarA2);
                objO2.getClass();
                return agrj.e((Map) objO, (Map) objO2);
            }
        }, zwk.a);
    }
}
