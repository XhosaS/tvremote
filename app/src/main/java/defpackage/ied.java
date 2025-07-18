package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ied extends agtu implements agvb {
    final /* synthetic */ iep a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ied(iep iepVar, agsw agswVar) {
        super(2, agswVar);
        this.a = iepVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ied) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        this.a.e.setResult(-1, new Intent().putExtra("dsc_setup_result", 1));
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new ied(this.a, agswVar);
    }
}
