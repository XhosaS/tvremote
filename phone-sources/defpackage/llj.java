package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class llj implements ieh {
    private final mfy a;

    public llj() {
        throw null;
    }

    @Override // defpackage.ieh
    public final /* synthetic */ Object a() {
        mfx mfxVar = (mfx) this.a;
        return new meq(mfxVar.g, mfxVar.h);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof llj) {
            return this.a.equals(((llj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "VideoDisplaySizeSupplier{surface=" + this.a.toString() + "}";
    }

    public llj(mfy mfyVar) {
        if (mfyVar == null) {
            throw new NullPointerException("Null surface");
        }
        this.a = mfyVar;
    }
}
