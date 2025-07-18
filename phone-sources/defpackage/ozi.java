package defpackage;

import com.google.common.collect.ImmutableMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ozi {
    public final oyd a;
    public final ImmutableMap b;
    public final ImmutableMap c;
    public final ImmutableMap d;
    public final ImmutableMap e;
    private final String f;
    private final uwm g;

    public ozi() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ozi) {
            ozi oziVar = (ozi) obj;
            String str = this.f;
            if (str != null ? str.equals(oziVar.f) : oziVar.f == null) {
                if (this.g.equals(oziVar.g) && this.a.equals(oziVar.a) && this.b.equals(oziVar.b) && this.c.equals(oziVar.c) && this.d.equals(oziVar.d) && this.e.equals(oziVar.e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iJ;
        String str = this.f;
        int iHashCode = str == null ? 0 : str.hashCode();
        uwm uwmVar = this.g;
        if (uwmVar.A()) {
            iJ = uwmVar.j();
        } else {
            int iJ2 = uwmVar.M;
            if (iJ2 == 0) {
                iJ2 = uwmVar.j();
                uwmVar.M = iJ2;
            }
            iJ = iJ2;
        }
        return ((((((((((((iHashCode ^ 1000003) * 1000003) ^ iJ) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        ImmutableMap immutableMap = this.e;
        ImmutableMap immutableMap2 = this.d;
        ImmutableMap immutableMap3 = this.c;
        ImmutableMap immutableMap4 = this.b;
        oyd oydVar = this.a;
        return "TargetingRuleEvalContext{accountName=" + this.f + ", promoId=" + this.g.toString() + ", clearcutLogContext=" + oydVar.toString() + ", clearcutCounts=" + immutableMap4.toString() + ", veCounts=" + immutableMap3.toString() + ", appStates=" + immutableMap2.toString() + ", permissionRequestCounts=" + immutableMap.toString() + "}";
    }

    public ozi(String str, uwm uwmVar, oyd oydVar, ImmutableMap immutableMap, ImmutableMap immutableMap2, ImmutableMap immutableMap3, ImmutableMap immutableMap4) {
        this.f = str;
        if (uwmVar == null) {
            throw new NullPointerException("Null promoId");
        }
        this.g = uwmVar;
        if (oydVar == null) {
            throw new NullPointerException("Null clearcutLogContext");
        }
        this.a = oydVar;
        if (immutableMap == null) {
            throw new NullPointerException("Null clearcutCounts");
        }
        this.b = immutableMap;
        if (immutableMap2 == null) {
            throw new NullPointerException("Null veCounts");
        }
        this.c = immutableMap2;
        if (immutableMap3 == null) {
            throw new NullPointerException("Null appStates");
        }
        this.d = immutableMap3;
        if (immutableMap4 == null) {
            throw new NullPointerException("Null permissionRequestCounts");
        }
        this.e = immutableMap4;
    }
}
