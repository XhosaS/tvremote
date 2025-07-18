package defpackage;

import android.net.Uri;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class kvf implements Parcelable, kss, kws, kxa, kwf, kst, kvy, kwi, kwz, kvz, kxh, kxc, kwj {
    public static kve T(ksy ksyVar) {
        kve kveVar = new kve();
        if (ksyVar == null) {
            throw new NullPointerException("Null assetId");
        }
        kveVar.a = ksyVar;
        kveVar.m("");
        kveVar.D("");
        kveVar.i("");
        kveVar.r(false);
        kveVar.x(false);
        kveVar.v(false);
        kveVar.q(false);
        kveVar.u(false);
        kveVar.s(false);
        kveVar.w(false);
        kveVar.t(false);
        kveVar.o(false);
        kveVar.E(0);
        kveVar.K("");
        String str = ksyVar.b;
        kveVar.A(kxd.b(str));
        kveVar.F(kxd.d(str));
        kveVar.j("");
        kveVar.J(0);
        kveVar.H(Float.NaN);
        kveVar.I(0L);
        kveVar.l(0);
        kveVar.N(ImmutableList.of());
        kveVar.p(Float.NaN);
        kveVar.L(lcu.TOMATOMETER_RATING_UNKNOWN);
        kveVar.M("");
        ieg iegVar = ieg.a;
        kveVar.z(iegVar);
        kveVar.B("");
        kveVar.k(ImmutableList.of());
        kveVar.P(ImmutableList.of());
        kveVar.b(ImmutableList.of());
        kveVar.C(ImmutableList.of());
        kveVar.g(ImmutableList.of());
        kveVar.f(ImmutableList.of());
        kveVar.c(iegVar);
        kveVar.e(ImmutableList.of());
        kveVar.h(ImmutableList.of());
        kveVar.G(iegVar);
        kveVar.y(false);
        kveVar.O(iegVar);
        kveVar.n(iegVar);
        kveVar.d(iegVar);
        return kveVar;
    }

    public static kvf U(ksy ksyVar) {
        return T(ksyVar).a();
    }

    public abstract String A();

    public abstract String B();

    public abstract String C();

    public abstract String F();

    public /* bridge */ /* synthetic */ List G() {
        throw null;
    }

    public abstract boolean H();

    public abstract boolean I();

    public abstract boolean J();

    public abstract boolean K();

    public abstract boolean L();

    public abstract boolean M();

    public abstract boolean N();

    public abstract boolean O();

    public abstract boolean P();

    public abstract boolean Q();

    /* JADX WARN: Multi-variable type inference failed */
    public final int R() {
        if (!V()) {
            return 0;
        }
        UnmodifiableIterator it = ((ktz) l().g()).b.iterator();
        while (it.hasNext()) {
            kvo kvoVar = (kvo) it.next();
            if (kvoVar.c()) {
                return kvoVar.m;
            }
        }
        return 0;
    }

    public final int S() {
        return (int) a();
    }

    public final boolean V() {
        if (l().m()) {
            return ((ktz) l().g()).g;
        }
        return false;
    }

    @Override // defpackage.kws
    public final boolean W() {
        return !Float.isNaN(b());
    }

    @Override // defpackage.kxa
    public final boolean X() {
        return !Float.isNaN(a());
    }

    public abstract float a();

    public abstract float b();

    public abstract int c();

    public abstract int d();

    @Override // defpackage.kvz
    @Deprecated
    public final ktz dW() {
        return (ktz) l().h(ktz.a);
    }

    @Override // defpackage.kum
    public final String dX() {
        return o().c;
    }

    @Override // defpackage.kxh
    public final List dY() {
        return (List) n().h(Collections.EMPTY_LIST);
    }

    public abstract int e();

    public abstract long f();

    public abstract Uri g();

    public abstract Uri h();

    public abstract ieg i();

    public abstract ieg j();

    public abstract ieg m();

    public abstract ieg n();

    public abstract lcu p();

    public abstract ImmutableList q();

    public abstract ImmutableList r();

    public abstract ImmutableList s();

    public abstract ImmutableList t();

    public abstract ImmutableList u();

    public abstract ImmutableList v();

    public abstract ImmutableList w();

    public abstract ImmutableList x();

    public abstract ImmutableList y();
}
