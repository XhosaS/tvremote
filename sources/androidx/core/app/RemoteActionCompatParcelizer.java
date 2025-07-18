package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.acf;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(acf acfVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.a = (IconCompat) acfVar.t(remoteActionCompat.a);
        remoteActionCompat.b = acfVar.d(remoteActionCompat.b, 2);
        remoteActionCompat.c = acfVar.d(remoteActionCompat.c, 3);
        remoteActionCompat.d = (PendingIntent) acfVar.b(remoteActionCompat.d, 4);
        remoteActionCompat.e = acfVar.l(remoteActionCompat.e, 5);
        remoteActionCompat.f = acfVar.l(remoteActionCompat.f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, acf acfVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        acfVar.u(remoteActionCompat.a);
        acfVar.g(remoteActionCompat.b, 2);
        acfVar.g(remoteActionCompat.c, 3);
        acfVar.i(remoteActionCompat.d, 4);
        acfVar.f(remoteActionCompat.e, 5);
        acfVar.f(remoteActionCompat.f, 6);
    }
}
