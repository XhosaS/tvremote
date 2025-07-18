package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aejf implements aejl, aehf {
    private static final Object a = new Object();
    private volatile aejl b;
    private volatile Object c = a;

    private aejf(aejl aejlVar) {
        this.b = aejlVar;
    }

    public static aehf b(aejl aejlVar) {
        if (aejlVar instanceof aehf) {
            return (aehf) aejlVar;
        }
        aejlVar.getClass();
        return new aejf(aejlVar);
    }

    public static aejl c(aejl aejlVar) {
        aejlVar.getClass();
        return aejlVar instanceof aejf ? aejlVar : new aejf(aejlVar);
    }

    private final synchronized Object d() {
        Object obj = this.c;
        Object obj2 = a;
        if (obj != obj2) {
            return obj;
        }
        Object objA = this.b.a();
        Object obj3 = this.c;
        if (obj3 != obj2 && obj3 != objA) {
            throw new IllegalStateException(a.f(objA, obj3, "Scoped provider was invoked recursively returning different results: ", " & ", ". This is likely due to a circular dependency."));
        }
        this.c = objA;
        this.b = null;
        return objA;
    }

    @Override // defpackage.agow
    public final Object a() {
        Object obj = this.c;
        return obj == a ? d() : obj;
    }
}
