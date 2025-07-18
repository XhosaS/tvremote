package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ijn extends ijj {
    public final gex a;
    public final gei b = new ijl();
    public final gei c = new ijm();

    public ijn(gex gexVar) {
        this.a = gexVar;
    }

    public static final String o(wlh wlhVar) {
        switch (wlhVar) {
            case DOMAIN_UNSPECIFIED:
                return "DOMAIN_UNSPECIFIED";
            case WATCH_ACTION:
                return "WATCH_ACTION";
            case RECOMMENDATION:
                return "RECOMMENDATION";
            case TVM_ENTITY:
                return "TVM_ENTITY";
            case WATCHLIST:
                return "WATCHLIST";
            case CONTINUE_WATCHING:
                return "CONTINUE_WATCHING";
            case LIBRARY:
                return "LIBRARY";
            case UNRECOGNIZED:
                return "UNRECOGNIZED";
            default:
                throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: ".concat(String.valueOf(String.valueOf(wlhVar))));
        }
    }

    @Override // defpackage.ijf
    public final /* bridge */ /* synthetic */ Object a(Object[] objArr, yih yihVar) {
        throw null;
    }

    @Override // defpackage.ijf
    public final /* bridge */ /* synthetic */ Object b(Object[] objArr, yih yihVar) {
        throw null;
    }

    @Override // defpackage.ijj
    public final Object c(yih yihVar) {
        return gez.l(this.a, false, true, new gwp(8), yihVar);
    }

    @Override // defpackage.ijj
    public final Object d(long j, yih yihVar) {
        return gez.l(this.a, false, true, new dth(j, 2), yihVar);
    }

    @Override // defpackage.ijj
    public final Object e(List list, String str, yih yihVar) {
        return gez.k(this.a, new ikc(this, list, str, 1), yihVar);
    }

    @Override // defpackage.ijj
    public final Object f(long j, yih yihVar) {
        return gez.l(this.a, false, true, new dth(j, 3), yihVar);
    }

    @Override // defpackage.ijj
    public final Object h(yih yihVar) {
        return gez.l(this.a, true, false, new gwp(7), yihVar);
    }

    @Override // defpackage.ijj
    protected final Object i(ink inkVar, String str, long j, yih yihVar) {
        return gez.l(this.a, true, false, new gvc(inkVar, j, str, 2), yihVar);
    }

    @Override // defpackage.ijj
    public final Object j(yih yihVar) {
        return gez.l(this.a, true, false, new gwp(6), yihVar);
    }

    @Override // defpackage.ijj
    public final Object k(List list, yih yihVar) {
        return gez.l(this.a, false, true, new gup(this, list, 20), yihVar);
    }

    @Override // defpackage.ijj
    protected final Object l(ink inkVar, String str, long j, yih yihVar) {
        return gez.l(this.a, false, true, new gvc(j, inkVar, str, 3), yihVar);
    }

    @Override // defpackage.ijj
    public final Object m(final ink inkVar, final String str, final inl inlVar, final long j, final long j2, final List list, yih yihVar) {
        return gez.k(this.a, new yjv() { // from class: ijk
            @Override // defpackage.yjv
            public final Object a(Object obj) {
                return ijj.n(this.a, inkVar, str, inlVar, j, j2, list, (yih) obj);
            }
        }, yihVar);
    }
}
