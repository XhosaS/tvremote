package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jfx extends agtu implements agvb {
    int a;
    final /* synthetic */ jhh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jfx(jhh jhhVar, agsw agswVar) {
        super(2, agswVar);
        this.b = jhhVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jfx) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            jhh jhhVar = this.b;
            if (!agvy.c(jhhVar.g.get(), Boolean.valueOf(jhhVar.W))) {
                ((zdv) jhh.a.b().q("com/google/android/apps/tvsearch/voice/libassistant/AssistantWrapperImpl$handleLocaleChange$1", "invokeSuspend", 1933, "AssistantWrapperImpl.kt")).u("Detected assistant-support status change due to locale change. Restarting Assistant.");
                this.a = 1;
                if (jhhVar.h(this) == agtgVar) {
                    return agtgVar;
                }
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new jfx(this.b, agswVar);
    }
}
