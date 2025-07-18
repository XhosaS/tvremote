package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum cog {
    DOUBLE(coh.DOUBLE, 1),
    FLOAT(coh.FLOAT, 5),
    INT64(coh.LONG, 0),
    UINT64(coh.LONG, 0),
    INT32(coh.INT, 0),
    FIXED64(coh.LONG, 1),
    FIXED32(coh.INT, 5),
    BOOL(coh.BOOLEAN, 0),
    STRING(coh.STRING, 2),
    GROUP(coh.MESSAGE, 3),
    MESSAGE(coh.MESSAGE, 2),
    BYTES(coh.BYTE_STRING, 2),
    UINT32(coh.INT, 0),
    ENUM(coh.ENUM, 0),
    SFIXED32(coh.INT, 5),
    SFIXED64(coh.LONG, 1),
    SINT32(coh.INT, 0),
    SINT64(coh.LONG, 0);

    public final coh s;
    public final int t;

    cog(coh cohVar, int i) {
        this.s = cohVar;
        this.t = i;
    }
}
