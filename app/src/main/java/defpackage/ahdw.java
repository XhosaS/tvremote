package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahdw {
    public static final ahmg a = new ahmg("COMPLETING_ALREADY");
    public static final ahmg b = new ahmg("COMPLETING_WAITING_CHILDREN");
    public static final ahmg c = new ahmg("COMPLETING_RETRY");
    public static final ahmg d = new ahmg("TOO_LATE_TO_CANCEL");
    public static final ahmg e = new ahmg("SEALED");
    public static final ahcq f = new ahcq(false);
    public static final ahcq g = new ahcq(true);

    public static final Object a(Object obj) {
        return obj instanceof ahdg ? new ahdh((ahdg) obj) : obj;
    }

    public static final Object b(Object obj) {
        ahdg ahdgVar;
        ahdh ahdhVar = obj instanceof ahdh ? (ahdh) obj : null;
        return (ahdhVar == null || (ahdgVar = ahdhVar.a) == null) ? obj : ahdgVar;
    }
}
