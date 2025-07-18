package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import j$.time.Duration;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class feg implements fed {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/common/handler/KatnissIpcConnection");
    static final Duration b = Duration.ofSeconds(15);
    public final Context c;
    public final String e;
    private final zyh g;
    private final String h;
    private zyd i;
    public final Queue d = new ArrayDeque();
    private Messenger j = null;
    public int f = 1;

    public feg(String str, Context context, zyh zyhVar) {
        this.h = str;
        this.c = context;
        this.g = zyhVar;
        this.e = str.substring(str.lastIndexOf(46));
    }

    private final synchronized void c() {
        zyd zydVar = this.i;
        if (zydVar != null) {
            zydVar.cancel(false);
        }
        zyh zyhVar = this.g;
        vqi.d("com/google/android/apps/tvsearch/common/handler/KatnissIpcConnection", "sendAllEnqueuedMessages", 189, zyhVar.submit(wyo.h(new Runnable() { // from class: fee
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b();
            }
        })), "Failed to send enqueued messages.", new Object[0]);
        this.i = zyhVar.schedule(wyo.h(new Runnable() { // from class: fef
            @Override // java.lang.Runnable
            public final void run() {
                feg fegVar = this.a;
                synchronized (fegVar) {
                    String str = fegVar.e;
                    Queue queue = fegVar.d;
                    if (!queue.isEmpty()) {
                        ((zdv) ((zdv) feg.a.b()).q("com/google/android/apps/tvsearch/common/handler/KatnissIpcConnection", "sendAllEnqueuedMessages", 202, "KatnissIpcConnection.java")).u("Dropping out-of-date messages.");
                    }
                    queue.clear();
                    int i = fegVar.f;
                    if (i == 3 || i == 2) {
                        ((zdv) ((zdv) feg.a.b()).q("com/google/android/apps/tvsearch/common/handler/KatnissIpcConnection", "sendAllEnqueuedMessages", 206, "KatnissIpcConnection.java")).x("Will disconnect service connection. %s", str);
                        fegVar.f = 4;
                        try {
                            fegVar.c.unbindService(fegVar);
                        } catch (IllegalArgumentException e) {
                            ((zdv) ((zdv) ((zdv) feg.a.d()).p(e)).q("com/google/android/apps/tvsearch/common/handler/KatnissIpcConnection", "sendAllEnqueuedMessages", 212, "KatnissIpcConnection.java")).u("Unbind service failed, might already been unbound.");
                        }
                    }
                }
            }
        }), b.toSeconds(), TimeUnit.SECONDS);
    }

    private final synchronized void d(Messenger messenger) {
        this.j = messenger;
    }

    private final synchronized void e() {
        int i = this.f;
        if (i != 3 && i != 2) {
            this.f = 2;
            Intent intent = new Intent();
            Context context = this.c;
            intent.setClassName(context, this.h);
            ((zdv) ((zdv) a.b()).q("com/google/android/apps/tvsearch/common/handler/KatnissIpcConnection", "startConnection", 122, "KatnissIpcConnection.java")).x("Starting the connection to the target service. %s", this.e);
            context.bindService(intent, this, 65);
            return;
        }
        ((zdv) ((zdv) a.b()).q("com/google/android/apps/tvsearch/common/handler/KatnissIpcConnection", "startConnection", 116, "KatnissIpcConnection.java")).v("Current state: %s, ignoring request to start connection.", this.f);
    }

    @Override // defpackage.fed
    public final synchronized void a(Message message) {
        this.d.add(message);
        int i = this.f;
        if (i != 1) {
            if (i == 3) {
                c();
                return;
            } else if (i != 4) {
                return;
            }
        }
        e();
    }

    public final /* synthetic */ void b() {
        synchronized (this) {
            while (true) {
                Queue queue = this.d;
                if (queue.isEmpty()) {
                    return;
                }
                Messenger messenger = this.j;
                if (messenger == null) {
                    ((zdv) ((zdv) a.b()).q("com/google/android/apps/tvsearch/common/handler/KatnissIpcConnection", "sendAllEnqueuedMessages", 162, "KatnissIpcConnection.java")).u("Attempted to send message with null messenger. Ignoring.");
                    return;
                }
                try {
                    messenger.send((Message) queue.peek());
                    queue.poll();
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException e) {
                    ((zdv) ((zdv) ((zdv) a.d()).p(e)).q("com/google/android/apps/tvsearch/common/handler/KatnissIpcConnection", "sendAllEnqueuedMessages", 179, "KatnissIpcConnection.java")).u("Message could not be sent. Keeping message as enqueued.");
                    return;
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ((zdv) ((zdv) a.b()).q("com/google/android/apps/tvsearch/common/handler/KatnissIpcConnection", "onServiceConnected", 97, "KatnissIpcConnection.java")).x("Service is connected. %s", this.e);
        this.f = 3;
        d(new Messenger(iBinder));
        c();
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        ((zdv) ((zdv) a.b()).q("com/google/android/apps/tvsearch/common/handler/KatnissIpcConnection", "onServiceDisconnected", 105, "KatnissIpcConnection.java")).x("Service disconnected: %s", this.e);
        this.f = 1;
        d(null);
    }
}
