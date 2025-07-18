package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agix implements agfg, aggi {
    final agfg a;
    aggi b;
    final /* synthetic */ agiy c;

    public agix(agiy agiyVar, agfg agfgVar) {
        this.c = agiyVar;
        this.a = agfgVar;
    }

    @Override // defpackage.agfg
    public final void a() {
        if (this.b == aghd.a) {
            return;
        }
        try {
            this.c.d.a();
            this.a.a();
        } catch (Throwable th) {
            aggq.a(th);
            this.a.fg(th);
        }
    }

    @Override // defpackage.agfg
    public final void c(aggi aggiVar) {
        try {
            this.c.b.a(aggiVar);
            if (aghd.d(this.b, aggiVar)) {
                this.b = aggiVar;
                this.a.c(this);
            }
        } catch (Throwable th) {
            aggq.a(th);
            aggiVar.dispose();
            this.b = aghd.a;
            aghe.d(th, this.a);
        }
    }

    @Override // defpackage.aggi
    public final void dispose() {
        this.b.dispose();
    }

    @Override // defpackage.aggi
    public final boolean f() {
        throw null;
    }

    @Override // defpackage.agfg
    public final void fg(Throwable th) {
        if (this.b == aghd.a) {
            agoh.e(th);
            return;
        }
        try {
            this.c.c.a(th);
        } catch (Throwable th2) {
            aggq.a(th2);
            th = new aggp(Arrays.asList(th, th2));
        }
        this.a.fg(th);
    }
}
