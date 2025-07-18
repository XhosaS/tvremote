package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class itg {
    public final boolean a;

    public itg(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof itg) && this.a == ((itg) obj).a;
    }

    public final int hashCode() {
        return a.q(this.a);
    }

    public final String toString() {
        return "VolumeLevels(isMuted=" + this.a + ")";
    }
}
