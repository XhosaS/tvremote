package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dip {
    public final int a;

    public dip(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dip) && ((dip) obj).a == this.a;
    }

    public final int hashCode() {
        return this.a;
    }
}
