package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yov extends yid {
    public static final bbx b = new bbx();
    public final String a;

    public yov(String str) {
        super(b);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yov) && yks.e(this.a, ((yov) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CoroutineName(" + this.a + ")";
    }
}
