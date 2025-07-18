package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class gih implements ghi {
    public final ghk f;
    public final String g;
    public boolean h;

    public gih(ghk ghkVar, String str) {
        this.f = ghkVar;
        this.g = str;
    }

    @Override // defpackage.ghi
    public final /* synthetic */ boolean n() {
        return b(0) != 0;
    }

    protected final void o() {
        if (this.h) {
            gez.u(21, "statement is closed");
            throw new yfs();
        }
    }

    protected final void p() {
        this.h = true;
    }
}
