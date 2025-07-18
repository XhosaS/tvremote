package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pte {
    public final ptd a;
    public final int b;
    private final int c;

    public pte() {
        throw null;
    }

    public static xxq a() {
        xxq xxqVar = new xxq();
        xxqVar.a = 1;
        return xxqVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pte) {
            pte pteVar = (pte) obj;
            if (this.a.equals(pteVar.a)) {
                int i = this.b;
                int i2 = pteVar.b;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    int i3 = this.c;
                    int i4 = pteVar.c;
                    if (i3 == 0) {
                        throw null;
                    }
                    if (i3 == i4) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        int i = this.b;
        a.bl(i);
        int i2 = this.c;
        a.bl(i2);
        return (((iHashCode * 1000003) ^ i) * 1000003) ^ i2;
    }

    public final String toString() {
        String str;
        int i = this.c;
        String strValueOf = String.valueOf(this.a);
        switch (i) {
            case 1:
                str = "SOURCE_UNSPECIFIED";
                break;
            case 2:
                str = "EXPLICIT_PREFERENCE";
                break;
            case 3:
                str = "BEHAVIOR_DEFAULT";
                break;
            case 4:
                str = "BEHAVIOR_OVERRIDE";
                break;
            case 5:
                str = "REMOVED_PREFERENCE";
                break;
            case 6:
                str = "NON_DYNAMIC_EXPLICIT_PREFERENCE";
                break;
            default:
                str = "null";
                break;
        }
        return "PreferenceResult{preferenceKey=" + strValueOf + ", preference=" + ocv.bu(this.b) + ", preferenceSource=" + str + "}";
    }

    public pte(ptd ptdVar, int i, int i2) {
        this.a = ptdVar;
        this.b = i;
        this.c = i2;
    }
}
