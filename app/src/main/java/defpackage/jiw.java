package defpackage;

import com.google.assistant.sdk.libassistant.ActionExecutor;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jiw extends agtu implements agvb {
    int a;
    final /* synthetic */ ahcb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jiw(ahcb ahcbVar, agsw agswVar) {
        super(2, agswVar);
        this.b = ahcbVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jiw) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
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
        List listC = jhyVar.c(xheVar);
        zdy zdyVar = jjc.a;
        xjv xjvVar = xheVar.c;
        if (xjvVar == null) {
            xjvVar = xjv.a;
        }
        xju xjuVarB = xju.b(xjvVar.c);
        if (xjuVarB == null) {
            xjuVarB = xju.OK;
        }
        return xjuVarB == xju.OK ? new ActionExecutor.Result(ActionExecutor.Status.OK, "", listC) : new ActionExecutor.Result(ActionExecutor.Status.CANCELLED, "", listC);
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new jiw(this.b, agswVar);
    }
}
