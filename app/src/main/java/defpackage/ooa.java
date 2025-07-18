package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ooa extends ooc {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ooc)) {
            return false;
        }
        ooc oocVar = (ooc) obj;
        oocVar.b();
        oocVar.a();
        return true;
    }

    public final int hashCode() {
        return 385623363;
    }

    public final String toString() {
        return "DeleteStatusUpdateParams{markAsUndeleted=false, deleteStatus=PENDING_DELETE}";
    }

    @Override // defpackage.ooc
    public final void a() {
    }

    @Override // defpackage.ooc
    public final void b() {
    }
}
