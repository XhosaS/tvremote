package defpackage;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class frv extends MediaSession.Callback {
    final /* synthetic */ frw a;

    public frv(frw frwVar) {
        this.a = frwVar;
    }

    private final frx a() {
        frx frxVar;
        frw frwVar = this.a;
        synchronized (frwVar.o) {
            frxVar = (frx) frwVar.q.get();
        }
        if (frxVar == null || this.a != frxVar.b()) {
            return null;
        }
        return frxVar;
    }

    private static final void b(frx frxVar) {
        frxVar.d(null);
    }

    private static final void c(frx frxVar) {
        if (Build.VERSION.SDK_INT < 28) {
            String str = null;
            try {
                MediaSession mediaSession = frxVar.a;
                str = (String) mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
            } catch (Exception e) {
                Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e);
            }
            if (true == TextUtils.isEmpty(str)) {
                str = "android.media.session.MediaController";
            }
            frxVar.d(new fsf(str, -1, -1));
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        glk glkVar;
        frx frxVarA = a();
        if (frxVarA == null) {
            return;
        }
        fse.d(bundle);
        c(frxVarA);
        try {
            fsb fsbVar = null;
            IBinder iBinderAsBinder = null;
            fsbVar = null;
            if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                if (resultReceiver != null) {
                    Bundle bundle2 = new Bundle();
                    fsd fsdVar = frxVarA.b;
                    frn frnVarA = fsdVar.a();
                    if (frnVarA != null) {
                        iBinderAsBinder = frnVarA.asBinder();
                    }
                    bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", iBinderAsBinder);
                    synchronized (fsdVar.a) {
                        glkVar = fsdVar.d;
                    }
                    gli.e(bundle2, glkVar);
                    resultReceiver.send(0, bundle2);
                }
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                if (bundle != null) {
                    this.a.g((frs) fus.t(bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), frs.CREATOR));
                }
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                if (bundle != null) {
                    this.a.h((frs) fus.t(bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), frs.CREATOR), bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                }
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                if (bundle != null) {
                    this.a.u((frs) fus.t(bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), frs.CREATOR));
                }
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                List list = frxVarA.g;
                if (list != null && bundle != null) {
                    int i = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                    if (i >= 0 && i < list.size()) {
                        fsbVar = (fsb) list.get(i);
                    }
                    if (fsbVar != null) {
                        this.a.u(fsbVar.a);
                    }
                }
            } else {
                this.a.i(str, bundle, resultReceiver);
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
        }
        b(frxVarA);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCustomAction(String str, Bundle bundle) {
        frx frxVarA = a();
        if (frxVarA == null) {
            return;
        }
        fse.d(bundle);
        c(frxVarA);
        try {
            if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                if (bundle != null) {
                    Uri uri = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                    Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                    fse.d(bundle2);
                    this.a.p(uri, bundle2);
                }
            } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                this.a.q();
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                if (bundle != null) {
                    String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                    Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                    fse.d(bundle3);
                    this.a.r(string, bundle3);
                }
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                if (bundle != null) {
                    String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                    Bundle bundle4 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                    fse.d(bundle4);
                    this.a.s(string2, bundle4);
                }
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                if (bundle != null) {
                    Uri uri2 = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                    Bundle bundle5 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                    fse.d(bundle5);
                    this.a.t(uri2, bundle5);
                }
            } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                if (bundle != null) {
                    bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                }
            } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                if (bundle != null) {
                    this.a.z(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                }
            } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                if (bundle != null) {
                    this.a.A(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                }
            } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                if (bundle != null) {
                    fsm fsmVar = (fsm) fus.t(bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING"), fsm.CREATOR);
                    fse.d(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                    this.a.J(fsmVar);
                }
            } else if (!str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                this.a.j(str, bundle);
            } else if (bundle != null) {
                this.a.x(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
        }
        b(frxVarA);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onFastForward() {
        frx frxVarA = a();
        if (frxVarA == null) {
            return;
        }
        c(frxVarA);
        this.a.k();
        b(frxVarA);
    }

    @Override // android.media.session.MediaSession.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        frx frxVarA = a();
        if (frxVarA == null) {
            return false;
        }
        c(frxVarA);
        boolean zI = this.a.I(intent);
        b(frxVarA);
        return zI || super.onMediaButtonEvent(intent);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPause() {
        frx frxVarA = a();
        if (frxVarA == null) {
            return;
        }
        c(frxVarA);
        this.a.l();
        b(frxVarA);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlay() {
        frx frxVarA = a();
        if (frxVarA == null) {
            return;
        }
        c(frxVarA);
        this.a.m();
        b(frxVarA);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        frx frxVarA = a();
        if (frxVarA == null) {
            return;
        }
        fse.d(bundle);
        c(frxVarA);
        this.a.n(str, bundle);
        b(frxVarA);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromSearch(String str, Bundle bundle) {
        frx frxVarA = a();
        if (frxVarA == null) {
            return;
        }
        fse.d(bundle);
        c(frxVarA);
        this.a.o(str, bundle);
        b(frxVarA);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        frx frxVarA = a();
        if (frxVarA == null) {
            return;
        }
        fse.d(bundle);
        c(frxVarA);
        this.a.p(uri, bundle);
        b(frxVarA);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepare() {
        frx frxVarA = a();
        if (frxVarA == null) {
            return;
        }
        c(frxVarA);
        this.a.q();
        b(frxVarA);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        frx frxVarA = a();
        if (frxVarA == null) {
            return;
        }
        fse.d(bundle);
        c(frxVarA);
        this.a.r(str, bundle);
        b(frxVarA);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        frx frxVarA = a();
        if (frxVarA == null) {
            return;
        }
        fse.d(bundle);
        c(frxVarA);
        this.a.s(str, bundle);
        b(frxVarA);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        frx frxVarA = a();
        if (frxVarA == null) {
            return;
        }
        fse.d(bundle);
        c(frxVarA);
        this.a.t(uri, bundle);
        b(frxVarA);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onRewind() {
        frx frxVarA = a();
        if (frxVarA == null) {
            return;
        }
        c(frxVarA);
        this.a.v();
        b(frxVarA);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSeekTo(long j) {
        frx frxVarA = a();
        if (frxVarA == null) {
            return;
        }
        c(frxVarA);
        this.a.w(j);
        b(frxVarA);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetPlaybackSpeed(float f) {
        frx frxVarA = a();
        if (frxVarA == null) {
            return;
        }
        c(frxVarA);
        this.a.x(f);
        b(frxVarA);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetRating(Rating rating) {
        frx frxVarA = a();
        if (frxVarA == null) {
            return;
        }
        c(frxVarA);
        frw frwVar = this.a;
        fsm fsmVarG = null;
        if (rating != null) {
            int ratingStyle = rating.getRatingStyle();
            if (rating.isRated()) {
                switch (ratingStyle) {
                    case 1:
                        fsmVarG = fsm.c(rating.hasHeart());
                        break;
                    case 2:
                        fsmVarG = fsm.f(rating.isThumbUp());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        fsmVarG = fsm.e(ratingStyle, rating.getStarRating());
                        break;
                    case 6:
                        fsmVarG = fsm.d(rating.getPercentRating());
                        break;
                }
            } else {
                fsmVarG = fsm.g(ratingStyle);
            }
            fsmVarG.getClass();
            fsmVarG.b = rating;
        }
        frwVar.y(fsmVarG);
        b(frxVarA);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToNext() {
        frx frxVarA = a();
        if (frxVarA == null) {
            return;
        }
        c(frxVarA);
        this.a.B();
        b(frxVarA);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToPrevious() {
        frx frxVarA = a();
        if (frxVarA == null) {
            return;
        }
        c(frxVarA);
        this.a.C();
        b(frxVarA);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToQueueItem(long j) {
        frx frxVarA = a();
        if (frxVarA == null) {
            return;
        }
        c(frxVarA);
        this.a.D(j);
        b(frxVarA);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onStop() {
        frx frxVarA = a();
        if (frxVarA == null) {
            return;
        }
        c(frxVarA);
        this.a.E();
        b(frxVarA);
    }
}
