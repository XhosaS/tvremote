package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class asp implements yjv {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ asp(ylb ylbVar, ylb ylbVar2, fyr fyrVar, boolean z, ygx ygxVar, int i) {
        this.f = i;
        this.d = ylbVar;
        this.e = ylbVar2;
        this.b = fyrVar;
        this.a = z;
        this.c = ygxVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bdy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [bdy, java.lang.Object] */
    @Override // defpackage.yjv
    public final Object a(Object obj) {
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                fwr fwrVar = (fwr) obj;
                fwrVar.getClass();
                ((ylb) this.d).a = true;
                ((ylb) this.e).a = true;
                ((fyr) this.b).k(fwrVar, this.a, (ygx) this.c);
                return ygi.a;
            }
            boolean z = this.a;
            alg algVar = (alg) this.c;
            long jA = anf.a(algVar.b(z));
            ((yle) this.d).a = jA;
            algVar.F((afo) this.b, jA);
            ((yle) this.e).a = 0L;
            algVar.j = -1;
            return ygi.a;
        }
        boi boiVar = (boi) obj;
        ?? r0 = this.d;
        Object obj2 = this.b;
        boolean z2 = this.a;
        float fFloatValue = 0.8f;
        float fFloatValue2 = 1.0f;
        boiVar.t(!z2 ? ((Number) r0.a()).floatValue() : ((Boolean) ((od) obj2).b()).booleanValue() ? 1.0f : 0.8f);
        if (!z2) {
            fFloatValue = ((Number) r0.a()).floatValue();
        } else if (((Boolean) ((od) obj2).b()).booleanValue()) {
            fFloatValue = 1.0f;
        }
        boiVar.u(fFloatValue);
        if (!z2) {
            fFloatValue2 = ((Number) this.e.a()).floatValue();
        } else if (!((Boolean) ((od) obj2).b()).booleanValue()) {
            fFloatValue2 = 0.0f;
        }
        ?? r02 = this.c;
        boiVar.m(fFloatValue2);
        boiVar.y(((bop) r02.a()).b);
        return ygi.a;
    }

    public /* synthetic */ asp(yle yleVar, alg algVar, boolean z, afo afoVar, yle yleVar2, int i) {
        this.f = i;
        this.d = yleVar;
        this.c = algVar;
        this.a = z;
        this.b = afoVar;
        this.e = yleVar2;
    }

    public /* synthetic */ asp(boolean z, od odVar, bcb bcbVar, bdy bdyVar, bdy bdyVar2, int i) {
        this.f = i;
        this.a = z;
        this.b = odVar;
        this.c = bcbVar;
        this.d = bdyVar;
        this.e = bdyVar2;
    }
}
