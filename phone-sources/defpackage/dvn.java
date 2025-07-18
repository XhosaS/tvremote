package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dvn extends Service implements dvk {
    private final ivx a = new ivx(this);

    @Override // defpackage.dvk
    public final dve getLifecycle() {
        return (dve) this.a.a;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        this.a.j(dvc.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.a.j(dvc.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        ivx ivxVar = this.a;
        ivxVar.j(dvc.ON_STOP);
        ivxVar.j(dvc.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    @yfp
    public final void onStart(Intent intent, int i) {
        this.a.j(dvc.ON_START);
        super.onStart(intent, i);
    }
}
