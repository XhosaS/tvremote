package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ank extends agtu implements agvb {
    int a;
    final /* synthetic */ ano b;
    final /* synthetic */ agvb c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ank(ano anoVar, agvb agvbVar, agsw agswVar) {
        super(2, agswVar);
        this.b = anoVar;
        this.c = agvbVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ank) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) throws Throwable {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            return obj;
        }
        ahbt ahbtVar = (ahbt) this.d;
        ahaz ahazVar = new ahaz();
        ano anoVar = this.b;
        aog aogVar = new aog(this.c, ahazVar, anoVar.d.a(), ahbtVar.fs());
        apj apjVar = anoVar.g;
        Object objI = apjVar.c.i(aogVar);
        if (objI instanceof ahfr) {
            Throwable thB = ahft.b(objI);
            if (thB == null) {
                throw new ahfz("Channel was closed normally");
            }
            throw thB;
        }
        if (objI instanceof ahfs) {
            throw new IllegalStateException("Check failed.");
        }
        if (apjVar.d.a.getAndIncrement() == 0) {
            ahal.e(apjVar.a, null, 0, new api(apjVar, null), 3);
        }
        this.a = 1;
        Object objFy = ahazVar.fy(this);
        return objFy == agtgVar ? agtgVar : objFy;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        ank ankVar = new ank(this.b, this.c, agswVar);
        ankVar.d = obj;
        return ankVar;
    }
}
