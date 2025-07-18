package defpackage;

import j$.time.Instant;
import j$.util.Map;
import j$.util.function.Function$CC;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vzb extends vzc {
    public vze a;
    public final vrl b;

    public vzb(bq bqVar, Executor executor) {
        vrl vrlVar = new vrl(executor);
        this.b = vrlVar;
        vrlVar.c();
        bqVar.ek().b(new wzt(new vza(this, bqVar)));
    }

    @Override // defpackage.vzc
    public final void a(final vxo vxoVar, final vyr vyrVar, final vyv vyvVar) {
        uea.c();
        yqw.M(true, "Callbacks that implement BackgroundCallbacks must be registered with subscribeWithBackground().");
        this.b.execute(new Runnable() { // from class: vyz
            @Override // java.lang.Runnable
            public final void run() {
                int iIntValue;
                final vze vzeVar = this.a.a;
                final vyr vyrVar2 = vyrVar;
                vzr vzrVar = new vzr() { // from class: vxr
                    @Override // defpackage.vzr
                    public final int a(Instant instant, vxn vxnVar, boolean z) {
                        boolean z2 = vxnVar.b.b;
                        if (z2 && vxnVar.d()) {
                            if (!vxnVar.b().isBefore(instant.minus(vyrVar2.k))) {
                                return 2;
                            }
                        }
                        if (z || !z2) {
                            return z2 ? 3 : 1;
                        }
                        return 2;
                    }
                };
                uea.c();
                final vxo vxoVar2 = vxoVar;
                vyv vyvVar2 = vyvVar;
                vzq vzqVar = (vzq) Map.EL.computeIfAbsent(vzeVar.a, vyvVar2.getClass(), new Function() { // from class: vzd
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo116andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        vxo vxoVar3 = vxoVar2;
                        vze vzeVar2 = vzeVar;
                        return new vzq(vxoVar3, vzeVar2.i, vzeVar2.f, vzeVar2.e, vzeVar2.g);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                uea.c();
                vrn vrnVar = vzeVar.c;
                we weVar = vrnVar.c;
                Class<?> cls = vyvVar2.getClass();
                if (weVar.containsKey(cls)) {
                    iIntValue = ((Integer) weVar.get(cls)).intValue();
                } else {
                    int andIncrement = vrn.a.getAndIncrement();
                    weVar.put(cls, Integer.valueOf(andIncrement));
                    iIntValue = andIncrement;
                }
                Object objPut = vrnVar.b.put(Integer.valueOf(iIntValue), vyvVar2);
                vxi vxiVar = (vxi) vzqVar.f;
                Object obj = vxiVar.b;
                mcw mcwVar = vzqVar.j;
                long j = vxiVar.d;
                boolean z = j != Long.MAX_VALUE;
                Instant instantNow = Instant.now();
                yqw.M(z, "You've just overflowed a long. Consider upgrading to a BigDecimal, if this happens more than once.");
                vzqVar.f = new vxi(vxoVar2, ((vya) vxoVar2).a, vzrVar, j + 1, 3, vxiVar.e.g(vxoVar2, instantNow));
                vxk vxkVar = (vxk) vzqVar.g;
                vzqVar.g = new vxk(vxkVar.a + 1, vyvVar2, vxkVar.c, vxkVar.d, ypv.a);
                if (vzqVar.k == null) {
                    vzqVar.k = new vzp(vzqVar);
                    vzqVar.a.c(((vxi) vzqVar.f).b, vzqVar.k);
                } else if (!((vxi) vzqVar.f).b.equals(obj)) {
                    vyp vypVar = vzqVar.a;
                    vypVar.d(obj, vzqVar.k);
                    vypVar.c(((vxi) vzqVar.f).b, vzqVar.k);
                }
                if (objPut == null) {
                    if (((vxk) vzqVar.g).d.g()) {
                        yqw.M(!r1.e.g(), "Cannot be the case that subscription has data.");
                        vyx vyxVar = vzqVar.g;
                        vzqVar.g = vzq.j(vyxVar, (vyg) ((vxk) vyxVar).d.c());
                        yqw.M(((vxk) vzqVar.g).e.g(), "Callbacks did not accept pinned data after rotation.");
                        if (!(((vxk) vzqVar.g).b instanceof vxl) || vzqVar.h.b()) {
                            return;
                        }
                        vzqVar.g = vzqVar.g.g(true);
                        vzq.f((vxl) ((vxk) vzqVar.g).b);
                        return;
                    }
                }
                vzqVar.e(((vxi) vzqVar.f).e);
            }
        });
    }
}
