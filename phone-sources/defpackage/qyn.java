package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.libraries.onegoogle.accountmanagement.AddAccountActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qyn {
    public final qwn a;
    public final Context b;
    public final ysx c;
    public final yjv d;
    public final qyi e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final tst i;
    public final tst j;
    public final rbi k;
    public final cb l;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ysx] */
    public qyn(qwn qwnVar) {
        this.a = qwnVar;
        Context context = qwnVar.a;
        context.getClass();
        this.b = context;
        this.c = new vvd(qwnVar).b;
        tst tstVar = qwnVar.e.a;
        this.k = new rbi(new mcp(3), new oun(20), null);
        this.d = new psn(qwnVar, 10);
        final cb cbVar = new cb(qwnVar, (byte[]) null);
        qwn qwnVar2 = (qwn) cbVar.a;
        qth qthVar = qwnVar2.c;
        tst tstVar2 = qwnVar2.e.m;
        trk trkVar = trk.a;
        final aafi aafiVar = new aafi(qthVar, (tst) trkVar, qwnVar2.n);
        rrx rrxVar = ((qwn) cbVar.a).e.r;
        final int i = 1;
        final int i2 = 0;
        this.e = new qyi(new qtg() { // from class: qyp
            @Override // defpackage.qtg
            public final void a(View view, Object obj) {
                if (i != 0) {
                    vrn vrnVar = (vrn) obj;
                    view.getClass();
                    aafiVar.w(view, vrnVar != null ? rdd.h((qwn) cbVar.a, vrnVar) : null);
                } else {
                    vrn vrnVar2 = (vrn) obj;
                    view.getClass();
                    aafiVar.x(view, vrnVar2 != null ? rdd.h((qwn) cbVar.a, vrnVar2) : null);
                }
            }
        }, new qtg() { // from class: qyp
            @Override // defpackage.qtg
            public final void a(View view, Object obj) {
                if (i2 != 0) {
                    vrn vrnVar = (vrn) obj;
                    view.getClass();
                    aafiVar.w(view, vrnVar != null ? rdd.h((qwn) cbVar.a, vrnVar) : null);
                } else {
                    vrn vrnVar2 = (vrn) obj;
                    view.getClass();
                    aafiVar.x(view, vrnVar2 != null ? rdd.h((qwn) cbVar.a, vrnVar2) : null);
                }
            }
        });
        this.f = qwnVar.e.f.e();
        this.g = false;
        this.h = qwnVar.h.a;
        rfg rfgVar = qwnVar.e;
        this.i = rfgVar.m;
        this.j = trkVar;
        this.l = new cb(qwnVar, (byte[]) null);
        tst tstVar3 = rfgVar.e;
    }

    public final void a(View view, vrn vrnVar) {
        qwn qwnVar = (qwn) this.l.a;
        qwh qwhVar = qwnVar.d.b;
        if (vrnVar != null) {
            rdd.h(qwnVar, vrnVar);
        }
        AddAccountActivity.startActivity(view);
    }

    public final void b(boolean z) {
        ((qwq) this.a.i.c()).a(z);
    }
}
