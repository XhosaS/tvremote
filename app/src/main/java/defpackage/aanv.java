package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aanv {
    static {
        i().a();
    }

    public static aanu i() {
        aanq aanqVar = new aanq();
        aanqVar.d(0L);
        aanqVar.c(1);
        aanqVar.b(0L);
        return aanqVar;
    }

    public abstract long a();

    public abstract long b();

    public abstract aanu c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract String g();

    public abstract int h();

    public final boolean j() {
        return h() == 5;
    }

    public final boolean k() {
        return h() == 2 || h() == 1;
    }

    public final boolean l() {
        return h() == 4;
    }

    public final boolean m() {
        return h() == 3;
    }

    public final aanv n() {
        aanu aanuVarC = c();
        ((aanq) aanuVarC).d = "BAD CONFIG";
        aanuVarC.c(5);
        return aanuVarC.a();
    }
}
