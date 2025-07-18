package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class djz {
    public final int a;

    public djz(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof djz) && this.a == ((djz) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "AppWidgetId(appWidgetId=" + this.a + ')';
    }
}
