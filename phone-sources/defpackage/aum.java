package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aum implements bns, yko {
    private final /* synthetic */ yjk a;

    public aum(yjk yjkVar) {
        this.a = yjkVar;
    }

    @Override // defpackage.bns
    public final /* synthetic */ long a() {
        return ((bnq) ((ykx) this.a).b()).h;
    }

    @Override // defpackage.yko
    public final yfq b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof bns) && (obj instanceof yko)) {
            return yks.e(this.a, ((yko) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
