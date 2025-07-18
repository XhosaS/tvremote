package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bos extends agtu implements agvb {
    int a;
    final /* synthetic */ agvb b;
    final /* synthetic */ ahaz c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bos(ahaz ahazVar, agvb agvbVar, agsw agswVar) {
        super(2, agswVar);
        this.c = ahazVar;
        this.b = agvbVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bos) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        ahaz ahazVar;
        agtg agtgVar = agtg.a;
        if (this.a != 0) {
            ahazVar = (ahaz) this.d;
            try {
                agpl.b(obj);
            } catch (Throwable th) {
                th = th;
                obj = agpl.a(th);
                ahba.b(ahazVar, obj);
                return agpu.a;
            }
        } else {
            agpl.b(obj);
            ahbt ahbtVar = (ahbt) this.d;
            ahaz ahazVar2 = this.c;
            agvb agvbVar = this.b;
            try {
                this.d = ahazVar2;
                this.a = 1;
                obj = agvbVar.a(ahbtVar, this);
                if (obj == agtgVar) {
                    return agtgVar;
                }
                ahazVar = ahazVar2;
            } catch (Throwable th2) {
                th = th2;
                ahazVar = ahazVar2;
                obj = agpl.a(th);
                ahba.b(ahazVar, obj);
                return agpu.a;
            }
        }
        ahba.b(ahazVar, obj);
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        bos bosVar = new bos(this.c, this.b, agswVar);
        bosVar.d = obj;
        return bosVar;
    }
}
