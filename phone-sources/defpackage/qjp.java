package defpackage;

import android.content.Context;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qjp implements qjm {
    public static final tvn a = tvn.n("GnpSdk");
    public final Context b;
    public final Class c;
    public final qoj d;
    private final yil e;

    public qjp(Context context, yil yilVar, Class cls, qoj qojVar) {
        cls.getClass();
        qojVar.getClass();
        this.b = context;
        this.e = yilVar;
        this.c = cls;
        this.d = qojVar;
    }

    @Override // defpackage.qjm
    public final Object a(int i, qen qenVar, yih yihVar) throws Throwable {
        Object objL = ykr.l(this.e, new qjn(this, qenVar, i, (yih) null, 0), yihVar);
        return objL == yio.a ? objL : ygi.a;
    }

    @Override // defpackage.qjm
    public final Object b(qjl qjlVar, qen qenVar, Bundle bundle, Long l, yih yihVar) {
        return ykr.l(this.e, new qjo(qjlVar, this, qenVar, bundle, l, null), yihVar);
    }
}
