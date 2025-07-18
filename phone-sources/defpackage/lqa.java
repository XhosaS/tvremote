package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lqa {
    private final lpz a;
    private final String b;
    private final tst c;
    private final tst d;
    private final tst e;
    private final tst f;
    private final ImmutableList g;
    private final lpx h;
    private final lpy i;

    public lqa() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lqa) {
            lqa lqaVar = (lqa) obj;
            if (this.a.equals(lqaVar.a) && this.b.equals(lqaVar.b) && this.c.equals(lqaVar.c) && this.d.equals(lqaVar.d) && this.e.equals(lqaVar.e) && this.f.equals(lqaVar.f) && this.g.equals(lqaVar.g) && this.h.equals(lqaVar.h) && this.i.equals(lqaVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    public final String toString() {
        lpy lpyVar = this.i;
        lpx lpxVar = this.h;
        ImmutableList immutableList = this.g;
        tst tstVar = this.f;
        tst tstVar2 = this.e;
        tst tstVar3 = this.d;
        tst tstVar4 = this.c;
        return "Card{type=" + String.valueOf(this.a) + ", title=" + this.b + ", message=" + String.valueOf(tstVar4) + ", callToActionText=" + String.valueOf(tstVar3) + ", callToActionContentDescription=" + String.valueOf(tstVar2) + ", callToActionToken=" + String.valueOf(tstVar) + ", images=" + String.valueOf(immutableList) + ", arrowPlacement=" + String.valueOf(lpxVar) + ", dismissalType=" + String.valueOf(lpyVar) + "}";
    }

    public lqa(lpz lpzVar, String str, tst tstVar, tst tstVar2, tst tstVar3, tst tstVar4, ImmutableList immutableList, lpx lpxVar, lpy lpyVar) {
        this.a = lpzVar;
        this.b = str;
        this.c = tstVar;
        this.d = tstVar2;
        this.e = tstVar3;
        this.f = tstVar4;
        this.g = immutableList;
        this.h = lpxVar;
        this.i = lpyVar;
    }
}
