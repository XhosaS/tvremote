package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum cmi {
    VOID(Void.class),
    INT(Integer.class),
    LONG(Long.class),
    FLOAT(Float.class),
    DOUBLE(Double.class),
    BOOLEAN(Boolean.class),
    STRING(String.class),
    BYTE_STRING(ckv.class),
    ENUM(Integer.class),
    MESSAGE(Object.class);

    public final Class k;

    static {
        ckv ckvVar = ckv.b;
    }

    cmi(Class cls) {
        this.k = cls;
    }
}
