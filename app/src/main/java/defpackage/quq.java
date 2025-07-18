package defpackage;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class quq {
    public static qup n() {
        quh quhVar = new quh();
        quhVar.c(false);
        quhVar.d(false);
        quhVar.b(0);
        quhVar.g(false);
        quhVar.e(Integer.MAX_VALUE);
        quhVar.g = new Predicate() { // from class: quo
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            public final /* synthetic */ Predicate negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return true;
            }
        };
        return quhVar;
    }

    public abstract int a();

    public abstract int b();

    public abstract qry c();

    public abstract qxk d();

    public abstract Long e();

    public abstract String f();

    public abstract String g();

    public abstract Predicate h();

    public abstract ahqu i();

    public abstract ahvw j();

    public abstract boolean k();

    public abstract boolean l();

    public abstract boolean m();
}
