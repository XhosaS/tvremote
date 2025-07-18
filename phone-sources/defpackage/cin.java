package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cin {
    public final int a;

    public cin(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cin) && this.a == ((cin) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.a + ')';
    }
}
