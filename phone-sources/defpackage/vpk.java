package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vpk implements vpm {
    public final vro a;

    public vpk(vro vroVar) {
        vroVar.getClass();
        this.a = vroVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vpk) && this.a == ((vpk) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ButtonStyleFilled(backgroundColor=" + this.a + ")";
    }
}
