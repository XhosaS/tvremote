package defpackage;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kqw extends krb {
    private final AtomicReference a = new AtomicReference();
    private boolean b;

    public final Bundle c(long j) {
        Bundle bundle;
        AtomicReference atomicReference = this.a;
        synchronized (atomicReference) {
            if (!this.b) {
                try {
                    atomicReference.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.a.get();
        }
        return bundle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0003, code lost:
    
        r4 = r4.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(android.os.Bundle r4, java.lang.Class r5) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L32
            java.lang.String r1 = "r"
            java.lang.Object r4 = r4.get(r1)
            if (r4 == 0) goto L32
            java.lang.Object r4 = r5.cast(r4)     // Catch: java.lang.ClassCastException -> L10
            return r4
        L10:
            r0 = move-exception
            java.lang.String r5 = r5.getCanonicalName()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getCanonicalName()
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r5
            r5 = 1
            r1[r5] = r4
            java.lang.String r4 = "Unexpected object type. Expected, Received: %s, %s"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            java.lang.String r5 = "AM"
            android.util.Log.w(r5, r4, r0)
            throw r0
        L32:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kqw.d(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    public final String e(long j) {
        return (String) d(c(j), String.class);
    }

    @Override // defpackage.krc
    public final void f(Bundle bundle) {
        AtomicReference atomicReference = this.a;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.b = true;
                } finally {
                    this.a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
