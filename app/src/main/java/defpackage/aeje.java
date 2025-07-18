package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeje implements aejg {
    private aejl a;

    public static void b(aeje aejeVar, aejl aejlVar) {
        aejlVar.getClass();
        if (aejeVar.a != null) {
            throw new IllegalStateException();
        }
        aejeVar.a = aejlVar;
    }

    @Override // defpackage.agow
    public final Object a() {
        aejl aejlVar = this.a;
        if (aejlVar != null) {
            return aejlVar.a();
        }
        throw new IllegalStateException();
    }
}
