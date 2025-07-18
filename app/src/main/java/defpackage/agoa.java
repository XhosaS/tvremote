package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agoa implements Serializable {
    private static final long serialVersionUID = -8759979445933046293L;
    public final Throwable a;

    public agoa(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof agoa) {
            return aghn.a(this.a, ((agoa) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NotificationLite.Error[" + String.valueOf(this.a) + "]";
    }
}
