package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeih implements aeiz {
    private volatile Object a;
    private final Object b = new Object();
    private final evi c;

    public aeih(evi eviVar) {
        this.c = eviVar;
    }

    @Override // defpackage.aeiz
    public final Object dN() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    evi eviVar = this.c;
                    aejl aejlVar = evh.a;
                    this.a = new eup(new aeiw(eviVar.a));
                }
            }
        }
        return this.a;
    }
}
