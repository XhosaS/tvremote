package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum vus {
    VOID(Void.class),
    INT(Integer.class),
    LONG(Long.class),
    FLOAT(Float.class),
    DOUBLE(Double.class),
    BOOLEAN(Boolean.class),
    STRING(String.class),
    BYTE_STRING(vsz.class),
    ENUM(Integer.class),
    MESSAGE(Object.class);

    public final Class k;

    static {
        vsz vszVar = vsz.b;
    }

    vus(Class cls) {
        this.k = cls;
    }
}
