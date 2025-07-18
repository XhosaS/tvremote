package defpackage;

import com.google.protobuf.MessageLite;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jzo {
    final MessageLite a;

    public jzo() {
        this.a = null;
    }

    public static jzo a(MessageLite messageLite) {
        return (messageLite == null || messageLite == abwh.a) ? jzu.a : new jzo(messageLite);
    }

    public final boolean equals(Object obj) {
        MessageLite messageLite;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof jzo) && (messageLite = this.a) != null) {
            MessageLite messageLite2 = ((jzo) obj).a;
            if (messageLite != messageLite2) {
                if (messageLite2 != null && messageLite.getClass() == messageLite2.getClass()) {
                    if (abza.a.a(messageLite.getClass()).k(messageLite, messageLite2)) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        kkk.f(!jzu.b.equals(this));
        if (jzu.a.equals(this)) {
            return 0;
        }
        MessageLite messageLite = this.a;
        kkk.k(messageLite);
        abxd abxdVar = (abxd) messageLite;
        if ((abxdVar.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            return abza.a.a(messageLite.getClass()).b(messageLite);
        }
        int i = abxdVar.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iB = abza.a.a(messageLite.getClass()).b(messageLite);
        abxdVar.memoizedHashCode = iB;
        return iB;
    }

    public final String toString() {
        if (jzu.b.equals(this)) {
            return "$use_sticky_dims$";
        }
        if (jzu.a.equals(this)) {
            return "$no_dims$";
        }
        MessageLite messageLite = this.a;
        kkk.k(messageLite);
        return messageLite.toString();
    }

    private jzo(MessageLite messageLite) {
        this.a = messageLite;
    }
}
