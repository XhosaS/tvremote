package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class par {
    public final String a;
    public final int b;

    public par(int i, String str) {
        this.b = i;
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof par) {
            par parVar = (par) obj;
            if (parVar.b - 1 == this.b - 1 && yqs.a(parVar.a, this.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return (this.b - 1) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
