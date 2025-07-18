package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqz implements bqr {
    public static final cbt a = cbt.k("com/google/android/tv/remote/service/audio/provider/PfdAudioWrapper");
    public static final dln j = new dln(0, (byte[]) null);
    public static final dln k = new dln(0, (byte[]) null);
    public final bqy b;
    public final int f;
    public final String g;
    public bqq h;
    private Runnable l;
    private Thread m;
    private ParcelFileDescriptor n;
    public final LinkedBlockingQueue i = new LinkedBlockingQueue();
    public final IBinder c = new Binder();
    public final CountDownLatch e = new CountDownLatch(1);
    public final bqk d = new bqk(16000);

    public bqz(bqy bqyVar, int i, String str, Runnable runnable) {
        this.b = bqyVar;
        this.f = i;
        this.g = str;
        this.l = runnable;
    }

    public static final ParcelFileDescriptor[] h() {
        try {
            return ParcelFileDescriptor.createPipe();
        } catch (IOException unused) {
            ((cbs) a.g().j("com/google/android/tv/remote/service/audio/provider/PfdAudioWrapper", "prepare", 91, "PfdAudioWrapper.java")).p("Unable to create Pipe pair");
            return null;
        }
    }

    @Override // defpackage.bqr
    public final int a() {
        return this.f;
    }

    @Override // defpackage.bqr
    public final void b(boolean z) {
        if (z) {
            this.i.add(k);
        } else {
            this.i.add(j);
        }
        this.b.a(this.c);
    }

    @Override // defpackage.bqr
    public final boolean c() {
        return false;
    }

    @Override // defpackage.bqr
    public final void d(dln dlnVar) {
        this.i.add(dlnVar);
    }

    public final synchronized ParcelFileDescriptor e() {
        ParcelFileDescriptor parcelFileDescriptor;
        parcelFileDescriptor = this.n;
        this.n = null;
        this.l = null;
        this.e.countDown();
        return parcelFileDescriptor;
    }

    public final void f(ParcelFileDescriptor[] parcelFileDescriptorArr) {
        this.n = parcelFileDescriptorArr[0];
        Thread thread = new Thread(new ame(this, parcelFileDescriptorArr[1], 20, null));
        this.m = thread;
        thread.setName("AudioFileWriter");
        this.m.start();
    }

    public final synchronized boolean g() {
        ParcelFileDescriptor parcelFileDescriptor;
        try {
            parcelFileDescriptor = this.n;
        } catch (IOException e) {
            ((cbs) a.g().j("com/google/android/tv/remote/service/audio/provider/PfdAudioWrapper", "clearPfdOutput", 152, "PfdAudioWrapper.java")).t("Unable to close pipe: %s", e.getMessage());
        }
        if (parcelFileDescriptor == null) {
            return false;
        }
        try {
            this.n = null;
            this.l.run();
            this.l = null;
            ((cbs) a.g().j("com/google/android/tv/remote/service/audio/provider/PfdAudioWrapper", "clearPfdOutput", 148, "PfdAudioWrapper.java")).s("PFD was not requested within %d seconds. Closing...", TimeUnit.MILLISECONDS.toSeconds(15000L));
            parcelFileDescriptor.close();
            return true;
        } catch (Throwable th) {
            try {
                parcelFileDescriptor.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
