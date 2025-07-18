package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fxn extends agtu implements agvb {
    final /* synthetic */ fxq a;
    final /* synthetic */ fxr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxn(fxq fxqVar, fxr fxrVar, agsw agswVar) {
        super(2, agswVar);
        this.a = fxqVar;
        this.b = fxrVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fxn) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        fxq fxqVar = this.a;
        fxr fxrVar = this.b;
        fxqVar.c(fxrVar);
        Intent intent = new Intent("com.google.android.katniss.DATA_STORE_CHANGED");
        intent.setPackage("com.google.android.katniss");
        intent.putExtra("com.google.android.katniss.ProcessId", fxqVar.b.j.a);
        intent.putExtra("FIELD_PATH", fxrVar.a);
        fxqVar.a.sendBroadcast(intent);
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new fxn(this.a, this.b, agswVar);
    }
}
