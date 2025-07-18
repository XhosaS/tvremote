package com.google.android.apps.tvsearch.voice.voiceinput;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.speech.SpeechRecognizer;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import androidx.leanback.widget.SearchEditText;
import androidx.leanback.widget.SpeechOrbView;
import com.google.android.katniss.R;
import defpackage.a;
import defpackage.aeia;
import defpackage.aeiv;
import defpackage.bai;
import defpackage.bcg;
import defpackage.bco;
import defpackage.etb;
import defpackage.eup;
import defpackage.ghp;
import defpackage.jox;
import defpackage.joy;
import defpackage.jpc;
import defpackage.jpd;
import defpackage.jrv;
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
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class VoiceInputActivity extends jox implements wgt, wgr, wip {
    private jpd m;
    private boolean o;
    private Context p;
    private bco r;
    private boolean s;
    private final wsz n = new wsz(this, this);
    private final long q = SystemClock.elapsedRealtime();

    public VoiceInputActivity() {
        this.f.a(new joy(this));
    }

    @Override // defpackage.wgr
    public final long F() {
        return this.q;
    }

    @Override // defpackage.wgt
    public final /* bridge */ /* synthetic */ Object L() {
        jpd jpdVar = this.m;
        if (jpdVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.s) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return jpdVar;
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

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        this.p = context;
        xag.a(context);
        super.attachBaseContext(context);
        this.p = null;
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
            r();
            this.m.a();
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

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        wwt wwtVarI = wum.i();
        try {
            super.invalidateOptionsMenu();
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

    @Override // defpackage.jox
    public final /* synthetic */ aeia k() {
        return new wji(this);
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

    @Override // defpackage.tt, android.app.Activity, android.content.ComponentCallbacks
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

    @Override // defpackage.jox, defpackage.bw, defpackage.tt, defpackage.eq, android.app.Activity
    public final void onCreate(Bundle bundle) {
        wsz wszVar = this.n;
        wwt wwtVarV = wszVar.v();
        try {
            this.o = true;
            ((wiq) ek()).g(wszVar);
            super.onCreate(bundle);
            r();
            final jpd jpdVar = this.m;
            VoiceInputActivity voiceInputActivity = jpdVar.d;
            Intent intent = voiceInputActivity.getIntent();
            if (!Objects.equals(intent.getAction(), "android.speech.action.RECOGNIZE_SPEECH")) {
                ((zdv) ((zdv) jpd.a.d()).q("com/google/android/apps/tvsearch/voice/voiceinput/VoiceInputActivityPeer", "onCreate", 102, "VoiceInputActivityPeer.java")).u("not started from RecognizerIntent, exiting");
                jpdVar.a();
            }
            WindowManager.LayoutParams attributes = voiceInputActivity.getWindow().getAttributes();
            attributes.gravity = 48;
            voiceInputActivity.getWindow().setAttributes(attributes);
            voiceInputActivity.setContentView(R.layout.voice_input);
            voiceInputActivity.getWindow().setLayout(-1, -2);
            View viewFindViewById = voiceInputActivity.findViewById(R.id.lb_search_bar_badge);
            jpdVar.f = (SpeechOrbView) voiceInputActivity.findViewById(R.id.lb_search_bar_speech_orb);
            jpdVar.f.a = new View.OnClickListener() { // from class: jpa
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    jpd jpdVar2 = jpdVar;
                    jpdVar2.d.setResult(0);
                    jpdVar2.a();
                }
            };
            jpdVar.i = (SearchEditText) voiceInputActivity.findViewById(R.id.lb_search_text_editor);
            jpdVar.i.setTextColor(voiceInputActivity.getResources().getColor(R.color.lb_search_bar_hint_speech_mode, null));
            jpdVar.i.setHintTextColor(voiceInputActivity.getResources().getColor(R.color.lb_search_bar_hint_speech_mode, null));
            jpdVar.i.a = new bai() { // from class: jpb
            };
            if (intent.hasExtra("android.speech.extra.PROMPT")) {
                jpdVar.i.setHint(intent.getStringExtra("android.speech.extra.PROMPT"));
            }
            boolean zHasExtra = intent.hasExtra("LEANBACK_BADGE_PRESENT");
            if (intent.getBooleanExtra("LEANBACK_BADGE_PRESENT", false)) {
                viewFindViewById.setVisibility(0);
            }
            if (zHasExtra) {
                voiceInputActivity.findViewById(R.id.lb_search_bar_items).setBackground(null);
            } else {
                View viewFindViewById2 = voiceInputActivity.findViewById(R.id.lb_search_bar_items);
                viewFindViewById2.setBackground(new LayerDrawable(new Drawable[]{new ColorDrawable(-16777216), viewFindViewById2.getBackground()}));
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

    @Override // defpackage.jox, defpackage.bw, android.app.Activity
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

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        super.onKeyUp(i, keyEvent);
        r();
        jpd jpdVar = this.m;
        if (i != 4) {
            switch (i) {
                case 19:
                case 20:
                case 21:
                case 22:
                    break;
                default:
                    return false;
            }
        }
        jpdVar.h.removeCallbacksAndMessages(null);
        jpdVar.d.setResult(0);
        jpdVar.a();
        return true;
    }

    @Override // defpackage.bw, defpackage.tt, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        wwt wwtVarX = this.n.x();
        try {
            boolean zOnMenuItemSelected = super.onMenuItemSelected(i, menuItem);
            wwtVarX.close();
            return zOnMenuItemSelected;
        } catch (Throwable th) {
            try {
                wwtVarX.close();
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
            r();
            jpd jpdVar = this.m;
            jpdVar.h.removeCallbacksAndMessages(null);
            jpdVar.e.abandonAudioFocusRequest(jpdVar.k);
            synchronized (jpdVar.b) {
                SpeechRecognizer speechRecognizer = jpdVar.g;
                if (speechRecognizer != null) {
                    speechRecognizer.destroy();
                    jpdVar.g = null;
                }
            }
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

    @Override // android.app.Activity
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

    @Override // defpackage.bw, android.app.Activity
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
            r();
            jpd jpdVar = this.m;
            if (jpdVar.g == null) {
                jpdVar.g = SpeechRecognizer.createSpeechRecognizer(jpdVar.d);
            }
            int iRequestAudioFocus = jpdVar.e.requestAudioFocus(jpdVar.k);
            if (iRequestAudioFocus != 1) {
                ((zdv) ((zdv) jpd.a.d()).q("com/google/android/apps/tvsearch/voice/voiceinput/VoiceInputActivityPeer", "onResume", 173, "VoiceInputActivityPeer.java")).v("Could not get audio focus, res=%d, capturing voice anyway...", iRequestAudioFocus);
            }
            synchronized (jpdVar.b) {
                SpeechRecognizer speechRecognizer = jpdVar.g;
                if (speechRecognizer != null) {
                    speechRecognizer.setRecognitionListener(new jpc(jpdVar));
                    jpdVar.g.startListening(jpdVar.d.getIntent());
                }
            }
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

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onSearchRequested() {
        super.onSearchRequested();
        r();
        return true;
    }

    @Override // defpackage.bw, android.app.Activity
    protected final void onStart() {
        wwt wwtVarJ = this.n.j();
        try {
            super.onStart();
            r();
            jpd jpdVar = this.m;
            jpdVar.j.p();
            jpdVar.c = jrv.a(jpdVar.d);
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

    @Override // defpackage.bw, android.app.Activity
    protected final void onStop() {
        wwt wwtVarK = this.n.k();
        try {
            r();
            jpd jpdVar = this.m;
            jrv jrvVar = jpdVar.c;
            if (jrvVar != null) {
                jpdVar.d.unregisterReceiver(jrvVar);
                jpdVar.c = null;
            }
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

    public final void r() {
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
                        Activity activity = ((etb) objDN).a;
                        aeiv.a(activity);
                        if (!(activity instanceof VoiceInputActivity)) {
                            throw new IllegalStateException(a.w((tt) activity, jpd.class));
                        }
                        eup eupVar = ((etb) objDN).c;
                        this.m = new jpd((VoiceInputActivity) activity, eupVar.o(), (ghp) eupVar.ar.a());
                        wvxVarF.close();
                        this.m.l = this;
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
}
