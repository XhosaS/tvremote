package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lua {
    public final ksn a;

    public lua() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lua) {
            return this.a.equals(((lua) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "GetNotificationSettingsRequest{account=" + this.a.toString() + "}";
    }

    public lua(ksn ksnVar) {
        this.a = ksnVar;
    }
}
