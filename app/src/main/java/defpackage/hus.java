package defpackage;

import android.webkit.WebSettings;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hus extends agtu implements agvb {
    final /* synthetic */ hut a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hus(hut hutVar, agsw agswVar) {
        super(2, agswVar);
        this.a = hutVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hus) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        WebSettings.getDefaultUserAgent(this.a.b);
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new hus(this.a, agswVar);
    }
}
