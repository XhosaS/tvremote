package com.google.android.apps.tvsearch.performers.shownotification;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import defpackage.a;
import defpackage.abvk;
import defpackage.abvo;
import defpackage.abvw;
import defpackage.abvz;
import defpackage.abwa;
import defpackage.abxd;
import defpackage.abza;
import defpackage.aeia;
import defpackage.aeiv;
import defpackage.bcg;
import defpackage.bco;
import defpackage.etb;
import defpackage.eup;
import defpackage.ffp;
import defpackage.gsg;
import defpackage.gsh;
import defpackage.gsi;
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
import defpackage.xgu;
import defpackage.xgw;
import defpackage.xhn;
import defpackage.xho;
import defpackage.xhs;
import defpackage.xht;
import defpackage.xjo;
import defpackage.xjp;
import defpackage.xki;
import defpackage.xkj;
import defpackage.xlq;
import defpackage.xnm;
import defpackage.xnn;
import defpackage.xnu;
import defpackage.zdv;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class NotificationActivity extends gsg implements wgt, wgr, wip {
    private gsi m;
    private boolean o;
    private Context p;
    private bco r;
    private boolean s;
    private final wsz n = new wsz(this, this);
    private final long q = SystemClock.elapsedRealtime();

    public NotificationActivity() {
        this.f.a(new gsh(this));
    }

    @Override // defpackage.gsg
    public final /* synthetic */ aeia D() {
        return new wji(this);
    }

    @Override // defpackage.wgr
    public final long F() {
        return this.q;
    }

    @Override // defpackage.wgt
    public final /* bridge */ /* synthetic */ Object L() {
        gsi gsiVar = this.m;
        if (gsiVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.s) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return gsiVar;
    }

    public final void M() {
        if (this.m == null) {
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
                        ffp ffpVar = (ffp) eupVar.by.a();
                        Activity activity = ((etb) objDN).a;
                        aeiv.a(activity);
                        if (!(activity instanceof NotificationActivity)) {
                            throw new IllegalStateException(a.w((tt) activity, gsi.class));
                        }
                        this.m = new gsi(ffpVar, (NotificationActivity) activity, eupVar.lP);
                        wvxVarF.close();
                    } catch (ClassCastException e) {
                        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } finally {
                try {
                    wvxVarF.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
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

    @Override // defpackage.gsg, defpackage.bw, defpackage.tt, defpackage.eq, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int length;
        int iA;
        wsz wszVar = this.n;
        wwt wwtVarV = wszVar.v();
        try {
            this.o = true;
            ((wiq) ek()).g(wszVar);
            super.onCreate(bundle);
            M();
            gsi gsiVar = this.m;
            if (((Boolean) gsiVar.d.a()).booleanValue()) {
                Bundle extras = gsiVar.c.getIntent().getExtras();
                if (extras == null) {
                    ((zdv) gsi.a.c().q("com/google/android/apps/tvsearch/performers/shownotification/NotificationActivityPeer", "onCreate", 42, "NotificationActivityPeer.kt")).u("#onCreate missing extras");
                } else {
                    String string = extras.getString("notification_id");
                    byte[] byteArray = extras.getByteArray("opaque_token");
                    if (string == null || string.length() == 0 || byteArray == null || (length = byteArray.length) == 0) {
                        ((zdv) gsi.a.c().q("com/google/android/apps/tvsearch/performers/shownotification/NotificationActivityPeer", "startNewCustomerSurvey", 54, "NotificationActivityPeer.kt")).u("#startNewCustomerSurvey empty notificationId or opaqueToken");
                    } else {
                        ffp ffpVar = gsiVar.b;
                        xht xhtVar = xht.a;
                        xhs xhsVar = new xhs();
                        xho xhoVar = xho.a;
                        xhn xhnVar = new xhn();
                        xgw xgwVar = xgw.a;
                        xgu xguVar = new xgu();
                        if ((xguVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            xguVar.y();
                        }
                        xgw xgwVar2 = (xgw) xguVar.b;
                        xgwVar2.b |= 1;
                        xgwVar2.c = "notification.notification_request";
                        DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((xgw) xguVar.b).d)).getClass();
                        xjp xjpVar = xjp.a;
                        xnu xnuVar = new xnu(new xjo());
                        xjo xjoVar = xnuVar.a;
                        if ((xjoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            xjoVar.y();
                        }
                        xjp xjpVar2 = (xjp) xjoVar.b;
                        xjpVar2.b |= 1;
                        xjpVar2.c = "assistant.api.client_input.NotificationRequestParam";
                        xnn xnnVar = xnn.a;
                        xnm xnmVar = new xnm();
                        if ((xnmVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            xnmVar.y();
                        }
                        xnn xnnVar2 = (xnn) xnmVar.b;
                        xnnVar2.b |= 1;
                        xnnVar2.c = string;
                        abvo abvoVarU = abvo.u(byteArray, 0, length);
                        if ((xnmVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            xnmVar.y();
                        }
                        xnn xnnVar3 = (xnn) xnmVar.b;
                        xnnVar3.b |= 4;
                        xnnVar3.d = abvoVarU;
                        abxd abxdVarV = xnmVar.v();
                        abxdVarV.getClass();
                        xnn xnnVar4 = (xnn) abxdVarV;
                        try {
                            int i = xnnVar4.memoizedSerializedSize;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                iA = abza.a.a(xnnVar4.getClass()).a(xnnVar4);
                                if (iA < 0) {
                                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                }
                            } else {
                                iA = i & Integer.MAX_VALUE;
                                if (iA == Integer.MAX_VALUE) {
                                    iA = abza.a.a(xnnVar4.getClass()).a(xnnVar4);
                                    if (iA < 0) {
                                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                    }
                                    xnnVar4.memoizedSerializedSize = (xnnVar4.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                                }
                            }
                            byte[] bArr = new byte[iA];
                            boolean z = abvz.e;
                            abvw abvwVar = new abvw(bArr, 0, iA);
                            abza.a.a(xnnVar4.getClass()).m(xnnVar4, abwa.a(abvwVar));
                            xnuVar.b(abvk.a(abvwVar, bArr));
                            xguVar.a("notification_request_params", xnuVar.a());
                            xgw xgwVarA = xki.a(xguVar);
                            if ((xhnVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                xhnVar.y();
                            }
                            xho xhoVar2 = (xho) xhnVar.b;
                            xhoVar2.c = xgwVarA;
                            xhoVar2.b = 5;
                            xho xhoVarA = xkj.a(xhnVar);
                            if ((xhsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                xhsVar.y();
                            }
                            xht xhtVar2 = (xht) xhsVar.b;
                            xhtVar2.c = xhoVarA;
                            xhtVar2.b = 3;
                            ffpVar.l(xlq.a(xhsVar), "createRequestNotification", Optional.empty());
                        } catch (IOException e) {
                            throw new RuntimeException(a.A(xnnVar4, "ByteString"), e);
                        }
                    }
                }
            }
            gsiVar.c.finish();
            this.o = false;
            this.n.o();
            ((wsx) wwtVarV).a.t();
        } finally {
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

    @Override // defpackage.gsg, defpackage.gf, defpackage.bw, android.app.Activity
    public final void onDestroy() {
        wwt wwtVarD = this.n.d();
        try {
            super.onDestroy();
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
