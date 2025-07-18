package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class msd implements mjm {
    private final by a;
    private final idy b;
    private final msf c;

    public msd(by byVar, idy idyVar, msf msfVar) {
        this.a = byVar;
        this.b = idyVar;
        this.c = msfVar;
    }

    @Override // defpackage.mjm
    public final void a(mjw mjwVar) {
        this.c.a();
        by byVar = this.a;
        byVar.supportInvalidateOptionsMenu();
        if (mjwVar == null) {
            byVar.finish();
        }
        this.b.c(ieg.a(mjwVar));
    }
}
