package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.Notification;
import android.content.Context;
import android.media.AudioManager;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvb {
    public static AudioManager a;

    public static final dvc a(dvd dvdVar) {
        dvdVar.getClass();
        int iOrdinal = dvdVar.ordinal();
        if (iOrdinal == 2) {
            return dvc.ON_DESTROY;
        }
        if (iOrdinal == 3) {
            return dvc.ON_STOP;
        }
        if (iOrdinal != 4) {
            return null;
        }
        return dvc.ON_PAUSE;
    }

    public static final dvc b(dvd dvdVar) {
        dvdVar.getClass();
        int iOrdinal = dvdVar.ordinal();
        if (iOrdinal == 1) {
            return dvc.ON_CREATE;
        }
        if (iOrdinal == 2) {
            return dvc.ON_START;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return dvc.ON_RESUME;
    }

    public static final dvc c(dvd dvdVar) {
        dvdVar.getClass();
        int iOrdinal = dvdVar.ordinal();
        if (iOrdinal == 2) {
            return dvc.ON_CREATE;
        }
        if (iOrdinal == 3) {
            return dvc.ON_START;
        }
        if (iOrdinal != 4) {
            return null;
        }
        return dvc.ON_RESUME;
    }

    public static final dvf d(dvk dvkVar) {
        AtomicReference atomicReference;
        dvf dvfVar;
        yqp yqpVar;
        dvkVar.getClass();
        dve lifecycle = dvkVar.getLifecycle();
        lifecycle.getClass();
        do {
            atomicReference = (AtomicReference) lifecycle.a.a;
            dvf dvfVar2 = (dvf) atomicReference.get();
            if (dvfVar2 != null) {
                return dvfVar2;
            }
            yqy yqyVar = new yqy(null);
            yot yotVar = ypk.a;
            yqpVar = yxi.a;
            dvfVar = new dvf(lifecycle, wcq.W(yqyVar, yqpVar.i()));
        } while (!a.v(atomicReference, dvfVar));
        ykr.q(dvfVar, yqpVar.i(), 0, new ale(dvfVar, (yih) null, 5), 2);
        return dvfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(Activity activity, dvc dvcVar) {
        dvcVar.getClass();
        if (activity instanceof dvm) {
            ((dvm) activity).a().e(dvcVar);
        } else if (activity instanceof dvk) {
            dve lifecycle = ((dvk) activity).getLifecycle();
            if (lifecycle instanceof dvl) {
                ((dvl) lifecycle).e(dvcVar);
            }
        }
    }

    public static final void f(Activity activity) {
        activity.getClass();
        if (Build.VERSION.SDK_INT >= 29) {
            dwf dwfVar = dwg.Companion;
            dwf.a(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new dwh(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public static final Object g(dve dveVar, dvd dvdVar, yjz yjzVar, yih yihVar) {
        Object objK;
        if (dvdVar != dvd.b) {
            return (dveVar.a() != dvd.a && (objK = yoz.k(new dwe(dveVar, dvdVar, yjzVar, (yih) null, 0), yihVar)) == yio.a) ? objK : ygi.a;
        }
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
    }

    public static final Object h(dvk dvkVar, dvd dvdVar, yjz yjzVar, yih yihVar) {
        Object objG = g(dvkVar.getLifecycle(), dvdVar, yjzVar, yihVar);
        return objG == yio.a ? objG : ygi.a;
    }

    public static synchronized AudioManager i(Context context) {
        Context applicationContext = context.getApplicationContext();
        byte[] bArr = null;
        if (applicationContext != null) {
            a = null;
        }
        AudioManager audioManager = a;
        if (audioManager != null) {
            return audioManager;
        }
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
            shx shxVar = new shx();
            clw.X().execute(new be(applicationContext, shxVar, 18, bArr));
            shxVar.c();
            AudioManager audioManager2 = a;
            audioManager2.getClass();
            return audioManager2;
        }
        AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
        a = audioManager3;
        audioManager3.getClass();
        return audioManager3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:125:0x015e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int j(java.lang.String r2) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvb.j(java.lang.String):int");
    }

    public static int k(Map map) {
        List list = (List) map.get("Content-Type");
        String str = null;
        if (list != null && !list.isEmpty()) {
            str = (String) list.get(0);
        }
        return j(str);
    }

    public static int l(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }

    public static void m(Notification.MediaStyle mediaStyle, int[] iArr, et etVar) {
        if (iArr != null) {
            mediaStyle.setShowActionsInCompactView(iArr);
        }
        if (etVar != null) {
            mediaStyle.setMediaSession((MediaSession.Token) etVar.b);
        }
    }
}
