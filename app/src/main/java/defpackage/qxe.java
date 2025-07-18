package defpackage;

import android.content.Context;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qxe extends qwx implements quz {
    public final qux a;
    public final Context b;
    public final Executor c;
    public final agow d;
    public final qqq e;
    public final aehf f;
    public final agow g;
    public final agow h;
    public final agow i;
    public final qqz j;
    public final qww k;

    public qxe(quy quyVar, Context context, Executor executor, qww qwwVar, agow agowVar, aehf aehfVar, qqq qqqVar, qqz qqzVar, agow agowVar2, agow agowVar3, agow agowVar4) {
        this.a = quyVar.a(executor, aehfVar, null);
        this.b = context;
        this.c = executor;
        this.k = qwwVar;
        this.d = agowVar;
        this.e = qqqVar;
        this.j = qqzVar;
        this.f = aehfVar;
        this.g = agowVar2;
        this.h = agowVar3;
        this.i = agowVar4;
    }

    @Override // defpackage.quz
    public final void k() {
        zvh zvhVar = new zvh() { // from class: qxa
            @Override // defpackage.zvh
            public final zyd a() {
                final qxe qxeVar = this.a;
                return mhv.d(qxeVar.b, new Runnable() { // from class: qxb
                    @Override // java.lang.Runnable
                    public final void run() {
                        final qxe qxeVar2 = qxeVar;
                        zxn.l(new zvh() { // from class: qxd
                            /* JADX WARN: Removed duplicated region for block: B:173:0x0381  */
                            /* JADX WARN: Removed duplicated region for block: B:175:0x038e  */
                            @Override // defpackage.zvh
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public final defpackage.zyd a() throws java.lang.Throwable {
                                /*
                                    Method dump skipped, instructions count: 1480
                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.qxd.a():zyd");
                            }
                        }, qxeVar2.c);
                    }
                });
            }
        };
        Executor executor = this.c;
        zxn.l(zvhVar, executor);
        zxn.j(new Runnable() { // from class: qwz
            @Override // java.lang.Runnable
            public final void run() {
                qxe qxeVar = this.a;
                if (((Boolean) qxeVar.i.a()).booleanValue()) {
                    qxeVar.e.b();
                }
                final qqz qqzVar = qxeVar.j;
                if (((Boolean) qqzVar.c.a()).booleanValue()) {
                    double dLongValue = ((Long) qqzVar.d.a()).longValue();
                    Random random = qqzVar.b;
                    agow agowVar = qqzVar.e;
                    qqzVar.a.scheduleWithFixedDelay(new Runnable() { // from class: qqy
                        @Override // java.lang.Runnable
                        public final void run() {
                            qrb qrbVar = qqzVar.f;
                            qrbVar.a.a(new qra(qrbVar));
                        }
                    }, Math.round(dLongValue + (random.nextDouble() * ((Long) agowVar.a()).longValue())), ((Long) agowVar.a()).longValue(), TimeUnit.MILLISECONDS);
                }
            }
        }, executor);
    }
}
