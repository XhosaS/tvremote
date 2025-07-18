package defpackage;

import android.content.Context;
import com.google.android.gms.clearcut.LogEventParcelable;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kbf {
    private static volatile kbf a;
    private final Context b;
    private int d = 0;
    private final Queue c = new ArrayDeque();

    private kbf(Context context) {
        this.b = context;
    }

    static kbf c(Context context) {
        if (a == null) {
            synchronized (kbf.class) {
                if (a == null) {
                    a = new kbf(context);
                }
            }
        }
        return a;
    }

    final synchronized kbe a() {
        return (kbe) this.c.peek();
    }

    final synchronized kbe b() {
        Queue queue = this.c;
        kbe kbeVar = (kbe) queue.peek();
        if (kbeVar != null) {
            int i = kbeVar.c + 1;
            kbeVar.c = i;
            if (i >= aese.a.eV().c(this.b)) {
                return (kbe) queue.poll();
            }
        }
        return null;
    }

    final synchronized boolean d(LogEventParcelable logEventParcelable) {
        byte[] bArr = logEventParcelable.b;
        bArr.getClass();
        int length = bArr.length;
        Queue queue = this.c;
        long size = queue.size();
        aese aeseVar = aese.a;
        aesf aesfVarEV = aeseVar.eV();
        Context context = this.b;
        if (size < aesfVarEV.a(context)) {
            if (this.d + length < aeseVar.eV().b(context)) {
                queue.add(new kbe(logEventParcelable));
                this.d += length;
                return true;
            }
        }
        return false;
    }

    final synchronized void e() {
        kbe kbeVar = (kbe) this.c.poll();
        if (kbeVar != null) {
            byte[] bArr = kbeVar.a.b;
            bArr.getClass();
            this.d -= bArr.length;
        }
    }
}
