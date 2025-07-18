package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ytb {
    public static final yjv a = new qyx(14);
    public static final yjz b = new dsc(17);

    public static final ysx a(ysx ysxVar) {
        return ysxVar instanceof yva ? ysxVar : b(ysxVar, a, b);
    }

    public static final ysx b(ysx ysxVar, yjv yjvVar, yjz yjzVar) {
        if (ysxVar instanceof ysw) {
            ysw yswVar = (ysw) ysxVar;
            if (yswVar.a == yjvVar && yswVar.b == yjzVar) {
                return ysxVar;
            }
        }
        return new ysw(ysxVar, yjvVar, yjzVar);
    }
}
