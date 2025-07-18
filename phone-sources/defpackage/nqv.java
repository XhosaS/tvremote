package defpackage;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.ReconnectionService;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nqv {
    public static final nsf a = new nsf("MediaSessionManager");
    public final Context b;
    public final nmj c;
    public final noo d;
    public final nnm e;
    public final npk f;
    public final ComponentName g;
    public final nql h;
    public final nql i;
    public nqj j;
    public CastDevice k;
    public eu l;
    public em m;
    public boolean n;
    public final npj o;
    private final ComponentName p;
    private nqr q;
    private final Handler r;
    private final Runnable s;
    private ex t;
    private ex u;
    private ex v;
    private ex w;

    public nqv(Context context, nmj nmjVar, noo nooVar) {
        npk npkVar;
        this.b = context;
        this.c = nmjVar;
        this.d = nooVar;
        nmg nmgVarC = nmg.c();
        nqr nqrVar = null;
        this.e = nmgVarC != null ? nmgVarC.h() : null;
        now nowVar = nmjVar.h;
        this.f = nowVar == null ? null : nowVar.c;
        this.o = new nqu(this);
        String str = nowVar == null ? null : nowVar.b;
        this.p = !TextUtils.isEmpty(str) ? new ComponentName(context, str) : null;
        String str2 = nowVar == null ? null : nowVar.a;
        this.g = !TextUtils.isEmpty(str2) ? new ComponentName(context, str2) : null;
        nql nqlVar = new nql(context);
        this.h = nqlVar;
        nqlVar.c = new nqs(this, 1);
        nql nqlVar2 = new nql(context);
        this.i = nqlVar2;
        nqlVar2.c = new nqs(this, 0);
        this.r = new ogh(Looper.getMainLooper());
        nsf nsfVar = nqr.a;
        now nowVar2 = nmjVar.h;
        if (nowVar2 != null && (npkVar = nowVar2.c) != null) {
            npb npbVar = npkVar.G;
            if (npbVar == null) {
                nqrVar = new nqr(context);
            } else {
                List listE = nqw.e(npbVar);
                int[] iArrF = nqw.f(npbVar);
                int size = listE == null ? 0 : listE.size();
                if (listE == null || listE.isEmpty()) {
                    nqr.a.b("npj".concat(" doesn't provide any action."), new Object[0]);
                } else if (listE.size() > 5) {
                    nqr.a.b("npj".concat(" provides more than 5 actions."), new Object[0]);
                } else if (iArrF == null || (iArrF.length) == 0) {
                    nqr.a.b("npj".concat(" doesn't provide any actions for compact view."), new Object[0]);
                } else {
                    for (int i : iArrF) {
                        if (i < 0 || i >= size) {
                            nqr.a.b("npj".concat("provides a compact view action whose index is out of bounds."), new Object[0]);
                            break;
                        }
                    }
                    nqrVar = new nqr(context);
                }
            }
        }
        this.q = nqrVar;
        this.s = new mpz(this, 19);
    }

    private final long g(String str, int i, Bundle bundle) {
        Integer numD;
        Integer numD2;
        long j;
        int iHashCode = str.hashCode();
        if (iHashCode != -945151566) {
            if (iHashCode != -945080078) {
                if (iHashCode == 235550565 && str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK)) {
                    if (i == 3) {
                        j = 514;
                        i = 3;
                    } else {
                        j = 512;
                    }
                    if (i != 2) {
                        return j;
                    }
                    return 516L;
                }
            } else if (str.equals(MediaIntentReceiver.ACTION_SKIP_PREV)) {
                nqj nqjVar = this.j;
                if (nqjVar != null && nqjVar.q()) {
                    nln nlnVarH = nqjVar.h();
                    ocv.aF(nlnVarH);
                    if (nlnVarH.e(128L) || nlnVarH.p != 0 || ((numD2 = nlnVarH.d(nlnVarH.c)) != null && numD2.intValue() > 0)) {
                        return 16L;
                    }
                }
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
                return 0L;
            }
        } else if (str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT)) {
            nqj nqjVar2 = this.j;
            if (nqjVar2 != null && nqjVar2.q()) {
                nln nlnVarH2 = nqjVar2.h();
                ocv.aF(nlnVarH2);
                if (nlnVarH2.e(64L) || nlnVarH2.p != 0 || ((numD = nlnVarH2.d(nlnVarH2.c)) != null && numD.intValue() < nlnVarH2.b() - 1)) {
                    return 32L;
                }
            }
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        }
        return 0L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void h(defpackage.ew r9, java.lang.String r10, defpackage.npi r11) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nqv.h(ew, java.lang.String, npi):void");
    }

    private static final boolean i(String str) {
        return TextUtils.equals(str, MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_PREV) || TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_NEXT);
    }

    private final Uri j(nli nliVar) {
        now nowVar = this.c.h;
        oak oakVarB = (nowVar == null ? null : nowVar.a()) != null ? npd.b(nliVar) : nliVar.d() ? (oak) nliVar.a.get(0) : null;
        if (oakVarB == null) {
            return null;
        }
        return oakVarB.b;
    }

    private final nhl k() {
        eu euVar = this.l;
        du duVarL = euVar == null ? null : ((eu) euVar.b).l();
        return duVarL == null ? new nhl() : new nhl(duVarL);
    }

    final void a(Bitmap bitmap, int i) {
        eu euVar = this.l;
        if (euVar == null) {
            return;
        }
        if (bitmap == null || bitmap.getWidth() <= 1 || bitmap.getHeight() <= 1) {
            bitmap = Bitmap.createBitmap(2, 2, Bitmap.Config.ARGB_8888);
            bitmap.eraseColor(0);
        }
        nhl nhlVarK = k();
        nhlVarK.f(i == 0 ? "android.media.metadata.DISPLAY_ICON" : "android.media.metadata.ALBUM_ART", bitmap);
        euVar.h(nhlVarK.e());
    }

    public final void b(boolean z) {
        if (this.c.i) {
            Runnable runnable = this.s;
            if (runnable != null) {
                this.r.removeCallbacks(runnable);
            }
            Context context = this.b;
            Intent intent = new Intent(context, (Class<?>) ReconnectionService.class);
            intent.setPackage(context.getPackageName());
            try {
                context.startService(intent);
            } catch (IllegalStateException unused) {
                if (z) {
                    this.r.postDelayed(this.s, 1000L);
                }
            }
        }
    }

    public final void c() {
        nqr nqrVar = this.q;
        if (nqrVar != null) {
            nsf.e();
            nqrVar.d.a();
            NotificationManager notificationManager = nqrVar.b;
            if (notificationManager != null) {
                notificationManager.cancel("castMediaNotification", 1);
            }
        }
    }

    public final void d() {
        if (this.c.i) {
            this.r.removeCallbacks(this.s);
            Context context = this.b;
            Intent intent = new Intent(context, (Class<?>) ReconnectionService.class);
            intent.setPackage(context.getPackageName());
            context.stopService(intent);
        }
    }

    public final void e(int i, MediaInfo mediaInfo) throws Resources.NotFoundException {
        ey eyVarA;
        eu euVar;
        nli nliVar;
        PendingIntent activity;
        eu euVar2 = this.l;
        if (euVar2 == null) {
            return;
        }
        Bundle bundle = new Bundle();
        ew ewVar = new ew();
        nqj nqjVar = this.j;
        if (nqjVar == null || this.q == null) {
            eyVarA = ewVar.a();
        } else {
            ewVar.d(i, (nqjVar.a() == 0 || nqjVar.s()) ? 0L : nqjVar.c());
            if (i == 0) {
                eyVarA = ewVar.a();
            } else {
                npk npkVar = this.f;
                npb npbVar = npkVar != null ? npkVar.G : null;
                nqj nqjVar2 = this.j;
                long jG = (nqjVar2 == null || nqjVar2.s() || this.j.x()) ? 0L : 256L;
                if (npbVar != null) {
                    List<npi> listE = nqw.e(npbVar);
                    if (listE != null) {
                        for (npi npiVar : listE) {
                            String str = npiVar.a;
                            if (i(str)) {
                                jG |= g(str, i, bundle);
                            } else {
                                h(ewVar, str, npiVar);
                            }
                        }
                    }
                } else if (npkVar != null) {
                    for (String str2 : npkVar.c) {
                        if (i(str2)) {
                            jG |= g(str2, i, bundle);
                        } else {
                            h(ewVar, str2, null);
                        }
                    }
                }
                ewVar.a = jG;
                eyVarA = ewVar.a();
            }
        }
        euVar2.i(eyVarA);
        npk npkVar2 = this.f;
        if (npkVar2 != null && npkVar2.H) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
        }
        if (npkVar2 != null && npkVar2.I) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        }
        if (bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS") || bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
            ((en) euVar2.c).a.setExtras(bundle);
        }
        if (i == 0) {
            euVar2.h(new nhl().e());
            return;
        }
        if (this.j != null) {
            ComponentName componentName = this.p;
            if (componentName == null) {
                activity = null;
            } else {
                Intent intent = new Intent();
                intent.setComponent(componentName);
                activity = PendingIntent.getActivity(this.b, 0, intent, 201326592);
            }
            if (activity != null) {
                euVar2.j(activity);
            }
        }
        nqj nqjVar3 = this.j;
        if (nqjVar3 == null || (euVar = this.l) == null || mediaInfo == null || (nliVar = mediaInfo.c) == null) {
            return;
        }
        long j = nqjVar3.s() ? 0L : mediaInfo.d;
        String strA = nliVar.a("com.google.android.gms.cast.metadata.TITLE");
        String strA2 = nliVar.a("com.google.android.gms.cast.metadata.SUBTITLE");
        nhl nhlVarK = k();
        nhlVarK.g(j);
        if (strA != null) {
            nhlVarK.h("android.media.metadata.TITLE", strA);
            nhlVarK.h("android.media.metadata.DISPLAY_TITLE", strA);
        }
        if (strA2 != null) {
            nhlVarK.h("android.media.metadata.DISPLAY_SUBTITLE", strA2);
        }
        euVar.h(nhlVarK.e());
        Uri uriJ = j(nliVar);
        if (uriJ != null) {
            this.h.b(uriJ);
        } else {
            a(null, 0);
        }
        Uri uriJ2 = j(nliVar);
        if (uriJ2 != null) {
            this.i.b(uriJ2);
        } else {
            a(null, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nqv.f():void");
    }
}
