package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bcq extends Service implements bcl {
    private final bdz a = new bdz(this);

    @Override // defpackage.bcl
    public final bcg ek() {
        return this.a.a;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        intent.getClass();
        this.a.a(bce.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.a.a(bce.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        bdz bdzVar = this.a;
        bdzVar.a(bce.ON_STOP);
        bdzVar.a(bce.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        this.a.a(bce.ON_START);
        super.onStart(intent, i);
    }
}
