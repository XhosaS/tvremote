package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qgr extends qgu {
    public final boolean a;

    public qgr(boolean z) {
        this.a = z;
    }

    @Override // defpackage.qgu
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof qgu) && this.a == ((qgu) obj).a();
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        return "PhotoOptions{allowDefaultImage=" + this.a + "}";
    }
}
