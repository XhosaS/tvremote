package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jdm extends agtu implements agvb {
    Object a;
    Object b;
    boolean c;
    int d;
    final /* synthetic */ jdn e;
    final /* synthetic */ boolean f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdm(jdn jdnVar, boolean z, agsw agswVar) {
        super(2, agswVar);
        this.e = jdnVar;
        this.f = z;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jdm) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.agto
    public final Object b(Object obj) {
        ahbt ahbtVar;
        boolean z;
        ahni ahniVar;
        Object obj2;
        agtg agtgVar = agtg.a;
        if (this.d != 0) {
            z = this.c;
            Object obj3 = this.b;
            Object obj4 = this.a;
            ahbtVar = (ahbt) this.g;
            agpl.b(obj);
            obj2 = obj3;
            ahniVar = obj4;
        } else {
            agpl.b(obj);
            ahbtVar = (ahbt) this.g;
            jdn jdnVar = this.e;
            boolean z2 = this.f;
            this.g = ahbtVar;
            ahni ahniVar2 = jdnVar.b;
            this.a = ahniVar2;
            this.b = jdnVar;
            this.c = z2;
            this.d = 1;
            if (ahniVar2.b(this) == agtgVar) {
                return agtgVar;
            }
            z = z2;
            obj2 = jdnVar;
            ahniVar = ahniVar2;
        }
        try {
            int i = jdn.e;
            ahdl ahdlVar = ((jdn) obj2).a;
            if (ahdlVar != null && !ahdlVar.v()) {
                ahdlVar.s(null);
            }
            ((jdn) obj2).a = ahal.e(ahbtVar, null, 0, new jdl((jdn) obj2, z, null), 3);
            ahniVar.d();
            return agpu.a;
        } catch (Throwable th) {
            ahniVar.d();
            throw th;
        }
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        jdm jdmVar = new jdm(this.e, this.f, agswVar);
        jdmVar.g = obj;
        return jdmVar;
    }
}
