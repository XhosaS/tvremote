package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class htn {
    public final hkq a;
    public final List b;
    public final hkg c;
    public boolean d;
    public htm e;
    public boolean f;
    public htm g;
    public Bitmap h;
    public htm i;
    public int j;
    public int k;
    public int l;
    private final Handler m;
    private final hod n;
    private boolean o;
    private hke p;

    public htn(hjr hjrVar, hkq hkqVar, int i, int i2, hlp hlpVar, Bitmap bitmap) {
        hod hodVar = hjrVar.a;
        hkg hkgVarC = hjr.c(hjrVar.a());
        hke hkeVarH = hjr.c(hjrVar.a()).b().h(((hvc) ((hvc) hvc.c(hng.b).H()).K()).s(i, i2));
        this.b = new ArrayList();
        this.c = hkgVarC;
        Handler handler = new Handler(Looper.getMainLooper(), new etv(this, 3, null));
        this.n = hodVar;
        this.m = handler;
        this.p = hkeVarH;
        this.a = hkqVar;
        e(hlpVar, bitmap);
    }

    final int a() {
        return ((hku) this.a).f.c;
    }

    public final void b() {
        int i;
        if (!this.d || this.o) {
            return;
        }
        htm htmVar = this.i;
        if (htmVar != null) {
            this.i = null;
            c(htmVar);
            return;
        }
        this.o = true;
        hkq hkqVar = this.a;
        hku hkuVar = (hku) hkqVar;
        hks hksVar = hkuVar.f;
        int i2 = hksVar.c;
        int i3 = 0;
        if (i2 > 0 && (i = hkuVar.e) >= 0) {
            i3 = i < i2 ? ((hkr) hksVar.e.get(i)).i : -1;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() + i3;
        hkqVar.b();
        this.g = new htm(this.m, hkuVar.e, jUptimeMillis);
        this.p.h((hvc) new hvc().x(new hwa(Double.valueOf(Math.random())))).f(hkqVar).l(this.g);
    }

    public final void c(htm htmVar) {
        this.o = false;
        if (this.f) {
            this.m.obtainMessage(2, htmVar).sendToTarget();
            return;
        }
        if (!this.d) {
            this.i = htmVar;
            return;
        }
        if (htmVar.b != null) {
            d();
            htm htmVar2 = this.e;
            this.e = htmVar;
            List list = this.b;
            for (int size = list.size() - 1; size >= 0; size--) {
                hti htiVar = (hti) list.get(size);
                Object callback = htiVar.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    htiVar.stop();
                    htiVar.invalidateSelf();
                } else {
                    htiVar.invalidateSelf();
                    htm htmVar3 = htiVar.a.a.e;
                    if ((htmVar3 != null ? htmVar3.a : -1) == r5.a() - 1) {
                        htiVar.c++;
                    }
                    if (htiVar.d != -1 && htiVar.c >= 0) {
                        htiVar.stop();
                    }
                }
            }
            if (htmVar2 != null) {
                this.m.obtainMessage(2, htmVar2).sendToTarget();
            }
        }
        b();
    }

    public final void d() {
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            this.n.d(bitmap);
            this.h = null;
        }
    }

    final void e(hlp hlpVar, Bitmap bitmap) {
        hju.p(hlpVar);
        hju.p(bitmap);
        this.h = bitmap;
        this.p = this.p.h(new hvc().z(hlpVar));
        this.j = hwp.a(bitmap);
        this.k = bitmap.getWidth();
        this.l = bitmap.getHeight();
    }

    public final void f() {
        this.d = false;
    }
}
