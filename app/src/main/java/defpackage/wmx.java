package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wmx extends wna {
    public final int a;

    public wmx(int i) {
        this.a = i;
    }

    @Override // defpackage.wna
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wna) {
            wna wnaVar = (wna) obj;
            wnaVar.b();
            if (this.a == wnaVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a ^ (-722379962);
    }

    public final String toString() {
        return a.e(this.a != 1 ? "CREDENTIAL" : "DEVICE", "StorageSpec{type=FILES, directBoot=", "}");
    }

    @Override // defpackage.wna
    public final void b() {
    }
}
