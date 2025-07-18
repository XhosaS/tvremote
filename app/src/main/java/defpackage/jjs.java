package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jjs extends agtu implements agvb {
    int a;
    final /* synthetic */ jkx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jjs(jkx jkxVar, agsw agswVar) {
        super(2, agswVar);
        this.b = jkxVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jjs) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        try {
            if (this.a != 0) {
                agpl.b(obj);
            } else {
                agpl.b(obj);
                Duration duration = jkx.c;
                jjr jjrVar = new jjr(this.b, null);
                this.a = 1;
                if (zty.b(duration, jjrVar, this) == agtgVar) {
                    return agtgVar;
                }
            }
        } catch (ahem e) {
            ((zdv) ((zdv) jkx.a.d()).p(e).q("com/google/android/apps/tvsearch/voice/libassistant/handlers/MediaClientOpHandler$finishKatnissActivityAndRun$2", "invokeSuspend", 649, "MediaClientOpHandler.kt")).u("Did not receive Activity-Finish completion callback in time.");
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new jjs(this.b, agswVar);
    }
}
