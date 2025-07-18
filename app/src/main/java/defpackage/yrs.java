package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class yrs implements yrp {
    private static final yrp a = new yrp() { // from class: yrr
        @Override // defpackage.yrp
        public final Object eV() {
            throw new IllegalStateException();
        }
    };
    private final ysa b = new ysa();
    private volatile yrp c;
    private Object d;

    public yrs(yrp yrpVar) {
        yrpVar.getClass();
        this.c = yrpVar;
    }

    @Override // defpackage.yrp
    public final Object eV() {
        yrp yrpVar = this.c;
        yrp yrpVar2 = a;
        if (yrpVar != yrpVar2) {
            synchronized (this.b) {
                if (this.c != yrpVar2) {
                    Object objEV = this.c.eV();
                    this.d = objEV;
                    this.c = yrpVar2;
                    return objEV;
                }
            }
        }
        return this.d;
    }

    public final String toString() {
        Object obj = this.c;
        if (obj == a) {
            obj = "<supplier that returned " + String.valueOf(this.d) + ">";
        }
        return a.o(obj, "Suppliers.memoize(", ")");
    }
}
