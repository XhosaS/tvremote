package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.play.movies.common.service.playstore.PlayStoreBootstrapActivity;
import com.google.android.apps.play.movies.mobile.usecase.watch.BootstrapWatchActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class mna implements lhg {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ mna(ieh iehVar, Context context, mdy mdyVar, String str, int i) {
        this.e = i;
        this.a = iehVar;
        this.c = context;
        this.b = mdyVar;
        this.d = str;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [idy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, kst, kvy, kwj] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, mdy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [ieh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [ieh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, mdy] */
    @Override // defpackage.lhg
    public final void a(lhf lhfVar) {
        int i = this.e;
        if (i == 0) {
            boolean z = ((mwg) lhfVar).a.b;
            ?? r3 = this.a;
            Object obj = this.b;
            Object obj2 = this.d;
            if (z) {
                ieg iegVar = (ieg) r3.a();
                ieg iegVarA = ((ldy) obj).a();
                if (iegVar.m() && iegVarA.m()) {
                    ((lhm) obj2).d((ksn) iegVarA.g(), ((kwn) iegVar.g()).d, ((kwn) iegVar.g()).g, true);
                }
            } else {
                ieg iegVar2 = (ieg) r3.a();
                ieg iegVarA2 = ((ldy) obj).a();
                if (iegVar2.m() && iegVarA2.m()) {
                    ((lhm) obj2).d((ksn) iegVarA2.g(), ((kwn) iegVar2.g()).d, ((kwn) iegVar2.g()).g, false);
                }
            }
            this.c.c(true);
            return;
        }
        if (i == 1) {
            mxv mxvVar = (mxv) lhfVar;
            lid lidVarD = nqq.d(new lif(liq.e(604), mxvVar.b));
            kuo kuoVar = mxvVar.a;
            ldy ldyVar = (ldy) this.a;
            if (ldyVar.a().m()) {
                Object obj3 = this.d;
                ?? r6 = this.b;
                Object obj4 = this.c;
                int i2 = mxvVar.c;
                Context context = (Context) obj4;
                PlayStoreBootstrapActivity.purchase(context, r6, ieg.a, ieg.f(kuoVar.c), ieg.f(ksy.k(kuoVar.j)), ieg.f(ksy.l(kuoVar.k)), (ksn) ldyVar.a().g(), true, true, 38, (String) obj3, lidVarD);
                return;
            }
            return;
        }
        if (i != 2) {
            myp mypVar = (myp) lhfVar;
            nqq.d(mypVar.b);
            String str = mypVar.a.b;
            ?? r2 = this.a;
            kxb kxbVarB = kxb.b(str, r2.h(), r2.g());
            ieg iegVarF = ieg.f(r2.o());
            Object obj5 = this.c;
            Context context2 = (Context) obj5;
            this.b.a(BootstrapWatchActivity.createTrailerIntent(context2, kxbVarB, iegVarF, ieg.a, (String) this.d));
            return;
        }
        myh myhVar = (myh) lhfVar;
        ldy ldyVar2 = (ldy) this.a;
        if (ldyVar2.a().m()) {
            ?? r32 = this.b;
            if (((ieg) r32.a()).m()) {
                kst kstVar = (kst) ((ieg) r32.a()).g();
                boolean z2 = myhVar.a;
                ksn ksnVar = (ksn) ldyVar2.a().g();
                if (!(kstVar instanceof kvj)) {
                    ((lhm) this.d).d(ksnVar, kstVar.o(), "", z2);
                    return;
                }
                Object obj6 = this.c;
                String str2 = ((kvj) kstVar).b;
                pyb pybVar = new pyb();
                pybVar.a = ksnVar;
                pybVar.d(kstVar.o());
                pybVar.c = str2;
                pybVar.e(z2);
                myj myjVarC = pybVar.c();
                Bundle bundle = new Bundle();
                bundle.putParcelable("family_library_movies_bundle_share_dialog_share_status_update", myjVarC);
                myi myiVar = new myi();
                myiVar.setArguments(bundle);
                myiVar.show((cr) obj6, "movies bundle share dialog");
            }
        }
    }

    public /* synthetic */ mna(ieh iehVar, ieh iehVar2, cr crVar, lhm lhmVar, int i) {
        this.e = i;
        this.a = iehVar;
        this.b = iehVar2;
        this.c = crVar;
        this.d = lhmVar;
    }

    public /* synthetic */ mna(ieh iehVar, ieh iehVar2, lhm lhmVar, idy idyVar, int i) {
        this.e = i;
        this.a = iehVar;
        this.b = iehVar2;
        this.d = lhmVar;
        this.c = idyVar;
    }

    public /* synthetic */ mna(mdy mdyVar, Context context, kst kstVar, String str, int i) {
        this.e = i;
        this.b = mdyVar;
        this.c = context;
        this.a = kstVar;
        this.d = str;
    }
}
