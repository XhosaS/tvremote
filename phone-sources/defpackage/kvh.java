package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kvh {
    public final kuf a;

    public kvh(kuf kufVar) {
        this.a = kufVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kvh) {
            return this.a.equals(((kvh) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
