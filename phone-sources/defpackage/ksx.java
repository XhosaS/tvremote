package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ksx {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public ksx() {
        throw null;
    }

    public static ksx a(List list) {
        uug uugVar = new uug();
        uugVar.g(false);
        uugVar.f(false);
        uugVar.h(false);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int i = ((ktd) it.next()).b;
            if (i == 1) {
                uugVar.g(true);
            } else if (i == 2) {
                uugVar.f(true);
            } else if (i == 3) {
                uugVar.h(true);
            }
        }
        return uugVar.e();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ksx) {
            ksx ksxVar = (ksx) obj;
            if (this.a == ksxVar.a && this.b == ksxVar.b && this.c == ksxVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        return ((((i ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237);
    }

    public final String toString() {
        return "AssetDetailsRestrictions{thumbsUpRestricted=" + this.a + ", thumbsDownRestricted=" + this.b + ", watchlistRestricted=" + this.c + "}";
    }

    public ksx(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }
}
