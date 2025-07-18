package defpackage;

import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class uqv {
    final Object a;
    public final String b;
    public final uqs[] c;
    public boolean d = true;
    HashMap e;
    public int f;
    private final agow g;

    public uqv(String str, agow agowVar, uqs... uqsVarArr) {
        this.b = str;
        this.c = uqsVarArr;
        int length = uqsVarArr.length;
        HashMap map = new HashMap(length > 0 ? 10 : 1);
        this.e = map;
        if (length == 0) {
            map.put(uql.b, f());
        }
        this.f = 0;
        this.g = agowVar;
        this.a = new Object();
    }

    protected final void c(Object obj, uql uqlVar) {
        synchronized (this.a) {
            uqm uqmVarF = (uqm) this.e.get(uqlVar);
            if (uqmVarF == null) {
                uqmVarF = f();
                this.e.put(uqlVar, uqmVarF);
            }
            uqmVarF.b(obj);
            this.f++;
        }
        uqw uqwVar = ((uqx) this.g).c;
        if (uqwVar != null) {
            ura uraVar = (ura) uqwVar;
            AtomicLong atomicLong = uraVar.c;
            if (atomicLong.incrementAndGet() >= 100) {
                Object obj2 = uraVar.e;
                synchronized (obj2) {
                    if (atomicLong.get() >= 100) {
                        synchronized (obj2) {
                            ScheduledFuture scheduledFuture = ((ura) uqwVar).d;
                            if (scheduledFuture == null || scheduledFuture.isDone() || ((ura) uqwVar).d.isCancelled()) {
                                final ura uraVar2 = (ura) uqwVar;
                                ((ura) uqwVar).d = ((ura) uqwVar).a.schedule(new Runnable() { // from class: uqz
                                    @Override // java.lang.Runnable
                                    public final void run() throws NoSuchAlgorithmException {
                                        uraVar2.b();
                                    }
                                }, 1L, TimeUnit.MILLISECONDS);
                            } else if (((ura) uqwVar).d.getDelay(TimeUnit.MILLISECONDS) > 100) {
                                ((ura) uqwVar).a();
                                final ura uraVar3 = (ura) uqwVar;
                                ((ura) uqwVar).d = ((ura) uqwVar).a.schedule(new Runnable() { // from class: uqz
                                    @Override // java.lang.Runnable
                                    public final void run() throws NoSuchAlgorithmException {
                                        uraVar3.b();
                                    }
                                }, 1L, TimeUnit.MILLISECONDS);
                            }
                        }
                        return;
                    }
                }
            }
            synchronized (uraVar.e) {
                ScheduledFuture scheduledFuture2 = ((ura) uqwVar).d;
                if (scheduledFuture2 == null || scheduledFuture2.isDone() || ((ura) uqwVar).d.isCancelled()) {
                    final ura uraVar4 = (ura) uqwVar;
                    ((ura) uqwVar).d = ((ura) uqwVar).a.schedule(new Runnable() { // from class: uqz
                        @Override // java.lang.Runnable
                        public final void run() throws NoSuchAlgorithmException {
                            uraVar4.b();
                        }
                    }, ((ura) uqwVar).b, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    protected final void d(Object... objArr) {
        uqs[] uqsVarArr = this.c;
        yqw.A(uqsVarArr.length == objArr.length);
        if (this.d) {
            for (int i = 0; i < objArr.length; i++) {
                Object obj = objArr[i];
                if (obj == null) {
                    throw new NullPointerException("Streamz " + this.b + " has null parameter: " + Arrays.toString(objArr));
                }
                if (!uqsVarArr[i].b.isInstance(obj)) {
                    String str = this.b;
                    String string = obj.toString();
                    String strValueOf = String.valueOf(obj.getClass());
                    uqs uqsVar = uqsVarArr[i];
                    throw new IllegalArgumentException("Streamz " + str + " has parameter {index: " + i + ", value: " + string + ", type: " + strValueOf + "}, but expected: {name: " + uqsVar.a + ", type: " + uqsVar.b.toString() + "}");
                }
            }
        }
    }

    final void e(uqs... uqsVarArr) {
        uqs[] uqsVarArr2 = this.c;
        if (Arrays.equals(uqsVarArr2, uqsVarArr)) {
            return;
        }
        throw new uqy("Streamz " + this.b + " with field diffs: " + Arrays.toString(uqsVarArr2) + " and " + Arrays.toString(uqsVarArr));
    }

    public abstract uqm f();
}
