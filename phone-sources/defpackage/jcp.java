package defpackage;

import android.content.ContentValues;
import android.content.Intent;
import android.os.SystemClock;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jcp implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ jcp(Object obj, long j, Object obj2, int i) {
        this.d = i;
        this.c = obj;
        this.a = j;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v20, types: [fcf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, qeq] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, qeq] */
    @Override // java.lang.Runnable
    public final void run() throws InterruptedException, SecurityException, IllegalArgumentException {
        int i = this.d;
        if (i == 0) {
            jdd jddVar = (jdd) this.b;
            ltw ltwVar = jddVar.ai;
            if (ltwVar == null) {
                yks.c("videoUpdateFunction");
                ltwVar = null;
            }
            long j = this.a;
            if (!((ieg) ltwVar.b(this.c)).m()) {
                ((tug) jdd.a.g().h(tvo.a, "[GTVM-Kinetoscope]").j("com/google/android/apps/googletv/app/player/TvodPlayerFragment", "updateResumePosition$lambda$42", 1808, "TvodPlayerFragment.kt")).u("Failed to upload resume time: %d to server, but updated locally.", j);
                return;
            }
            ((tug) jdd.a.b().h(tvo.a, "[GTVM-Kinetoscope]").j("com/google/android/apps/googletv/app/player/TvodPlayerFragment", "updateResumePosition$lambda$42", 1800, "TvodPlayerFragment.kt")).u("New position updated both locally and remotely: %d.", j);
            long j2 = ynm.a;
            jddVar.D = ylh.p(j, yno.c);
            return;
        }
        if (i == 1) {
            String str = edt.a;
            ((epm) this.b).b.cT(this.c);
            return;
        }
        if (i == 2) {
            Object obj = this.b;
            ((nqq) this.c).g(this.a, (lin) obj, false, "Sending");
            return;
        }
        if (i != 3) {
            if (i != 4) {
                long j3 = this.a;
                ?? r3 = this.c;
                Intent intent = (Intent) this.b;
                ((tvk) qep.a.e()).v("Executing action in Service [%s].", intent.getAction());
                osk.ae(r3, intent, qdo.c(), j3);
                return;
            }
            tvk tvkVar = (tvk) qep.a.e();
            Intent intent2 = (Intent) this.b;
            tvkVar.v("Executing action in Service [%s].", intent2.getAction());
            qep.d(intent2, this.c, qdo.c(), this.a);
            return;
        }
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException unused) {
        }
        Object obj2 = this.b;
        long j4 = this.a;
        Object obj3 = this.c;
        ContentValues contentValues = new ContentValues();
        kso ksoVar = new kso(System.currentTimeMillis(), SystemClock.elapsedRealtime());
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putLong(ksoVar.a);
        byteBufferAllocate.putLong(ksoVar.b);
        contentValues.put("license_activation", byteBufferAllocate.array());
        contentValues.put("license_expiration_timestamp", Long.valueOf(j4));
        contentValues.put("license_force_sync", (Boolean) true);
        lkp lkpVar = (lkp) obj3;
        ktw.u(lkpVar.T, (kuh) obj2, contentValues);
        lkpVar.S = true;
    }

    public /* synthetic */ jcp(Object obj, Object obj2, long j, int i) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = j;
    }
}
