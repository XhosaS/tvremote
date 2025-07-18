package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agnr implements aghr {
    public static final agnr a;
    private static final /* synthetic */ agnr[] b;

    static {
        agnr agnrVar = new agnr();
        a = agnrVar;
        b = new agnr[]{agnrVar};
    }

    private agnr() {
    }

    public static void d(Throwable th, aide aideVar) {
        aideVar.a(a);
        aideVar.e(th);
    }

    public static agnr[] values() {
        return (agnr[]) b.clone();
    }

    @Override // defpackage.aghs
    public final Object ff() {
        return null;
    }

    @Override // defpackage.aidf
    public final void fi(long j) {
        agns.b(j);
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

    @Override // java.lang.Enum
    public final String toString() {
        return "EmptySubscription";
    }

    @Override // defpackage.aghs
    public final void b() {
    }

    @Override // defpackage.aidf
    public final void fh() {
    }
}
