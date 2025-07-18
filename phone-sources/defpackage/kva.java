package defpackage;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kva {
    public static final kva a = f().q();
    public final Map b;
    private final Map c;
    private final Set d;
    private final Set e;

    public kva() {
        throw null;
    }

    public static nag f() {
        nag nagVar = new nag();
        nagVar.r(Collections.EMPTY_MAP);
        nagVar.u(Collections.EMPTY_MAP);
        nagVar.s(Collections.EMPTY_SET);
        nagVar.t(Collections.EMPTY_SET);
        return nagVar;
    }

    public final kvc a(kst kstVar) {
        return b(kstVar.o());
    }

    public final kvc b(ksy ksyVar) {
        if (ksy.y(ksyVar)) {
            krd.b("Attempting to get library item for non-purchasable asset. Please use showLibraryItemForShow() instead");
            return kvc.a;
        }
        kvc kvcVar = (kvc) this.b.get(ksyVar.c);
        return kvcVar != null ? kvcVar : kvc.a;
    }

    public final kwp c(ksy ksyVar) {
        if (ksy.y(ksyVar)) {
            kwp kwpVar = (kwp) this.c.get(ksyVar);
            return kwpVar == null ? kwp.a().a() : kwpVar;
        }
        krd.b("Attempting to get show library item for asset that is not a show.");
        return kwp.a().a();
    }

    public final boolean d(ksy ksyVar) {
        if (ksy.x(ksyVar)) {
            return this.d.contains(ksyVar);
        }
        krd.b("Attempting to get season status for non-season asset.");
        return false;
    }

    public final boolean e(ksy ksyVar) {
        if (ksy.y(ksyVar)) {
            return this.e.contains(ksyVar);
        }
        krd.b("Attempting to get show status for non-show asset.");
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kva) {
            kva kvaVar = (kva) obj;
            if (this.b.equals(kvaVar.b) && this.c.equals(kvaVar.c) && this.d.equals(kvaVar.d) && this.e.equals(kvaVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        Set set = this.e;
        Set set2 = this.d;
        Map map = this.c;
        return "Library{libraryItems=" + String.valueOf(this.b) + ", showLibraryItems=" + String.valueOf(map) + ", partiallyPurchasedSeasons=" + String.valueOf(set2) + ", partiallyPurchasedShows=" + String.valueOf(set) + "}";
    }

    public kva(Map map, Map map2, Set set, Set set2) {
        this.b = map;
        this.c = map2;
        this.d = set;
        this.e = set2;
    }
}
