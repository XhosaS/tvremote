package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gba {
    public fzv a;
    public fzv b;
    final /* synthetic */ mdw c;
    private fzv d;

    public gba() {
        fzu fzuVar = fzu.b;
        this.d = fzuVar;
        this.a = fzuVar;
        this.b = fzuVar;
    }

    public final void a(fzx fzxVar, fzv fzvVar) {
        fzxVar.getClass();
        int iOrdinal = fzxVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new yfu();
                }
                if (yks.e(this.b, fzvVar)) {
                    return;
                } else {
                    this.b = fzvVar;
                }
            } else if (yks.e(this.a, fzvVar)) {
                return;
            } else {
                this.a = fzvVar;
            }
        } else if (yks.e(this.d, fzvVar)) {
            return;
        } else {
            this.d = fzvVar;
        }
        gbb gbbVar = (gbb) this.c.b;
        ykr.q(gbbVar.f, gbbVar.g, 0, new fzp(gbbVar, fzxVar, fzvVar, (yih) null, 2), 2);
    }

    public gba(mdw mdwVar) {
        this.c = mdwVar;
        fzu fzuVar = fzu.b;
        this.d = fzuVar;
        this.a = fzuVar;
        this.b = fzuVar;
    }
}
