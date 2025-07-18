package defpackage;

import android.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pft implements pcm {
    public final pbv a;
    public final pcn b;
    public pbv c;
    public List d;
    public boolean e = false;
    public int f = 1;

    public pft(pbv pbvVar) {
        this.a = pbvVar;
        this.b = pbvVar.b;
    }

    @Override // defpackage.pcm
    public final void a() {
        yqw.L(!this.e);
        this.e = true;
        Set set = this.b.a;
        if (!set.isEmpty()) {
            pbv pbvVar = this.a;
            if (Log.isLoggable("GIL", 2)) {
                Log.v("GIL", "Inserted: ".concat(String.valueOf(String.valueOf(pbvVar))));
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((pcl) it.next()).b(pbvVar);
            }
        }
        List list = this.d;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((pbv) it2.next()).c.a();
            }
        }
    }

    @Override // defpackage.pcm
    public final void b() {
        yqw.L(this.e);
        this.e = false;
        List list = this.d;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((pbv) it.next()).c.b();
            }
        }
        pcn pcnVar = this.b;
        pbv pbvVar = this.a;
        Set set = pcnVar.a;
        if (set.isEmpty()) {
            return;
        }
        if (Log.isLoggable("GIL", 2)) {
            Log.v("GIL", "Removed: ".concat(String.valueOf(String.valueOf(pbvVar))));
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            ((pcl) it2.next()).c(pbvVar);
        }
    }

    @Override // defpackage.pcm
    public final void c() {
        int iB = zos.b(this.a.a().e);
        if (iB == 0) {
            iB = 1;
        }
        this.f = iB;
    }

    @Override // defpackage.pcm
    public final boolean d() {
        return this.c == null;
    }
}
