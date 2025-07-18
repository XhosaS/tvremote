package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum vwo {
    DOUBLE(vwp.DOUBLE, 1),
    FLOAT(vwp.FLOAT, 5),
    INT64(vwp.LONG, 0),
    UINT64(vwp.LONG, 0),
    INT32(vwp.INT, 0),
    FIXED64(vwp.LONG, 1),
    FIXED32(vwp.INT, 5),
    BOOL(vwp.BOOLEAN, 0),
    STRING(vwp.STRING, 2),
    GROUP(vwp.MESSAGE, 3),
    MESSAGE(vwp.MESSAGE, 2),
    BYTES(vwp.BYTE_STRING, 2),
    UINT32(vwp.INT, 0),
    ENUM(vwp.ENUM, 0),
    SFIXED32(vwp.INT, 5),
    SFIXED64(vwp.LONG, 1),
    SINT32(vwp.INT, 0),
    SINT64(vwp.LONG, 0);

    public final vwp s;
    public final int t;

    vwo(vwp vwpVar, int i) {
        this.s = vwpVar;
        this.t = i;
    }
}
