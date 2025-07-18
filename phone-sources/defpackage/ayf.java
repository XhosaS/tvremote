package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayf implements bol {
    public final /* synthetic */ ayh a;
    private final bcb b = new bci(new ylz(0.0f, 1.0f), bcz.c);

    public ayf(ayh ayhVar) {
        this.a = ayhVar;
    }

    @Override // defpackage.bol
    public final boe a(long j, cmi cmiVar, clx clxVar) {
        ayh ayhVar = this.a;
        ayhVar.b = j;
        this.b.b(new ylz(0.0f, Float.intBitsToFloat((int) (4294967295L & j)) / 2.0f));
        float fFloatValue = ((Number) ykn.s(Float.valueOf(ayh.d(ayhVar)), b())).floatValue();
        float fFloatValue2 = ((Number) ykn.s(Float.valueOf(ayh.c(ayhVar)), b())).floatValue();
        float fFloatValue3 = ((Number) ykn.s(Float.valueOf(ayh.b(ayhVar)), b())).floatValue();
        float fFloatValue4 = ((Number) ykn.s(Float.valueOf(ayh.a(ayhVar)), b())).floatValue();
        aeh aehVar = aep.a;
        return new aeh(new aeo(fFloatValue), new aeo(fFloatValue2), new aeo(fFloatValue4), new aeo(fFloatValue3)).a(j, cmiVar, clxVar);
    }

    public final ylz b() {
        return (ylz) this.b.a();
    }
}
