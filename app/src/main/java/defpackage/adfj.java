package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum adfj implements abxf {
    INTERNAL_RUNTIME_ERROR_UNSPECIFIED(0),
    WIRE_FORMAT_ERROR(1),
    CONFIGURATION_ERROR(2),
    INTERNAL_TEMPLATE_RESOLUTION_ERROR(3),
    INTERNAL_ERROR(4),
    INTERNAL_RESOURCE_ERROR(5),
    INTERNAL_UTP_ERROR(6);

    public final int h;

    adfj(int i2) {
        this.h = i2;
    }

    @Override // defpackage.abxf
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
