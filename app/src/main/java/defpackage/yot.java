package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yot extends agtu implements agvb {
    Object a;
    int b;
    final /* synthetic */ yor c;
    final /* synthetic */ agvb d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yot(yor yorVar, agvb agvbVar, agsw agswVar) {
        super(2, agswVar);
        this.c = yorVar;
        this.d = agvbVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yot) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [agvb, java.lang.Object] */
    @Override // defpackage.agto
    public final Object b(Object obj) throws Throwable {
        ahni ahniVar;
        agtg agtgVar = agtg.a;
        int i = this.b;
        if (i == 0) {
            agpl.b(obj);
            ahbu.c((ahbt) this.e);
            yor yorVar = this.c;
            agvb agvbVar = this.d;
            ahni ahniVar2 = yorVar.a;
            this.e = ahniVar2;
            this.a = agvbVar;
            this.b = 1;
            if (agth.a(yos.a, ahniVar2, this) != agtgVar) {
                agth.c(this).e(agpu.a);
            }
        } else {
            if (i != 1) {
                ahniVar = (ahni) this.e;
                try {
                    agpl.b(obj);
                    ahniVar.d();
                    return obj;
                } catch (Throwable th) {
                    th = th;
                    ahniVar.d();
                    throw th;
                }
            }
            ?? r1 = this.a;
            ahni ahniVar3 = (ahni) this.e;
            agpl.b(obj);
            try {
                this.e = ahniVar3;
                this.a = null;
                this.b = 2;
                obj = ahbu.a(r1, this);
                if (obj != agtgVar) {
                    ahniVar = ahniVar3;
                    ahniVar.d();
                    return obj;
                }
            } catch (Throwable th2) {
                th = th2;
                ahniVar = ahniVar3;
                ahniVar.d();
                throw th;
            }
        }
        return agtgVar;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        yot yotVar = new yot(this.c, this.d, agswVar);
        yotVar.e = obj;
        return yotVar;
    }
}
