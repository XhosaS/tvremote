package defpackage;

import com.google.assistant.sdk.libassistant.ActionExecutor;
import j$.time.Duration;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jhm extends agtu implements agvb {
    int a;
    final /* synthetic */ gez b;
    final /* synthetic */ jhr c;
    final /* synthetic */ String d;
    final /* synthetic */ Map e;
    final /* synthetic */ ActionExecutor.ResponseParams f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jhm(gez gezVar, jhr jhrVar, String str, Map map, ActionExecutor.ResponseParams responseParams, agsw agswVar) {
        super(2, agswVar);
        this.b = gezVar;
        this.c = jhrVar;
        this.d = str;
        this.e = map;
        this.f = responseParams;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jhm) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        rqw rqwVarC;
        agtg agtgVar = agtg.a;
        try {
            if (this.a != 0) {
                agpl.b(obj);
            } else {
                agpl.b(obj);
                Duration duration = jhx.a;
                Duration duration2 = jhx.c;
                jhl jhlVar = new jhl(this.c, this.b, this.d, this.e, this.f, null);
                this.a = 1;
                obj = zty.b(duration2, jhlVar, this);
                if (obj == agtgVar) {
                    return agtgVar;
                }
            }
            return (ActionExecutor.Result) obj;
        } catch (ahem e) {
            gez gezVar = this.b;
            if (gezVar != null) {
                jhr jhrVar = this.c;
                agow agowVar = jhrVar.e;
                gey geyVar = gez.a;
                if (geyVar.b(gezVar, agowVar, jhrVar.d) && (rqwVarC = gfb.c(gezVar, agowVar)) != null) {
                    geyVar.d(((gfn) jhrVar.h.a()).c(rqwVarC), gezVar, 4, 6).c(abqb.DEADLINE_EXCEEDED);
                }
            }
            zdv zdvVar = (zdv) ((zdv) jhr.a.d()).p(e).q("com/google/android/apps/tvsearch/voice/libassistant/DelegatingActionExecutor$executeActionBlocking$1", "invokeSuspend", 462, "DelegatingActionExecutor.kt");
            jiq jiqVar = (jiq) this.c.p.get(this.d);
            zdvVar.x("Timed out during ExecuteAction delegating to %s.", jiqVar != null ? jiqVar.c() : null);
            return new ActionExecutor.Result(ActionExecutor.Status.UNKNOWN, "Timed out during execution.");
        }
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new jhm(this.b, this.c, this.d, this.e, this.f, agswVar);
    }
}
