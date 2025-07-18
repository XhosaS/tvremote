package com.google.android.apps.tvsearch.setup;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import defpackage.a;
import defpackage.aeia;
import defpackage.aeiv;
import defpackage.aejl;
import defpackage.agte;
import defpackage.ahal;
import defpackage.ahbt;
import defpackage.bcg;
import defpackage.bco;
import defpackage.etb;
import defpackage.eup;
import defpackage.ewm;
import defpackage.ewo;
import defpackage.eyp;
import defpackage.fcu;
import defpackage.fda;
import defpackage.ffo;
import defpackage.fiu;
import defpackage.ggr;
import defpackage.ghr;
import defpackage.gtu;
import defpackage.iax;
import defpackage.idl;
import defpackage.idu;
import defpackage.idw;
import defpackage.iei;
import defpackage.iep;
import defpackage.iga;
import defpackage.irh;
import defpackage.jbd;
import defpackage.tt;
import defpackage.wgr;
import defpackage.wgs;
import defpackage.wgt;
import defpackage.wip;
import defpackage.wiq;
import defpackage.wji;
import defpackage.wsv;
import defpackage.wsw;
import defpackage.wsx;
import defpackage.wsz;
import defpackage.wum;
import defpackage.wvx;
import defpackage.wwb;
import defpackage.wwt;
import defpackage.wyo;
import defpackage.wzg;
import defpackage.xag;
import defpackage.zdv;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AssistantDataSharingConsentActivity extends iga implements wgt, wgr, wip {
    private iep m;
    private boolean o;
    private Context p;
    private bco r;
    private boolean s;
    private final wsz n = new wsz(this, this);
    private final long q = SystemClock.elapsedRealtime();

    public AssistantDataSharingConsentActivity() {
        this.f.a(new idw(this));
    }

    @Override // defpackage.iga
    public final /* synthetic */ aeia C() {
        return new wji(this);
    }

    public final void D() {
        if (this.m != null) {
            return;
        }
        if (!this.o) {
            throw new IllegalStateException("createPeer() called outside of onCreate");
        }
        if (this.s && !isFinishing()) {
            throw new IllegalStateException("createPeer() called after destroyed.");
        }
        wvx wvxVarF = wzg.f("CreateComponent", wwb.a, true);
        try {
            cO().dN();
            wvxVarF.close();
            wvxVarF = wzg.f("CreatePeer", wwb.a, true);
            try {
                try {
                    Object objDN = cO().dN();
                    eup eupVar = ((etb) objDN).c;
                    Supplier supplierGG = eupVar.gG();
                    eyp eypVar = (eyp) eupVar.gT.a();
                    aejl aejlVar = eupVar.oi;
                    ggr ggrVarAY = eupVar.aY();
                    Activity activity = ((etb) objDN).a;
                    aeiv.a(activity);
                    if (!(activity instanceof AssistantDataSharingConsentActivity)) {
                        throw new IllegalStateException(a.w((tt) activity, iep.class));
                    }
                    this.m = new iep(supplierGG, eypVar, aejlVar, ggrVarAY, (AssistantDataSharingConsentActivity) activity, (iax) eupVar.gb.a(), eupVar.gJ(), (fda) eupVar.fS.a(), (agte) eupVar.x.a(), (agte) eupVar.bW.a(), (ahbt) eupVar.q.a(), (fiu) eupVar.eY.a(), eupVar.gI(), eupVar.oj, eupVar.ap(), eupVar.ok, eupVar.ol, eupVar.om, eupVar.on, eupVar.oo, eupVar.op, eupVar.oq, eupVar.or, eupVar.os, eupVar.bj(), new ewo(), (gtu) eupVar.bE.a(), eupVar.fU, eupVar.ot, (fcu) eupVar.fb.a(), (jbd) eupVar.gp.a(), (jbd) eupVar.fj.a(), (idl) eupVar.ga.a(), (idu) eupVar.fZ.a(), (irh) ((etb) objDN).g.a(), (ghr) eupVar.fg.a(), (ffo) eupVar.fu.a(), eupVar.al());
                    wvxVarF.close();
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            } finally {
            }
        } finally {
            try {
                wvxVarF.close();
                throw th;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
    }

    @Override // defpackage.wgr
    public final long F() {
        return this.q;
    }

    @Override // defpackage.wgt
    public final /* bridge */ /* synthetic */ Object L() {
        iep iepVar = this.m;
        if (iepVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.s) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return iepVar;
    }

    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(Configuration configuration) {
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            baseContext = this.p;
        }
        xag.b(baseContext);
        super.applyOverrideConfiguration(configuration);
    }

    @Override // defpackage.gf, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        this.p = context;
        xag.a(context);
        super.attachBaseContext(context);
        this.p = null;
    }

    @Override // defpackage.gf
    public final boolean cV() {
        wwt wwtVarL = this.n.l();
        try {
            boolean zCV = super.cV();
            wwtVarL.close();
            return zCV;
        } catch (Throwable th) {
            try {
                wwtVarL.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.eq, defpackage.bcl
    public final bcg ek() {
        if (this.r == null) {
            this.r = new wiq(this);
        }
        return this.r;
    }

    @Override // android.app.Activity
    public final void finish() {
        wwt wwtVarA = this.n.a();
        try {
            super.finish();
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

    @Override // defpackage.gf, android.app.Activity
    public final void invalidateOptionsMenu() {
        wwt wwtVarI = wum.i();
        try {
            cT().e();
            wwtVarI.close();
        } catch (Throwable th) {
            try {
                wwtVarI.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bw, defpackage.tt, android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        wwt wwtVarU = this.n.u();
        try {
            super.onActivityResult(i, i2, intent);
            wwtVarU.close();
        } catch (Throwable th) {
            try {
                wwtVarU.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        wwt wwtVarB = this.n.b();
        try {
            super.onAttachedToWindow();
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

    @Override // defpackage.tt, android.app.Activity
    public final void onBackPressed() {
        wwt wwtVarC = this.n.c();
        try {
            this.j.a.c();
            D();
            iep iepVar = this.m;
            iepVar.e.setResult(0);
            ahal.e(iepVar.g, null, 0, new iei(iepVar, null), 3);
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

    @Override // defpackage.gf, defpackage.tt, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        wwt wwtVarN = this.n.n("onConfigurationChanged", null);
        try {
            super.onConfigurationChanged(configuration);
            wwtVarN.close();
        } catch (Throwable th) {
            try {
                wwtVarN.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096 A[Catch: all -> 0x0046, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0046, blocks: (B:9:0x003f, B:16:0x0056, B:17:0x005a, B:18:0x0065, B:19:0x0068, B:20:0x007b, B:24:0x0096, B:25:0x009a, B:26:0x00a4, B:27:0x00a7, B:28:0x00b9, B:32:0x00d3, B:35:0x00e1, B:38:0x00f2, B:41:0x00fe, B:46:0x012d, B:48:0x013b, B:61:0x016f, B:63:0x0177, B:67:0x01b8, B:71:0x01c8, B:75:0x01d3, B:72:0x01cb, B:73:0x01ce, B:74:0x01d1, B:78:0x01e3, B:80:0x01fc, B:82:0x0213, B:83:0x0216, B:85:0x022a, B:87:0x0232, B:91:0x0242, B:93:0x0249, B:94:0x024c, B:95:0x025f, B:99:0x0275, B:114:0x02cf, B:117:0x02d7, B:124:0x02ec, B:151:0x03aa, B:155:0x03c4, B:159:0x03de, B:163:0x03f8, B:167:0x0421, B:129:0x0314, B:132:0x031c, B:134:0x032d, B:146:0x038e, B:135:0x033f, B:140:0x036c, B:103:0x0284, B:107:0x0291, B:111:0x0299), top: B:211:0x003f, inners: #4, #5, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cb A[Catch: all -> 0x0538, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0538, blocks: (B:3:0x0013, B:7:0x0039, B:13:0x004c, B:22:0x008e, B:30:0x00cb, B:33:0x00d9, B:36:0x00e7, B:39:0x00f8, B:42:0x0104, B:43:0x0115, B:53:0x0149, B:56:0x0159, B:59:0x0169, B:65:0x0194, B:76:0x01db, B:97:0x026c, B:112:0x02a1, B:115:0x02d1, B:121:0x02e3, B:148:0x0399, B:152:0x03ae, B:156:0x03c8, B:160:0x03e2, B:164:0x03fc, B:168:0x0425, B:126:0x0300, B:130:0x0318, B:143:0x037a, B:147:0x0392, B:137:0x0358, B:142:0x0371, B:101:0x027e, B:105:0x028d, B:109:0x0295), top: B:212:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d3 A[Catch: all -> 0x0046, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0046, blocks: (B:9:0x003f, B:16:0x0056, B:17:0x005a, B:18:0x0065, B:19:0x0068, B:20:0x007b, B:24:0x0096, B:25:0x009a, B:26:0x00a4, B:27:0x00a7, B:28:0x00b9, B:32:0x00d3, B:35:0x00e1, B:38:0x00f2, B:41:0x00fe, B:46:0x012d, B:48:0x013b, B:61:0x016f, B:63:0x0177, B:67:0x01b8, B:71:0x01c8, B:75:0x01d3, B:72:0x01cb, B:73:0x01ce, B:74:0x01d1, B:78:0x01e3, B:80:0x01fc, B:82:0x0213, B:83:0x0216, B:85:0x022a, B:87:0x0232, B:91:0x0242, B:93:0x0249, B:94:0x024c, B:95:0x025f, B:99:0x0275, B:114:0x02cf, B:117:0x02d7, B:124:0x02ec, B:151:0x03aa, B:155:0x03c4, B:159:0x03de, B:163:0x03f8, B:167:0x0421, B:129:0x0314, B:132:0x031c, B:134:0x032d, B:146:0x038e, B:135:0x033f, B:140:0x036c, B:103:0x0284, B:107:0x0291, B:111:0x0299), top: B:211:0x003f, inners: #4, #5, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e1 A[Catch: all -> 0x0046, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0046, blocks: (B:9:0x003f, B:16:0x0056, B:17:0x005a, B:18:0x0065, B:19:0x0068, B:20:0x007b, B:24:0x0096, B:25:0x009a, B:26:0x00a4, B:27:0x00a7, B:28:0x00b9, B:32:0x00d3, B:35:0x00e1, B:38:0x00f2, B:41:0x00fe, B:46:0x012d, B:48:0x013b, B:61:0x016f, B:63:0x0177, B:67:0x01b8, B:71:0x01c8, B:75:0x01d3, B:72:0x01cb, B:73:0x01ce, B:74:0x01d1, B:78:0x01e3, B:80:0x01fc, B:82:0x0213, B:83:0x0216, B:85:0x022a, B:87:0x0232, B:91:0x0242, B:93:0x0249, B:94:0x024c, B:95:0x025f, B:99:0x0275, B:114:0x02cf, B:117:0x02d7, B:124:0x02ec, B:151:0x03aa, B:155:0x03c4, B:159:0x03de, B:163:0x03f8, B:167:0x0421, B:129:0x0314, B:132:0x031c, B:134:0x032d, B:146:0x038e, B:135:0x033f, B:140:0x036c, B:103:0x0284, B:107:0x0291, B:111:0x0299), top: B:211:0x003f, inners: #4, #5, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f2 A[Catch: all -> 0x0046, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0046, blocks: (B:9:0x003f, B:16:0x0056, B:17:0x005a, B:18:0x0065, B:19:0x0068, B:20:0x007b, B:24:0x0096, B:25:0x009a, B:26:0x00a4, B:27:0x00a7, B:28:0x00b9, B:32:0x00d3, B:35:0x00e1, B:38:0x00f2, B:41:0x00fe, B:46:0x012d, B:48:0x013b, B:61:0x016f, B:63:0x0177, B:67:0x01b8, B:71:0x01c8, B:75:0x01d3, B:72:0x01cb, B:73:0x01ce, B:74:0x01d1, B:78:0x01e3, B:80:0x01fc, B:82:0x0213, B:83:0x0216, B:85:0x022a, B:87:0x0232, B:91:0x0242, B:93:0x0249, B:94:0x024c, B:95:0x025f, B:99:0x0275, B:114:0x02cf, B:117:0x02d7, B:124:0x02ec, B:151:0x03aa, B:155:0x03c4, B:159:0x03de, B:163:0x03f8, B:167:0x0421, B:129:0x0314, B:132:0x031c, B:134:0x032d, B:146:0x038e, B:135:0x033f, B:140:0x036c, B:103:0x0284, B:107:0x0291, B:111:0x0299), top: B:211:0x003f, inners: #4, #5, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fe A[Catch: all -> 0x0046, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0046, blocks: (B:9:0x003f, B:16:0x0056, B:17:0x005a, B:18:0x0065, B:19:0x0068, B:20:0x007b, B:24:0x0096, B:25:0x009a, B:26:0x00a4, B:27:0x00a7, B:28:0x00b9, B:32:0x00d3, B:35:0x00e1, B:38:0x00f2, B:41:0x00fe, B:46:0x012d, B:48:0x013b, B:61:0x016f, B:63:0x0177, B:67:0x01b8, B:71:0x01c8, B:75:0x01d3, B:72:0x01cb, B:73:0x01ce, B:74:0x01d1, B:78:0x01e3, B:80:0x01fc, B:82:0x0213, B:83:0x0216, B:85:0x022a, B:87:0x0232, B:91:0x0242, B:93:0x0249, B:94:0x024c, B:95:0x025f, B:99:0x0275, B:114:0x02cf, B:117:0x02d7, B:124:0x02ec, B:151:0x03aa, B:155:0x03c4, B:159:0x03de, B:163:0x03f8, B:167:0x0421, B:129:0x0314, B:132:0x031c, B:134:0x032d, B:146:0x038e, B:135:0x033f, B:140:0x036c, B:103:0x0284, B:107:0x0291, B:111:0x0299), top: B:211:0x003f, inners: #4, #5, #6, #7 }] */
    @Override // defpackage.iga, defpackage.bw, defpackage.tt, defpackage.eq, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.tvsearch.setup.AssistantDataSharingConsentActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.tt, android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        wwt wwtVarW = this.n.w();
        try {
            super.onCreatePanelMenu(i, menu);
            wwtVarW.close();
            return true;
        } catch (Throwable th) {
            try {
                wwtVarW.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.iga, defpackage.gf, defpackage.bw, android.app.Activity
    public final void onDestroy() {
        wwt wwtVarD = this.n.d();
        try {
            super.onDestroy();
            D();
            iep iepVar = this.m;
            iepVar.Q.b(iepVar.e);
            this.s = true;
            wsz.p(((wsw) wwtVarD).a);
        } catch (Throwable th) {
            try {
                wsz.p(((wsw) wwtVarD).a);
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.tt, android.app.Activity
    protected final void onNewIntent(Intent intent) {
        wwt wwtVarE = this.n.e(intent);
        try {
            super.onNewIntent(intent);
            ((wsx) wwtVarE).a.t();
        } catch (Throwable th) {
            try {
                ((wsx) wwtVarE).a.t();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        wwt wwtVarY = this.n.y();
        try {
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            wwtVarY.close();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            try {
                wwtVarY.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bw, android.app.Activity
    protected final void onPause() {
        wwt wwtVarF = this.n.f();
        try {
            super.onPause();
            wsz wszVar = ((wsv) wwtVarF).a;
            wszVar.t();
            wszVar.r();
        } catch (Throwable th) {
            try {
                wsz wszVar2 = ((wsv) wwtVarF).a;
                wszVar2.t();
                wszVar2.r();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.tt, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        wwt wwtVarZ = this.n.z();
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            wwtVarZ.close();
        } catch (Throwable th) {
            try {
                wwtVarZ.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.gf, android.app.Activity
    protected final void onPostCreate(Bundle bundle) {
        wwt wwtVarA = this.n.A();
        try {
            super.onPostCreate(bundle);
            D();
            final iep iepVar = this.m;
            iepVar.Q.a(iepVar.e, new ewm() { // from class: idx
                @Override // defpackage.ewm
                public final void a() {
                    iepVar.e.finish();
                }
            });
            ((wsx) wwtVarA).a.t();
        } catch (Throwable th) {
            try {
                ((wsx) wwtVarA).a.t();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.gf, defpackage.bw, android.app.Activity
    protected final void onPostResume() {
        wwt wwtVarG = this.n.g();
        try {
            super.onPostResume();
            wwtVarG.close();
        } catch (Throwable th) {
            try {
                wwtVarG.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        wwt wwtVarI = wum.i();
        try {
            boolean zOnPrepareOptionsMenu = super.onPrepareOptionsMenu(menu);
            wwtVarI.close();
            return zOnPrepareOptionsMenu;
        } catch (Throwable th) {
            try {
                wwtVarI.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bw, defpackage.tt, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        wwt wwtVarN = this.n.n("onRequestPermissionsResult", null);
        try {
            super.onRequestPermissionsResult(i, strArr, iArr);
            wwtVarN.close();
        } catch (Throwable th) {
            try {
                wwtVarN.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    protected final void onRestart() {
        wwt wwtVarH = this.n.h();
        try {
            super.onRestart();
            ((wsx) wwtVarH).a.t();
        } catch (Throwable th) {
            try {
                ((wsx) wwtVarH).a.t();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bw, android.app.Activity
    protected final void onResume() {
        wwt wwtVarI = this.n.i();
        try {
            super.onResume();
            ((wsx) wwtVarI).a.t();
        } catch (Throwable th) {
            try {
                ((wsx) wwtVarI).a.t();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.tt, defpackage.eq, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        wwt wwtVarB = this.n.B();
        try {
            super.onSaveInstanceState(bundle);
            wsz wszVar = ((wsv) wwtVarB).a;
            wszVar.t();
            wszVar.r();
        } catch (Throwable th) {
            try {
                wsz wszVar2 = ((wsv) wwtVarB).a;
                wszVar2.t();
                wszVar2.r();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.gf, defpackage.bw, android.app.Activity
    protected final void onStart() {
        wwt wwtVarJ = this.n.j();
        try {
            super.onStart();
            D();
            this.m.z.w();
            ((wsx) wwtVarJ).a.t();
        } catch (Throwable th) {
            try {
                ((wsx) wwtVarJ).a.t();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.gf, defpackage.bw, android.app.Activity
    protected final void onStop() {
        wwt wwtVarK = this.n.k();
        try {
            super.onStop();
            D();
            iep iepVar = this.m;
            ((zdv) iep.b.b().q("com/google/android/apps/tvsearch/setup/AssistantDataSharingConsentActivityPeer", "onStop", 333, "AssistantDataSharingConsentActivityPeer.kt")).u("onStop");
            iepVar.z.x();
            wsz wszVar = ((wsv) wwtVarK).a;
            wszVar.t();
            wszVar.r();
        } catch (Throwable th) {
            try {
                wsz wszVar2 = ((wsv) wwtVarK).a;
                wszVar2.t();
                wszVar2.r();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onUserInteraction() {
        wwt wwtVarM = this.n.m();
        try {
            super.onUserInteraction();
            wwtVarM.close();
        } catch (Throwable th) {
            try {
                wwtVarM.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        if (wgs.a(intent, getApplicationContext())) {
            wyo.k(intent);
        }
        super.startActivity(intent);
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent, Bundle bundle) {
        if (wgs.a(intent, getApplicationContext())) {
            wyo.k(intent);
        }
        super.startActivity(intent, bundle);
    }

    @Override // defpackage.gf
    protected final void cW() {
    }

    @Override // defpackage.gf
    protected final void cX() {
    }
}
