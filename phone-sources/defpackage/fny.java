package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.util.Log;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fny {
    private static final Object b = new Object();
    private static final HashMap c = new HashMap();
    public final foo a;

    public fny(Context context, String str, eao eaoVar, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, fnt fntVar, Bundle bundle, Bundle bundle2, ecl eclVar) throws Throwable {
        synchronized (b) {
            try {
            } catch (Throwable th) {
                th = th;
            }
            try {
                HashMap map = c;
                if (map.containsKey(str)) {
                    throw new IllegalStateException(a.cr(str, "Session ID must be unique. ID="));
                }
                map.put(str, this);
                this.a = a(context, str, eaoVar, immutableList, immutableList2, immutableList3, fntVar, bundle, bundle2, eclVar);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public foo a(Context context, String str, eao eaoVar, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, fnt fntVar, Bundle bundle, Bundle bundle2, ecl eclVar) {
        return new foo(this, context, str, eaoVar, immutableList, immutableList2, immutableList3, fntVar, bundle, bundle2, eclVar);
    }

    public final void b() throws NoSuchFieldException {
        try {
            synchronized (b) {
                c.remove(this.a.h);
            }
            foo fooVar = this.a;
            edb.h("Release " + Integer.toHexString(System.identityHashCode(fooVar)) + " [AndroidXMedia3/1.8.0-alpha01] [" + edt.a + "] [" + dzz.a() + "]");
            synchronized (fooVar.a) {
                if (fooVar.s) {
                    return;
                }
                fooVar.s = true;
                fooVar.d.a();
                Handler handler = fooVar.k;
                handler.removeCallbacksAndMessages(null);
                try {
                    edt.aB(handler, new emy(fooVar, 20));
                } catch (Exception e) {
                    edb.f("MediaSessionImpl", "Exception thrown while closing", e);
                }
                fph fphVar = fooVar.g;
                if (Build.VERSION.SDK_INT < 31) {
                    ComponentName componentName = fphVar.f;
                    if (componentName == null) {
                        fphVar.d.g(null);
                    } else {
                        foo fooVar2 = fphVar.b;
                        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", fooVar2.b);
                        intent.setComponent(componentName);
                        fphVar.d.g(PendingIntent.getBroadcast(fooVar2.f, 0, intent, fph.a));
                    }
                }
                fpf fpfVar = fphVar.e;
                if (fpfVar != null) {
                    fphVar.b.f.unregisterReceiver(fpfVar);
                }
                Object obj = fphVar.d.b;
                ((frx) obj).e.kill();
                if (Build.VERSION.SDK_INT == 27) {
                    try {
                        MediaSession mediaSession = ((frx) obj).a;
                        Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                        declaredField.setAccessible(true);
                        Handler handler2 = (Handler) declaredField.get(mediaSession);
                        if (handler2 != null) {
                            handler2.removeCallbacksAndMessages(null);
                        }
                    } catch (Exception e2) {
                        Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e2);
                    }
                }
                MediaSession mediaSession2 = ((frx) obj).a;
                mediaSession2.setCallback(null);
                ((frx) obj).m.a.clear();
                mediaSession2.release();
                fnl fnlVar = fooVar.x;
                iom iomVar = fnlVar.d;
                for (fnw fnwVar : iomVar.l()) {
                    iomVar.q(fnwVar);
                    fnv fnvVar = fnwVar.d;
                    if (fnvVar != null) {
                        try {
                            fnvVar.j();
                        } catch (RemoteException unused) {
                        }
                    }
                }
                Iterator it = fnlVar.b.iterator();
                while (it.hasNext()) {
                    fnv fnvVar2 = ((fnw) it.next()).d;
                    if (fnvVar2 != null) {
                        try {
                            fnvVar2.j();
                        } catch (RemoteException unused2) {
                        }
                    }
                }
                fnlVar.b.clear();
                fnlVar.a.clear();
            }
        } catch (Exception unused3) {
        }
    }
}
