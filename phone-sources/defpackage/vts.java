package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum vts {
    DOUBLE(0, 1, vus.DOUBLE),
    FLOAT(1, 1, vus.FLOAT),
    INT64(2, 1, vus.LONG),
    UINT64(3, 1, vus.LONG),
    INT32(4, 1, vus.INT),
    FIXED64(5, 1, vus.LONG),
    FIXED32(6, 1, vus.INT),
    BOOL(7, 1, vus.BOOLEAN),
    STRING(8, 1, vus.STRING),
    MESSAGE(9, 1, vus.MESSAGE),
    BYTES(10, 1, vus.BYTE_STRING),
    UINT32(11, 1, vus.INT),
    ENUM(12, 1, vus.ENUM),
    SFIXED32(13, 1, vus.INT),
    SFIXED64(14, 1, vus.LONG),
    SINT32(15, 1, vus.INT),
    SINT64(16, 1, vus.LONG),
    GROUP(17, 1, vus.MESSAGE),
    DOUBLE_LIST(18, 2, vus.DOUBLE),
    FLOAT_LIST(19, 2, vus.FLOAT),
    INT64_LIST(20, 2, vus.LONG),
    UINT64_LIST(21, 2, vus.LONG),
    INT32_LIST(22, 2, vus.INT),
    FIXED64_LIST(23, 2, vus.LONG),
    FIXED32_LIST(24, 2, vus.INT),
    BOOL_LIST(25, 2, vus.BOOLEAN),
    STRING_LIST(26, 2, vus.STRING),
    MESSAGE_LIST(27, 2, vus.MESSAGE),
    BYTES_LIST(28, 2, vus.BYTE_STRING),
    UINT32_LIST(29, 2, vus.INT),
    ENUM_LIST(30, 2, vus.ENUM),
    SFIXED32_LIST(31, 2, vus.INT),
    SFIXED64_LIST(32, 2, vus.LONG),
    SINT32_LIST(33, 2, vus.INT),
    SINT64_LIST(34, 2, vus.LONG),
    DOUBLE_LIST_PACKED(35, 3, vus.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, vus.FLOAT),
    INT64_LIST_PACKED(37, 3, vus.LONG),
    UINT64_LIST_PACKED(38, 3, vus.LONG),
    INT32_LIST_PACKED(39, 3, vus.INT),
    FIXED64_LIST_PACKED(40, 3, vus.LONG),
    FIXED32_LIST_PACKED(41, 3, vus.INT),
    BOOL_LIST_PACKED(42, 3, vus.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, vus.INT),
    ENUM_LIST_PACKED(44, 3, vus.ENUM),
    SFIXED32_LIST_PACKED(45, 3, vus.INT),
    SFIXED64_LIST_PACKED(46, 3, vus.LONG),
    SINT32_LIST_PACKED(47, 3, vus.INT),
    SINT64_LIST_PACKED(48, 3, vus.LONG),
    GROUP_LIST(49, 2, vus.MESSAGE),
    MAP(50, 4, vus.VOID);

    private static final vts[] aa;
    public final int Z;

    static {
        vts[] vtsVarArrValues = values();
        aa = new vts[vtsVarArrValues.length];
        for (vts vtsVar : vtsVarArrValues) {
            aa[vtsVar.Z] = vtsVar;
        }
    }

    vts(int i, int i2, vus vusVar) {
        this.Z = i;
        int i3 = i2 - 1;
        if (i3 == 1 || i3 == 3) {
            Class cls = vusVar.k;
        }
        if (i2 == 1) {
            vus vusVar2 = vus.VOID;
            vusVar.ordinal();
        }
    }
}
