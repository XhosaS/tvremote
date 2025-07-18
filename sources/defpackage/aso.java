package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aso implements asm {
    final /* synthetic */ byo a;
    final /* synthetic */ byo b;
    final /* synthetic */ asq c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public aso(asq asqVar, byo byoVar, byo byoVar2, Object obj, int i) {
        this.e = i;
        this.a = byoVar;
        this.b = byoVar2;
        this.d = obj;
        this.c = asqVar;
    }

    private final void a() {
        asq asqVar = this.c;
        ask askVar = asqVar.b;
        if (askVar != null) {
            ((asz) this.d).g.remove(askVar);
            asqVar.b = null;
        }
    }

    private final void b() {
        asq asqVar = this.c;
        ass assVar = asqVar.a;
        if (assVar != null) {
            ((asv) this.d).b(assVar);
            asqVar.a = null;
        }
    }

    @Override // defpackage.asm
    public final void i(aqe aqeVar) {
        if (this.e != 0) {
            if (((Boolean) this.a.aL()).booleanValue()) {
                this.c.c.k(aqeVar);
                return;
            } else if (((Boolean) this.b.aL()).booleanValue()) {
                b();
                return;
            } else {
                this.c.c.k(aqeVar);
                return;
            }
        }
        if (((Boolean) this.a.aL()).booleanValue()) {
            this.c.c.k(aqeVar);
        } else if (((Boolean) this.b.aL()).booleanValue()) {
            this.c.c.k(aqeVar);
        } else {
            a();
        }
    }

    @Override // defpackage.asm
    public final void j(aqe aqeVar) {
        if (this.e != 0) {
            if (((Boolean) this.a.aL()).booleanValue()) {
                this.c.c.l(aqeVar);
                return;
            } else if (((Boolean) this.b.aL()).booleanValue()) {
                b();
                return;
            } else {
                this.c.c.l(aqeVar);
                return;
            }
        }
        if (((Boolean) this.a.aL()).booleanValue()) {
            this.c.c.l(aqeVar);
        } else if (((Boolean) this.b.aL()).booleanValue()) {
            this.c.c.l(aqeVar);
        } else {
            a();
        }
    }
}
