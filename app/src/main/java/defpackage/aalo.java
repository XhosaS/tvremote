package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aalo extends aalz {
    private final String a;
    private final List b;

    public aalo(String str, List list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.a = str;
        this.b = list;
    }

    @Override // defpackage.aalz
    public final String a() {
        return this.a;
    }

    @Override // defpackage.aalz
    public final List b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aalz) {
            aalz aalzVar = (aalz) obj;
            if (this.a.equals(aalzVar.a()) && this.b.equals(aalzVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.a + ", usedDates=" + this.b.toString() + "}";
    }
}
