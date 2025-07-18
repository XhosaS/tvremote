package defpackage;

import android.view.View;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class mox implements scg {
    public final /* synthetic */ scf a;
    public final /* synthetic */ sbx b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ mox(scf scfVar, sbx sbxVar, Object obj, int i) {
        this.d = i;
        this.a = scfVar;
        this.b = sbxVar;
        this.c = obj;
    }

    @Override // defpackage.scg
    public final void a(Object obj, View view) {
        if (this.d == 0) {
            scf scfVar = this.a;
            sbx sbxVar = this.b;
            Object obj2 = this.c;
            try {
                pjr pjrVarB = ((pke) ((moy) sbxVar).a.b).b(107517);
                String str = ((kwn) obj2).d.c;
                pjrVarB.d(qtl.af(liq.p(ksy.l(str)), vsz.b));
                pjrVarB.d(qtl.ai(nqq.a(str, ((mov) scfVar).g)));
                pjrVarB.b(view);
                return;
            } catch (Exception e) {
                krd.c("Error create view for Movie Presenter ".concat(String.valueOf(e.getMessage())));
                return;
            }
        }
        scf scfVar2 = this.a;
        sbx sbxVar2 = this.b;
        Object obj3 = this.c;
        try {
            Object obj4 = ((moi) sbxVar2).b.b;
            pjr pjrVarB2 = ((pke) obj4).b(107517);
            wji wjiVarP = liq.p(ksy.i(((kvf) obj3).o().c));
            vsz vszVar = vsz.b;
            pjrVarB2.d(qtl.af(wjiVarP, vszVar));
            pjrVarB2.d(qtl.ai(nqq.a(((kvf) obj3).o().c, ((mof) scfVar2).n)));
            pjrVarB2.b(view);
            pjr pjrVarB3 = ((pke) obj4).b(110071);
            pjrVarB3.d(qtl.af(liq.p(ksy.i(((kvf) obj3).o().c)), vszVar));
            pjrVarB3.b(view.findViewById(R.id.play_button));
            pjr pjrVarB4 = ((pke) obj4).b(110070);
            pjrVarB4.d(qtl.af(liq.p(ksy.i(((kvf) obj3).o().c)), vszVar));
            pjrVarB4.b(view.findViewById(R.id.download_icon));
        } catch (Exception e2) {
            krd.c("Error create view for Movie Presenter ".concat(String.valueOf(e2.getMessage())));
        }
    }
}
