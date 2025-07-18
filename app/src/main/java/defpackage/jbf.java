package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jbf extends agtu implements agvb {
    final /* synthetic */ Intent a;
    final /* synthetic */ jbg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jbf(Intent intent, jbg jbgVar, agsw agswVar) {
        super(2, agswVar);
        this.a = intent;
        this.b = jbgVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jbf) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        String action = this.a.getAction();
        if (agvy.c("android.search.action.SEARCHABLES_CHANGED", action) || agvy.c("android.search.action.SETTINGS_CHANGED", action)) {
            this.b.a.F();
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new jbf(this.a, this.b, agswVar);
    }
}
