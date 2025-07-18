package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.bww;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(bww bwwVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.a = (IconCompat) bwwVar.j(remoteActionCompat.a, 1);
        remoteActionCompat.b = bwwVar.l(remoteActionCompat.b, 2);
        remoteActionCompat.c = bwwVar.l(remoteActionCompat.c, 3);
        remoteActionCompat.d = (PendingIntent) bwwVar.g(remoteActionCompat.d, 4);
        remoteActionCompat.e = bwwVar.C(remoteActionCompat.e, 5);
        remoteActionCompat.f = bwwVar.C(remoteActionCompat.f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, bww bwwVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        IconCompat iconCompat = remoteActionCompat.a;
        bwwVar.p(1);
        bwwVar.A(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        bwwVar.p(2);
        bwwVar.u(charSequence);
        CharSequence charSequence2 = remoteActionCompat.c;
        bwwVar.p(3);
        bwwVar.u(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.d;
        bwwVar.p(4);
        bwwVar.x(pendingIntent);
        boolean z = remoteActionCompat.e;
        bwwVar.p(5);
        bwwVar.r(z);
        boolean z2 = remoteActionCompat.f;
        bwwVar.p(6);
        bwwVar.r(z2);
    }
}
