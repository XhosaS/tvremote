package defpackage;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wzr implements Runnable {
    public final wxv a;
    public final UUID b;
    public final String c;
    public final wyr d;
    public final AtomicReference e;
    public zyd f;
    private final long h;
    private final mcw k;
    private final Set i = new HashSet();
    int g = 0;
    private final boolean j = false;

    public wzr(wxv wxvVar, UUID uuid, String str, wyr wyrVar, wzp wzpVar, long j, boolean z, mcw mcwVar) {
        this.a = wxvVar;
        this.b = uuid;
        this.c = str;
        this.d = wyrVar;
        this.h = j;
        this.k = mcwVar;
        this.e = new AtomicReference(wzpVar);
    }

    public final long a() {
        return this.k.a() - this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.wyv b() {
        /*
            Method dump skipped, instructions count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wzr.b():wyv");
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x021b  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 547
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wzr.run():void");
    }

    public final String toString() {
        wyv wyvVarB;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            wyvVarB = b();
        }
        return "UnfinishedTrace@" + hexString + "[" + ((wtb) wyvVarB).a + "]";
    }
}
