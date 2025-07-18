package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import j$.util.DesugarCollections;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class eu {
    static int a;
    public final Object b;
    public final Object c;
    private final Object d;

    public eu(Context context, et etVar) {
        if (etVar == null) {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        this.d = DesugarCollections.synchronizedSet(new HashSet());
        this.c = etVar;
        if (Build.VERSION.SDK_INT >= 29) {
            this.b = new gag(context, etVar);
        } else {
            this.b = new gag(context, etVar);
        }
    }

    public static Bundle a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        c(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public static void c(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(eu.class.getClassLoader());
        }
    }

    public final et b() {
        return ((en) this.c).b;
    }

    public final void d() throws NoSuchFieldException {
        Object obj = this.c;
        en enVar = (en) obj;
        enVar.d.kill();
        if (Build.VERSION.SDK_INT == 27) {
            try {
                MediaSession mediaSession = ((en) obj).a;
                Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                declaredField.setAccessible(true);
                Handler handler = (Handler) declaredField.get(mediaSession);
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
            } catch (Exception e) {
                Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e);
            }
        }
        MediaSession mediaSession2 = enVar.a;
        mediaSession2.setCallback(null);
        enVar.i.a.set(null);
        mediaSession2.release();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    public final void e(boolean z) {
        ((en) this.c).a.setActive(z);
        ?? r4 = this.d;
        int size = r4.size();
        for (int i = 0; i < size; i++) {
            ((eq) r4.get(i)).a();
        }
    }

    public final void f(em emVar) {
        g(emVar, null);
    }

    public final void g(em emVar, Handler handler) {
        if (emVar == null) {
            ((en) this.c).c(null, null);
            return;
        }
        Object obj = this.c;
        if (handler == null) {
            handler = new Handler();
        }
        ((en) obj).c(emVar, handler);
    }

    public final void h(du duVar) {
        en enVar = (en) this.c;
        enVar.f = duVar;
        if (duVar.c == null) {
            Parcel parcelObtain = Parcel.obtain();
            duVar.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            duVar.c = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(parcelObtain);
            parcelObtain.recycle();
        }
        enVar.a.setMetadata(duVar.c);
    }

    public final void i(ey eyVar) {
        PlaybackState playbackState;
        Object obj = this.c;
        en enVar = (en) obj;
        enVar.e = eyVar;
        synchronized (enVar.c) {
            RemoteCallbackList remoteCallbackList = ((en) obj).d;
            int iBeginBroadcast = remoteCallbackList.beginBroadcast();
            while (true) {
                iBeginBroadcast--;
                if (iBeginBroadcast < 0) {
                    break;
                } else {
                    try {
                        ((dy) remoteCallbackList.getBroadcastItem(iBeginBroadcast)).a(eyVar);
                    } catch (RemoteException unused) {
                    }
                }
            }
            ((en) obj).d.finishBroadcast();
        }
        MediaSession mediaSession = enVar.a;
        if (eyVar == null) {
            playbackState = null;
        } else {
            if (eyVar.l == null) {
                PlaybackState.Builder builder = new PlaybackState.Builder();
                builder.setState(eyVar.a, eyVar.b, eyVar.d, eyVar.h);
                builder.setBufferedPosition(eyVar.c);
                builder.setActions(eyVar.e);
                builder.setErrorMessage(eyVar.g);
                for (ex exVar : eyVar.i) {
                    PlaybackState.CustomAction customActionBuild = exVar.e;
                    if (customActionBuild == null) {
                        PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(exVar.a, exVar.b, exVar.c);
                        builder2.setExtras(exVar.d);
                        customActionBuild = builder2.build();
                    }
                    builder.addCustomAction(customActionBuild);
                }
                builder.setActiveQueueItemId(eyVar.j);
                builder.setExtras(eyVar.k);
                eyVar.l = builder.build();
            }
            playbackState = eyVar.l;
        }
        mediaSession.setPlaybackState(playbackState);
    }

    public final void j(PendingIntent pendingIntent) {
        ((en) this.c).a.setSessionActivity(pendingIntent);
    }

    public final void k() {
        ((en) this.c).f();
    }

    public final du l() {
        MediaMetadata metadata = ((MediaController) ((gag) this.b).c).getMetadata();
        if (metadata != null) {
            return du.c(metadata);
        }
        return null;
    }

    public final ei m() {
        MediaController.TransportControls transportControls = ((MediaController) ((gag) this.b).c).getTransportControls();
        return Build.VERSION.SDK_INT >= 29 ? new ej(transportControls) : new ej(transportControls);
    }

    public final ey n() {
        gag gagVar = (gag) this.b;
        Object obj = gagVar.b;
        if (((et) obj).a() != null) {
            try {
                return ((et) obj).a().a();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e);
            }
        }
        PlaybackState playbackState = ((MediaController) gagVar.c).getPlaybackState();
        if (playbackState == null) {
            return null;
        }
        return ey.a(playbackState);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    public final void o(ee eeVar) {
        if (eeVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (!this.d.add(eeVar)) {
            Log.w("MediaControllerCompat", "the callback has already been registered");
            return;
        }
        Handler handler = new Handler();
        eeVar.b(handler);
        Object obj = this.b;
        gag gagVar = (gag) obj;
        ((MediaController) gagVar.c).registerCallback(eeVar.a, handler);
        synchronized (gagVar.e) {
            Object obj2 = ((gag) obj).b;
            if (((et) obj2).a() != null) {
                eg egVar = new eg(eeVar);
                ((HashMap) ((gag) obj).d).put(eeVar, egVar);
                eeVar.c = egVar;
                try {
                    ((et) obj2).a().b(egVar);
                    eeVar.a(13, null, null);
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                }
            } else {
                eeVar.c = null;
                ((gag) obj).a.add(eeVar);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, java.util.List] */
    public final void p(ee eeVar) {
        if (eeVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (!this.d.remove(eeVar)) {
            Log.w("MediaControllerCompat", "the callback has never been registered");
            return;
        }
        try {
            Object obj = this.b;
            ((MediaController) ((gag) obj).c).unregisterCallback(eeVar.a);
            synchronized (((gag) obj).e) {
                Object obj2 = ((gag) obj).b;
                if (((et) obj2).a() != null) {
                    try {
                        eg egVar = (eg) ((HashMap) ((gag) obj).d).remove(eeVar);
                        if (egVar != null) {
                            eeVar.c = null;
                            ((et) obj2).a().c(egVar);
                        }
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e);
                    }
                }
                ((gag) obj).a.remove(eeVar);
            }
        } finally {
            eeVar.b(null);
        }
    }

    public eu(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        this.d = new ArrayList();
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                if (componentName == null && (componentName = a.aa(context)) == null) {
                    Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
                }
                if (componentName != null && pendingIntent == null) {
                    Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                    intent.setComponent(componentName);
                    pendingIntent = PendingIntent.getBroadcast(context, 0, intent, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    this.c = new ep(context, str);
                } else if (Build.VERSION.SDK_INT >= 28) {
                    this.c = new eo(context, str);
                } else {
                    this.c = new en(context, str);
                }
                g(new liu(null), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
                ((en) this.c).a.setMediaButtonReceiver(pendingIntent);
                this.b = new eu(context, b());
                if (a == 0) {
                    a = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        throw new IllegalArgumentException("context must not be null");
    }
}
