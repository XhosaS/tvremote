package defpackage;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class upd implements Callable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ upd(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, uos uosVar, uoq uoqVar, int i) {
        this.f = i;
        this.a = context;
        this.b = scheduledExecutorService;
        this.c = firebaseMessaging;
        this.d = uosVar;
        this.e = uoqVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, nnj] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.concurrent.Executor, java.util.concurrent.ScheduledExecutorService] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (this.f == 0) {
            ?? r7 = this.b;
            Context context = this.a;
            int i = upe.e;
            Object obj = this.e;
            Object obj2 = this.d;
            return new upe((FirebaseMessaging) this.c, (uos) obj2, upc.b(context, r7), (uoq) obj, context, r7);
        }
        Object obj3 = this.b;
        Object obj4 = this.d;
        ?? r2 = this.e;
        Object obj5 = this.c;
        Context context2 = this.a;
        synchronized (nmg.a) {
            if (nmg.b == null) {
                nmg.b = new nmg(context2, (nmj) obj5, r2.getAdditionalSessionProviders(context2), (noo) obj4, (nrn) obj3);
            }
        }
        return nmg.b;
    }

    public /* synthetic */ upd(Context context, nmj nmjVar, nnj nnjVar, noo nooVar, nrn nrnVar, int i) {
        this.f = i;
        this.a = context;
        this.c = nmjVar;
        this.e = nnjVar;
        this.d = nooVar;
        this.b = nrnVar;
    }
}
