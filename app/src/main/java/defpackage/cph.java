package defpackage;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cph {
    public Map b;
    public Map c;
    public Map d;
    public wy e;
    public wr f;
    public List g;
    public Rect h;
    public float i;
    public float j;
    public float k;
    public final cqo a = new cqo();
    private final HashSet m = new HashSet();
    public int l = 0;

    public final float a() {
        return (long) (((this.j - this.i) / this.k) * 1000.0f);
    }

    public final cuk b(long j) {
        return (cuk) this.f.e(j);
    }

    public final void c(String str) {
        ((cwq) cwr.a).a(str, null);
        this.m.add(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            sb.append(((cuk) it.next()).a("\t"));
        }
        return sb.toString();
    }
}
