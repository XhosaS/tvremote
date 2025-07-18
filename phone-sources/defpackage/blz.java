package defpackage;

/* compiled from: PG */
@yji
/* loaded from: classes.dex */
public final class blz {
    public final int a;

    public /* synthetic */ blz(int i) {
        this.a = i;
    }

    public static String a(int i) {
        return a.r(i, 1) ? "Next" : a.r(i, 2) ? "Previous" : a.r(i, 3) ? "Left" : a.r(i, 4) ? "Right" : a.r(i, 5) ? "Up" : a.r(i, 6) ? "Down" : a.r(i, 7) ? "Enter" : a.r(i, 8) ? "Exit" : "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof blz) && this.a == ((blz) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a(this.a);
    }
}
