package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nba extends mix implements nhn {
    private final aefd a;

    public nba(aefd aefdVar) {
        this.a = aefdVar;
    }

    @Override // defpackage.nhn
    public final float g() {
        aefd aefdVar = this.a;
        return aefdVar.b.getFloat(aefdVar.a);
    }

    @Override // defpackage.nhn
    public final boolean h() {
        return true;
    }

    @Override // defpackage.nhn
    public final boolean i() {
        return true;
    }

    @Override // defpackage.nhn
    public final int j() {
        aefd aefdVar = this.a;
        int iA = nhp.a(aefdVar.b.getInt(aefdVar.a + 4));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
