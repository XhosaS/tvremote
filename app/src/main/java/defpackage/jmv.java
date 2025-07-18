package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jmv extends agtu implements agvb {
    int a;
    final /* synthetic */ jmz b;
    final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmv(jmz jmzVar, long j, agsw agswVar) {
        super(2, agswVar);
        this.b = jmzVar;
        this.c = j;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jmv) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        try {
            if (this.a != 0) {
                agpl.b(obj);
            } else {
                agpl.b(obj);
                jmr jmrVar = this.b.b;
                long j = this.c;
                this.a = 1;
                obj = jmrVar.a(j, this);
                if (obj == agtgVar) {
                    return agtgVar;
                }
            }
            return (String) obj;
        } catch (Throwable th) {
            ((zdv) ((zdv) jmz.a.d()).p(th).q("com/google/android/apps/tvsearch/voice/libassistant/updaters/CastIdUpdaterImpl$retrieveCastId$2", "invokeSuspend", 83, "CastIdUpdaterImpl.kt")).u("Failed to retrieve castId");
            return "";
        }
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new jmv(this.b, this.c, agswVar);
    }
}
