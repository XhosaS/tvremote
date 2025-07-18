package defpackage;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.tvsearch.widget.logoview.LogoView;
import com.google.android.katniss.R;
import java.util.Locale;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iod extends inu implements wgt, aeiz, wjd, wwo {
    private ioi b;
    private Context c;
    private final bco d = new bco(this);
    private final wua e = new wua(this);
    private boolean f;

    @Deprecated
    public iod() {
        uea.c();
    }

    @Override // defpackage.udh, defpackage.bq
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.e.g();
        try {
            super.D(layoutInflater, viewGroup, bundle);
            ioi ioiVarL = L();
            layoutInflater.getClass();
            ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.preview_card_container, viewGroup, false).findViewById(R.id.preview_card_container);
            LogoView logoView = (LogoView) viewGroup2.findViewById(R.id.preview_logo_view);
            hvh.a(logoView);
            logoView.d(10, true);
            View viewInflate = layoutInflater.inflate(R.layout.setup_preview_hotword, viewGroup2, false);
            TextView textView = (TextView) viewInflate.findViewById(R.id.hotword_setup_description);
            Context context = ioiVarL.c;
            textView.setText(context.getString(R.string.assistant_setup_hotword_intro_description_v2));
            ((TextView) viewInflate.findViewById(R.id.hotword_setup_title)).setText(context.getString(R.string.assistant_setup_hotword_intro_title_amati_v2));
            viewGroup2.addView(viewInflate);
            viewGroup2.getClass();
            viewInflate.getClass();
            ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup2;
            aac aacVar = new aac();
            aacVar.c(constraintLayout);
            aacVar.j(viewInflate.getId(), 3, 3, 0);
            aacVar.j(viewInflate.getId(), 6, 6, (int) context.getResources().getDimension(R.dimen.amati_search_bar_text_margin_from_parent_start));
            aacVar.j(viewInflate.getId(), 7, 7, 0);
            aacVar.b(constraintLayout);
            wum.n();
            return viewGroup2;
        } catch (Throwable th) {
            try {
                wum.n();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.udh, defpackage.bq
    public final void U(Bundle bundle) {
        this.e.g();
        try {
            super.U(bundle);
            wum.n();
        } catch (Throwable th) {
            try {
                wum.n();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.udh, defpackage.bq
    public final void V(int i, int i2, Intent intent) {
        wwt wwtVarA = this.e.a("Fragment:onActivityResult");
        try {
            super.V(i, i2, intent);
            wwtVarA.close();
        } catch (Throwable th) {
            try {
                wwtVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.inu, defpackage.udh, defpackage.bq
    public final void W(Activity activity) {
        this.e.g();
        try {
            super.W(activity);
            wum.n();
        } catch (Throwable th) {
            try {
                wum.n();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.udh, defpackage.bq
    public final void X() {
        wwt wwtVarC = this.e.c();
        try {
            super.X();
            wwtVarC.close();
        } catch (Throwable th) {
            try {
                wwtVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.udh, defpackage.bq
    public final void Y() {
        this.e.g();
        try {
            super.Y();
            wum.n();
        } catch (Throwable th) {
            try {
                wum.n();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.udh, defpackage.bq
    public final void Z() {
        wwt wwtVarC = this.e.c();
        try {
            super.Z();
            wwtVarC.close();
        } catch (Throwable th) {
            try {
                wwtVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.wgt
    /* renamed from: aC, reason: merged with bridge method [inline-methods] */
    public final ioi L() {
        ioi ioiVar = this.b;
        if (ioiVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.f) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return ioiVar;
    }

    @Override // defpackage.hmv
    public final boolean aI() {
        L();
        return false;
    }

    @Override // defpackage.hmv
    public final boolean aJ() {
        L();
        return true;
    }

    @Override // defpackage.wwo
    public final wyt aK() {
        return this.e.b;
    }

    @Override // defpackage.wjd
    public final Locale aM() {
        return wjc.a(this);
    }

    @Override // defpackage.wwo
    public final void aN(wyt wytVar, boolean z) {
        this.e.d(wytVar, z);
    }

    @Override // defpackage.wwo
    public final void aO(wyt wytVar) {
        this.e.c = wytVar;
    }

    @Override // defpackage.udh, defpackage.bq
    public final void aa(View view, Bundle bundle) {
        this.e.g();
        try {
            ((udh) this).a.c(bundle);
            final ioi ioiVarL = L();
            view.getClass();
            View viewFindViewById = view.findViewById(R.id.hotword_yes_button);
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: ioe
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ioiVarL.a(true);
                }
            });
            view.findViewById(R.id.hotword_no_button).setOnClickListener(new View.OnClickListener() { // from class: iof
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ioiVarL.a(false);
                }
            });
            if (ioiVarL.h.E() || (ioiVarL.f.c() == null && ((Boolean) ioiVarL.b.get()).booleanValue())) {
                View viewFindViewById2 = view.findViewById(R.id.hotword_neutral_button);
                viewFindViewById2.setVisibility(0);
                viewFindViewById2.requestFocus();
                if (viewFindViewById.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                    layoutParams.getClass();
                    ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = (int) ioiVarL.c.getResources().getDimension(R.dimen.space_salmon);
                }
            } else {
                viewFindViewById.requestFocus();
            }
            wum.n();
        } catch (Throwable th) {
            try {
                wum.n();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bq
    public final void af(Object obj) {
        wua wuaVar = this.e;
        if (wuaVar != null) {
            wuaVar.h();
        }
        super.eb().i = obj;
    }

    @Override // defpackage.bq
    public final void ag(Object obj) {
        wua wuaVar = this.e;
        if (wuaVar != null) {
            wuaVar.h();
        }
        super.eb().k = obj;
    }

    @Override // defpackage.bq
    public final void aj(Object obj) {
        wua wuaVar = this.e;
        if (wuaVar != null) {
            wuaVar.h();
        }
        super.eb().l = obj;
    }

    @Override // defpackage.bq
    public final void ak(Object obj) {
        wua wuaVar = this.e;
        if (wuaVar != null) {
            wuaVar.h();
        }
        super.eb().j = obj;
    }

    @Override // defpackage.bq
    public final void av(int i, int i2) {
        this.e.e(i, i2);
        wum.n();
    }

    @Override // defpackage.udh, defpackage.bq
    public final boolean ay() {
        wwt wwtVarA = this.e.a("Fragment:onOptionsItemSelected");
        try {
            boolean zT = ((udh) this).a.t();
            wwtVarA.close();
            return zT;
        } catch (Throwable th) {
            try {
                wwtVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.udh, defpackage.bq
    public final void e() {
        wwt wwtVarC = this.e.c();
        try {
            super.e();
            wwtVarC.close();
        } catch (Throwable th) {
            try {
                wwtVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bq, defpackage.bcl
    public final bcg ek() {
        return this.d;
    }

    @Override // defpackage.bq, defpackage.bbz
    public final bet em() {
        beu beuVar = new beu(super.em());
        beuVar.b(bds.c, new Bundle());
        return beuVar;
    }

    @Override // defpackage.udh, defpackage.bq
    public final void er() {
        wwt wwtVarB = this.e.b();
        try {
            super.er();
            this.f = true;
            wwtVarB.close();
        } catch (Throwable th) {
            try {
                wwtVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bq
    public final LayoutInflater ev(Bundle bundle) {
        this.e.g();
        try {
            LayoutInflater layoutInflaterAr = ar();
            LayoutInflater layoutInflaterCloneInContext = layoutInflaterAr.cloneInContext(new aeiu(layoutInflaterAr, this));
            LayoutInflater layoutInflaterCloneInContext2 = layoutInflaterCloneInContext.cloneInContext(new wjg(this, layoutInflaterCloneInContext));
            wum.n();
            return layoutInflaterCloneInContext2;
        } catch (Throwable th) {
            try {
                wum.n();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.inu, defpackage.bq
    public final void ex(Context context) {
        this.e.g();
        try {
            if (this.f) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.ex(context);
            if (this.b == null) {
                try {
                    wvx wvxVarD = wzg.d(iod.class, "CreateComponent");
                    try {
                        Object objDN = cO().dN();
                        wvxVarD.close();
                        wvx wvxVarD2 = wzg.d(iod.class, "CreatePeer");
                        try {
                            Activity activity = ((eth) objDN).c.a;
                            aeiv.a(activity);
                            eup eupVar = ((eth) objDN).b;
                            Supplier supplierGG = eupVar.gG();
                            AppOpsManager appOpsManagerC = eupVar.c();
                            ggr ggrVarAY = eupVar.aY();
                            Context context2 = (Context) eupVar.n.a();
                            ahbt ahbtVar = (ahbt) eupVar.q.a();
                            fjr fjrVar = (fjr) eupVar.fW.a();
                            bq bqVar = ((eth) objDN).a;
                            if (!(bqVar instanceof iod)) {
                                throw new IllegalStateException(a.B(bqVar, ioi.class, "Attempt to inject a Fragment wrapper of type "));
                            }
                            iod iodVar = (iod) bqVar;
                            iodVar.getClass();
                            this.b = new ioi(activity, supplierGG, appOpsManagerC, ggrVarAY, context2, ahbtVar, fjrVar, iodVar, (jcy) eupVar.gx.a(), (ffp) eupVar.by.a(), eupVar.ho(), (gtu) eupVar.bE.a(), eupVar.bZ(), (idu) eupVar.fZ.a(), (ghr) eupVar.fg.a());
                            wvxVarD2.close();
                            this.aa.b(new wir(this.e, this.d));
                        } finally {
                        }
                    } finally {
                    }
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            }
            bqs bqsVar = this.F;
            if (bqsVar instanceof wwo) {
                wua wuaVar = this.e;
                if (wuaVar.b == null) {
                    wuaVar.d(((wwo) bqsVar).aK(), true);
                }
            }
            wum.n();
        } finally {
        }
    }

    @Override // defpackage.udh, defpackage.bq
    public final void ey(Bundle bundle) {
        this.e.g();
        try {
            super.ey(bundle);
            wum.n();
        } catch (Throwable th) {
            try {
                wum.n();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.udh, defpackage.bq
    public final void g(Bundle bundle) {
        this.e.g();
        try {
            ((udh) this).a.i(bundle);
            wum.n();
        } catch (Throwable th) {
            try {
                wum.n();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.udh, defpackage.bq
    public final void h() {
        this.e.g();
        try {
            super.h();
            wum.n();
        } catch (Throwable th) {
            try {
                wum.n();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.udh, defpackage.bq
    public final void i() {
        this.e.g();
        try {
            super.i();
            wum.n();
        } catch (Throwable th) {
            try {
                wum.n();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.inu
    protected final /* synthetic */ aeik m() {
        return new wjj(this);
    }

    @Override // defpackage.inu, defpackage.bq
    public final Context s() {
        if (super.s() == null) {
            return null;
        }
        if (this.c == null) {
            this.c = new wjg(this, super.s());
        }
        return this.c;
    }
}
