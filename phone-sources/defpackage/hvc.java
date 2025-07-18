package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvc extends huu {
    public static hvc r;
    public static hvc s;
    private static hvc t;

    public static hvc a() {
        if (t == null) {
            hvc hvcVar = (hvc) new hvc().B(hru.c, new hrj());
            hvcVar.L();
            t = hvcVar;
        }
        return t;
    }

    public static hvc b(Class cls) {
        return (hvc) new hvc().n(cls);
    }

    public static hvc c(hng hngVar) {
        return (hvc) new hvc().o(hngVar);
    }

    public static hvc d(int i) {
        return (hvc) new hvc().t(i);
    }

    @Override // defpackage.huu
    public final boolean equals(Object obj) {
        return (obj instanceof hvc) && super.equals(obj);
    }
}
