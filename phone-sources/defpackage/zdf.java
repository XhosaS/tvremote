package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.io.IOException;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zdf extends zcs {
    final /* synthetic */ zdg d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zdf(zdg zdgVar, String str) {
        super(str);
        this.d = zdgVar;
    }

    @Override // defpackage.zcs
    public final long a() throws IOException {
        long j;
        long jNanoTime = System.nanoTime();
        zdg zdgVar = this.d;
        Iterator it = ((ConcurrentLinkedQueue) zdgVar.d).iterator();
        it.getClass();
        long j2 = Long.MIN_VALUE;
        zde zdeVar = null;
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            zde zdeVar2 = (zde) it.next();
            zdeVar2.getClass();
            synchronized (zdeVar2) {
                byte[] bArr = zcr.a;
                List list = zdeVar2.l;
                int i3 = 0;
                while (true) {
                    if (i3 < list.size()) {
                        Reference reference = (Reference) list.get(i3);
                        if (reference.get() != null) {
                            i3++;
                        } else {
                            reference.getClass();
                            zce zceVar = zdeVar2.a.a.h;
                            StringBuilder sb = new StringBuilder();
                            j = jNanoTime;
                            sb.append("A connection to ");
                            sb.append(zceVar);
                            sb.append(" was leaked. Did you forget to close a response body?");
                            zfo.b.f(sb.toString(), ((zda) reference).a);
                            list.remove(i3);
                            zdeVar2.j();
                            if (list.isEmpty()) {
                                zdeVar2.m = j - zdgVar.a;
                                break;
                            }
                            jNanoTime = j;
                        }
                    } else {
                        j = jNanoTime;
                        if (list.size() > 0) {
                            i2++;
                        }
                    }
                }
                i++;
                long j3 = j - zdeVar2.m;
                if (j3 > j2) {
                    j2 = j3;
                }
                if (j3 > j2) {
                    zdeVar = zdeVar2;
                }
            }
            jNanoTime = j;
        }
        long j4 = jNanoTime;
        if (j2 < zdgVar.a && i <= 5) {
            if (i > 0) {
                return zdgVar.a - j2;
            }
            if (i2 <= 0) {
                return -1L;
            }
            return zdgVar.a;
        }
        zdeVar.getClass();
        synchronized (zdeVar) {
            if (!zdeVar.l.isEmpty()) {
                return 0L;
            }
            if (zdeVar.m + j2 != j4) {
                return 0L;
            }
            zdeVar.j();
            ((ConcurrentLinkedQueue) zdgVar.d).remove(zdeVar);
            zcr.p(zdeVar.a());
            if (!((ConcurrentLinkedQueue) zdgVar.d).isEmpty()) {
                return 0L;
            }
            ((zcu) zdgVar.b).a();
            return 0L;
        }
    }
}
