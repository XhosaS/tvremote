package defpackage;

import com.google.assistant.sdk.libassistant.ActionExecutor;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jjc implements jiq {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/voice/libassistant/handlers/KidsClientOpHandler");
    public static final Duration b;
    private static final ActionExecutor.SupportedAction e;
    public final lzb c;
    public jix d;
    private final agte f;
    private final agow g;
    private final gph h;
    private final String i;

    static {
        Duration durationOfMinutes = Duration.ofMinutes(1L);
        durationOfMinutes.getClass();
        b = durationOfMinutes;
        e = jhy.a.b(fbo.u, new ActionExecutor.SupportedAction.Arg[]{new ActionExecutor.SupportedAction.Arg("request", "assistant.api.client_op.ParentalAuthorizationArgs")}, "", new byte[0]);
    }

    public jjc(agte agteVar, agow agowVar, gph gphVar, lzb lzbVar) {
        agteVar.getClass();
        agowVar.getClass();
        lzbVar.getClass();
        this.f = agteVar;
        this.g = agowVar;
        this.h = gphVar;
        this.c = lzbVar;
        this.i = "KidsClientOpHandler";
    }

    @Override // defpackage.jiq
    public final /* synthetic */ Object a(agsw agswVar) {
        return agrd.a;
    }

    @Override // defpackage.jiq
    public final /* synthetic */ Object b(String str, Map map, ActionExecutor.ResponseParams responseParams, gez gezVar, agsw agswVar) {
        return agpu.a;
    }

    @Override // defpackage.jiq
    public final String c() {
        return this.i;
    }

    @Override // defpackage.jiq
    public final List d() {
        ArrayList arrayList = new ArrayList();
        if (this.h == gph.a && ((Boolean) this.g.a()).booleanValue()) {
            arrayList.add(e);
        }
        return agqq.x(arrayList);
    }

    @Override // defpackage.jiq
    public final Object e(String str, Map map, gez gezVar, agsw agswVar) {
        if (agvy.c(str, fbo.u.a())) {
            return ahal.a(this.f, new jjb(this, irw.b((byte[]) map.get("request")), null), agswVar);
        }
        ((zdv) a.d().q("com/google/android/apps/tvsearch/voice/libassistant/handlers/KidsClientOpHandler", "execute", 78, "KidsClientOpHandler.kt")).x("Received unsupported clientOp: %s", str);
        return new ActionExecutor.Result(ActionExecutor.Status.INVALID_ARGUMENT, a.e(str, "Unsupported clientOp[", "]"));
    }
}
