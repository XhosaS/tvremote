package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum ycg implements abxf {
    DATA_SHARING_CONSENT_UNKNOWN(0),
    DATA_SHARING_CONSENT_GRANTED(1),
    DATA_SHARING_CONSENT_DENIED(2),
    DATA_SHARING_CONSENT_DENIED_FROM_OOBE(3);

    public final int e;

    ycg(int i) {
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
