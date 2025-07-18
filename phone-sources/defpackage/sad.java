package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sad {
    public final int a;

    public sad() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sad)) {
            return false;
        }
        int i = this.a;
        int i2 = ((sad) obj).a;
        if (i != 0) {
            return i2 == 1;
        }
        throw null;
    }

    public final int hashCode() {
        a.bl(this.a);
        return -721379960;
    }

    public final String toString() {
        return a.cg(this.a != 1 ? "null" : "CLICK", "ClickActionAnalyticsEventData{actionType=null, clickDataType=", "}");
    }

    public sad(byte[] bArr) {
        this.a = 1;
    }
}
