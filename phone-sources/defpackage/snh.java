package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class snh {
    final Object a;
    public final String b;
    public final sne[] c;
    HashMap d;
    public int e;
    private final yfo f;
    private boolean g = true;

    public snh(String str, yfo yfoVar, sne... sneVarArr) {
        this.b = str;
        this.c = sneVarArr;
        int length = sneVarArr.length;
        HashMap map = new HashMap(length > 0 ? 10 : 1);
        this.d = map;
        if (length == 0) {
            map.put(smz.b, a());
        }
        this.e = 0;
        this.f = yfoVar;
        this.a = new Object();
    }

    public abstract sna a();

    public final void d() {
        this.g = false;
    }

    protected final void e(Object obj, smz smzVar) {
        synchronized (this.a) {
            sna snaVarA = (sna) this.d.get(smzVar);
            if (snaVarA == null) {
                snaVarA = a();
                this.d.put(smzVar, snaVarA);
            }
            snaVarA.b(obj);
            this.e++;
        }
        sni sniVar = ((snj) this.f).c;
        if (sniVar != null) {
            snl snlVar = (snl) sniVar;
            AtomicLong atomicLong = snlVar.c;
            int i = 4;
            if (atomicLong.incrementAndGet() >= 100) {
                Object obj2 = snlVar.e;
                synchronized (obj2) {
                    if (atomicLong.get() >= 100) {
                        synchronized (obj2) {
                            ScheduledFuture scheduledFuture = ((snl) sniVar).d;
                            if (scheduledFuture == null || scheduledFuture.isDone() || ((snl) sniVar).d.isCancelled()) {
                                ((snl) sniVar).d = ((snl) sniVar).a.schedule(new slt(sniVar, i), 1L, TimeUnit.MILLISECONDS);
                            } else if (((snl) sniVar).d.getDelay(TimeUnit.MILLISECONDS) > 100) {
                                ((snl) sniVar).a();
                                ((snl) sniVar).d = ((snl) sniVar).a.schedule(new slt(sniVar, i), 1L, TimeUnit.MILLISECONDS);
                            }
                        }
                        return;
                    }
                }
            }
            synchronized (snlVar.e) {
                ScheduledFuture scheduledFuture2 = ((snl) sniVar).d;
                if (scheduledFuture2 == null || scheduledFuture2.isDone() || ((snl) sniVar).d.isCancelled()) {
                    ((snl) sniVar).d = ((snl) sniVar).a.schedule(new slt(sniVar, i), ((snl) sniVar).b, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    protected final void f(Object... objArr) {
        sne[] sneVarArr = this.c;
        a.H(sneVarArr.length == objArr.length);
        if (this.g) {
            for (int i = 0; i < objArr.length; i++) {
                Object obj = objArr[i];
                if (obj == null) {
                    throw new NullPointerException("Streamz " + this.b + " has null parameter: " + Arrays.toString(objArr));
                }
                if (!sneVarArr[i].b.isInstance(obj)) {
                    String str = this.b;
                    String string = obj.toString();
                    String strValueOf = String.valueOf(obj.getClass());
                    sne sneVar = sneVarArr[i];
                    throw new IllegalArgumentException("Streamz " + str + " has parameter {index: " + i + ", value: " + string + ", type: " + strValueOf + "}, but expected: {name: " + sneVar.a + ", type: " + sneVar.b.toString() + "}");
                }
            }
        }
    }

    final void g(sne... sneVarArr) {
        sne[] sneVarArr2 = this.c;
        if (Arrays.equals(sneVarArr2, sneVarArr)) {
            return;
        }
        throw new snk("Streamz " + this.b + " with field diffs: " + Arrays.toString(sneVarArr2) + " and " + Arrays.toString(sneVarArr));
    }
}
