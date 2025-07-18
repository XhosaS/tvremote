package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class pxg {
    public abstract qen a();

    public abstract int b();

    public final qen c() {
        if (b() - 1 != 0) {
            return null;
        }
        return a();
    }

    public final String d() {
        qen qenVarC = c();
        if (qenVarC != null) {
            return qenVarC.b;
        }
        return null;
    }
}
