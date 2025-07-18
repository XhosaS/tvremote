package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class due {
    public final duf a;
    public final cmk b;
    public final dtz c;
    private final dty d;
    private final dtx e;
    private final dua f;
    private final dtw g;

    public /* synthetic */ due(duf dufVar, cmk cmkVar, dtz dtzVar, int i) {
        if ((i & 1) != 0) {
            duf dufVar2 = dub.a;
            dufVar = dub.a;
        }
        cmkVar = (i & 2) != 0 ? null : cmkVar;
        dtzVar = (i & 16) != 0 ? null : dtzVar;
        this.a = dufVar;
        this.b = cmkVar;
        this.d = null;
        this.e = null;
        this.c = dtzVar;
        this.f = null;
        this.g = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof due)) {
            return false;
        }
        due dueVar = (due) obj;
        if (!yks.e(this.a, dueVar.a) || !yks.e(this.b, dueVar.b)) {
            return false;
        }
        dty dtyVar = dueVar.d;
        if (!yks.e(null, null)) {
            return false;
        }
        dtx dtxVar = dueVar.e;
        if (!yks.e(null, null)) {
            return false;
        }
        dua duaVar = dueVar.f;
        if (!yks.e(null, null) || !yks.e(this.c, dueVar.c)) {
            return false;
        }
        dtw dtwVar = dueVar.g;
        return yks.e(null, null);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        cmk cmkVar = this.b;
        return (((iHashCode + (cmkVar != null ? cmkVar.hashCode() : 0)) * 923521) + (this.c != null ? 3 : 0)) * 31;
    }

    public final String toString() {
        return "TextStyle(color=" + this.a + ", fontSize=" + this.b + ", fontWeight=null, fontStyle=null, textDecoration=null, textAlign=" + this.c + ", fontFamily=null)";
    }
}
