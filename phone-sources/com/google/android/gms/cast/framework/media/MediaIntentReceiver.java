package com.google.android.gms.cast.framework.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import defpackage.nlm;
import defpackage.nmg;
import defpackage.nmq;
import defpackage.nnl;
import defpackage.nnm;
import defpackage.nqj;
import defpackage.nsf;
import defpackage.ocv;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MediaIntentReceiver extends BroadcastReceiver {
    public static final String ACTION_DISCONNECT = "com.google.android.gms.cast.framework.action.DISCONNECT";
    public static final String ACTION_FORWARD = "com.google.android.gms.cast.framework.action.FORWARD";
    public static final String ACTION_REWIND = "com.google.android.gms.cast.framework.action.REWIND";
    public static final String ACTION_SKIP_NEXT = "com.google.android.gms.cast.framework.action.SKIP_NEXT";
    public static final String ACTION_SKIP_PREV = "com.google.android.gms.cast.framework.action.SKIP_PREV";
    public static final String ACTION_STOP_CASTING = "com.google.android.gms.cast.framework.action.STOP_CASTING";
    public static final String ACTION_TOGGLE_PLAYBACK = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK";
    public static final String EXTRA_SKIP_STEP_MS = "googlecast-extra_skip_step_ms";
    private static final String TAG = "MediaIntentReceiver";
    private static final nsf log = new nsf(TAG);

    private static nqj getRemoteMediaClient(nmq nmqVar) {
        if (nmqVar == null || !nmqVar.s()) {
            return null;
        }
        return nmqVar.d();
    }

    private void seek(nmq nmqVar, long j) {
        nqj remoteMediaClient;
        if (j == 0 || (remoteMediaClient = getRemoteMediaClient(nmqVar)) == null || remoteMediaClient.s() || remoteMediaClient.x()) {
            return;
        }
        remoteMediaClient.F(new nlm(remoteMediaClient.c() + j));
    }

    private void togglePlayback(nmq nmqVar) {
        nqj remoteMediaClient = getRemoteMediaClient(nmqVar);
        if (remoteMediaClient == null) {
            return;
        }
        remoteMediaClient.n();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        nnm nnmVarH;
        nnl nnlVarB;
        String action = intent.getAction();
        nsf.e();
        if (action == null || (nnlVarB = (nnmVarH = nmg.d(context).h()).b()) == null) {
            return;
        }
        switch (action.hashCode()) {
            case -1699820260:
                if (action.equals(ACTION_REWIND)) {
                    onReceiveActionRewind(nnlVarB, intent.getLongExtra(EXTRA_SKIP_STEP_MS, 0L));
                    return;
                }
                break;
            case -945151566:
                if (action.equals(ACTION_SKIP_NEXT)) {
                    onReceiveActionSkipNext(nnlVarB);
                    return;
                }
                break;
            case -945080078:
                if (action.equals(ACTION_SKIP_PREV)) {
                    onReceiveActionSkipPrev(nnlVarB);
                    return;
                }
                break;
            case -668151673:
                if (action.equals(ACTION_STOP_CASTING)) {
                    nnmVarH.d(true);
                    return;
                }
                break;
            case -124479363:
                if (action.equals(ACTION_DISCONNECT)) {
                    nnmVarH.d(false);
                    return;
                }
                break;
            case 235550565:
                if (action.equals(ACTION_TOGGLE_PLAYBACK)) {
                    onReceiveActionTogglePlayback(nnlVarB);
                    return;
                }
                break;
            case 1362116196:
                if (action.equals(ACTION_FORWARD)) {
                    onReceiveActionForward(nnlVarB, intent.getLongExtra(EXTRA_SKIP_STEP_MS, 0L));
                    return;
                }
                break;
            case 1997055314:
                if (action.equals("android.intent.action.MEDIA_BUTTON")) {
                    onReceiveActionMediaButton(nnlVarB, intent);
                    return;
                }
                break;
        }
        onReceiveOtherAction(context, action, intent);
    }

    protected void onReceiveActionForward(nnl nnlVar, long j) {
        if (nnlVar instanceof nmq) {
            seek((nmq) nnlVar, j);
        }
    }

    protected void onReceiveActionMediaButton(nnl nnlVar, Intent intent) {
        if ((nnlVar instanceof nmq) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Bundle extras = intent.getExtras();
            ocv.aF(extras);
            KeyEvent keyEvent = (KeyEvent) extras.get("android.intent.extra.KEY_EVENT");
            if (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 85) {
                togglePlayback((nmq) nnlVar);
            }
        }
    }

    protected void onReceiveActionRewind(nnl nnlVar, long j) {
        if (nnlVar instanceof nmq) {
            seek((nmq) nnlVar, -j);
        }
    }

    protected void onReceiveActionSkipNext(nnl nnlVar) {
        nqj remoteMediaClient;
        if (!(nnlVar instanceof nmq) || (remoteMediaClient = getRemoteMediaClient((nmq) nnlVar)) == null || remoteMediaClient.x()) {
            return;
        }
        remoteMediaClient.C();
    }

    protected void onReceiveActionSkipPrev(nnl nnlVar) {
        nqj remoteMediaClient;
        if (!(nnlVar instanceof nmq) || (remoteMediaClient = getRemoteMediaClient((nmq) nnlVar)) == null || remoteMediaClient.x()) {
            return;
        }
        remoteMediaClient.D();
    }

    protected void onReceiveActionTogglePlayback(nnl nnlVar) {
        if (nnlVar instanceof nmq) {
            togglePlayback((nmq) nnlVar);
        }
    }

    protected void onReceiveOtherAction(Context context, String str, Intent intent) {
    }

    @Deprecated
    protected void onReceiveOtherAction(String str, Intent intent) {
        onReceiveOtherAction(null, str, intent);
    }
}
