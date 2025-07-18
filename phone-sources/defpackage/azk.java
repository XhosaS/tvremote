package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class azk implements ays, yko {
    private final /* synthetic */ yjk a;

    public azk(yjk yjkVar) {
        this.a = yjkVar;
    }

    @Override // defpackage.ays
    public final /* synthetic */ float a() {
        return ((Number) this.a.a()).floatValue();
    }

    @Override // defpackage.yko
    public final yfq b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ays) && (obj instanceof yko)) {
            return yks.e(this.a, ((yko) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
