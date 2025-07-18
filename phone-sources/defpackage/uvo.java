package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uvo {
    public final String a;

    public uvo(upo upoVar) {
        this.a = (String) upoVar.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uvo) {
            return Objects.equals(this.a, ((uvo) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        return "CapabilityAlias{alias='" + this.a + "'}";
    }
}
