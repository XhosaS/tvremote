package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qie implements xcm {
    private final xcq a;
    private final xcq b;

    public qie(xcq xcqVar, xcq xcqVar2) {
        this.a = xcqVar;
        this.b = xcqVar2;
    }

    @Override // defpackage.yfo, defpackage.yfn
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final qig b() {
        qig qigVarY;
        qei qeiVar = (qei) this.a.b();
        qps qpsVar = new qps();
        Context contextA = ((rgq) this.b).a();
        int i = qid.a;
        qeiVar.getClass();
        qpsVar.a(contextA);
        String strA = xew.a.get().a();
        if (strA.length() > 0) {
            try {
                qigVarY = (qig) Enum.valueOf(qig.class, strA);
            } catch (IllegalArgumentException e) {
                tvk tvkVar = (tvk) ((tvk) qic.a.g()).i(e);
                int i2 = qeiVar.l;
                if (i2 == 0) {
                    throw null;
                }
                tvkVar.B("Invalid environment_override value %s, falling back to %s", strA, osk.Y(i2).name());
            }
        } else {
            int i3 = qeiVar.l;
            if (i3 == 0) {
                throw null;
            }
            qigVarY = osk.Y(i3);
        }
        qigVarY.getClass();
        return qigVarY;
    }
}
