package defpackage;

/* compiled from: PG */
@yji
/* loaded from: classes.dex */
public final class clh {
    public static String a(int i) {
        StringBuilder sb = new StringBuilder("LineBreak(strategy=");
        int iL = cko.l(i);
        String str = "Invalid";
        sb.append((Object) (a.r(iL, 1) ? "Strategy.Simple" : a.r(iL, 2) ? "Strategy.HighQuality" : a.r(iL, 3) ? "Strategy.Balanced" : a.r(iL, 0) ? "Strategy.Unspecified" : "Invalid"));
        sb.append(", strictness=");
        int iM = cko.m(i);
        sb.append((Object) (a.r(iM, 1) ? "Strictness.None" : a.r(iM, 2) ? "Strictness.Loose" : a.r(iM, 3) ? "Strictness.Normal" : a.r(iM, 4) ? "Strictness.Strict" : a.r(iM, 0) ? "Strictness.Unspecified" : "Invalid"));
        sb.append(", wordBreak=");
        int iN = cko.n(i);
        if (a.r(iN, 1)) {
            str = "WordBreak.None";
        } else if (a.r(iN, 2)) {
            str = "WordBreak.Phrase";
        } else if (a.r(iN, 0)) {
            str = "WordBreak.Unspecified";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
