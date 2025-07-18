package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hqm implements gki {
    final /* synthetic */ xlm a;
    final /* synthetic */ hqn b;

    public hqm(hqn hqnVar, xlm xlmVar) {
        this.a = xlmVar;
        this.b = hqnVar;
    }

    @Override // defpackage.gki
    public final String f() {
        return this.a.c;
    }

    @Override // defpackage.gki
    public final String k() {
        return "";
    }

    @Override // defpackage.gki
    public final String l() {
        hqn hqnVar = this.b;
        return hqnVar.s() != null ? hqnVar.s().getPackageName() : "";
    }

    @Override // defpackage.gki
    public final boolean m() {
        return false;
    }
}
