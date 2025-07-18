package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amw extends agtu implements agvb {
    int a;
    final /* synthetic */ ano b;
    final /* synthetic */ aog c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amw(ano anoVar, aog aogVar, agsw agswVar) {
        super(2, agswVar);
        this.b = anoVar;
        this.c = aogVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amw) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) throws Throwable {
        agtg agtgVar = agtg.a;
        int i = this.a;
        if (i == 0) {
            agpl.b(obj);
            ano anoVar = this.b;
            apk apkVarA = anoVar.d.a();
            if (apkVarA instanceof alt) {
                aog aogVar = this.c;
                this.a = 1;
                Object objJ = anoVar.j(aogVar.a, aogVar.c, this);
                if (objJ != agtgVar) {
                    return objJ;
                }
            } else {
                if (!(apkVarA instanceof apa) && !(apkVarA instanceof app)) {
                    if (apkVarA instanceof aoe) {
                        throw ((aoe) apkVarA).a;
                    }
                    throw new agpg();
                }
                if (apkVarA != this.c.b) {
                    throw ((apa) apkVarA).a;
                }
                this.a = 2;
                if (anoVar.g(this) != agtgVar) {
                }
            }
        }
        agpl.b(obj);
        if (i == 1 || i != 2) {
            return obj;
        }
        ano anoVar2 = this.b;
        aog aogVar2 = this.c;
        this.a = 3;
        Object objJ2 = anoVar2.j(aogVar2.a, aogVar2.c, this);
        return objJ2 == agtgVar ? agtgVar : objJ2;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new amw(this.b, this.c, agswVar);
    }
}
