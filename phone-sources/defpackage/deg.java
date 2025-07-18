package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum deg {
    DOUBLE(0, 1, des.DOUBLE),
    FLOAT(1, 1, des.FLOAT),
    INT64(2, 1, des.LONG),
    UINT64(3, 1, des.LONG),
    INT32(4, 1, des.INT),
    FIXED64(5, 1, des.LONG),
    FIXED32(6, 1, des.INT),
    BOOL(7, 1, des.BOOLEAN),
    STRING(8, 1, des.STRING),
    MESSAGE(9, 1, des.MESSAGE),
    BYTES(10, 1, des.BYTE_STRING),
    UINT32(11, 1, des.INT),
    ENUM(12, 1, des.ENUM),
    SFIXED32(13, 1, des.INT),
    SFIXED64(14, 1, des.LONG),
    SINT32(15, 1, des.INT),
    SINT64(16, 1, des.LONG),
    GROUP(17, 1, des.MESSAGE),
    DOUBLE_LIST(18, 2, des.DOUBLE),
    FLOAT_LIST(19, 2, des.FLOAT),
    INT64_LIST(20, 2, des.LONG),
    UINT64_LIST(21, 2, des.LONG),
    INT32_LIST(22, 2, des.INT),
    FIXED64_LIST(23, 2, des.LONG),
    FIXED32_LIST(24, 2, des.INT),
    BOOL_LIST(25, 2, des.BOOLEAN),
    STRING_LIST(26, 2, des.STRING),
    MESSAGE_LIST(27, 2, des.MESSAGE),
    BYTES_LIST(28, 2, des.BYTE_STRING),
    UINT32_LIST(29, 2, des.INT),
    ENUM_LIST(30, 2, des.ENUM),
    SFIXED32_LIST(31, 2, des.INT),
    SFIXED64_LIST(32, 2, des.LONG),
    SINT32_LIST(33, 2, des.INT),
    SINT64_LIST(34, 2, des.LONG),
    DOUBLE_LIST_PACKED(35, 3, des.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, des.FLOAT),
    INT64_LIST_PACKED(37, 3, des.LONG),
    UINT64_LIST_PACKED(38, 3, des.LONG),
    INT32_LIST_PACKED(39, 3, des.INT),
    FIXED64_LIST_PACKED(40, 3, des.LONG),
    FIXED32_LIST_PACKED(41, 3, des.INT),
    BOOL_LIST_PACKED(42, 3, des.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, des.INT),
    ENUM_LIST_PACKED(44, 3, des.ENUM),
    SFIXED32_LIST_PACKED(45, 3, des.INT),
    SFIXED64_LIST_PACKED(46, 3, des.LONG),
    SINT32_LIST_PACKED(47, 3, des.INT),
    SINT64_LIST_PACKED(48, 3, des.LONG),
    GROUP_LIST(49, 2, des.MESSAGE),
    MAP(50, 4, des.VOID);

    private static final deg[] aa;
    public final int Z;

    static {
        deg[] degVarArrValues = values();
        aa = new deg[degVarArrValues.length];
        for (deg degVar : degVarArrValues) {
            aa[degVar.Z] = degVar;
        }
    }

    deg(int i, int i2, des desVar) {
        this.Z = i;
        des desVar2 = des.VOID;
        int i3 = i2 - 1;
        if (i3 == 1 || i3 == 3) {
            Class cls = desVar.k;
        }
        if (i2 == 1) {
            desVar.ordinal();
        }
    }
}
