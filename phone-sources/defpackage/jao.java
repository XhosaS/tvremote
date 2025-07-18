package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jao {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    private final int e = 3;

    public /* synthetic */ jao(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jao)) {
            return false;
        }
        jao jaoVar = (jao) obj;
        if (!yks.e(this.a, jaoVar.a) || !yks.e(this.b, jaoVar.b) || !yks.e(this.c, jaoVar.c)) {
            return false;
        }
        int i = jaoVar.e;
        return yks.e(this.d, jaoVar.d);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + 3) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "ChimeNotificationChannel(id=" + this.a + ", name=" + this.b + ", description=" + this.c + ", importance=3, groupId=" + this.d + ")";
    }
}
