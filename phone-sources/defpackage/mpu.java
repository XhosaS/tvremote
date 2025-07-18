package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mpu implements sbn {
    public final String a;

    public mpu(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mpu) && yks.e(this.a, ((mpu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ViewModeChangedEvent(newViewMode=" + this.a + ")";
    }
}
