package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum cll {
    DOUBLE(0, 1, cmi.DOUBLE),
    FLOAT(1, 1, cmi.FLOAT),
    INT64(2, 1, cmi.LONG),
    UINT64(3, 1, cmi.LONG),
    INT32(4, 1, cmi.INT),
    FIXED64(5, 1, cmi.LONG),
    FIXED32(6, 1, cmi.INT),
    BOOL(7, 1, cmi.BOOLEAN),
    STRING(8, 1, cmi.STRING),
    MESSAGE(9, 1, cmi.MESSAGE),
    BYTES(10, 1, cmi.BYTE_STRING),
    UINT32(11, 1, cmi.INT),
    ENUM(12, 1, cmi.ENUM),
    SFIXED32(13, 1, cmi.INT),
    SFIXED64(14, 1, cmi.LONG),
    SINT32(15, 1, cmi.INT),
    SINT64(16, 1, cmi.LONG),
    GROUP(17, 1, cmi.MESSAGE),
    DOUBLE_LIST(18, 2, cmi.DOUBLE),
    FLOAT_LIST(19, 2, cmi.FLOAT),
    INT64_LIST(20, 2, cmi.LONG),
    UINT64_LIST(21, 2, cmi.LONG),
    INT32_LIST(22, 2, cmi.INT),
    FIXED64_LIST(23, 2, cmi.LONG),
    FIXED32_LIST(24, 2, cmi.INT),
    BOOL_LIST(25, 2, cmi.BOOLEAN),
    STRING_LIST(26, 2, cmi.STRING),
    MESSAGE_LIST(27, 2, cmi.MESSAGE),
    BYTES_LIST(28, 2, cmi.BYTE_STRING),
    UINT32_LIST(29, 2, cmi.INT),
    ENUM_LIST(30, 2, cmi.ENUM),
    SFIXED32_LIST(31, 2, cmi.INT),
    SFIXED64_LIST(32, 2, cmi.LONG),
    SINT32_LIST(33, 2, cmi.INT),
    SINT64_LIST(34, 2, cmi.LONG),
    DOUBLE_LIST_PACKED(35, 3, cmi.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, cmi.FLOAT),
    INT64_LIST_PACKED(37, 3, cmi.LONG),
    UINT64_LIST_PACKED(38, 3, cmi.LONG),
    INT32_LIST_PACKED(39, 3, cmi.INT),
    FIXED64_LIST_PACKED(40, 3, cmi.LONG),
    FIXED32_LIST_PACKED(41, 3, cmi.INT),
    BOOL_LIST_PACKED(42, 3, cmi.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, cmi.INT),
    ENUM_LIST_PACKED(44, 3, cmi.ENUM),
    SFIXED32_LIST_PACKED(45, 3, cmi.INT),
    SFIXED64_LIST_PACKED(46, 3, cmi.LONG),
    SINT32_LIST_PACKED(47, 3, cmi.INT),
    SINT64_LIST_PACKED(48, 3, cmi.LONG),
    GROUP_LIST(49, 2, cmi.MESSAGE),
    MAP(50, 4, cmi.VOID);

    private static final cll[] aa;
    public final int Z;

    static {
        cll[] cllVarArrValues = values();
        aa = new cll[cllVarArrValues.length];
        for (cll cllVar : cllVarArrValues) {
            aa[cllVar.Z] = cllVar;
        }
    }

    cll(int i, int i2, cmi cmiVar) {
        this.Z = i;
        int i3 = i2 - 1;
        if (i3 == 1 || i3 == 3) {
            Class cls = cmiVar.k;
        }
        if (i2 == 1) {
            cmi cmiVar2 = cmi.VOID;
            cmiVar.ordinal();
        }
    }
}
