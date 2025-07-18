package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum xfn implements abxf {
    DEFAULT_NO_DATA_SHARING_RESTRICTION(0),
    NO_SHARING_ALLOWED_WITH_THIRD_PARTY(1),
    SHARING_STATUS_NOT_SET(2),
    NO_SHARING_ALLOWED_WITH_THIRD_PARTY_FROM_OOBE(3);

    public final int e;

    xfn(int i) {
        this.e = i;
    }

    @Override // defpackage.abxf
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
