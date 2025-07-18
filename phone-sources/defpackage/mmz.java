package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class mmz implements lhg {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    private final /* synthetic */ int h;

    public /* synthetic */ mmz(iea ieaVar, ieh iehVar, ieh iehVar2, ieh iehVar3, ieh iehVar4, mta mtaVar, lie lieVar, int i) {
        this.h = i;
        this.d = ieaVar;
        this.e = iehVar;
        this.a = iehVar2;
        this.b = iehVar3;
        this.c = iehVar4;
        this.g = mtaVar;
        this.f = lieVar;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, lie] */
    /* JADX WARN: Type inference failed for: r1v11, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19, types: [iea, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object, mwb] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, lie] */
    /* JADX WARN: Type inference failed for: r2v24, types: [idy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [ieh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, lio] */
    /* JADX WARN: Type inference failed for: r3v22, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, san] */
    /* JADX WARN: Type inference failed for: r4v3, types: [ieh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [ieh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10, types: [ieh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, mcy] */
    /* JADX WARN: Type inference failed for: r7v0, types: [ieh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [ieh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [ieh, java.lang.Object] */
    @Override // defpackage.lhg
    public final void a(lhf lhfVar) throws Resources.NotFoundException {
        int i = this.h;
        if (i == 0) {
            mxt mxtVar = (mxt) lhfVar;
            nqq.d(new lif(liq.e(612), mxtVar.b));
            ldy ldyVar = (ldy) this.a;
            if (ldyVar.a().m()) {
                ?? r4 = this.b;
                if (((ieg) r4.a()).m()) {
                    Object obj = this.e;
                    Object obj2 = this.d;
                    ?? r7 = this.c;
                    ksn ksnVar = (ksn) ldyVar.a().g();
                    kuo kuoVar = mxtVar.a;
                    ksy ksyVar = kuoVar.c;
                    kuj kujVarA = ((kuk) r7.a()).a(ksyVar);
                    if (kujVarA.i()) {
                        mta.f((Activity) obj2, (cr) obj, ksyVar, kujVarA, false);
                        return;
                    } else {
                        if (kujVarA.g()) {
                            mta.g((Activity) obj2, (cr) obj, ksyVar, kuoVar.e, ((kwn) ((ieg) r4.a()).g()).g, kujVarA);
                            return;
                        }
                        ?? r1 = this.f;
                        ((mta) this.g).c((Activity) obj2, (cr) obj, ksnVar, ksyVar);
                        r1.G(false);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i == 1) {
            ((pjx) this.f).a(pjw.b(), ((View) this.a).findViewById(R.id.current_distributor));
            this.d.edit().putBoolean(krh.SHOW_DISTRIBUTOR_TOOLTIP_TAG.concat(ksn.c(((ldy) this.c).a())), false).apply();
            ((icu) this.b).eb();
            mxo mxoVar = ((mxg) lhfVar).a;
            Bundle bundle = new Bundle();
            bundle.putParcelable("distributors_viewmodel", mxoVar);
            mxf mxfVar = new mxf();
            mxfVar.setArguments(bundle);
            mxfVar.show((cr) this.e, "distributor picker dialog");
            nqq.d(new lif(mnu.d(mxoVar.c), (lio) this.g.a()));
            return;
        }
        if (i == 2) {
            ?? r12 = this.d;
            nak nakVar = (nak) lhfVar;
            if (((ieg) r12.a()).m()) {
                ?? r10 = this.f;
                Object obj3 = this.g;
                ?? r8 = this.c;
                ?? r72 = this.b;
                ?? r42 = this.a;
                ?? r5 = this.e;
                kvf kvfVar = (kvf) ((ieg) r12.a()).g();
                nqq.d(nakVar.a);
                new mio(r5, (cr) r42.a(), r72, r8, (mta) obj3, r10).a(kvfVar.o(), kvfVar.E());
                return;
            }
            return;
        }
        naw nawVar = (naw) lhfVar;
        rzy rzyVar = nawVar.c;
        ?? r43 = this.f;
        rzt rztVar = (rzt) r43.f(rzyVar).e();
        boolean z = nawVar.b;
        boolean z2 = !z;
        Object obj4 = this.b;
        ksn ksnVar2 = (ksn) ((ieg) obj4).g();
        ksy ksyVar2 = nawVar.a;
        ?? r6 = this.c;
        r6.a(ksnVar2, ksyVar2, z2, 2, "");
        int i2 = !z ? R.string.user_feedback_add_wishlist_toast : R.string.user_feedback_remove_wishlist_toast;
        Object obj5 = this.d;
        String string = ((Resources) this.e).getString(i2);
        rzy rzyVar2 = (rzy) ((sah) rrx.E(r43.j(rztVar), wgi.UNDO_SNACKBAR)).e();
        rzy rzyVar3 = (rzy) ((sah) r43.g(rzyVar2).a(wgi.UNDO_BUTTON)).e();
        if (jwq.X((Context) obj5)) {
            ((sah) r43.g(rzyVar2).a(wgi.DISMISS_BUTTON)).e();
        }
        Object obj6 = this.a;
        Object obj7 = this.g;
        View view = (View) obj6;
        miv mivVar = new miv(r6, new mmo(obj4, 8), ksyVar2, z2, "", trk.a, 2, view, tst.i(rzyVar3), tst.i(r43));
        mqy mqyVar = new mqy(view, 1);
        nsf nsfVar = (nsf) obj7;
        ?? B = nsfVar.a.b(string);
        B.c(R.string.undo_dismissal, mivVar, mqyVar);
        B.d("Light");
        B.e();
        B.f();
        B.h();
        B.g();
        B.b();
        nsfVar.b.c(B);
    }

    public /* synthetic */ mmz(ieh iehVar, ieh iehVar2, ieh iehVar3, mta mtaVar, Activity activity, cr crVar, lie lieVar, int i) {
        this.h = i;
        this.a = iehVar;
        this.b = iehVar2;
        this.c = iehVar3;
        this.g = mtaVar;
        this.d = activity;
        this.e = crVar;
        this.f = lieVar;
    }

    public /* synthetic */ mmz(pjx pjxVar, View view, ieh iehVar, SharedPreferences sharedPreferences, idt idtVar, cr crVar, ieh iehVar2, int i) {
        this.h = i;
        this.f = pjxVar;
        this.a = view;
        this.c = iehVar;
        this.d = sharedPreferences;
        this.b = idtVar;
        this.e = crVar;
        this.g = iehVar2;
    }

    public /* synthetic */ mmz(san sanVar, mcy mcyVar, ieg iegVar, Resources resources, Context context, nsf nsfVar, View view, int i) {
        this.h = i;
        this.f = sanVar;
        this.c = mcyVar;
        this.b = iegVar;
        this.e = resources;
        this.d = context;
        this.g = nsfVar;
        this.a = view;
    }
}
