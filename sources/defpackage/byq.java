package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byq implements byo {
    private static final byo a = new azz(5);
    private volatile byo b;
    private Object c;
    private final cav d = new cav(null);

    public byq(byo byoVar) {
        this.b = byoVar;
    }

    @Override // defpackage.byo
    public final Object aL() {
        byo byoVar = this.b;
        byo byoVar2 = a;
        if (byoVar != byoVar2) {
            synchronized (this.d) {
                if (this.b != byoVar2) {
                    Object objAL = this.b.aL();
                    this.c = objAL;
                    this.b = byoVar2;
                    return objAL;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj = this.b;
        if (obj == a) {
            obj = "<supplier that returned " + String.valueOf(this.c) + ">";
        }
        return b.j(obj, "Suppliers.memoize(", ")");
    }
}
