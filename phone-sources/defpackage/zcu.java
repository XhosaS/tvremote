package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zcu {
    public final zcv a;
    public final String b;
    public boolean c;
    public zcs d;
    public final List e = new ArrayList();
    public boolean f;

    public zcu(zcv zcvVar, String str) {
        this.a = zcvVar;
        this.b = str;
    }

    public final void a() {
        byte[] bArr = zcr.a;
        zcv zcvVar = this.a;
        synchronized (zcvVar) {
            if (c()) {
                zcvVar.c(this);
            }
        }
    }

    public final void b() {
        byte[] bArr = zcr.a;
        zcv zcvVar = this.a;
        synchronized (zcvVar) {
            this.c = true;
            if (c()) {
                zcvVar.c(this);
            }
        }
    }

    public final boolean c() {
        if (this.d != null) {
            this.f = true;
        }
        List list = this.e;
        int size = list.size() - 1;
        boolean z = false;
        while (size >= 0) {
            zcs zcsVar = (zcs) list.get(size);
            if (zcv.b.isLoggable(Level.FINE)) {
                wbb.I(zcsVar, this, "canceled");
            }
            list.remove(size);
            size--;
            z = true;
        }
        return z;
    }

    public final boolean d(zcs zcsVar, long j, boolean z) {
        zcu zcuVar = zcsVar.b;
        if (zcuVar != this) {
            if (zcuVar != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            zcsVar.b = this;
        }
        long jNanoTime = System.nanoTime();
        long j2 = jNanoTime + j;
        List list = this.e;
        int iIndexOf = list.indexOf(zcsVar);
        if (iIndexOf != -1) {
            if (zcsVar.c <= j2) {
                if (zcv.b.isLoggable(Level.FINE)) {
                    wbb.I(zcsVar, this, "already scheduled");
                }
                return false;
            }
            list.remove(iIndexOf);
        }
        zcsVar.c = j2;
        if (zcv.b.isLoggable(Level.FINE)) {
            long j3 = j2 - jNanoTime;
            wbb.I(zcsVar, this, z ? "run again after ".concat(wbb.H(j3)) : "scheduled after ".concat(wbb.H(j3)));
        }
        Iterator it = list.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((zcs) it.next()).c - jNanoTime > j) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = list.size();
        }
        list.add(size, zcsVar);
        return size == 0;
    }

    public final void e(zcs zcsVar) {
        zcsVar.getClass();
        zcv zcvVar = this.a;
        synchronized (zcvVar) {
            if (this.c) {
                if (zcv.b.isLoggable(Level.FINE)) {
                    wbb.I(zcsVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (d(zcsVar, 0L, false)) {
                    zcvVar.c(this);
                }
            }
        }
    }

    public final String toString() {
        return this.b;
    }
}
