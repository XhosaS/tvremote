package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentMap$EL;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxj {
    public boolean a;
    public Object b;
    public final Object c;

    public bxj() {
        this.a = false;
        this.b = null;
        this.c = null;
    }

    private final void i() {
        if (!this.a) {
            ((PrintWriter) this.c).print((String) this.b);
        }
        this.a = true;
    }

    public final void a() {
        this.b = ((String) this.b).substring(2);
        if (this.a) {
            ((PrintWriter) this.c).println();
        }
        this.a = false;
    }

    public final void b() {
        this.b = String.valueOf(this.b).concat("  ");
    }

    public final void c(String str, Object... objArr) {
        i();
        ((PrintWriter) this.c).printf(str, objArr);
        if (str.endsWith("%n")) {
            this.a = false;
        }
    }

    public final void d(String str) {
        i();
        ((PrintWriter) this.c).println(str);
        this.a = false;
    }

    public final bco e() {
        return new bcr(new bco() { // from class: bcp
            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
            /* JADX WARN: Type inference failed for: r1v0, types: [byb, java.lang.Object] */
            @Override // defpackage.bco
            public final bcn a(final bav bavVar) {
                bcn[] bcnVarArr;
                bcn bcnVar;
                bcn[] bcnVarArr2;
                int length;
                bxj bxjVar = this.a;
                ?? r1 = bxjVar.c;
                cih cihVar = bcn.h;
                Context context = bavVar.d;
                final String str = (String) r1.a(context);
                final boolean z = bxjVar.a;
                final ?? r0 = bxjVar.b;
                byo byoVarK = bit.k(new byo() { // from class: bcm
                    @Override // defpackage.byo
                    public final Object aL() {
                        return new bcn(bavVar, str, z, r0);
                    }
                });
                AtomicReference atomicReference = (AtomicReference) ConcurrentMap$EL.computeIfAbsent(cihVar.a, str, new aro(7));
                do {
                    bcnVarArr = (bcn[]) atomicReference.get();
                    if (bcnVarArr == null || (length = bcnVarArr.length) == 0) {
                        bcn bcnVar2 = (bcn) byoVarK.aL();
                        bcnVar = bcnVar2;
                        bcnVarArr2 = new bcn[]{bcnVar2};
                    } else {
                        bcn bcnVar3 = bcnVarArr[0];
                        if (bcnVar3.c.equals("")) {
                            bcnVar = bcnVar3;
                            bcnVarArr2 = null;
                        } else {
                            bcnVar = (bcn) byoVarK.aL();
                            bcnVarArr2 = new bcn[length + 1];
                            bcnVarArr2[0] = bcnVar;
                            System.arraycopy(bcnVarArr, 0, bcnVarArr2, 1, length);
                        }
                    }
                    if (bcnVarArr2 == null) {
                        break;
                    }
                } while (!sd.g(atomicReference, bcnVarArr, bcnVarArr2));
                if (bcnVarArr2 != null) {
                    byj byjVar = new byj(cihVar);
                    byj byjVar2 = new byj(cihVar);
                    if (bde.b == null) {
                        synchronized (bde.class) {
                            if (bde.b == null) {
                                if (!Objects.equals(context.getPackageName(), "com.google.android.gms")) {
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        context.registerReceiver(new bde(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"), 2);
                                    } else {
                                        context.registerReceiver(new bde(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"));
                                    }
                                }
                                bde.b = byjVar;
                                bde.a = byjVar2;
                            }
                        }
                    }
                }
                boolean z2 = bcnVar.d;
                bdq.h(true, "Package %s cannot be registered both with and without stickyAccountSupport", str);
                return bcnVar;
            }
        });
    }

    public final void f(Set set) {
        this.b = cab.m(set);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Queue] */
    public final void g(amj amjVar) {
        synchronized (this.c) {
            if (this.b == null) {
                this.b = new ArrayDeque();
            }
            this.b.add(amjVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Queue] */
    public final void h(ami amiVar) {
        amj amjVar;
        synchronized (this.c) {
            if (this.b != null && !this.a) {
                this.a = true;
                while (true) {
                    synchronized (this.c) {
                        amjVar = (amj) this.b.poll();
                        if (amjVar == null) {
                            this.a = false;
                            return;
                        }
                    }
                    amjVar.c(amiVar);
                }
            }
        }
    }

    public bxj(PrintWriter printWriter) {
        this.c = printWriter;
        this.b = "";
    }

    public bxj(byte[] bArr) {
        this.c = new Object();
    }

    public bxj(byb bybVar) {
        this.b = cbd.a;
        this.a = false;
        this.c = bybVar;
    }
}
