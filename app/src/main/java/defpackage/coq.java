package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class coq extends agtu implements agvb {
    final /* synthetic */ cld a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coq(cld cldVar, agsw agswVar) {
        super(2, agswVar);
        this.a = cldVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((coq) c((chl) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        String str = cor.a;
        cbx cbxVarC = cbx.c();
        cld cldVar = this.a;
        Objects.toString(cldVar);
        cbxVarC.a(str, "Constraints changed for ".concat(String.valueOf(cldVar)));
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new coq(this.a, agswVar);
    }
}
