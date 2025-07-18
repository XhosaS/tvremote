package com.google.android.tv.remote.service.pairing;

import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.hardware.hdmi.HdmiControlManager;
import android.hardware.hdmi.HdmiPlaybackClient;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.format.DateUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.tv.remote.service.R;
import defpackage.adx;
import defpackage.bsk;
import defpackage.btw;
import defpackage.btz;
import defpackage.bua;
import defpackage.coy;
import defpackage.er;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PairingCodeActivity extends coy {
    public final Handler a = new Handler();
    public bua b;
    public boolean c;
    public adx d;
    private btw f;
    private long g;
    private int h;

    public static boolean d() {
        return Build.VERSION.SDK_INT < 31 && Build.VERSION.SDK_INT != 29;
    }

    public final void a() {
        this.c = true;
        bua buaVar = this.b;
        Runnable runnable = buaVar.a;
        if (runnable != null) {
            runnable.run();
            buaVar.a();
        }
        finish();
    }

    public final void b() {
        long jUptimeMillis = this.g - SystemClock.uptimeMillis();
        String elapsedTime = jUptimeMillis <= 0 ? null : DateUtils.formatElapsedTime((jUptimeMillis + 999) / 1000);
        if (elapsedTime == null) {
            c();
        } else {
            ((TextView) findViewById(R.id.cooldown_message)).setText(getString(R.string.pairing_request_wait, new Object[]{Integer.valueOf(this.h), elapsedTime}));
            this.a.postDelayed(new bsk(this, 2), 1000L);
        }
    }

    public final void c() {
        findViewById(R.id.cooldown_message).setVisibility(4);
        findViewById(R.id.code).setVisibility(0);
        findViewById(R.id.button_try_again).setVisibility(8);
    }

    @Override // defpackage.coy, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.pairing_code);
        ObjectAnimator objectAnimator = new ObjectAnimator();
        objectAnimator.setFloatValues(0.0f, 1.0f);
        objectAnimator.addUpdateListener(new btz(0));
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setStartDelay(3, 0L);
        layoutTransition.setAnimator(3, objectAnimator);
        ((LinearLayout) findViewById(R.id.layout)).setLayoutTransition(layoutTransition);
        Bundle extras = getIntent().getExtras();
        String string = extras.getString("code");
        String string2 = extras.getString("client_name");
        this.g = extras.getLong("cooldown_timeout", 0L);
        this.h = extras.getInt("failed", 0);
        this.b = (bua) extras.getBinder("cancellation");
        btw btwVar = (btw) extras.getBinder("dismiss");
        this.f = btwVar;
        bsk bskVar = new bsk(this, 3);
        synchronized (btwVar) {
            if (btwVar.b != 2) {
                btwVar.a = bskVar;
            } else {
                btwVar.b = 3;
                bskVar.run();
            }
        }
        ((TextView) findViewById(R.id.explanation)).setText(getString(R.string.explanation, new Object[]{string2}));
        ((TextView) findViewById(R.id.code)).setText(string);
        findViewById(R.id.button_cancel).setOnClickListener(new er(this, 4));
        findViewById(R.id.button_try_again).setOnClickListener(new er(this, 5));
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        this.f.a();
        if (!this.c) {
            a();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected final void onRestart() {
        this.a.removeCallbacksAndMessages(null);
        super.onRestart();
    }

    @Override // android.app.Activity
    protected final void onStart() {
        HdmiPlaybackClient playbackClient;
        adx adxVar = this.d;
        HdmiPlaybackClient.OneTouchPlayCallback oneTouchPlayCallback = new HdmiPlaybackClient.OneTouchPlayCallback() { // from class: bui
            public final void onComplete(int i) {
            }
        };
        Object obj = adxVar.a;
        if (obj != null && (playbackClient = ((HdmiControlManager) obj).getPlaybackClient()) != null) {
            playbackClient.oneTouchPlay(oneTouchPlayCallback);
        }
        super.onStart();
        b();
    }

    @Override // android.app.Activity
    protected final void onStop() {
        Handler handler = this.a;
        handler.removeCallbacksAndMessages(null);
        super.onStop();
        if (d()) {
            handler.postDelayed(new bsk(this, 4), 2000L);
        }
    }
}
