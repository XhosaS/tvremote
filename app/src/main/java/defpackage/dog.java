package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class dog {
    final Class a;
    final dap b;
    private final Class c;

    public dog(Class cls, Class cls2, dap dapVar) {
        this.c = cls;
        this.a = cls2;
        this.b = dapVar;
    }

    public final boolean a(Class cls, Class cls2) {
        return this.c.isAssignableFrom(cls) && cls2.isAssignableFrom(this.a);
    }
}
