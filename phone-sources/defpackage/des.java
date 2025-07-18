package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum des {
    VOID(Void.class),
    INT(Integer.class),
    LONG(Long.class),
    FLOAT(Float.class),
    DOUBLE(Double.class),
    BOOLEAN(Boolean.class),
    STRING(String.class),
    BYTE_STRING(dds.class),
    ENUM(Integer.class),
    MESSAGE(Object.class);

    public final Class k;

    static {
        dds ddsVar = dds.b;
    }

    des(Class cls) {
        this.k = cls;
    }
}
