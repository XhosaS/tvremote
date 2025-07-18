package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aejo implements aejl {
    private static final Object a = new Object();
    private volatile aejl b;
    private volatile Object c = a;

    private aejo(aejl aejlVar) {
        this.b = aejlVar;
    }

    public static aejl b(aejl aejlVar) {
        if ((aejlVar instanceof aejo) || (aejlVar instanceof aejf)) {
            return aejlVar;
        }
        aejlVar.getClass();
        return new aejo(aejlVar);
    }

    @Override // defpackage.agow
    public final Object a() {
        Object obj = this.c;
        if (obj != a) {
            return obj;
        }
        aejl aejlVar = this.b;
        if (aejlVar == null) {
            return this.c;
        }
        Object objA = aejlVar.a();
        this.c = objA;
        this.b = null;
        return objA;
    }
}
