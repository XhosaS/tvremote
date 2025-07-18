package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yng {
    public final String a;
    private final ymd b;

    public yng(String str, ymd ymdVar) {
        ymdVar.getClass();
        this.a = str;
        this.b = ymdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yng)) {
            return false;
        }
        yng yngVar = (yng) obj;
        return yks.e(this.a, yngVar.a) && yks.e(this.b, yngVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "MatchGroup(value=" + this.a + ", range=" + this.b + ")";
    }
}
