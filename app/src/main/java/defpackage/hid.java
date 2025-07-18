package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.google.android.katniss.R;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hid extends hiw implements wgt, aeiz, wjd, wwo {
    private final bco ah = new bco(this);
    private final wua ai = new wua(this);
    private boolean aj;
    private hig e;
    private Context f;

    @Deprecated
    public hid() {
        uea.c();
    }

    @Override // defpackage.ats, defpackage.bq
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.ai.g();
        try {
            View viewD = super.D(layoutInflater, viewGroup, bundle);
            wum.n();
            return viewD;
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
    public final void U(Bundle bundle) {
        this.ai.g();
        try {
            this.P = true;
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
    public final void V(int i, int i2, Intent intent) {
        wwt wwtVarA = this.ai.a("Fragment:onActivityResult");
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

    @Override // defpackage.bq
    public final void W(Activity activity) {
        this.ai.g();
        boolean z = true;
        try {
            this.P = true;
            ContextWrapper contextWrapper = ((hiw) this).d;
            if (contextWrapper != null && aeik.c(contextWrapper) != activity) {
                z = false;
            }
            aejb.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
            super.aV();
            aW();
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
    public final void X() {
        wwt wwtVarC = this.ai.c();
        try {
            this.P = true;
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

    @Override // defpackage.bq
    public final void Y() {
        this.ai.g();
        try {
            this.P = true;
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

    @Override // defpackage.ats, defpackage.bq
    public final void Z() {
        wwt wwtVarC = this.ai.c();
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

    @Override // defpackage.ats
    public final int aB() {
        return L().b == gph.a ? R.style.Theme_DisclaimerNotification_GuidedStep_Amati : R.style.Theme_DisclaimerNotification_GuidedStep_Watson;
    }

    @Override // defpackage.ats
    public final axe aD() {
        L();
        return new hif();
    }

    @Override // defpackage.ats
    public final ayc aF() {
        int i = ayc.j;
        L();
        return new hie();
    }

    @Override // defpackage.wwo
    public final wyt aK() {
        return this.ai.b;
    }

    @Override // defpackage.wjd
    public final Locale aM() {
        return wjc.a(this);
    }

    @Override // defpackage.wwo
    public final void aN(wyt wytVar, boolean z) {
        this.ai.d(wytVar, z);
    }

    @Override // defpackage.wwo
    public final void aO(wyt wytVar) {
        this.ai.c = wytVar;
    }

    @Override // defpackage.ats
    public final axd aP() {
        Bundle bundle = L().c.n;
        return new axd(bundle != null ? bundle.getString("disclaimer_title") : null, bundle != null ? bundle.getString("disclaimer_description") : null, null, null);
    }

    @Override // defpackage.ats
    public final void aR(List list) {
        hid hidVar = L().c;
        hidVar.s();
        axf axfVar = new axf(null);
        axfVar.a = 1L;
        axfVar.b = hidVar.dZ().getResources().getString(R.string.assistant_setup_got_it_button);
        list.add(axfVar.a());
    }

    @Override // defpackage.wgt
    /* renamed from: aS, reason: merged with bridge method [inline-methods] */
    public final hig L() {
        hig higVar = this.e;
        if (higVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.aj) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return higVar;
    }

    @Override // defpackage.hiw
    protected final /* synthetic */ aeik aT() {
        return new wjj(this);
    }

    @Override // defpackage.bq
    public final void aa(View view, Bundle bundle) {
        this.ai.g();
        wum.n();
    }

    @Override // defpackage.bq
    public final void af(Object obj) {
        wua wuaVar = this.ai;
        if (wuaVar != null) {
            wuaVar.h();
        }
        super.eb().i = obj;
    }

    @Override // defpackage.bq
    public final void ag(Object obj) {
        wua wuaVar = this.ai;
        if (wuaVar != null) {
            wuaVar.h();
        }
        super.eb().k = obj;
    }

    @Override // defpackage.bq
    public final void aj(Object obj) {
        wua wuaVar = this.ai;
        if (wuaVar != null) {
            wuaVar.h();
        }
        super.eb().l = obj;
    }

    @Override // defpackage.bq
    public final void ak(Object obj) {
        wua wuaVar = this.ai;
        if (wuaVar != null) {
            wuaVar.h();
        }
        super.eb().j = obj;
    }

    @Override // defpackage.bq
    public final void al(Object obj) {
        wua wuaVar = this.ai;
        if (wuaVar != null) {
            wuaVar.h();
        }
        super.eb().m = obj;
    }

    @Override // defpackage.bq
    public final void av(int i, int i2) {
        this.ai.e(i, i2);
        wum.n();
    }

    @Override // defpackage.bq
    public final boolean ay() {
        this.ai.a("Fragment:onOptionsItemSelected").close();
        return false;
    }

    @Override // defpackage.bq
    public final void dH(Bundle bundle) {
        this.P = true;
        hig higVarL = L();
        AccessibilityManager accessibilityManager = higVarL.a;
        if (accessibilityManager.isTouchExplorationEnabled()) {
            StringBuilder sb = new StringBuilder();
            hid hidVar = higVarL.c;
            axe axeVar = ((ats) hidVar).a;
            axeVar.getClass();
            TextView textView = axeVar.a;
            if (textView != null) {
                textView.setFocusable(true);
                sb.append(textView.getText());
                sb.append("\n");
            }
            TextView textView2 = axeVar.b;
            if (textView2 != null) {
                textView2.setFocusable(true);
                sb.append(textView2.getText());
            }
            String string = sb.toString();
            if (agyv.n(string)) {
                return;
            }
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
            accessibilityEventObtain.setClassName(accessibilityEventObtain.getClass().getName());
            accessibilityEventObtain.setEventType(32);
            Context contextS = hidVar.s();
            accessibilityEventObtain.setPackageName(contextS != null ? contextS.getPackageName() : null);
            accessibilityEventObtain.getText().add(string);
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain);
        }
    }

    @Override // defpackage.ats
    public final void dt(axh axhVar) {
        wwt wwtVarA = this.ai.a("Fragment:onGuidedActionClickedBegin");
        try {
            hig higVarL = L();
            axhVar.getClass();
            if (axhVar.a == 1) {
                higVarL.a();
            }
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

    @Override // defpackage.ats, defpackage.bq
    public final void e() {
        wwt wwtVarC = this.ai.c();
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
        return this.ah;
    }

    @Override // defpackage.bq
    public final void er() {
        wwt wwtVarB = this.ai.b();
        try {
            this.P = true;
            this.aj = true;
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
        this.ai.g();
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

    @Override // defpackage.hiw, defpackage.bq
    public final void ex(Context context) {
        this.ai.g();
        try {
            if (this.aj) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.ex(context);
            if (this.e == null) {
                try {
                    wvx wvxVarD = wzg.d(hid.class, "CreateComponent");
                    try {
                        Object objDN = cO().dN();
                        wvxVarD.close();
                        wvx wvxVarD2 = wzg.d(hid.class, "CreatePeer");
                        try {
                            eup eupVar = ((eth) objDN).b;
                            AccessibilityManager accessibilityManagerU = eupVar.u();
                            gph gphVarBj = eupVar.bj();
                            bq bqVar = ((eth) objDN).a;
                            if (!(bqVar instanceof hid)) {
                                throw new IllegalStateException(a.B(bqVar, hig.class, "Attempt to inject a Fragment wrapper of type "));
                            }
                            hid hidVar = (hid) bqVar;
                            hidVar.getClass();
                            this.e = new hig(accessibilityManagerU, gphVarBj, hidVar);
                            wvxVarD2.close();
                            this.aa.b(new wir(this.ai, this.ah));
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            wvxVarD.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            }
            bqs bqsVar = this.F;
            if (bqsVar instanceof wwo) {
                wua wuaVar = this.ai;
                if (wuaVar.b == null) {
                    wuaVar.d(((wwo) bqsVar).aK(), true);
                }
            }
            wum.n();
        } catch (Throwable th3) {
            try {
                wum.n();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028 A[Catch: all -> 0x002f, TRY_LEAVE, TryCatch #1 {all -> 0x002f, blocks: (B:3:0x0005, B:5:0x0012, B:7:0x001a, B:9:0x001e, B:12:0x0028), top: B:23:0x0005 }] */
    @Override // defpackage.ats, defpackage.bq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ey(android.os.Bundle r4) {
        /*
            r3 = this;
            wua r0 = r3.ai
            r0.g()
            super.ey(r4)     // Catch: java.lang.Throwable -> L2f
            hig r4 = r3.L()     // Catch: java.lang.Throwable -> L2f
            hid r0 = r4.c     // Catch: java.lang.Throwable -> L2f
            android.os.Bundle r1 = r0.n     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L28
            java.lang.String r2 = "disclaimer_title"
            java.lang.String r1 = r1.getString(r2)     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L28
            android.os.Bundle r0 = r0.n     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L25
            java.lang.String r1 = "disclaimer_description"
            java.lang.String r0 = r0.getString(r1)     // Catch: java.lang.Throwable -> L2f
            goto L26
        L25:
            r0 = 0
        L26:
            if (r0 != 0) goto L2b
        L28:
            r4.a()     // Catch: java.lang.Throwable -> L2f
        L2b:
            defpackage.wum.n()
            return
        L2f:
            r4 = move-exception
            defpackage.wum.n()     // Catch: java.lang.Throwable -> L34
            goto L38
        L34:
            r0 = move-exception
            r4.addSuppressed(r0)
        L38:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hid.ey(android.os.Bundle):void");
    }

    @Override // defpackage.ats, defpackage.bq
    public final void g(Bundle bundle) {
        this.ai.g();
        try {
            super.g(bundle);
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
    public final void h() {
        this.ai.g();
        try {
            this.P = true;
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
    public final void i() {
        this.ai.g();
        try {
            this.P = true;
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

    @Override // defpackage.hiw, defpackage.bq
    public final Context s() {
        if (super.s() == null) {
            return null;
        }
        if (this.f == null) {
            this.f = new wjg(this, super.s());
        }
        return this.f;
    }
}
