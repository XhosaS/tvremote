package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajo {
    public static final Object a = new Object();
    public static volatile ajo b;

    public ajo() {
        new ConcurrentHashMap();
    }

    public static void a(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }
}
