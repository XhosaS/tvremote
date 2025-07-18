package defpackage;

import com.google.assistant.sdk.libassistant.ActionExecutor;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jjp extends agtu implements agvb {
    int a;
    final /* synthetic */ jkx b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jjp(jkx jkxVar, agsw agswVar) {
        super(2, agswVar);
        this.b = jkxVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jjp) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        ahcb ahcbVar;
        Exception e;
        agtg agtgVar = agtg.a;
        if (this.a != 0) {
            ahcbVar = (ahcb) this.c;
            try {
                agpl.b(obj);
            } catch (Exception e2) {
                e = e2;
                ahcbVar.s(null);
                this.b.l = null;
                ((zdv) ((zdv) jkx.a.d()).p(e).q("com/google/android/apps/tvsearch/voice/libassistant/handlers/MediaClientOpHandler$execute$5", "invokeSuspend", 323, "MediaClientOpHandler.kt")).u("Failed to retrieve OnDeviceSearch results.");
                return new ActionExecutor.Result(ActionExecutor.Status.UNKNOWN, "Failed to retrieve OnDeviceSearch results.");
            }
        } else {
            agpl.b(obj);
            ahbt ahbtVar = (ahbt) this.c;
            zyd zydVarA = xt.a(new jjm(this.b));
            ahcb ahcbVarD = ahal.d(ahbtVar, null, 0, new jjn(zydVarA, null), 3);
            ahcbVarD.w(new jjo(zydVarA));
            try {
                Duration duration = jkx.d;
                jjk jjkVar = new jjk(ahcbVarD, null);
                this.c = ahcbVarD;
                this.a = 1;
                Object objB = zty.b(duration, jjkVar, this);
                if (objB == agtgVar) {
                    return agtgVar;
                }
                ahcbVar = ahcbVarD;
                obj = objB;
            } catch (Exception e3) {
                ahcbVar = ahcbVarD;
                e = e3;
                ahcbVar.s(null);
                this.b.l = null;
                ((zdv) ((zdv) jkx.a.d()).p(e).q("com/google/android/apps/tvsearch/voice/libassistant/handlers/MediaClientOpHandler$execute$5", "invokeSuspend", 323, "MediaClientOpHandler.kt")).u("Failed to retrieve OnDeviceSearch results.");
                return new ActionExecutor.Result(ActionExecutor.Status.UNKNOWN, "Failed to retrieve OnDeviceSearch results.");
            }
        }
        return (ActionExecutor.Result) obj;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        jjp jjpVar = new jjp(this.b, agswVar);
        jjpVar.c = obj;
        return jjpVar;
    }
}
