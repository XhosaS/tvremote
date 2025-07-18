package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Process;
import android.util.SparseArray;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class vqa extends Service {
    private zyd a = zxy.a;
    private int b = -1;

    @Override // android.app.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        Iterator it = ((vpz) aehg.a(getApplicationContext(), vpz.class)).ec().e.entrySet().iterator();
        while (it.hasNext()) {
            printWriter.println((String) ((Map.Entry) it.next()).getValue());
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        long j;
        if (this.a.isDone()) {
            return;
        }
        vqj vqjVarEc = ((vpz) aehg.a(getApplicationContext(), vpz.class)).ec();
        int i = this.b;
        AtomicLong atomicLong = vqjVarEc.c;
        int i2 = (int) (atomicLong.get() & 4294967295L);
        if (i == i2) {
            do {
                j = atomicLong.get();
                if (((int) (j & 4294967295L)) != i2) {
                    return;
                }
            } while (!atomicLong.compareAndSet(j, (int) ((r1 + 1) & 4294967295L)));
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, final int i2) {
        zyd zydVar;
        if ((i & 2) == 0 && intent != null) {
            vqj vqjVarEc = ((vpz) aehg.a(getApplicationContext(), vpz.class)).ec();
            yqw.F(intent.hasExtra("EXTRA_FUTURE_INDEX"), "Intent missing extra %s", intent);
            yqw.F(intent.hasExtra("EXTRA_PROCESS_UUID"), "Intent missing extra %s", intent);
            yqw.F(intent.hasExtra("EXTRA_PROCESS_UUID2"), "Intent missing extra %s", intent);
            long longExtra = intent.getLongExtra("EXTRA_PROCESS_UUID", -1L);
            long longExtra2 = intent.getLongExtra("EXTRA_PROCESS_UUID2", -1L);
            UUID uuid = vqjVarEc.h;
            if (uuid.getMostSignificantBits() == longExtra && uuid.getLeastSignificantBits() == longExtra2) {
                int intExtra = intent.getIntExtra("EXTRA_FUTURE_INDEX", -1);
                synchronized (vqjVarEc.d) {
                    SparseArray sparseArray = vqjVarEc.f;
                    zydVar = (zyu) sparseArray.get(intExtra);
                    zydVar.getClass();
                    if (zydVar != vqj.b) {
                        vqjVarEc.g.put(intExtra, zydVar);
                    }
                    sparseArray.remove(intExtra);
                }
            } else {
                ((zdv) ((zdv) vqj.a.b()).q("com/google/apps/tiktok/concurrent/AndroidFuturesServiceCounter", "onStartCommand", 224, "AndroidFuturesServiceCounter.java")).z("Stopping service immediately, intent delivered from previous process. Old PID was %d but current PID is %d", intent.getIntExtra("EXTRA_PROCESS_PID", -1), Process.myPid());
                zydVar = zxy.a;
            }
            this.a = zydVar;
            this.b = intent.getIntExtra("EXTRA_FUTURE_INDEX", -1);
        }
        this.a.d(new Runnable() { // from class: vpy
            @Override // java.lang.Runnable
            public final void run() {
                this.a.stopSelf(i2);
            }
        }, zwk.a);
        return 2;
    }
}
