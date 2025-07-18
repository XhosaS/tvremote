package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tgo extends agtu implements agvb {
    Object a;
    int b;
    final /* synthetic */ tgq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tgo(tgq tgqVar, agsw agswVar) {
        super(2, agswVar);
        this.c = tgqVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tgo) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // defpackage.agto
    public final Object b(Object obj) {
        ?? r0;
        agtg agtgVar = agtg.a;
        if (this.b != 0) {
            r0 = this.a;
            try {
                agpl.b(obj);
                r0 = r0;
            } catch (Throwable th) {
                th = th;
                try {
                    throw th;
                } catch (Throwable th2) {
                    aguc.a(r0, th);
                    throw th2;
                }
            }
        } else {
            agpl.b(obj);
            tgq tgqVar = this.c;
            wvl wvlVarA = tgqVar.a.a("deidentifiedLogging");
            try {
                tgg tggVar = tgqVar.b;
                this.a = wvlVarA;
                this.b = 1;
                obj = tggVar.d(this);
                if (obj == agtgVar) {
                    return agtgVar;
                }
                r0 = wvlVarA;
            } catch (Throwable th3) {
                th = th3;
                r0 = wvlVarA;
                throw th;
            }
        }
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        aguc.a(r0, null);
        return bool;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new tgo(this.c, agswVar);
    }
}
