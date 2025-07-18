package defpackage;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class crl {
    public static AudioAttributes.Builder a() {
        return new AudioAttributes.Builder();
    }

    public static AudioAttributes.Builder b(AudioAttributes.Builder builder, int i) {
        return builder.setContentType(4);
    }

    public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i) {
        return builder.setUsage(5);
    }

    public static AudioAttributes d(AudioAttributes.Builder builder) {
        return builder.build();
    }

    public static void e(Service service, int i, Notification notification, int i2) {
        if (Build.VERSION.SDK_INT >= 34) {
            if (i2 != 0) {
                service.startForeground(i, notification, i2 & 1073745919);
                return;
            } else {
                service.startForeground(i, notification, 0);
                return;
            }
        }
        if (Build.VERSION.SDK_INT < 29) {
            service.startForeground(i, notification);
        } else if (i2 != 0) {
            service.startForeground(i, notification, i2 & 255);
        } else {
            service.startForeground(i, notification, 0);
        }
    }

    public static int f(int i) {
        if (i <= 4) {
            return 8;
        }
        return i + i;
    }

    public static Shader.TileMode g(int i) {
        return i != 1 ? i != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    public static final cuy h(cut cutVar) {
        return cutVar.a();
    }

    public static void i(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void j(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void k(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException((String) obj2);
        }
    }

    public static void l(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            throw new IllegalArgumentException("id cannot be empty");
        }
    }

    static Object m(ExecutorService executorService, Callable callable, int i) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }

    public static Typeface n(Context context, List list, int i, boolean z, int i2, Handler handler, cri criVar) {
        Object obj = null;
        dhk dhkVar = new dhk(criVar, new ia(handler, 3, null));
        if (!z) {
            String strA = ctx.a(list, i);
            Typeface typeface = (Typeface) ctx.a.get(strA);
            if (typeface != null) {
                dhkVar.h(new zuw(typeface));
                obj = typeface;
            } else {
                ctw ctwVar = new ctw(dhkVar, 1);
                synchronized (ctx.c) {
                    ko koVar = ctx.d;
                    ArrayList arrayList = (ArrayList) koVar.get(strA);
                    if (arrayList != null) {
                        arrayList.add(ctwVar);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(ctwVar);
                        koVar.put(strA, arrayList2);
                        ctv ctvVar = new ctv(strA, context, list, i);
                        ctx.b.execute(new cua(Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler(), ctvVar, new ctw(strA, 0)));
                    }
                }
            }
        } else {
            if (list.size() > 1) {
                throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
            }
            ctt cttVar = (ctt) list.get(0);
            jp jpVar = ctx.a;
            String strA2 = ctx.a(dhk.b(new Object[]{cttVar}), i);
            Typeface typeface2 = (Typeface) ctx.a.get(strA2);
            if (typeface2 != null) {
                dhkVar.h(new zuw(typeface2));
                obj = typeface2;
            } else if (i2 == -1) {
                zuw zuwVarB = ctx.b(strA2, context, dhk.b(new Object[]{cttVar}), i);
                dhkVar.h(zuwVarB);
                obj = zuwVarB.b;
            } else {
                try {
                    zuw zuwVar = (zuw) m(ctx.b, new ctu(strA2, context, cttVar, i), i2);
                    dhkVar.h(zuwVar);
                    obj = zuwVar.b;
                } catch (InterruptedException unused) {
                    dhkVar.h(new zuw(-3));
                }
            }
        }
        return (Typeface) obj;
    }
}
