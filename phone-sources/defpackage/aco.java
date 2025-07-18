package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aco {
    public abstract ybo b();

    public final int c() {
        return b().b;
    }

    public final Object d(int i) {
        gb gbVarP = b().p(i);
        return ((acn) gbVarP.c).b().a(Integer.valueOf(i - gbVarP.a));
    }

    public final Object e(int i) {
        gb gbVarP = b().p(i);
        int i2 = i - gbVarP.a;
        yjv yjvVarA = ((acn) gbVarP.c).a();
        return yjvVarA != null ? yjvVarA.a(Integer.valueOf(i2)) : new acf(i);
    }
}
