package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aats {
    private final agow a;

    public aats(agow agowVar) {
        this.a = agowVar;
    }

    public final Object a(yqi yqiVar) throws aatt {
        try {
            aato aatoVar = (aato) this.a.a();
            if (aatoVar.a instanceof aiao) {
                throw new aatt();
            }
            return yqiVar.apply(aatoVar);
        } catch (IllegalStateException | UnsatisfiedLinkError e) {
            throw new aatt(e);
        }
    }
}
