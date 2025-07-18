package defpackage;

import com.google.android.libraries.elements.interfaces.ResourceLoader;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tnd extends agtu implements agvb {
    int a;
    final /* synthetic */ tne b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tnd(tne tneVar, agsw agswVar) {
        super(2, agswVar);
        this.b = tneVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tnd) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) throws Throwable {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            zyd zydVarA = ((tnz) this.b.a.a()).a();
            this.a = 1;
            obj = ahkr.b(zydVarA, this);
            if (obj == agtgVar) {
                return agtgVar;
            }
        }
        return ((ResourceLoader) obj).cacheResources();
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new tnd(this.b, agswVar);
    }
}
