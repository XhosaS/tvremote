package defpackage;

import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class qeo implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ qeo(Intent intent, qeq qeqVar, ylf ylfVar, long j, int i) {
        this.e = i;
        this.b = intent;
        this.c = qeqVar;
        this.d = ylfVar;
        this.a = j;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, qeq] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, uht] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, qeq] */
    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        int i = this.e;
        if (i == 0) {
            long j = this.a;
            ?? r0 = this.c;
            Intent intent = (Intent) this.b;
            ((tvk) qep.a.e()).v("Executing action in BroadcastReceiver [%s].", intent.getAction());
            osk.ae(r0, intent, (qdo) ((ylf) this.d).a, j);
            return;
        }
        if (i != 1) {
            this.c.run();
            rrx.H(this.b.schedule(this, this.a, (TimeUnit) this.d));
            return;
        }
        tvk tvkVar = (tvk) qep.a.e();
        Intent intent2 = (Intent) this.b;
        tvkVar.v("Executing action in BroadcastReceiver [%s].", intent2.getAction());
        qep.d(intent2, this.c, (qdo) ((ylf) this.d).a, this.a);
    }

    public qeo(Runnable runnable, uht uhtVar, long j, TimeUnit timeUnit, int i) {
        this.e = i;
        this.c = runnable;
        this.b = uhtVar;
        this.a = j;
        this.d = timeUnit;
    }
}
