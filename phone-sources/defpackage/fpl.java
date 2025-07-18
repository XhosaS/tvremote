package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fpl implements fqm {
    public final /* synthetic */ int a;
    public final /* synthetic */ fnl b;
    private final /* synthetic */ int c;

    public /* synthetic */ fpl(fnl fnlVar, int i, int i2) {
        this.c = i2;
        this.b = fnlVar;
        this.a = i;
    }

    @Override // defpackage.fqm
    public final void a(fqt fqtVar, fnw fnwVar) {
        if (this.c != 0) {
            fqtVar.az(this.b.a(fnwVar, fqtVar, this.a));
        } else {
            fqtVar.aA(this.b.a(fnwVar, fqtVar, this.a));
        }
    }
}
