package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class boq implements AutoCloseable {
    public final String a;
    public final agvb b;
    public final agpc c = new agpn(new agum() { // from class: bom
        @Override // defpackage.agum
        public final Object a() {
            boq boqVar = this.a;
            brr brrVar = boqVar.d.a;
            String strC = brrVar.c();
            String str = boqVar.a;
            if (strC == null) {
                if (!agvy.c(str, ":memory:")) {
                    throw new IllegalArgumentException(a.e(str, "This driver is configured to open an in-memory database but a file-based named '", "' was requested."));
                }
            } else if (!agvy.c(strC, str) && !agvy.c(agyv.l(strC, '/', strC), agyv.l(str, '/', str))) {
                throw new IllegalArgumentException("This driver is configured to open a database named '" + brrVar.c() + "' but '" + str + "' was requested.");
            }
            return new bsk(brrVar.b());
        }
    });
    public final bsl d;

    public boq(bsl bslVar, String str, agvb agvbVar) {
        this.d = bslVar;
        this.a = str;
        this.b = agvbVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        agpc agpcVar = this.c;
        if (agpcVar.b()) {
            ((bsk) agpcVar.a()).close();
        }
    }
}
