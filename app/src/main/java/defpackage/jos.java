package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jos extends agtu implements agvb {
    final /* synthetic */ Intent a;
    final /* synthetic */ jot b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jos(Intent intent, jot jotVar, String str, agsw agswVar) {
        super(2, agswVar);
        this.a = intent;
        this.b = jotVar;
        this.c = str;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jos) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        jlv jlvVar = this.a.getBooleanExtra("use_invocation_type_intent", false) ? jlv.INVOCATION_TYPE_INTENT : jlv.INVOCATION_TYPE_CLIENT_INPUT_INTENT;
        this.b.d.A(this.c, true, jlvVar);
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new jos(this.a, this.b, this.c, agswVar);
    }
}
