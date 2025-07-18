package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum adfk implements abxf {
    TEMPLATE_PROCESSING_ERROR_UNSPECIFIED(0),
    INVALID_VALUE(1),
    MISSING_FIELD(2),
    UNKNOWN_EXTENSION(3),
    MODEL_ERROR(4),
    COMMAND_EXECUTION_ERROR(5),
    MISSING_TEMPLATE_ERROR(6),
    PROPERTY_RESOLUTION_ERROR(7);

    public final int i;

    adfk(int i) {
        this.i = i;
    }

    @Override // defpackage.abxf
    public final int a() {
        return this.i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.i);
    }
}
