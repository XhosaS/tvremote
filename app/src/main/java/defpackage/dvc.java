package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dvc {
    public final String a;
    private final drq b;
    private final dxo c;

    public dvc(String str, drq drqVar, dxo dxoVar) {
        this.a = str;
        this.b = drqVar;
        this.c = dxoVar;
    }

    public final void a() {
        dru druVar = this.c.b;
        try {
            this.b.G(druVar);
        } catch (Exception e) {
            dsq.d(druVar, e);
        }
    }

    public final void b() {
        dru druVar = this.c.b;
        try {
            this.b.J(druVar);
        } catch (Exception e) {
            dsq.d(druVar, e);
        }
    }
}
