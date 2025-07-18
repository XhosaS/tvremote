package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fse {
    public final Object a;
    public final Object b;

    public fse(fwq fwqVar) {
        this.b = "type";
        this.a = fwqVar;
    }

    public static final hnv E(ImageDecoder.Source source, int i, int i2, hll hllVar) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new hqy(i, i2, hllVar));
        if (eo$$ExternalSyntheticApiModelOutline0.m$1(drawableDecodeDrawable)) {
            return new hsz(eo$$ExternalSyntheticApiModelOutline0.m351m((Object) drawableDecodeDrawable), 2);
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: ".concat(String.valueOf(String.valueOf(drawableDecodeDrawable))));
    }

    public static final boolean F(ImageHeaderParser$ImageType imageHeaderParser$ImageType) {
        if (imageHeaderParser$ImageType != ImageHeaderParser$ImageType.ANIMATED_WEBP) {
            return Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageType == ImageHeaderParser$ImageType.ANIMATED_AVIF;
        }
        return true;
    }

    private static void O(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    private final synchronized List P(String str) {
        ?? r0 = this.a;
        if (!r0.contains(str)) {
            r0.add(str);
        }
        ?? r02 = this.b;
        List list = (List) r02.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        r02.put(str, arrayList);
        return arrayList;
    }

    public static Bundle a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        d(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public static void d(Bundle bundle) {
        if (bundle != null) {
            ClassLoader classLoader = fse.class.getClassLoader();
            classLoader.getClass();
            bundle.setClassLoader(classLoader);
        }
    }

    public static final gzq q(gzu gzuVar, Throwable th) {
        gzuVar.getClass();
        if (th instanceof gzx) {
            gzo gzoVar = har.a;
        } else {
            gzo gzoVar2 = har.a;
        }
        return new gzq(gzuVar, th);
    }

    public static final boolean r(gzu gzuVar, Bitmap.Config config) {
        config.getClass();
        return !hjs.E(config) || gzuVar.j;
    }

    public static /* synthetic */ List s(String str, String str2, gic gicVar) {
        gicVar.getClass();
        ghi ghiVarA = gicVar.a(str);
        try {
            ghiVarA.i(1, str2);
            ArrayList arrayList = new ArrayList();
            while (ghiVarA.l()) {
                arrayList.add(ghiVarA.d(0));
            }
            return arrayList;
        } finally {
            ghiVarA.close();
        }
    }

    public static /* synthetic */ ygi t(String str, String str2, int i, gic gicVar) {
        gicVar.getClass();
        ghi ghiVarA = gicVar.a(str);
        try {
            ghiVarA.i(1, str2);
            ghiVarA.g(2, i);
            ghiVarA.l();
            ghiVarA.close();
            return ygi.a;
        } catch (Throwable th) {
            ghiVarA.close();
            throw th;
        }
    }

    public static /* synthetic */ ygi u(String str, String str2, gic gicVar) {
        gicVar.getClass();
        ghi ghiVarA = gicVar.a(str);
        try {
            ghiVarA.i(1, str2);
            ghiVarA.l();
            ghiVarA.close();
            return ygi.a;
        } catch (Throwable th) {
            ghiVarA.close();
            throw th;
        }
    }

    public static /* synthetic */ int v(String str, String str2, gic gicVar) {
        gicVar.getClass();
        ghi ghiVarA = gicVar.a(str);
        try {
            ghiVarA.i(1, str2);
            ghiVarA.l();
            return gez.K(gicVar);
        } finally {
            ghiVarA.close();
        }
    }

    public static /* synthetic */ List w(String str, gic gicVar) {
        int i;
        int i2;
        Integer numValueOf;
        gicVar.getClass();
        ghi ghiVarA = gicVar.a(str);
        try {
            int iJ = gez.J(ghiVarA, "id");
            int iJ2 = gez.J(ghiVarA, "state");
            int iJ3 = gez.J(ghiVarA, "worker_class_name");
            int iJ4 = gez.J(ghiVarA, "input_merger_class_name");
            int iJ5 = gez.J(ghiVarA, "input");
            int iJ6 = gez.J(ghiVarA, "output");
            int iJ7 = gez.J(ghiVarA, "initial_delay");
            int iJ8 = gez.J(ghiVarA, "interval_duration");
            int iJ9 = gez.J(ghiVarA, "flex_duration");
            int iJ10 = gez.J(ghiVarA, "run_attempt_count");
            int iJ11 = gez.J(ghiVarA, "backoff_policy");
            int iJ12 = gez.J(ghiVarA, "backoff_delay_duration");
            int iJ13 = gez.J(ghiVarA, "last_enqueue_time");
            int iJ14 = gez.J(ghiVarA, "minimum_retention_duration");
            int iJ15 = gez.J(ghiVarA, "schedule_requested_at");
            int iJ16 = gez.J(ghiVarA, "run_in_foreground");
            int iJ17 = gez.J(ghiVarA, "out_of_quota_policy");
            int iJ18 = gez.J(ghiVarA, "period_count");
            int iJ19 = gez.J(ghiVarA, "generation");
            int iJ20 = gez.J(ghiVarA, "next_schedule_time_override");
            int iJ21 = gez.J(ghiVarA, "next_schedule_time_override_generation");
            int iJ22 = gez.J(ghiVarA, "stop_reason");
            int iJ23 = gez.J(ghiVarA, "trace_tag");
            int iJ24 = gez.J(ghiVarA, "backoff_on_system_interruptions");
            int iJ25 = gez.J(ghiVarA, "required_network_type");
            int iJ26 = gez.J(ghiVarA, "required_network_request");
            int iJ27 = gez.J(ghiVarA, "requires_charging");
            int iJ28 = gez.J(ghiVarA, "requires_device_idle");
            int iJ29 = gez.J(ghiVarA, "requires_battery_not_low");
            int iJ30 = gez.J(ghiVarA, "requires_storage_not_low");
            int iJ31 = gez.J(ghiVarA, "trigger_content_update_delay");
            int iJ32 = gez.J(ghiVarA, "trigger_max_content_delay");
            int iJ33 = gez.J(ghiVarA, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (ghiVarA.l()) {
                String strD = ghiVarA.d(iJ);
                int i3 = iJ14;
                ArrayList arrayList2 = arrayList;
                gpx gpxVarAB = fki.aB((int) ghiVarA.b(iJ2));
                String strD2 = ghiVarA.d(iJ3);
                String strD3 = ghiVarA.d(iJ4);
                byte[] bArrM = ghiVarA.m(iJ5);
                gox goxVar = gox.a;
                gox goxVarW = gli.w(bArrM);
                gox goxVarW2 = gli.w(ghiVarA.m(iJ6));
                long jB = ghiVarA.b(iJ7);
                long jB2 = ghiVarA.b(iJ8);
                long jB3 = ghiVarA.b(iJ9);
                int iB = (int) ghiVarA.b(iJ10);
                int i4 = iJ2;
                int i5 = iJ3;
                int iAJ = fki.aJ((int) ghiVarA.b(iJ11));
                long jB4 = ghiVarA.b(iJ12);
                long jB5 = ghiVarA.b(iJ13);
                long jB6 = ghiVarA.b(i3);
                int i6 = iJ15;
                long jB7 = ghiVarA.b(i6);
                int i7 = iJ;
                int i8 = iJ16;
                boolean z = ((int) ghiVarA.b(i8)) != 0;
                int i9 = iJ17;
                int i10 = iJ4;
                int iAL = fki.aL((int) ghiVarA.b(i9));
                int i11 = iJ18;
                int i12 = iJ5;
                int iB2 = (int) ghiVarA.b(i11);
                int i13 = iJ19;
                int iB3 = (int) ghiVarA.b(i13);
                int i14 = iJ20;
                long jB8 = ghiVarA.b(i14);
                int i15 = iJ21;
                int iB4 = (int) ghiVarA.b(i15);
                int i16 = iJ22;
                int iB5 = (int) ghiVarA.b(i16);
                int i17 = iJ23;
                Boolean boolValueOf = null;
                String strD4 = ghiVarA.k(i17) ? null : ghiVarA.d(i17);
                int i18 = iJ24;
                if (ghiVarA.k(i18)) {
                    i = iB4;
                    i2 = i16;
                    numValueOf = null;
                } else {
                    i = iB4;
                    i2 = i16;
                    numValueOf = Integer.valueOf((int) ghiVarA.b(i18));
                }
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                int i19 = iJ25;
                Boolean bool = boolValueOf;
                int iAK = fki.aK((int) ghiVarA.b(i19));
                int i20 = iJ26;
                gvm gvmVarAC = fki.aC(ghiVarA.m(i20));
                iJ25 = i19;
                iJ26 = i20;
                int i21 = iJ27;
                boolean z2 = ((int) ghiVarA.b(i21)) != 0;
                iJ27 = i21;
                int i22 = iJ28;
                boolean z3 = ((int) ghiVarA.b(i22)) != 0;
                int i23 = iJ29;
                boolean z4 = ((int) ghiVarA.b(i23)) != 0;
                iJ29 = i23;
                int i24 = iJ30;
                int i25 = iJ31;
                int i26 = iJ32;
                int i27 = iJ33;
                iJ33 = i27;
                arrayList2.add(new guw(strD, gpxVarAB, strD2, strD3, goxVarW, goxVarW2, jB, jB2, jB3, new gou(gvmVarAC, iAK, z2, z3, z4, ((int) ghiVarA.b(i24)) != 0, ghiVarA.b(i25), ghiVarA.b(i26), fki.aD(ghiVarA.m(i27))), iB, iAJ, jB4, jB5, jB6, jB7, z, iAL, iB2, iB3, jB8, i, iB5, strD4, bool));
                iJ30 = i24;
                iJ4 = i10;
                iJ17 = i9;
                iJ19 = i13;
                iJ22 = i2;
                iJ24 = i18;
                iJ31 = i25;
                iJ32 = i26;
                iJ2 = i4;
                iJ14 = i3;
                iJ3 = i5;
                arrayList = arrayList2;
                iJ = i7;
                iJ15 = i6;
                iJ16 = i8;
                iJ20 = i14;
                iJ21 = i15;
                iJ23 = i17;
                iJ28 = i22;
                iJ5 = i12;
                iJ18 = i11;
            }
            return arrayList;
        } finally {
            ghiVarA.close();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final synchronized void A(List list) {
        ?? r1 = this.a;
        ArrayList arrayList = new ArrayList((Collection) r1);
        r1.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r1.add((String) it.next());
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            if (!list.contains(str)) {
                r1.add(str);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [hod, java.lang.Object] */
    public final void B(Bitmap bitmap) {
        this.b.d(bitmap);
    }

    public final void C(byte[] bArr) {
        ((hok) this.a).c(bArr);
    }

    public final byte[] D(int i) {
        return (byte[]) ((hok) this.a).a(i, byte[].class);
    }

    public final synchronized List G(Class cls) {
        return ((hqk) this.b).c(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final synchronized List H(Class cls) {
        ?? r0 = ((hfw) this.a).a;
        hfw hfwVar = (hfw) r0.get(cls);
        ?? r1 = hfwVar == null ? 0 : hfwVar.a;
        if (r1 != 0) {
            return r1;
        }
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((hqk) this.b).b(cls));
        if (((hfw) r0.put(cls, new hfw(listUnmodifiableList))) == null) {
            return listUnmodifiableList;
        }
        throw new IllegalStateException("Already cached loaders for model: ".concat(String.valueOf(String.valueOf(cls))));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Map] */
    public final synchronized void I(Class cls, Class cls2, hqg hqgVar) {
        ((hqk) this.b).d(cls, cls2, hqgVar);
        ((hfw) this.a).a.clear();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [cuj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [cuj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [cuj, java.lang.Object] */
    public final String J(hlg hlgVar) {
        String str;
        Object obj = this.b;
        synchronized (obj) {
            str = (String) ((hwl) obj).g(hlgVar);
        }
        if (str == null) {
            hoz hozVar = (hoz) this.a.a();
            hju.p(hozVar);
            try {
                MessageDigest messageDigest = hozVar.a;
                hlgVar.a(messageDigest);
                byte[] bArrDigest = messageDigest.digest();
                char[] cArr = hwp.b;
                synchronized (cArr) {
                    for (int i = 0; i < bArrDigest.length; i++) {
                        byte b = bArrDigest[i];
                        int i2 = i + i;
                        char[] cArr2 = hwp.a;
                        cArr[i2] = cArr2[(b & 255) >>> 4];
                        cArr[i2 + 1] = cArr2[b & 15];
                    }
                    str = new String(cArr);
                }
            } finally {
                this.a.b(hozVar);
            }
        }
        Object obj2 = this.b;
        synchronized (obj2) {
            ((hwl) obj2).h(hlgVar, str);
        }
        return str;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.concurrent.locks.Lock] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, java.util.Queue] */
    public final void K(String str) {
        zlj zljVar;
        synchronized (this) {
            ?? r1 = this.b;
            zljVar = (zlj) r1.get(str);
            hju.p(zljVar);
            int i = zljVar.a;
            if (i <= 0) {
                throw new IllegalStateException(a.cy(i, str, "Cannot release a lock that is not held, safeKey: ", ", interestedThreads: "));
            }
            int i2 = i - 1;
            zljVar.a = i2;
            if (i2 == 0) {
                zlj zljVar2 = (zlj) r1.remove(str);
                if (!zljVar2.equals(zljVar)) {
                    throw new IllegalStateException("Removed the wrong lock, expected to remove: " + zljVar.toString() + ", but actually removed: " + String.valueOf(zljVar2) + ", safeKey: " + str);
                }
                ?? r6 = ((hfx) this.a).a;
                synchronized (r6) {
                    if (r6.size() < 10) {
                        r6.offer(zljVar2);
                    }
                }
            }
        }
        zljVar.b.unlock();
    }

    public final /* synthetic */ void L(cb cbVar) {
        N(cbVar, null);
    }

    public final void M(cb cbVar, int i) {
        ((isy) this.b).q(new gvr((gqr) this.a, cbVar, false, i));
    }

    public final void N(cb cbVar, fki fkiVar) {
        ((isy) this.b).q(new bd(this, cbVar, fkiVar, 13));
    }

    public final fsd b() {
        return ((frx) this.b).b;
    }

    public final fsf c() {
        return ((frx) this.b).c();
    }

    public final void e(frw frwVar, Handler handler) {
        Object obj = this.b;
        synchronized (((frx) obj).c) {
            ((frx) obj).k = frwVar;
            ((frx) obj).a.setCallback(frwVar.p, handler);
            synchronized (frwVar.o) {
                frwVar.q = new WeakReference(obj);
                fru fruVar = frwVar.r;
                fru fruVar2 = null;
                if (fruVar != null) {
                    fruVar.removeCallbacksAndMessages(null);
                }
                if (handler != null) {
                    fruVar2 = new fru(frwVar, handler.getLooper());
                }
                frwVar.r = fruVar2;
            }
        }
    }

    public final void f(Bundle bundle) {
        ((frx) this.b).a.setExtras(bundle);
    }

    public final void g(PendingIntent pendingIntent) {
        ((frx) this.b).f(pendingIntent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(frt frtVar) {
        frx frxVar = (frx) this.b;
        frxVar.h = frtVar;
        if (frtVar.d == null) {
            MediaMetadata.Builder builder = new MediaMetadata.Builder();
            Bundle bundle = frtVar.c;
            for (String str : bundle.keySet()) {
                Integer num = (Integer) frt.a.get(str);
                if (num == null) {
                    num = -1;
                }
                int iIntValue = num.intValue();
                if (iIntValue == 0) {
                    builder.putLong(str, bundle.getLong(str));
                } else if (iIntValue == 1) {
                    builder.putText(str, bundle.getString(str));
                } else if (iIntValue == 2) {
                    builder.putBitmap(str, (Bitmap) bundle.getParcelable(str));
                } else if (iIntValue != 3) {
                    Object obj = bundle.get(str);
                    if (obj == null || (obj instanceof CharSequence)) {
                        builder.putText(str, (CharSequence) obj);
                    } else if (obj instanceof Long) {
                        builder.putLong(str, ((Long) obj).longValue());
                    }
                } else {
                    builder.putRating(str, (Rating) bundle.getParcelable(str));
                }
            }
            frtVar.d = builder.build();
        }
        frxVar.a.setMetadata(frtVar.d);
    }

    public final void i(fsl fslVar) {
        Object obj = this.b;
        frx frxVar = (frx) obj;
        frxVar.f = fslVar;
        synchronized (frxVar.c) {
            RemoteCallbackList remoteCallbackList = ((frx) obj).e;
            for (int iBeginBroadcast = remoteCallbackList.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                try {
                    ((frk) remoteCallbackList.getBroadcastItem(iBeginBroadcast)).a(fslVar);
                } catch (RemoteException | SecurityException e) {
                    Log.e("MediaSessionCompat", "Dead object in setPlaybackState.", e);
                }
            }
            ((frx) obj).e.finishBroadcast();
        }
        MediaSession mediaSession = frxVar.a;
        if (fslVar.l == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(fslVar.a, fslVar.b, fslVar.d, fslVar.h);
            builder.setBufferedPosition(fslVar.c);
            builder.setActions(fslVar.e);
            builder.setErrorMessage(fslVar.g);
            for (fsk fskVar : fslVar.i) {
                PlaybackState.CustomAction customActionBuild = fskVar.e;
                if (customActionBuild == null) {
                    PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(fskVar.a, fskVar.b, fskVar.c);
                    builder2.setExtras(fskVar.d);
                    customActionBuild = builder2.build();
                }
                if (customActionBuild != null) {
                    builder.addCustomAction(customActionBuild);
                }
            }
            builder.setActiveQueueItemId(fslVar.j);
            builder.setExtras(fslVar.k);
            fslVar.l = builder.build();
        }
        mediaSession.setPlaybackState(fslVar.l);
    }

    public final void j(int i) {
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setLegacyStreamType(i);
        ((frx) this.b).a.setPlaybackToLocal(builder.build());
    }

    public final void k(List list) {
        if (list != null) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                long j = ((fsb) it.next()).b;
                Long lValueOf = Long.valueOf(j);
                if (hashSet.contains(lValueOf)) {
                    Log.e("MediaSessionCompat", a.cs(j, "Found duplicate queue id: "), new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(lValueOf);
            }
        }
        frx frxVar = (frx) this.b;
        frxVar.g = list;
        if (list == null) {
            frxVar.a.setQueue(null);
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            fsb fsbVar = (fsb) it2.next();
            MediaSession.QueueItem queueItem = fsbVar.c;
            if (queueItem == null) {
                fsbVar.c = new MediaSession.QueueItem(fsbVar.a.a(), fsbVar.b);
                queueItem = fsbVar.c;
            }
            arrayList.add(queueItem);
        }
        frxVar.a.setQueue(arrayList);
    }

    public final void l(int i) {
        ((frx) this.b).g(i);
    }

    public final boolean m() {
        return ((frx) this.b).a.isActive();
    }

    public final boolean n(fsg fsgVar, String str) {
        int i = fsgVar.b;
        if (i < 0) {
            return ((Context) this.b).getPackageManager().checkPermission(str, fsgVar.a) == 0;
        }
        return ((Context) this.b).checkPermission(str, i, fsgVar.c) == 0;
    }

    public final byte[] o(ffu ffuVar) throws IOException {
        Object obj = this.b;
        ((ByteArrayOutputStream) obj).reset();
        try {
            Object obj2 = this.a;
            O((DataOutputStream) obj2, ffuVar.a);
            String str = ffuVar.b;
            if (str == null) {
                str = "";
            }
            O((DataOutputStream) obj2, str);
            ((DataOutputStream) obj2).writeLong(ffuVar.c);
            ((DataOutputStream) obj2).writeLong(ffuVar.d);
            ((DataOutputStream) obj2).write(ffuVar.e);
            ((DataOutputStream) obj2).flush();
            return ((ByteArrayOutputStream) obj).toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [fdk, java.lang.Object] */
    public final fdp p(Object... objArr) {
        Constructor constructorA;
        Object obj = this.b;
        synchronized (obj) {
            if (!((AtomicBoolean) obj).get()) {
                try {
                    constructorA = this.a.a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.b).set(true);
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            constructorA = null;
        }
        if (constructorA == null) {
            return null;
        }
        try {
            return (fdp) constructorA.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized List x(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            List<jzs> list = (List) this.b.get((String) it.next());
            if (list != null) {
                for (jzs jzsVar : list) {
                    if (jzsVar.g(cls, cls2)) {
                        arrayList.add(jzsVar.a);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized List y(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            List<jzs> list = (List) this.b.get((String) it.next());
            if (list != null) {
                for (jzs jzsVar : list) {
                    if (jzsVar.g(cls, cls2)) {
                        Object obj = jzsVar.c;
                        if (!arrayList.contains(obj)) {
                            arrayList.add(obj);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized void z(String str, hln hlnVar, Class cls, Class cls2) {
        P(str).add(new jzs(cls, cls2, hlnVar));
    }

    public fse(Class cls, hkw hkwVar) {
        this.a = cls;
        this.b = hkwVar;
    }

    public fse(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public fse(Object obj, Object obj2, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
    }

    public fse(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            componentName = componentName == null ? a.aa(context) : componentName;
            if (componentName != null && pendingIntent == null) {
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setComponent(componentName);
                pendingIntent = PendingIntent.getBroadcast(context, 0, intent, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
            }
            if (Build.VERSION.SDK_INT >= 29) {
                this.b = new fsa(context, str, bundle);
            } else if (Build.VERSION.SDK_INT >= 28) {
                this.b = new frz(context, str, bundle);
            } else {
                this.b = new fry(context, str, bundle);
            }
            Looper looperMyLooper = Looper.myLooper();
            e(new frw(), new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper));
            ((frx) this.b).f(pendingIntent);
            this.a = new dxc(context, b());
            return;
        }
        throw new IllegalArgumentException("tag must not be null or empty");
    }

    public fse(fdk fdkVar) {
        this.a = fdkVar;
        this.b = new AtomicBoolean(false);
    }

    public fse(gqr gqrVar, isy isyVar) {
        gqrVar.getClass();
        isyVar.getClass();
        this.a = gqrVar;
        this.b = isyVar;
    }

    public fse(hba hbaVar) {
        hbaVar.getClass();
        this.a = hbaVar;
        boolean z = hao.a;
        this.b = (Build.VERSION.SDK_INT < 26 || hao.a) ? new hax(false) : (Build.VERSION.SDK_INT == 26 || Build.VERSION.SDK_INT == 27) ? new hay() : new hax(true);
    }

    public fse(byte[] bArr, byte[] bArr2) {
        this.b = new AtomicReference();
        this.a = new ir();
    }

    public fse() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.b = byteArrayOutputStream;
        this.a = new DataOutputStream(byteArrayOutputStream);
    }

    public fse(String str, String str2, char[] cArr) {
        str2.getClass();
        this.b = str;
        this.a = str2;
    }

    public fse(hda hdaVar) {
        this.a = new ArrayList();
        this.b = hdaVar;
    }

    public fse(String str, String str2, byte[] bArr) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public fse(byte[] bArr) {
        this.a = new ArrayList();
        this.b = new HashMap();
    }

    public fse(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public fse(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = new HashMap();
        this.a = new hfx();
    }

    public fse(char[] cArr) {
        this.b = new hwl(1000L);
        this.a = hww.a(10, new hoy(0));
    }

    public fse(cuj cujVar) {
        hqk hqkVar = new hqk(cujVar);
        this.a = new hfw((byte[]) null, (char[]) null, (byte[]) null);
        this.b = hqkVar;
    }

    public fse(Context context) {
        this.b = context;
        this.a = context.getContentResolver();
    }
}
