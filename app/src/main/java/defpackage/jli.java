package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jli extends agtu implements agvb {
    int a;
    final /* synthetic */ jlp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jli(jlp jlpVar, agsw agswVar) {
        super(2, agswVar);
        this.b = jlpVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jli) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) throws Throwable {
        agtg agtgVar = agtg.a;
        try {
            if (this.a != 0) {
                agpl.b(obj);
            } else {
                agpl.b(obj);
                zyd zydVarB = ((fby) this.b.c.a()).b();
                this.a = 1;
                obj = ahkr.b(zydVarB, this);
                if (obj == agtgVar) {
                    return agtgVar;
                }
            }
            return (abvo) obj;
        } catch (ahem e) {
            ((zdv) ((zdv) jlp.a.d()).p(e).q("com/google/android/apps/tvsearch/voice/libassistant/handlers/UiClientOpHandler$getForegroundAppContextByteString$2", "invokeSuspend", 615, "UiClientOpHandler.kt")).u("Could not retrieve foreground app context within time-limit.");
            return null;
        }
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new jli(this.b, agswVar);
    }
}
