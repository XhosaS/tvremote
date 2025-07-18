package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.play.movies.mobile.usecase.watch.BootstrapWatchActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class mng implements lhg {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ mng(idr idrVar, idr idrVar2, idf idfVar, View view, ieh iehVar, int i) {
        this.f = i;
        this.a = idrVar;
        this.b = idrVar2;
        this.c = idfVar;
        this.d = view;
        this.e = iehVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [idr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [idr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, mdy] */
    /* JADX WARN: Type inference failed for: r0v5, types: [ieh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, lio] */
    /* JADX WARN: Type inference failed for: r1v1, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [ieh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // defpackage.lhg
    public final void a(lhf lhfVar) {
        int i = this.f;
        if (i == 0) {
            kwl kwlVar = ((mzk) lhfVar).a.a;
            this.a.c(ieg.f(kwlVar));
            this.b.c(this.c.b(kwlVar));
            ((View) this.d).sendAccessibilityEvent(8);
            nqq.d(new lif(liq.i(608, kwlVar), (lio) this.e.a()));
            return;
        }
        if (i != 1) {
            nai naiVar = (nai) lhfVar;
            nqq.d(naiVar.b);
            Object objB = this.c.b(naiVar.a);
            Object obj = this.d;
            Object obj2 = this.a;
            ieg iegVar = (ieg) obj2;
            Context context = (Context) obj;
            kxb kxbVar = (kxb) objB;
            this.b.a(BootstrapWatchActivity.createTrailerIntent(context, kxbVar, iegVar, ieg.a, (String) this.e));
            return;
        }
        myh myhVar = (myh) lhfVar;
        ldy ldyVar = (ldy) this.a;
        if (ldyVar.a().m()) {
            ?? r2 = this.b;
            if (((ieg) r2.a()).m()) {
                ksn ksnVar = (ksn) ldyVar.a().g();
                kwn kwnVar = (kwn) ((ieg) r2.a()).g();
                boolean z = myhVar.a;
                if (!z || !this.d.getBoolean(krh.SHOW_FAMILY_SHARING_CONFIRMATION_DIALOG_FOR_SHOWS, true)) {
                    ((lhm) this.e).d(ksnVar, kwnVar.d, kwnVar.g, z);
                    return;
                }
                Object obj3 = this.c;
                pyb pybVar = new pyb();
                pybVar.a = ksnVar;
                pybVar.d(kwnVar.d);
                pybVar.c = kwnVar.g;
                pybVar.e(true);
                myj myjVarC = pybVar.c();
                Bundle bundle = new Bundle();
                bundle.putParcelable("family_library_show_share_dialog_share_status_update", myjVarC);
                myl mylVar = new myl();
                mylVar.setArguments(bundle);
                mylVar.show((cr) obj3, "show sharing dialog");
            }
        }
    }

    public /* synthetic */ mng(ieh iehVar, ieh iehVar2, SharedPreferences sharedPreferences, lhm lhmVar, cr crVar, int i) {
        this.f = i;
        this.a = iehVar;
        this.b = iehVar2;
        this.d = sharedPreferences;
        this.e = lhmVar;
        this.c = crVar;
    }

    public /* synthetic */ mng(mdy mdyVar, Context context, idf idfVar, ieg iegVar, String str, int i) {
        this.f = i;
        this.b = mdyVar;
        this.d = context;
        this.c = idfVar;
        this.a = iegVar;
        this.e = str;
    }
}
