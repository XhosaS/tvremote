package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class ecl {
    public final ede a;
    public eck b;
    public boolean c;
    public int d;

    public ecl(ede edeVar) {
        this.a = edeVar;
    }

    final void a() {
        eck eckVar = this.b;
        if (eckVar == null || !c()) {
            return;
        }
        this.a.c(eckVar.a);
        this.b = null;
    }

    final boolean b() {
        int i = this.d;
        return i == 0 || i == 4 || i == 3;
    }

    public final boolean c() {
        return b() && !this.c;
    }
}
