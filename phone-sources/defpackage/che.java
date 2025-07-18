package defpackage;

/* compiled from: PG */
@yfp
/* loaded from: classes.dex */
public final class che implements cfu {
    public final String a = "https://myaccount.google.com/family/details";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof che) && yks.e(this.a, ((che) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UrlAnnotation(url=" + this.a + ')';
    }
}
