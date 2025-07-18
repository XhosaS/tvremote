package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bsq implements brj {
    public final brm f;
    public final String g;
    public boolean h;

    public bsq(brm brmVar, String str) {
        this.f = brmVar;
        this.g = str;
    }

    @Override // defpackage.brj
    public final /* synthetic */ boolean n() {
        return b(0) != 0;
    }

    protected final void o() {
        if (this.h) {
            bri.b(21, "statement is closed");
            throw new agpb();
        }
    }
}
