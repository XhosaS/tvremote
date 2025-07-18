package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mry implements ieh {
    private final mfy a;

    public mry() {
        throw null;
    }

    @Override // defpackage.ieh
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final meq a() {
        return ((mfx) this.a).c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mry) {
            return this.a.equals(((mry) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "VideoSizeSupplier{playerSurface=" + this.a.toString() + "}";
    }

    public mry(mfy mfyVar) {
        if (mfyVar == null) {
            throw new NullPointerException("Null playerSurface");
        }
        this.a = mfyVar;
    }
}
