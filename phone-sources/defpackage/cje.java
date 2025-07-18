package defpackage;

/* compiled from: PG */
@yji
/* loaded from: classes.dex */
public final class cje {
    public final int a;

    @yfp
    public /* synthetic */ cje(int i) {
        this.a = i;
    }

    public static String a(int i) {
        return a.r(i, 0) ? "Normal" : a.r(i, 1) ? "Italic" : "Invalid";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cje) && this.a == ((cje) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a(this.a);
    }
}
