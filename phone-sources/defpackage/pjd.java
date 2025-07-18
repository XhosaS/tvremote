package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pjd {
    public final String a;
    public final int b;

    public pjd(int i, String str) {
        this.b = i;
        this.a = str;
    }

    public static pjd a(String str) {
        str.getClass();
        return new pjd(1, str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pjd) {
            pjd pjdVar = (pjd) obj;
            if (pjdVar.b - 1 == this.b - 1 && a.Q(pjdVar.a, this.a)) {
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
