package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zry {
    public final int a;

    public zry(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zry) && ((zry) obj).a == this.a;
    }

    public final int hashCode() {
        return this.a;
    }
}
