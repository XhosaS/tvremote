package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum acge implements abxf {
    CUSTOM_STORAGE_TYPE_UNKNOWN(0),
    CUSTOM_STORAGE_TYPE_PROTODATASTORE(1),
    CUSTOM_STORAGE_TYPE_GDD(2);

    private final int e;

    acge(int i) {
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
