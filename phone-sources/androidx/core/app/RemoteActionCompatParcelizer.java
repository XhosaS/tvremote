package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.glj;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(glj gljVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.a = (IconCompat) gljVar.t(remoteActionCompat.a);
        remoteActionCompat.b = gljVar.d(remoteActionCompat.b, 2);
        remoteActionCompat.c = gljVar.d(remoteActionCompat.c, 3);
        remoteActionCompat.d = (PendingIntent) gljVar.b(remoteActionCompat.d, 4);
        remoteActionCompat.e = gljVar.l(remoteActionCompat.e, 5);
        remoteActionCompat.f = gljVar.l(remoteActionCompat.f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, glj gljVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        gljVar.u(remoteActionCompat.a);
        gljVar.g(remoteActionCompat.b, 2);
        gljVar.g(remoteActionCompat.c, 3);
        gljVar.i(remoteActionCompat.d, 4);
        gljVar.f(remoteActionCompat.e, 5);
        gljVar.f(remoteActionCompat.f, 6);
    }
}
