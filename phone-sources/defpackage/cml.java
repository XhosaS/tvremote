package defpackage;

/* compiled from: PG */
@yji
/* loaded from: classes.dex */
public final class cml {
    public final long a;

    public /* synthetic */ cml(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cml) && this.a == ((cml) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        long j = this.a;
        return a.s(j, 0L) ? "Unspecified" : a.s(j, 4294967296L) ? "Sp" : a.s(j, 8589934592L) ? "Em" : "Invalid";
    }
}
