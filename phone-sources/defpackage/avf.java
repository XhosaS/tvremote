package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class avf implements yjv {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ avf(yjv yjvVar, boolean z, int i) {
        this.c = i;
        this.b = yjvVar;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r7v9, types: [diz, java.lang.Object] */
    @Override // defpackage.yjv
    public final Object a(Object obj) {
        int i = this.c;
        if (i == 0) {
            boolean z = this.a;
            cfc cfcVar = (cfc) obj;
            bxa bxaVar = avm.a;
            if (!z) {
                cfk.b(cfcVar);
            }
            Object obj2 = this.b;
            cfk.m(cfcVar, String.valueOf(yln.v(((avn) obj2).d() * 100.0f) / 100.0f));
            cfcVar.e(cfb.h, new ces(null, new ars(obj2, 15)));
            return ygi.a;
        }
        boolean z2 = false;
        if (i == 1) {
            cfy cfyVar = (cfy) obj;
            if (this.a) {
                Object obj3 = this.b;
                ajq ajqVar = (ajq) obj3;
                ajqVar.a.i(cfyVar);
                ajqVar.r(true);
                ykr.q(((bko) obj3).F(), null, 0, new qy(ajqVar, (yih) null, 19), 3);
                z2 = true;
            }
            return Boolean.valueOf(z2);
        }
        if (i != 2) {
            ((Boolean) obj).booleanValue();
            this.b.a(Boolean.valueOf(this.a));
            return ygi.a;
        }
        djg djgVar = (djg) obj;
        if ((djgVar instanceof diq) || ((this.a && Build.VERSION.SDK_INT <= 30) || ((djgVar instanceof djp) && !cwn.o(this.b)))) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }

    public /* synthetic */ avf(boolean z, Object obj, int i) {
        this.c = i;
        this.a = z;
        this.b = obj;
    }
}
