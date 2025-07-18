package com.google.android.apps.tvsearch.previewer;

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
import defpackage.agte;
import defpackage.ahbt;
import defpackage.bcg;
import defpackage.bco;
import defpackage.etb;
import defpackage.eup;
import defpackage.hbs;
import defpackage.hbu;
import defpackage.hby;
import defpackage.hcc;
import defpackage.jhr;
import defpackage.lzb;
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

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PreviewerControlActivity extends hbs implements wgt, wgr, wip {
    private hby m;
    private boolean o;
    private Context p;
    private bco r;
    private boolean s;
    private final wsz n = new wsz(this, this);
    private final long q = SystemClock.elapsedRealtime();

    public PreviewerControlActivity() {
        this.f.a(new hbu(this));
    }

    @Override // defpackage.hbs
    public final /* synthetic */ aeia D() {
        return new wji(this);
    }

    @Override // defpackage.wgr
    public final long F() {
        return this.q;
    }

    @Override // defpackage.wgt
    public final /* bridge */ /* synthetic */ Object L() {
        hby hbyVar = this.m;
        if (hbyVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.s) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return hbyVar;
    }

    public final void M() {
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
                    Activity activity = ((etb) objDN).a;
                    aeiv.a(activity);
                    if (!(activity instanceof PreviewerControlActivity)) {
                        throw new IllegalStateException(a.w((tt) activity, hby.class));
                    }
                    eup eupVar = ((etb) objDN).c;
                    this.m = new hby((PreviewerControlActivity) activity, (Context) eupVar.n.a(), (agte) eupVar.x.a(), (agte) eupVar.bW.a(), (ahbt) eupVar.q.a(), ((Boolean) eupVar.gq.a()).booleanValue(), (hcc) eupVar.nV.a(), (lzb) eupVar.gZ.a(), (jhr) eupVar.lR.a());
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
            M();
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
            M();
            hby hbyVar = this.m;
            if (i == 101) {
                if (i2 == 1001) {
                    ((zdv) hby.a.b().q("com/google/android/apps/tvsearch/previewer/PreviewerControlActivityPeer", "onActivityResult", 274, "PreviewerControlActivityPeer.kt")).u("Screenshot was captured.");
                } else if (i2 != 1002) {
                    ((zdv) hby.a.c().q("com/google/android/apps/tvsearch/previewer/PreviewerControlActivityPeer", "onActivityResult", 275, "PreviewerControlActivityPeer.kt")).v("Unknown resultCode %d received from SRA.", i2);
                } else {
                    ((zdv) hby.a.c().q("com/google/android/apps/tvsearch/previewer/PreviewerControlActivityPeer", "onActivityResult", 273, "PreviewerControlActivityPeer.kt")).u("Failed to capture screenshot.");
                }
            }
            hbyVar.d.finish();
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

    @Override // defpackage.hbs, defpackage.bw, defpackage.tt, defpackage.eq, android.app.Activity
    public final void onCreate(Bundle bundle) {
        wsz wszVar = this.n;
        wwt wwtVarV = wszVar.v();
        try {
            this.o = true;
            ((wiq) ek()).g(wszVar);
            super.onCreate(bundle);
            M();
            hby hbyVar = this.m;
            if (!hbyVar.i) {
                hbyVar.d.finish();
            }
            this.o = false;
            wszVar.o();
            ((wsx) wwtVarV).a.t();
        } catch (Throwable th) {
            try {
                ((wsx) wwtVarV).a.t();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
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

    @Override // defpackage.hbs, defpackage.gf, defpackage.bw, android.app.Activity
    public final void onDestroy() {
        wwt wwtVarD = this.n.d();
        try {
            super.onDestroy();
            M();
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
            M();
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
            M();
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

    /* JADX WARN: Code restructure failed: missing block: B:64:0x01a4, code lost:
    
        if (r11 != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01cf, code lost:
    
        if (r11 != false) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02b9 A[Catch: all -> 0x03ed, TryCatch #7 {all -> 0x03ed, blocks: (B:101:0x0241, B:103:0x0247, B:107:0x0258, B:111:0x026b, B:114:0x0272, B:115:0x027b, B:116:0x027c, B:118:0x0285, B:119:0x0287, B:121:0x028c, B:123:0x0293, B:127:0x02a0, B:122:0x0291, B:130:0x02b1, B:132:0x02b9, B:133:0x02d3, B:134:0x02e2, B:136:0x02e8, B:138:0x02f2, B:140:0x02f9, B:142:0x02fd, B:143:0x02ff, B:139:0x02f7, B:144:0x0305, B:145:0x0323, B:146:0x032e, B:147:0x032f, B:148:0x033a, B:151:0x033e, B:153:0x0340, B:155:0x034a, B:156:0x0350, B:157:0x0351, B:159:0x0353, B:161:0x035d, B:162:0x0363, B:163:0x0364, B:164:0x0369, B:166:0x036b, B:167:0x0371, B:169:0x0373, B:171:0x0379, B:172:0x037f, B:174:0x0381, B:176:0x0387, B:181:0x03d8, B:177:0x03a1, B:179:0x03a5, B:180:0x03bf, B:182:0x03de, B:14:0x00c3, B:51:0x0178, B:49:0x0163), top: B:202:0x00bd, inners: #1, #4, #10, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02d3 A[Catch: all -> 0x03ed, TryCatch #7 {all -> 0x03ed, blocks: (B:101:0x0241, B:103:0x0247, B:107:0x0258, B:111:0x026b, B:114:0x0272, B:115:0x027b, B:116:0x027c, B:118:0x0285, B:119:0x0287, B:121:0x028c, B:123:0x0293, B:127:0x02a0, B:122:0x0291, B:130:0x02b1, B:132:0x02b9, B:133:0x02d3, B:134:0x02e2, B:136:0x02e8, B:138:0x02f2, B:140:0x02f9, B:142:0x02fd, B:143:0x02ff, B:139:0x02f7, B:144:0x0305, B:145:0x0323, B:146:0x032e, B:147:0x032f, B:148:0x033a, B:151:0x033e, B:153:0x0340, B:155:0x034a, B:156:0x0350, B:157:0x0351, B:159:0x0353, B:161:0x035d, B:162:0x0363, B:163:0x0364, B:164:0x0369, B:166:0x036b, B:167:0x0371, B:169:0x0373, B:171:0x0379, B:172:0x037f, B:174:0x0381, B:176:0x0387, B:181:0x03d8, B:177:0x03a1, B:179:0x03a5, B:180:0x03bf, B:182:0x03de, B:14:0x00c3, B:51:0x0178, B:49:0x0163), top: B:202:0x00bd, inners: #1, #4, #10, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x013d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0118 A[Catch: all -> 0x0031, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0031, blocks: (B:6:0x001a, B:17:0x00cd, B:29:0x0118, B:33:0x0129, B:40:0x0142, B:42:0x0146, B:44:0x014a, B:47:0x0150, B:83:0x01f8, B:88:0x0203, B:95:0x0222, B:98:0x0231, B:24:0x00e9), top: B:197:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0129 A[Catch: all -> 0x0031, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0031, blocks: (B:6:0x001a, B:17:0x00cd, B:29:0x0118, B:33:0x0129, B:40:0x0142, B:42:0x0146, B:44:0x014a, B:47:0x0150, B:83:0x01f8, B:88:0x0203, B:95:0x0222, B:98:0x0231, B:24:0x00e9), top: B:197:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0142 A[Catch: all -> 0x0031, TRY_ENTER, TryCatch #2 {all -> 0x0031, blocks: (B:6:0x001a, B:17:0x00cd, B:29:0x0118, B:33:0x0129, B:40:0x0142, B:42:0x0146, B:44:0x014a, B:47:0x0150, B:83:0x01f8, B:88:0x0203, B:95:0x0222, B:98:0x0231, B:24:0x00e9), top: B:197:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0150 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #2 {all -> 0x0031, blocks: (B:6:0x001a, B:17:0x00cd, B:29:0x0118, B:33:0x0129, B:40:0x0142, B:42:0x0146, B:44:0x014a, B:47:0x0150, B:83:0x01f8, B:88:0x0203, B:95:0x0222, B:98:0x0231, B:24:0x00e9), top: B:197:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01eb A[Catch: all -> 0x03ef, TRY_LEAVE, TryCatch #9 {all -> 0x03ef, blocks: (B:3:0x0008, B:10:0x0037, B:14:0x00c3, B:15:0x00c9, B:18:0x00cf, B:27:0x00fd, B:30:0x011a, B:31:0x0123, B:38:0x013e, B:48:0x0152, B:49:0x0163, B:51:0x0178, B:52:0x017b, B:65:0x01a6, B:78:0x01d1, B:79:0x01e4, B:81:0x01eb, B:86:0x01ff, B:89:0x0205, B:91:0x0212, B:93:0x021e, B:96:0x0224, B:99:0x0233, B:85:0x01fd, B:69:0x01b5, B:76:0x01cd, B:56:0x018a, B:63:0x01a2, B:21:0x00df, B:22:0x00e3), top: B:203:0x0008 }] */
    @Override // defpackage.gf, defpackage.bw, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onStart() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1026
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.tvsearch.previewer.PreviewerControlActivity.onStart():void");
    }

    @Override // defpackage.gf, defpackage.bw, android.app.Activity
    protected final void onStop() {
        wwt wwtVarK = this.n.k();
        try {
            super.onStop();
            M();
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
