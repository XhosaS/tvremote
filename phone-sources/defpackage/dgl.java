package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum dgl {
    DOUBLE(dgm.DOUBLE, 1),
    FLOAT(dgm.FLOAT, 5),
    INT64(dgm.LONG, 0),
    UINT64(dgm.LONG, 0),
    INT32(dgm.INT, 0),
    FIXED64(dgm.LONG, 1),
    FIXED32(dgm.INT, 5),
    BOOL(dgm.BOOLEAN, 0),
    STRING(dgm.STRING, 2),
    GROUP(dgm.MESSAGE, 3),
    MESSAGE(dgm.MESSAGE, 2),
    BYTES(dgm.BYTE_STRING, 2),
    UINT32(dgm.INT, 0),
    ENUM(dgm.ENUM, 0),
    SFIXED32(dgm.INT, 5),
    SFIXED64(dgm.LONG, 1),
    SINT32(dgm.INT, 0),
    SINT64(dgm.LONG, 0);

    public final dgm s;
    public final int t;

    dgl(dgm dgmVar, int i) {
        this.s = dgmVar;
        this.t = i;
    }
}
