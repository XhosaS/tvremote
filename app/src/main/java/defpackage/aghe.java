package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum aghe implements aghp {
    INSTANCE,
    NEVER;

    public static void c(agfs agfsVar) {
        agfsVar.d(INSTANCE);
        agfsVar.a();
    }

    public static void d(Throwable th, agfg agfgVar) {
        agfgVar.c(INSTANCE);
        agfgVar.fg(th);
    }

    public static void e(Throwable th, agfs agfsVar) {
        agfsVar.d(INSTANCE);
        agfsVar.fe(th);
    }

    @Override // defpackage.aggi
    public final boolean f() {
        throw null;
    }

    @Override // defpackage.aghs
    public final Object ff() {
        return null;
    }

    @Override // defpackage.aghs
    public final boolean fj() {
        return true;
    }

    @Override // defpackage.aghs
    public final boolean h(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.aghq
    public final int i() {
        return 2;
    }

    @Override // defpackage.aghs
    public final void b() {
    }

    @Override // defpackage.aggi
    public final void dispose() {
    }
}
