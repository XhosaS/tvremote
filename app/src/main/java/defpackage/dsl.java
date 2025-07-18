package defpackage;

import com.facebook.litho.ComponentTree;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dsl {
    public final dru a;
    public final drq b;
    public final int c;
    public final int d;
    public final boolean e;
    public final dzh f;
    public final int h;
    public volatile boolean i;
    public final int j;
    public final String k;
    final /* synthetic */ ComponentTree m;
    private final RunnableFuture o;
    private final boolean p;
    private volatile Object q;
    private volatile Object r;
    private final AtomicInteger n = new AtomicInteger(-1);
    public final AtomicInteger g = new AtomicInteger(0);
    public volatile boolean l = false;

    public dsl(ComponentTree componentTree, dru druVar, drq drqVar, int i, int i2, int i3, boolean z, dzh dzhVar, int i4, String str) {
        this.m = componentTree;
        this.a = druVar;
        this.b = drqVar;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = dzhVar;
        this.p = ComponentTree.z(i4);
        this.j = i4;
        this.k = str;
        this.h = i3;
        FutureTask futureTask = new FutureTask(new dsk(this));
        emt emtVar = emu.a;
        this.o = futureTask;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:159:0x020f A[Catch: all -> 0x008e, TryCatch #6 {all -> 0x008e, blocks: (B:45:0x0081, B:157:0x0207, B:159:0x020f, B:160:0x0211, B:161:0x0212, B:162:0x021b), top: B:174:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0212 A[Catch: all -> 0x008e, TryCatch #6 {all -> 0x008e, blocks: (B:45:0x0081, B:157:0x0207, B:159:0x020f, B:160:0x0211, B:161:0x0212, B:162:0x021b), top: B:174:0x007f }] */
    /* JADX WARN: Type inference failed for: r3v11, types: [dvk] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.dvd a(int r18) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsl.a(int):dvd");
    }

    public final synchronized void b() {
        if (this.l) {
            return;
        }
        this.r = null;
        this.q = null;
        this.l = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        dsl dslVar = (dsl) obj;
        if (this.c == dslVar.c && this.d == dslVar.d && this.a.equals(dslVar.a)) {
            return this.b.j == dslVar.b.j;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.j) * 31) + this.c) * 31) + this.d;
    }
}
