package defpackage;

import com.google.assistant.sdk.libassistant.ActionExecutor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jjk extends agtu implements agvb {
    int a;
    final /* synthetic */ ahcb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jjk(ahcb ahcbVar, agsw agswVar) {
        super(2, agswVar);
        this.b = ahcbVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jjk) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            ahcb ahcbVar = this.b;
            this.a = 1;
            obj = ahcbVar.a(this);
            if (obj == agtgVar) {
                return agtgVar;
            }
        }
        xhe xheVar = (xhe) obj;
        jhy jhyVar = jhy.a;
        xheVar.getClass();
        return new ActionExecutor.Result(ActionExecutor.Status.OK, "", jhyVar.c(xheVar));
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new jjk(this.b, agswVar);
    }
}
