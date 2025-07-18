package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum acap {
    DOUBLE(acaq.DOUBLE, 1),
    FLOAT(acaq.FLOAT, 5),
    INT64(acaq.LONG, 0),
    UINT64(acaq.LONG, 0),
    INT32(acaq.INT, 0),
    FIXED64(acaq.LONG, 1),
    FIXED32(acaq.INT, 5),
    BOOL(acaq.BOOLEAN, 0),
    STRING(acaq.STRING, 2),
    GROUP(acaq.MESSAGE, 3),
    MESSAGE(acaq.MESSAGE, 2),
    BYTES(acaq.BYTE_STRING, 2),
    UINT32(acaq.INT, 0),
    ENUM(acaq.ENUM, 0),
    SFIXED32(acaq.INT, 5),
    SFIXED64(acaq.LONG, 1),
    SINT32(acaq.INT, 0),
    SINT64(acaq.LONG, 0);

    public final acaq s;
    public final int t;

    acap(acaq acaqVar, int i) {
        this.s = acaqVar;
        this.t = i;
    }
}
