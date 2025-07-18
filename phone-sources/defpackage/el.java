package defpackage;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
final class el extends MediaSession.Callback {
    final /* synthetic */ em a;

    public el(em emVar) {
        this.a = emVar;
    }

    private final en a() {
        en enVar;
        em emVar = this.a;
        synchronized (emVar.a) {
            enVar = (en) emVar.c.get();
        }
        if (enVar == null || this.a != enVar.a()) {
            return null;
        }
        return enVar;
    }

    private static final void b(en enVar) {
        enVar.d(null);
    }

    private static final void c(en enVar) {
        if (Build.VERSION.SDK_INT < 28) {
            String str = null;
            try {
                MediaSession mediaSession = enVar.a;
                str = (String) mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
            } catch (Exception e) {
                Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e);
            }
            if (true == TextUtils.isEmpty(str)) {
                str = "android.media.session.MediaController";
            }
            enVar.d(new dyg(str, -1, -1));
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        glk glkVar;
        en enVarA = a();
        if (enVarA == null) {
            return;
        }
        eu.c(bundle);
        c(enVarA);
        try {
            if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                Bundle bundle2 = new Bundle();
                et etVar = enVarA.b;
                eb ebVarA = etVar.a();
                bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", ebVarA == null ? null : ebVarA.asBinder());
                synchronized (etVar.a) {
                    glkVar = etVar.d;
                }
                gli.e(bundle2, glkVar);
                resultReceiver.send(0, bundle2);
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
            } else {
                str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT");
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
        }
        b(enVarA);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCustomAction(String str, Bundle bundle) {
        en enVarA = a();
        if (enVarA == null) {
            return;
        }
        eu.c(bundle);
        c(enVarA);
        try {
            if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                eu.c(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
            } else if (!str.equals("android.support.v4.media.session.action.PREPARE")) {
                if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                    bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                    eu.c(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                    bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                    eu.c(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                    eu.c(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                    bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                    bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
                } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                    bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
                } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                    eu.c(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                    bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f);
                } else {
                    this.a.k(str);
                }
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
        }
        b(enVarA);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onFastForward() {
        en enVarA = a();
        if (enVarA == null) {
            return;
        }
        c(enVarA);
        this.a.a();
        b(enVarA);
    }

    @Override // android.media.session.MediaSession.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        en enVarA = a();
        if (enVarA == null) {
            return false;
        }
        c(enVarA);
        boolean zI = this.a.i(intent);
        b(enVarA);
        return zI || super.onMediaButtonEvent(intent);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPause() {
        en enVarA = a();
        if (enVarA == null) {
            return;
        }
        c(enVarA);
        this.a.b();
        b(enVarA);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlay() {
        en enVarA = a();
        if (enVarA == null) {
            return;
        }
        c(enVarA);
        this.a.c();
        b(enVarA);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        en enVarA = a();
        if (enVarA == null) {
            return;
        }
        eu.c(bundle);
        c(enVarA);
        b(enVarA);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromSearch(String str, Bundle bundle) {
        en enVarA = a();
        if (enVarA == null) {
            return;
        }
        eu.c(bundle);
        c(enVarA);
        b(enVarA);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        en enVarA = a();
        if (enVarA == null) {
            return;
        }
        eu.c(bundle);
        c(enVarA);
        b(enVarA);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepare() {
        en enVarA = a();
        if (enVarA == null) {
            return;
        }
        c(enVarA);
        b(enVarA);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        en enVarA = a();
        if (enVarA == null) {
            return;
        }
        eu.c(bundle);
        c(enVarA);
        b(enVarA);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        en enVarA = a();
        if (enVarA == null) {
            return;
        }
        eu.c(bundle);
        c(enVarA);
        b(enVarA);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        en enVarA = a();
        if (enVarA == null) {
            return;
        }
        eu.c(bundle);
        c(enVarA);
        b(enVarA);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onRewind() {
        en enVarA = a();
        if (enVarA == null) {
            return;
        }
        c(enVarA);
        this.a.d();
        b(enVarA);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSeekTo(long j) {
        en enVarA = a();
        if (enVarA == null) {
            return;
        }
        c(enVarA);
        this.a.e(j);
        b(enVarA);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetPlaybackSpeed(float f) {
        en enVarA = a();
        if (enVarA == null) {
            return;
        }
        c(enVarA);
        b(enVarA);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetRating(Rating rating) {
        float f;
        en enVarA = a();
        if (enVarA == null) {
            return;
        }
        c(enVarA);
        if (rating != null) {
            int ratingStyle = rating.getRatingStyle();
            dv dvVar = null;
            if (!rating.isRated()) {
                switch (ratingStyle) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        dvVar = new dv(ratingStyle, -1.0f);
                        break;
                }
            } else {
                switch (ratingStyle) {
                    case 1:
                        dvVar = new dv(1, true != rating.hasHeart() ? 0.0f : 1.0f);
                        break;
                    case 2:
                        dvVar = new dv(2, true != rating.isThumbUp() ? 0.0f : 1.0f);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        float starRating = rating.getStarRating();
                        if (ratingStyle == 3) {
                            f = 3.0f;
                        } else if (ratingStyle == 4) {
                            f = 4.0f;
                        } else if (ratingStyle != 5) {
                            Log.e("Rating", a.cd(ratingStyle, "Invalid rating style (", ") for a star rating"));
                            break;
                        } else {
                            f = 5.0f;
                        }
                        if (starRating >= 0.0f && starRating <= f) {
                            dvVar = new dv(ratingStyle, starRating);
                            break;
                        } else {
                            Log.e("Rating", "Trying to set out of range star-based rating");
                            break;
                        }
                    case 6:
                        float percentRating = rating.getPercentRating();
                        if (percentRating >= 0.0f && percentRating <= 100.0f) {
                            dvVar = new dv(6, percentRating);
                            break;
                        } else {
                            Log.e("Rating", "Invalid percentage-based rating value");
                            break;
                        }
                }
            }
            dvVar.a = rating;
        }
        b(enVarA);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToNext() {
        en enVarA = a();
        if (enVarA == null) {
            return;
        }
        c(enVarA);
        this.a.f();
        b(enVarA);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToPrevious() {
        en enVarA = a();
        if (enVarA == null) {
            return;
        }
        c(enVarA);
        this.a.g();
        b(enVarA);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToQueueItem(long j) {
        en enVarA = a();
        if (enVarA == null) {
            return;
        }
        c(enVarA);
        b(enVarA);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onStop() {
        en enVarA = a();
        if (enVarA == null) {
            return;
        }
        c(enVarA);
        this.a.h();
        b(enVarA);
    }
}
