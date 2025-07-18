package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum dpa {
    DOUBLE(0, 1, dpn.DOUBLE),
    FLOAT(1, 1, dpn.FLOAT),
    INT64(2, 1, dpn.LONG),
    UINT64(3, 1, dpn.LONG),
    INT32(4, 1, dpn.INT),
    FIXED64(5, 1, dpn.LONG),
    FIXED32(6, 1, dpn.INT),
    BOOL(7, 1, dpn.BOOLEAN),
    STRING(8, 1, dpn.STRING),
    MESSAGE(9, 1, dpn.MESSAGE),
    BYTES(10, 1, dpn.BYTE_STRING),
    UINT32(11, 1, dpn.INT),
    ENUM(12, 1, dpn.ENUM),
    SFIXED32(13, 1, dpn.INT),
    SFIXED64(14, 1, dpn.LONG),
    SINT32(15, 1, dpn.INT),
    SINT64(16, 1, dpn.LONG),
    GROUP(17, 1, dpn.MESSAGE),
    DOUBLE_LIST(18, 2, dpn.DOUBLE),
    FLOAT_LIST(19, 2, dpn.FLOAT),
    INT64_LIST(20, 2, dpn.LONG),
    UINT64_LIST(21, 2, dpn.LONG),
    INT32_LIST(22, 2, dpn.INT),
    FIXED64_LIST(23, 2, dpn.LONG),
    FIXED32_LIST(24, 2, dpn.INT),
    BOOL_LIST(25, 2, dpn.BOOLEAN),
    STRING_LIST(26, 2, dpn.STRING),
    MESSAGE_LIST(27, 2, dpn.MESSAGE),
    BYTES_LIST(28, 2, dpn.BYTE_STRING),
    UINT32_LIST(29, 2, dpn.INT),
    ENUM_LIST(30, 2, dpn.ENUM),
    SFIXED32_LIST(31, 2, dpn.INT),
    SFIXED64_LIST(32, 2, dpn.LONG),
    SINT32_LIST(33, 2, dpn.INT),
    SINT64_LIST(34, 2, dpn.LONG),
    DOUBLE_LIST_PACKED(35, 3, dpn.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, dpn.FLOAT),
    INT64_LIST_PACKED(37, 3, dpn.LONG),
    UINT64_LIST_PACKED(38, 3, dpn.LONG),
    INT32_LIST_PACKED(39, 3, dpn.INT),
    FIXED64_LIST_PACKED(40, 3, dpn.LONG),
    FIXED32_LIST_PACKED(41, 3, dpn.INT),
    BOOL_LIST_PACKED(42, 3, dpn.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, dpn.INT),
    ENUM_LIST_PACKED(44, 3, dpn.ENUM),
    SFIXED32_LIST_PACKED(45, 3, dpn.INT),
    SFIXED64_LIST_PACKED(46, 3, dpn.LONG),
    SINT32_LIST_PACKED(47, 3, dpn.INT),
    SINT64_LIST_PACKED(48, 3, dpn.LONG),
    GROUP_LIST(49, 2, dpn.MESSAGE),
    MAP(50, 4, dpn.VOID);

    private static final dpa[] aa;
    public final int Z;

    static {
        dpa[] dpaVarArrValues = values();
        aa = new dpa[dpaVarArrValues.length];
        for (dpa dpaVar : dpaVarArrValues) {
            aa[dpaVar.Z] = dpaVar;
        }
    }

    dpa(int i, int i2, dpn dpnVar) {
        this.Z = i;
        dpn dpnVar2 = dpn.VOID;
        int i3 = i2 - 1;
        if (i3 == 1 || i3 == 3) {
            Class cls = dpnVar.k;
        }
        if (i2 == 1) {
            dpnVar.ordinal();
        }
    }
}
