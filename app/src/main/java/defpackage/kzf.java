package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kzf {
    private static final Object b = new Object();
    public final String a;
    private final kzd c;
    private final Object d;
    private final Object e = new Object();
    private volatile Object f = null;
    private volatile Object g = null;

    public kzf(String str, Object obj, kzd kzdVar) {
        this.a = str;
        this.d = obj;
        this.c = kzdVar;
    }

    public final Object a(Object obj) {
        synchronized (this.e) {
        }
        if (obj != null) {
            return obj;
        }
        if (kze.a == null) {
            return this.d;
        }
        synchronized (b) {
            if (kze.a.a()) {
                return this.g == null ? this.d : this.g;
            }
            try {
                for (kzf kzfVar : kzg.a) {
                    if (kze.a.a()) {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                    Object objA = null;
                    try {
                        kzd kzdVar = kzfVar.c;
                        if (kzdVar != null) {
                            objA = kzdVar.a();
                        }
                    } catch (IllegalStateException unused) {
                    }
                    synchronized (b) {
                        kzfVar.g = objA;
                    }
                }
            } catch (SecurityException unused2) {
            }
            kzd kzdVar2 = this.c;
            if (kzdVar2 != null) {
                try {
                    return kzdVar2.a();
                } catch (IllegalStateException | SecurityException unused3) {
                }
            }
            boolean z = kze.a.a;
            return this.d;
        }
    }
}
