package defpackage;

import com.google.assistant.sdk.libassistant.AssistantManagerNative;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jgz extends agtu implements agvb {
    int a;
    final /* synthetic */ jhh b;
    final /* synthetic */ AssistantManagerNative c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgz(jhh jhhVar, AssistantManagerNative assistantManagerNative, agsw agswVar) {
        super(2, agswVar);
        this.b = jhhVar;
        this.c = assistantManagerNative;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jgz) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        fog fogVar;
        agtg agtgVar = agtg.a;
        try {
            if (this.a != 0) {
                agpl.b(obj);
            } else {
                agpl.b(obj);
                fki fkiVar = this.b.E;
                this.a = 1;
                obj = fkiVar.a(this);
                if (obj == agtgVar) {
                    return agtgVar;
                }
            }
            fogVar = (fog) obj;
        } catch (IllegalArgumentException e) {
            ((zdv) ((zdv) jhh.a.d()).p(e).q("com/google/android/apps/tvsearch/voice/libassistant/AssistantWrapperImpl$setAssistantLocation$2$1", "invokeSuspend", 1912, "AssistantWrapperImpl.kt")).u("Failed to set LibAssistant location.");
        }
        if (fogVar == null) {
            ((zdv) jhh.a.d().q("com/google/android/apps/tvsearch/voice/libassistant/AssistantWrapperImpl$setAssistantLocation$2$1", "invokeSuspend", 1906, "AssistantWrapperImpl.kt")).u("Failed to set LibAssistant location. Read location was null.");
            return agpu.a;
        }
        adwm adwmVar = fogVar.c;
        if (adwmVar == null) {
            adwmVar = adwm.a;
        }
        adwmVar.getClass();
        this.c.setLocation(adwmVar.b, adwmVar.c);
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new jgz(this.b, this.c, agswVar);
    }
}
