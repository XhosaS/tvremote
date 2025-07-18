package defpackage;

import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eag extends ebr {
    private final eaf e;
    private final dxa f = new dxa();

    public eag(dxa dxaVar, eaf eafVar) {
        b(dxaVar);
        this.e = eafVar;
    }

    private static Object k(WeakReference weakReference) {
        Object obj = weakReference != null ? weakReference.get() : null;
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof Drawable) || ((Drawable) obj).getCallback() != null) {
            return obj;
        }
        weakReference.clear();
        return null;
    }

    @Override // defpackage.ebr
    public final float a(long j) {
        if (d() > 1) {
            throw new RuntimeException("Trying to check for single input of node with multiple inputs!");
        }
        Map map = this.a;
        boolean zContainsKey = map == null ? false : map.containsKey("default_input");
        Object objK = k((WeakReference) this.f.b());
        if (objK == null) {
            return zContainsKey ? e().c : this.c;
        }
        if (!zContainsKey) {
            return this.e.a(objK);
        }
        float f = e().c;
        c(f);
        return f;
    }

    public final void b(dxa dxaVar) {
        dxa dxaVar2;
        int i = 0;
        while (true) {
            dxaVar2 = this.f;
            if (i >= 5) {
                break;
            }
            dxaVar2.a[i] = null;
            i++;
        }
        dxaVar2.b = (short) 0;
        if (dxaVar == null) {
            return;
        }
        short s = dxaVar.b;
        for (int i2 = 0; i2 < s; i2++) {
            dxaVar2.c(dxaVar.a(i2), new WeakReference(dxaVar.a[dxaVar.a(i2)]));
        }
    }

    public final void c(float f) {
        dxa dxaVar = this.f;
        short s = dxaVar.b;
        for (int i = 0; i < s; i++) {
            Object objK = k((WeakReference) dxaVar.a[dxaVar.a(i)]);
            if (objK != null) {
                this.e.d(objK, f);
            }
        }
    }
}
