package defpackage;

import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fqv {
    public final Object a;
    public int b;
    public boolean c;
    public final Object d;

    public fqv(czq czqVar, List list) {
        this.a = new ArrayList();
        g(list);
        g(list);
        if (!czqVar.b.contains(this)) {
            czqVar.b.add(this);
            csr csrVar = czqVar.c;
            csr csrVar2 = czqVar.d;
            f(this);
            int i = czqVar.e;
            f(this);
        }
        this.d = czqVar;
    }

    public static /* synthetic */ void f(fqv fqvVar) {
        ArrayList arrayList = (ArrayList) fqvVar.a;
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        throw null;
    }

    private static final void g(List list) {
        if (list.size() <= 0) {
            return;
        }
        throw null;
    }

    public final int a() {
        int i;
        synchronized (this.a) {
            i = this.b;
            this.b = i + 1;
        }
        return i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection] */
    public final dmj b() {
        if (this.b <= 0) {
            ?? r0 = this.a;
            ArrayList arrayList = new ArrayList(yfm.z(r0, 10));
            Iterator it = r0.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((RemoteViews) it.next()).getLayoutId()));
            }
            this.b = yfm.ab(arrayList).size();
        }
        return new dmj(yfm.au(this.d), (RemoteViews[]) this.a.toArray(new RemoteViews[0]), this.c, Math.max(this.b, 1));
    }

    public final void c(long j, RemoteViews remoteViews) {
        ((ArrayList) this.d).add(Long.valueOf(j));
        ((ArrayList) this.a).add(remoteViews);
    }

    public final int d() {
        return ((ArrayList) this.a).size();
    }

    public final void e() {
    }

    public fqv(byte[] bArr) {
        this.d = new ArrayList();
        this.a = new ArrayList();
    }

    public fqv() {
        this.a = new Object();
        this.d = new ir();
    }
}
