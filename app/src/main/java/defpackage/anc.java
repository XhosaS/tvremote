package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anc extends agtu implements agux {
    Object a;
    int b;
    final /* synthetic */ ano c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anc(ano anoVar, agsw agswVar) {
        super(1, agswVar);
        this.c = anoVar;
    }

    @Override // defpackage.agux
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new anc(this.c, (agsw) obj).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        Object obj2;
        apk apaVar;
        agtg agtgVar = agtg.a;
        int i = this.b;
        try {
        } catch (Throwable th) {
            aof aofVarB = this.c.b();
            this.a = th;
            this.b = 2;
            Object objA = aofVarB.a(this);
            if (objA != agtgVar) {
                obj2 = th;
                obj = objA;
            }
        }
        if (i == 0) {
            agpl.b(obj);
            ano anoVar = this.c;
            this.b = 1;
            obj = anoVar.i(true, this);
            if (obj == agtgVar) {
                return agtgVar;
            }
        } else {
            if (i != 1) {
                obj2 = this.a;
                agpl.b(obj);
                apaVar = new apa((Throwable) obj2, ((Number) obj).intValue());
                return new agpi(apaVar, true);
            }
            agpl.b(obj);
        }
        apaVar = (apk) obj;
        return new agpi(apaVar, true);
    }
}
