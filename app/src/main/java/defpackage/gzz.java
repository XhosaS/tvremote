package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gzz extends agtu implements agvb {
    int a;
    final /* synthetic */ hab b;
    final /* synthetic */ Intent c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gzz(hab habVar, Intent intent, agsw agswVar) {
        super(2, agswVar);
        this.b = habVar;
        this.c = intent;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gzz) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            hab habVar = this.b;
            Intent intent = this.c;
            this.a = 1;
            if (habVar.c(intent, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gzz(this.b, this.c, agswVar);
    }
}
