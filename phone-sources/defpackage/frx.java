package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class frx {
    public final MediaSession a;
    final fsd b;
    final Bundle d;
    fsl f;
    List g;
    frt h;
    public int i;
    public int j;
    frw k;
    fsf l;
    public final frm m;
    public final Object c = new Object();
    public final RemoteCallbackList e = new RemoteCallbackList();

    public frx(Context context, String str, Bundle bundle) {
        MediaSession mediaSessionA = a(context, str, bundle);
        this.a = mediaSessionA;
        frm frmVar = new frm(this);
        this.m = frmVar;
        this.b = new fsd(mediaSessionA.getSessionToken(), frmVar);
        this.d = bundle;
        e(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final frw b() {
        frw frwVar;
        synchronized (this.c) {
            frwVar = this.k;
        }
        return frwVar;
    }

    public fsf c() {
        fsf fsfVar;
        synchronized (this.c) {
            fsfVar = this.l;
        }
        return fsfVar;
    }

    public void d(fsf fsfVar) {
        synchronized (this.c) {
            this.l = fsfVar;
        }
    }

    public final void e(int i) {
        this.a.setFlags(i | 3);
    }

    public final void f(PendingIntent pendingIntent) {
        this.a.setMediaButtonReceiver(pendingIntent);
    }

    public void g(int i) {
        throw null;
    }
}
