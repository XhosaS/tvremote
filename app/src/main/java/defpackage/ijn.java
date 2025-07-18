package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.katniss.R;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.List;
import java.util.Locale;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ijn extends ijh implements wgt, aeiz, wjd, wwo {
    private final bco ah = new bco(this);
    private final wua ai = new wua(this);
    private boolean ao;
    private ijp e;
    private Context f;

    @Deprecated
    public ijn() {
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
            ContextWrapper contextWrapper = ((ijh) this).d;
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

    @Override // defpackage.ikr, defpackage.ats
    public final axe aD() {
        return new ijo(L());
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
    public final axd aP() throws Resources.NotFoundException {
        String string;
        ijp ijpVarL = L();
        jcy jcyVar = ijpVarL.d;
        String string2 = (!jcyVar.b() || jcyVar.d()) ? ijpVarL.b.dZ().getResources().getString(R.string.assistant_setup_hotword_intro_title) : ijpVarL.b.dZ().getResources().getString(R.string.assistant_setup_hotword_intro_title_hardware_toggle_off);
        string2.getClass();
        Supplier supplier = ijpVarL.a;
        if (((Boolean) supplier.get()).booleanValue() && jcyVar.b()) {
            string = ijpVarL.b.dZ().getResources().getString(R.string.assistant_setup_hotword_intro_description_supported_locale_hardware_toggle, ijpVarL.c.b);
            string.getClass();
        } else if (((Boolean) supplier.get()).booleanValue() && !jcyVar.b()) {
            string = ijpVarL.b.dZ().getResources().getString(R.string.assistant_setup_hotword_intro_description_supported_locale, ijpVarL.c.b);
            string.getClass();
        } else if (!((Boolean) supplier.get()).booleanValue() && jcyVar.b()) {
            string = ijpVarL.b.dZ().getResources().getString(R.string.assistant_setup_hotword_intro_description_unsupported_locale_hardware_toggle, ijpVarL.c.b);
            string.getClass();
        } else if (((Boolean) supplier.get()).booleanValue() || jcyVar.b()) {
            string = "";
        } else {
            string = ijpVarL.b.dZ().getResources().getString(R.string.assistant_setup_hotword_intro_description_unsupported_locale, ijpVarL.c.b);
            string.getClass();
        }
        return new axd(string2, string, null, ((Boolean) supplier.get()).booleanValue() ? ijpVarL.b.dZ().getResources().getDrawable(R.drawable.product_logo_assistant_color_144, null) : ijpVarL.b.dZ().getResources().getDrawable(R.drawable.ic_google_land, null));
    }

    @Override // defpackage.ats
    public final void aR(List list) {
        ijp ijpVarL = L();
        if (ijpVarL.d.b()) {
            ijn ijnVar = ijpVarL.b;
            ijnVar.s();
            axf axfVar = new axf(null);
            axfVar.a = 1L;
            axfVar.b = ijnVar.dZ().getResources().getString(R.string.assistant_setup_hotword_intro_continue);
            list.add(axfVar.a());
            return;
        }
        if (ijpVarL.c.d) {
            ijn ijnVar2 = ijpVarL.b;
            ijnVar2.s();
            axf axfVar2 = new axf(null);
            axfVar2.a = 3L;
            axfVar2.b = ijnVar2.dZ().getResources().getString(R.string.assistant_setup_neutral_full_screen);
            axfVar2.b(8, 8);
            list.add(axfVar2.a());
        }
        ijn ijnVar3 = ijpVarL.b;
        ijnVar3.s();
        axf axfVar3 = new axf(null);
        axfVar3.a = 1L;
        axfVar3.b = ijnVar3.dZ().getResources().getString(R.string.assistant_setup_hotword_intro_accept);
        list.add(axfVar3.a());
        ijnVar3.s();
        axf axfVar4 = new axf(null);
        axfVar4.a = 2L;
        axfVar4.b = ijnVar3.dZ().getResources().getString(R.string.assistant_setup_hotword_intro_decline);
        list.add(axfVar4.a());
    }

    @Override // defpackage.ijh
    protected final /* synthetic */ aeik aU() {
        return new wjj(this);
    }

    @Override // defpackage.wgt
    /* renamed from: aX, reason: merged with bridge method [inline-methods] */
    public final ijp L() {
        ijp ijpVar = this.e;
        if (ijpVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ao) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return ijpVar;
    }

    @Override // defpackage.ikr, defpackage.bq
    public final void aa(View view, Bundle bundle) {
        this.ai.g();
        try {
            super.aa(view, bundle);
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
    public final void ae(Bundle bundle) {
        Bundle bundle2 = this.n;
        boolean z = true;
        if (bundle2 != null && bundle2 != bundle) {
            z = false;
        }
        yqw.M(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.ae(bundle);
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

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067 A[Catch: all -> 0x009a, TryCatch #0 {all -> 0x009a, blocks: (B:3:0x0008, B:5:0x001e, B:8:0x0024, B:10:0x002c, B:13:0x0032, B:15:0x0038, B:17:0x003c, B:20:0x0042, B:22:0x0057, B:25:0x005e, B:27:0x0067, B:28:0x006a, B:30:0x0082, B:34:0x0093, B:33:0x008e), top: B:43:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082 A[Catch: all -> 0x009a, TryCatch #0 {all -> 0x009a, blocks: (B:3:0x0008, B:5:0x001e, B:8:0x0024, B:10:0x002c, B:13:0x0032, B:15:0x0038, B:17:0x003c, B:20:0x0042, B:22:0x0057, B:25:0x005e, B:27:0x0067, B:28:0x006a, B:30:0x0082, B:34:0x0093, B:33:0x008e), top: B:43:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    @Override // defpackage.ats
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void dt(defpackage.axh r10) {
        /*
            r9 = this;
            wua r0 = r9.ai
            java.lang.String r1 = "Fragment:onGuidedActionClickedBegin"
            wwt r0 = r0.a(r1)
            ijp r1 = r9.L()     // Catch: java.lang.Throwable -> L9a
            r10.getClass()     // Catch: java.lang.Throwable -> L9a
            ijn r2 = r1.b     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r3 = r2.ep()     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r4 = r2.ep()     // Catch: java.lang.Throwable -> L9a
            boolean r5 = r4 instanceof defpackage.ioy     // Catch: java.lang.Throwable -> L9a
            r6 = 0
            if (r5 == 0) goto L21
            ioy r4 = (defpackage.ioy) r4     // Catch: java.lang.Throwable -> L9a
            goto L22
        L21:
            r4 = r6
        L22:
            if (r4 != 0) goto L42
            java.lang.Object r4 = r2.ep()     // Catch: java.lang.Throwable -> L9a
            boolean r5 = r4 instanceof defpackage.wgt     // Catch: java.lang.Throwable -> L9a
            if (r5 == 0) goto L2f
            wgt r4 = (defpackage.wgt) r4     // Catch: java.lang.Throwable -> L9a
            goto L30
        L2f:
            r4 = r6
        L30:
            if (r4 == 0) goto L37
            java.lang.Object r4 = r4.L()     // Catch: java.lang.Throwable -> L9a
            goto L38
        L37:
            r4 = r6
        L38:
            boolean r5 = r4 instanceof defpackage.ioy     // Catch: java.lang.Throwable -> L9a
            if (r5 == 0) goto L3f
            r6 = r4
            ioy r6 = (defpackage.ioy) r6     // Catch: java.lang.Throwable -> L9a
        L3f:
            if (r6 == 0) goto L96
            r4 = r6
        L42:
            ycm r5 = defpackage.ycm.a     // Catch: java.lang.Throwable -> L9a
            ycl r5 = new ycl     // Catch: java.lang.Throwable -> L9a
            r5.<init>()     // Catch: java.lang.Throwable -> L9a
            r6 = 13
            defpackage.ygs.b(r6, r5)     // Catch: java.lang.Throwable -> L9a
            jcy r6 = r1.d     // Catch: java.lang.Throwable -> L9a
            boolean r6 = r6.b()     // Catch: java.lang.Throwable -> L9a
            r7 = 0
            if (r6 != 0) goto L5e
            iok r1 = r1.c     // Catch: java.lang.Throwable -> L9a
            boolean r1 = r1.d     // Catch: java.lang.Throwable -> L9a
            if (r1 == 0) goto L5e
            r7 = 1
        L5e:
            abxd r1 = r5.b     // Catch: java.lang.Throwable -> L9a
            int r1 = r1.memoizedSerializedSize     // Catch: java.lang.Throwable -> L9a
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r6
            if (r1 != 0) goto L6a
            r5.y()     // Catch: java.lang.Throwable -> L9a
        L6a:
            abxd r1 = r5.b     // Catch: java.lang.Throwable -> L9a
            ycm r1 = (defpackage.ycm) r1     // Catch: java.lang.Throwable -> L9a
            int r6 = r1.b     // Catch: java.lang.Throwable -> L9a
            r6 = r6 | 8
            r1.b = r6     // Catch: java.lang.Throwable -> L9a
            r1.e = r7     // Catch: java.lang.Throwable -> L9a
            ycm r1 = defpackage.ygs.a(r5)     // Catch: java.lang.Throwable -> L9a
            long r5 = r10.a     // Catch: java.lang.Throwable -> L9a
            r7 = 1
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 != 0) goto L88
            ire r10 = defpackage.ire.b     // Catch: java.lang.Throwable -> L9a
            r4.h(r10)     // Catch: java.lang.Throwable -> L9a
            goto L93
        L88:
            r7 = 2
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 != 0) goto L93
            ire r10 = defpackage.ire.c     // Catch: java.lang.Throwable -> L9a
            r4.h(r10)     // Catch: java.lang.Throwable -> L9a
        L93:
            super.ba(r3, r1)     // Catch: java.lang.Throwable -> L9a
        L96:
            r0.close()
            return
        L9a:
            r10 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L9f
            goto La3
        L9f:
            r0 = move-exception
            r10.addSuppressed(r0)
        La3:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ijn.dt(axh):void");
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

    @Override // defpackage.bq, defpackage.bbz
    public final bet em() {
        beu beuVar = new beu(super.em());
        beuVar.b(bds.c, new Bundle());
        return beuVar;
    }

    @Override // defpackage.bq
    public final void er() {
        wwt wwtVarB = this.ai.b();
        try {
            this.P = true;
            this.ao = true;
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

    @Override // defpackage.ijh, defpackage.ikr, defpackage.bq
    public final void ex(Context context) {
        this.ai.g();
        try {
            if (this.ao) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.ex(context);
            if (this.e == null) {
                try {
                    wvx wvxVarD = wzg.d(ijn.class, "CreateComponent");
                    try {
                        Object objDN = cO().dN();
                        wvxVarD.close();
                        wvx wvxVarD2 = wzg.d(ijn.class, "CreatePeer");
                        try {
                            eup eupVar = ((eth) objDN).b;
                            Supplier supplierGJ = eupVar.gJ();
                            bq bqVar = ((eth) objDN).a;
                            if (!(bqVar instanceof ijn)) {
                                throw new IllegalStateException(a.B(bqVar, ijp.class, "Attempt to inject a Fragment wrapper of type "));
                            }
                            ijn ijnVar = (ijn) bqVar;
                            ijnVar.getClass();
                            Bundle bundleA = wjk.a(bqVar);
                            ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) eupVar.pq.a();
                            yqw.B(bundleA.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                            iok iokVar = (iok) acas.d(bundleA, iok.a, extensionRegistryLite);
                            iokVar.getClass();
                            this.e = new ijp(supplierGJ, ijnVar, iokVar, (jcy) eupVar.gx.a());
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

    @Override // defpackage.ats, defpackage.bq
    public final void ey(Bundle bundle) {
        this.ai.g();
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

    @Override // defpackage.ikr, defpackage.bq
    public final void h() {
        this.ai.g();
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

    @Override // defpackage.ijh, defpackage.bq
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
