package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vxh extends vyq {
    private final vyn a;

    public vxh(vyn vynVar) {
        this.a = vynVar;
    }

    @Override // defpackage.vyq
    public final vyn a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vyq) {
            return this.a.equals(((vyq) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(((vxd) this.a).a) ^ 1000003;
    }

    public final String toString() {
        return "SingleExternalKey{externalKey=" + this.a.toString() + "}";
    }
}
