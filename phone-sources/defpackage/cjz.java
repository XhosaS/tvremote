package defpackage;

/* compiled from: PG */
@yji
/* loaded from: classes.dex */
public final class cjz {
    public final int a;

    public /* synthetic */ cjz(int i) {
        this.a = i;
    }

    public static String a(int i) {
        return a.r(i, -1) ? "Unspecified" : a.r(i, 0) ? "None" : a.r(i, 1) ? "Default" : a.r(i, 2) ? "Go" : a.r(i, 3) ? "Search" : a.r(i, 4) ? "Send" : a.r(i, 5) ? "Previous" : a.r(i, 6) ? "Next" : a.r(i, 7) ? "Done" : "Invalid";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cjz) && this.a == ((cjz) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a(this.a);
    }
}
