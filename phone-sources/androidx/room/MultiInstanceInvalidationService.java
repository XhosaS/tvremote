package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import defpackage.gek;
import defpackage.gep;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {
    public int a;
    public final Map b = new LinkedHashMap();
    public final RemoteCallbackList c = new gep(this);
    private final gek d = new gek(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        return this.d;
    }
}
