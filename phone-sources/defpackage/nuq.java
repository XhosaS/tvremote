package defpackage;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import j$.util.Objects;
import java.lang.ref.SoftReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class nuq extends BroadcastReceiver {
    public static SoftReference a;
    private static SoftReference b;

    protected abstract int a(Context context, num numVar);

    protected void b(Bundle bundle) {
        throw null;
    }

    public final int c(Intent intent) throws PendingIntent.CanceledException {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if (Objects.equals(intent.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
            b(extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        ExecutorService executorService;
        if (intent == null) {
            return;
        }
        final boolean zIsOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        synchronized (nuq.class) {
            SoftReference softReference = b;
            ExecutorService executorServiceUnconfigurableExecutorService = softReference != null ? (ExecutorService) softReference.get() : null;
            if (executorServiceUnconfigurableExecutorService == null) {
                ocv ocvVar = ogg.a;
                executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new ocy("firebase-iid-executor", 0)));
                b = new SoftReference(executorServiceUnconfigurableExecutorService);
            }
            executorService = executorServiceUnconfigurableExecutorService;
        }
        executorService.execute(new Runnable() { // from class: nup
            @Override // java.lang.Runnable
            public final void run() {
                Executor executorO;
                int iC;
                Intent intent2 = intent;
                BroadcastReceiver.PendingResult pendingResult = pendingResultGoAsync;
                try {
                    Parcelable parcelableExtra = intent2.getParcelableExtra("wrapped_intent");
                    Intent intent3 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    Context context2 = context;
                    nuq nuqVar = this.a;
                    if (intent3 != null) {
                        iC = nuqVar.c(intent3);
                    } else if (intent2.getExtras() == null) {
                        iC = 500;
                    } else {
                        num numVar = new num(intent2);
                        CountDownLatch countDownLatch = new CountDownLatch(1);
                        synchronized (nuq.class) {
                            SoftReference softReference2 = nuq.a;
                            executorO = softReference2 != null ? (Executor) softReference2.get() : null;
                            if (executorO == null) {
                                ocv ocvVar2 = ogg.a;
                                executorO = ocv.o(new ocy("pscm-ack-executor", 0));
                                nuq.a = new SoftReference(executorO);
                            }
                        }
                        executorO.execute(new lke(context2, numVar, countDownLatch, 11, (int[]) null));
                        int iA = nuqVar.a(context2, numVar);
                        try {
                            if (!countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS)) {
                                Log.w("CloudMessagingReceiver", "Message ack timed out");
                            }
                        } catch (InterruptedException e) {
                            Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e.toString()));
                        }
                        iC = iA;
                    }
                    if (zIsOrderedBroadcast && pendingResult != null) {
                        pendingResult.setResultCode(iC);
                    }
                } finally {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                }
            }
        });
    }
}
