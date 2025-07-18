package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zzv {
    private final aadb a;

    private zzv(aadb aadbVar) {
        this.a = aadbVar;
    }

    public static zzv b(zzu zzuVar) {
        aadb aadbVar = new aadb();
        aadbVar.B(zzuVar.a);
        return new zzv(aadbVar);
    }

    public final synchronized zzu a() {
        return zzu.b((aade) this.a.v());
    }
}
