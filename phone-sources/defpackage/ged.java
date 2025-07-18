package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ged {
    public final gef a;
    public final gfa b;
    public final List c;
    public final gho d;
    public ghk e;
    public final ggf f;

    public ged() {
        throw null;
    }

    private final void b() {
        gho ghoVar = this.d;
        if (ghoVar != null) {
            ghoVar.d(this.a.p == 3);
        }
    }

    public final void a(gic gicVar) {
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        gez.t(gicVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + this.b.b + "')");
    }

    public ged(gef gefVar, gfa gfaVar, yjz yjzVar) {
        this.a = gefVar;
        this.b = gfaVar;
        this.c = gefVar.d;
        gho ghoVarA = gefVar.c.a(gli.t(gefVar.a, gefVar.b, new ghl(this, gfaVar.a), false, false));
        this.d = ghoVarA;
        cb cbVar = new cb(ghoVarA);
        String str = gefVar.b;
        this.f = new ggf(cbVar, str == null ? ":memory:" : str, yjzVar);
        b();
    }

    public ged(gef gefVar, yjv yjvVar, yjz yjzVar) {
        this.a = gefVar;
        this.b = new get();
        this.c = gefVar.d;
        gho ghoVar = (gho) yjvVar.a(new gef(gefVar.a, gefVar.b, gefVar.c, gefVar.q, yfm.ag(gefVar.d, new geu(new fyq(this, 9))), gefVar.e, gefVar.p, gefVar.f, gefVar.g, gefVar.h, gefVar.i, gefVar.j, gefVar.k, gefVar.l, gefVar.m, gefVar.n));
        this.d = ghoVar;
        cb cbVar = new cb(ghoVar);
        String str = gefVar.b;
        this.f = new ggf(cbVar, str == null ? ":memory:" : str, yjzVar);
        b();
    }
}
