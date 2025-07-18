package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum abws {
    DOUBLE(0, 1, abxx.DOUBLE),
    FLOAT(1, 1, abxx.FLOAT),
    INT64(2, 1, abxx.LONG),
    UINT64(3, 1, abxx.LONG),
    INT32(4, 1, abxx.INT),
    FIXED64(5, 1, abxx.LONG),
    FIXED32(6, 1, abxx.INT),
    BOOL(7, 1, abxx.BOOLEAN),
    STRING(8, 1, abxx.STRING),
    MESSAGE(9, 1, abxx.MESSAGE),
    BYTES(10, 1, abxx.BYTE_STRING),
    UINT32(11, 1, abxx.INT),
    ENUM(12, 1, abxx.ENUM),
    SFIXED32(13, 1, abxx.INT),
    SFIXED64(14, 1, abxx.LONG),
    SINT32(15, 1, abxx.INT),
    SINT64(16, 1, abxx.LONG),
    GROUP(17, 1, abxx.MESSAGE),
    DOUBLE_LIST(18, 2, abxx.DOUBLE),
    FLOAT_LIST(19, 2, abxx.FLOAT),
    INT64_LIST(20, 2, abxx.LONG),
    UINT64_LIST(21, 2, abxx.LONG),
    INT32_LIST(22, 2, abxx.INT),
    FIXED64_LIST(23, 2, abxx.LONG),
    FIXED32_LIST(24, 2, abxx.INT),
    BOOL_LIST(25, 2, abxx.BOOLEAN),
    STRING_LIST(26, 2, abxx.STRING),
    MESSAGE_LIST(27, 2, abxx.MESSAGE),
    BYTES_LIST(28, 2, abxx.BYTE_STRING),
    UINT32_LIST(29, 2, abxx.INT),
    ENUM_LIST(30, 2, abxx.ENUM),
    SFIXED32_LIST(31, 2, abxx.INT),
    SFIXED64_LIST(32, 2, abxx.LONG),
    SINT32_LIST(33, 2, abxx.INT),
    SINT64_LIST(34, 2, abxx.LONG),
    DOUBLE_LIST_PACKED(35, 3, abxx.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, abxx.FLOAT),
    INT64_LIST_PACKED(37, 3, abxx.LONG),
    UINT64_LIST_PACKED(38, 3, abxx.LONG),
    INT32_LIST_PACKED(39, 3, abxx.INT),
    FIXED64_LIST_PACKED(40, 3, abxx.LONG),
    FIXED32_LIST_PACKED(41, 3, abxx.INT),
    BOOL_LIST_PACKED(42, 3, abxx.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, abxx.INT),
    ENUM_LIST_PACKED(44, 3, abxx.ENUM),
    SFIXED32_LIST_PACKED(45, 3, abxx.INT),
    SFIXED64_LIST_PACKED(46, 3, abxx.LONG),
    SINT32_LIST_PACKED(47, 3, abxx.INT),
    SINT64_LIST_PACKED(48, 3, abxx.LONG),
    GROUP_LIST(49, 2, abxx.MESSAGE),
    MAP(50, 4, abxx.VOID);

    private static final abws[] aa;
    public final int Z;

    static {
        abws[] abwsVarArrValues = values();
        aa = new abws[abwsVarArrValues.length];
        for (abws abwsVar : abwsVarArrValues) {
            aa[abwsVar.Z] = abwsVar;
        }
    }

    abws(int i, int i2, abxx abxxVar) {
        this.Z = i;
        int i3 = i2 - 1;
        if (i3 == 1 || i3 == 3) {
            Class cls = abxxVar.k;
        }
        if (i2 == 1) {
            abxx abxxVar2 = abxx.VOID;
            abxxVar.ordinal();
        }
    }
}
