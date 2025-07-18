package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum xxa {
    NO_ERROR(0, xtk.k),
    PROTOCOL_ERROR(1, xtk.j),
    INTERNAL_ERROR(2, xtk.j),
    FLOW_CONTROL_ERROR(3, xtk.j),
    SETTINGS_TIMEOUT(4, xtk.j),
    STREAM_CLOSED(5, xtk.j),
    FRAME_SIZE_ERROR(6, xtk.j),
    REFUSED_STREAM(7, xtk.k),
    CANCEL(8, xtk.c),
    COMPRESSION_ERROR(9, xtk.j),
    CONNECT_ERROR(10, xtk.j),
    ENHANCE_YOUR_CALM(11, xtk.h.e("Bandwidth exhausted")),
    INADEQUATE_SECURITY(12, xtk.f.e("Permission denied as protocol is not secure enough to call")),
    HTTP_1_1_REQUIRED(13, xtk.d);

    public static final xxa[] o;
    public final xtk p;
    private final int r;

    static {
        xxa[] xxaVarArrValues = values();
        xxa[] xxaVarArr = new xxa[((int) xxaVarArrValues[xxaVarArrValues.length - 1].a()) + 1];
        for (xxa xxaVar : xxaVarArrValues) {
            xxaVarArr[(int) xxaVar.a()] = xxaVar;
        }
        o = xxaVarArr;
    }

    xxa(int i, xtk xtkVar) {
        this.r = i;
        String strConcat = "HTTP/2 error code: ".concat(String.valueOf(name()));
        String str = xtkVar.o;
        if (str != null) {
            strConcat = strConcat + " (" + str + ")";
        }
        this.p = xtkVar.e(strConcat);
    }

    public final long a() {
        return this.r;
    }
}
