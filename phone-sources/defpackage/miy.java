package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class miy implements idy {
    private final Activity a;
    private final cr b;
    private final ieh c;
    private final ieh d;
    private final lie e;
    private final mta f;

    public miy(Activity activity, cr crVar, ieh iehVar, ieh iehVar2, mta mtaVar, lie lieVar) {
        this.a = activity;
        this.b = crVar;
        this.c = iehVar;
        this.d = iehVar2;
        this.f = mtaVar;
        this.e = lieVar;
    }

    @Override // defpackage.idy
    @Deprecated
    public final /* synthetic */ void c(Object obj) {
        kuo kuoVar = (kuo) obj;
        ksy ksyVar = kuoVar.c;
        kuj kujVarA = ((kuk) this.d.a()).a(ksyVar);
        ieg iegVarA = ((ldy) this.c).a();
        if (iegVarA.m()) {
            ksn ksnVar = (ksn) iegVarA.g();
            if (kujVarA.i()) {
                mta.f(this.a, this.b, ksyVar, kujVarA, false);
            } else if (kujVarA.g()) {
                mta.g(this.a, this.b, ksyVar, kuoVar.e, kuoVar.s, kujVarA);
            } else {
                this.f.c(this.a, this.b, ksnVar, ksyVar);
                this.e.G(false);
            }
        }
    }
}
