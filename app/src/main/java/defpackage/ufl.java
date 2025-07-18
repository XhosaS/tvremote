package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ufl {
    public final String a;
    public final String b;

    public ufl(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String toString() {
        String str = this.b;
        if (str == null) {
            return ufm.a(this.a);
        }
        return ufm.a(this.a) + "=" + ufm.a(str);
    }
}
