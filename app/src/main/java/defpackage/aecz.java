package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aecz {
    public static final aecz a;
    public static final aecz b;
    public static final aecz c;
    public static final aecz d;
    public final String e;

    static {
        int i = aect.a;
        aecz aeczVar = aecu.a;
        a = aecu.a;
        b = aecu.b;
        c = aecu.c;
        int i2 = aecv.a;
        int i3 = aecw.a;
        aecz aeczVar2 = aecx.a;
        d = aecx.a;
        int i4 = aecy.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aecz) {
            return this.e.equals(((aecz) obj).e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " name=" + this.e + '>';
    }
}
