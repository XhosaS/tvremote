package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class miv implements View.OnClickListener {
    private final mcy a;
    private final ieh b;
    private final ksy c;
    private final boolean d;
    private final int e;
    private final String f;
    private final tst g;
    private final View h;
    private final tst i;
    private final tst j;

    public miv(mcy mcyVar, ieh iehVar, ksy ksyVar, boolean z, String str, tst tstVar, int i, View view, tst tstVar2, tst tstVar3) {
        this.a = mcyVar;
        this.b = iehVar;
        this.c = ksyVar;
        this.d = z;
        this.f = str;
        this.g = tstVar;
        this.e = i;
        this.h = view;
        this.i = tstVar2;
        this.j = tstVar3;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, san] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object, lio] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ksn ksnVar = (ksn) ((ieg) this.b.a()).g();
        boolean z = this.d;
        this.a.a(ksnVar, this.c, !z, this.e, this.f);
        tst tstVar = this.g;
        if (tstVar.g()) {
            nqq.j(519, tstVar.c());
        }
        tst tstVar2 = this.i;
        if (tstVar2.g()) {
            tst tstVar3 = this.j;
            if (tstVar3.g()) {
                tstVar3.c().f((rzy) tstVar2.c()).e();
            }
        }
        jwq.W(this.h);
    }
}
