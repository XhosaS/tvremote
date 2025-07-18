package defpackage;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hbk {
    public Map a;
    public Map b;
    public Map c;
    public kp d;
    public jn e;
    public List f;
    public Rect g;
    public float h;
    public float i;
    public float j;
    public boolean k;
    public final hjs m = new hjs((byte[]) null, (byte[]) null);
    private final HashSet n = new HashSet();
    public int l = 0;

    public final float a() {
        return (long) ((b() / this.j) * 1000.0f);
    }

    public final float b() {
        return this.i - this.h;
    }

    public final hfn c(long j) {
        return (hfn) this.e.e(j);
    }

    public final void d(String str) {
        hhk.a(str);
        this.n.add(str);
    }

    public final void e(int i) {
        this.l += i;
    }

    public final void f() {
        this.k = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            sb.append(((hfn) it.next()).a("\t"));
        }
        return sb.toString();
    }
}
