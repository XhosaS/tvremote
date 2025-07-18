package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class guh implements guf {
    public final gei a = new gug();
    private final gex b;

    public guh(gex gexVar) {
        this.b = gexVar;
    }

    @Override // defpackage.guf
    public final Long a(String str) {
        return (Long) gez.j(this.b, true, false, new bct(str, 18, (char[]) null));
    }

    @Override // defpackage.guf
    public final void b(gue gueVar) {
        gez.j(this.b, false, true, new bct(this, gueVar, 17));
    }
}
