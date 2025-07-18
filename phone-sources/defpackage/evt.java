package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evt extends eay {
    private final dzy e;

    public evt(dzy dzyVar) {
        this.e = dzyVar;
    }

    @Override // defpackage.eay
    public final int a(Object obj) {
        return obj == evs.f ? 0 : -1;
    }

    @Override // defpackage.eay
    public final int b() {
        return 1;
    }

    @Override // defpackage.eay
    public final int c() {
        return 1;
    }

    @Override // defpackage.eay
    public final eav d(int i, eav eavVar, boolean z) {
        eavVar.k(z ? 0 : null, z ? evs.f : null, 0, -9223372036854775807L, 0L, dyn.a, true);
        return eavVar;
    }

    @Override // defpackage.eay
    public final eax e(int i, eax eaxVar, long j) {
        eaxVar.e(eax.a, this.e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        eaxVar.y = true;
        return eaxVar;
    }

    @Override // defpackage.eay
    public final Object f(int i) {
        return evs.f;
    }
}
