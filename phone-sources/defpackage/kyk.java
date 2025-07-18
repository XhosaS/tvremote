package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kyk {
    public final int a;

    public kyk() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof kyk) && this.a == ((kyk) obj).a;
    }

    public final int hashCode() {
        int i = this.a;
        a.bl(i);
        return i ^ 1000003;
    }

    public final String toString() {
        int i = this.a;
        return a.cg(i != 1 ? i != 2 ? "NOTIFICATION" : "DOWNLOADS" : "SETTING_UNSPECIFIED", "OpenSettingsPageAction{section=", "}");
    }

    public kyk(int i) {
        this.a = i;
    }
}
