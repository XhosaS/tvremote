package defpackage;

import com.google.assistant.sdk.libassistant.ActionExecutor;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jjb extends agtu implements agvb {
    int a;
    final /* synthetic */ jjc b;
    final /* synthetic */ byte[] c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jjb(jjc jjcVar, byte[] bArr, agsw agswVar) {
        super(2, agswVar);
        this.b = jjcVar;
        this.c = bArr;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jjb) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        try {
            if (this.a != 0) {
                agpl.b(obj);
            } else {
                agpl.b(obj);
                ahbt ahbtVar = (ahbt) this.d;
                zyd zydVarA = xt.a(new jiy(this.b, this.c));
                ahcb ahcbVarD = ahal.d(ahbtVar, null, 0, new jiz(zydVarA, null), 3);
                ahcbVarD.w(new jja(zydVarA));
                Duration duration = jjc.b;
                jiw jiwVar = new jiw(ahcbVarD, null);
                this.a = 1;
                obj = zty.b(duration, jiwVar, this);
                if (obj == agtgVar) {
                    return agtgVar;
                }
            }
            return (ActionExecutor.Result) obj;
        } catch (ahem e) {
            ((zdv) ((zdv) jjc.a.d()).p(e).q("com/google/android/apps/tvsearch/voice/libassistant/handlers/KidsClientOpHandler$executeParentalAuthorizationAction$2", "invokeSuspend", 109, "KidsClientOpHandler.kt")).u("Timed out during parental auth. action.");
            return new ActionExecutor.Result(ActionExecutor.Status.UNKNOWN, "Timed out during parental auth. action.");
        }
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        jjb jjbVar = new jjb(this.b, this.c, agswVar);
        jjbVar.d = obj;
        return jjbVar;
    }
}
