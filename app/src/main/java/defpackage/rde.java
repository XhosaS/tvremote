package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rde extends rdh {
    private final boolean b;

    public rde(ahug ahugVar, boolean z) {
        super(ahugVar);
        this.b = z;
    }

    private final ahug f() {
        return this.b ? this.a : e();
    }

    @Override // defpackage.rdh
    public final long a(String str) {
        ahug ahugVarF = f();
        ahug ahugVar = ahug.a;
        if (ahugVarF == ahugVar) {
            return 1000L;
        }
        if (ahugVar != null && ahugVarF.getClass() == ahugVar.getClass() && abza.a.a(ahugVarF.getClass()).k(ahugVarF, ahugVar)) {
            return 1000L;
        }
        return ahugVarF.c;
    }

    @Override // defpackage.rdh
    public final ahug b(Long l) {
        return this.a;
    }

    @Override // defpackage.rdh
    public final ahug c(Long l) {
        return f();
    }

    @Override // defpackage.rdh
    public final boolean d() {
        return this.b;
    }
}
