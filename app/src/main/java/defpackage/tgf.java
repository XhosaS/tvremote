package defpackage;

import j$.util.Map;
import j$.util.function.Function$CC;
import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tgf {
    public final rpe a;
    public final String b;
    public final Map c;
    public final tgv d;
    private final Map e = new EnumMap(tfu.class);

    public tgf(String str, rpe rpeVar, tgv tgvVar, Map map) {
        new EnumMap(tga.class);
        this.b = str;
        this.a = rpeVar;
        this.d = tgvVar;
        this.c = map;
    }

    public final synchronized ros a(tfu tfuVar) {
        return (ros) Map.EL.computeIfAbsent(this.e, tfuVar, new Function() { // from class: tgc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo116andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                final tfu tfuVar2 = (tfu) obj;
                rpj rpjVarI = rpk.i();
                int iA = tfuVar2.a();
                StringBuilder sb = new StringBuilder();
                final tgf tgfVar = this.a;
                sb.append(tgfVar.b);
                sb.append(" logger for TNGAppId: ");
                sb.append(iA);
                String string = sb.toString();
                rox roxVar = (rox) rpjVarI;
                roxVar.a = string;
                roxVar.b = yqt.i(Integer.valueOf(tfuVar2.a()));
                rpjVarI.b();
                rpjVarI.c(true);
                rpjVarI.d(tfuVar2.a());
                java.util.Map map = tgfVar.c;
                if (map.containsKey(tfuVar2)) {
                    tgb tgbVar = (tgb) map.get(tfuVar2);
                    zdl it = tgbVar.a().iterator();
                    while (it.hasNext()) {
                        rqr rqrVar = (rqr) it.next();
                        if (roxVar.c == null) {
                            roxVar.c = new yzo();
                        }
                        roxVar.c.c(rqrVar);
                    }
                    tgbVar.b();
                }
                return tfuVar2 == tfu.XBLEND_ANDROID ? tgfVar.a.a(new aehf() { // from class: tgd
                    @Override // defpackage.aehf
                    public final Object a() {
                        return new tfy(tgfVar.d.a(tfuVar2));
                    }
                }, rpjVarI.a()) : tgfVar.a.a(new aehf() { // from class: tge
                    @Override // defpackage.aehf
                    public final Object a() {
                        return new tfx(tgfVar.d.a(tfuVar2));
                    }
                }, rpjVarI.a());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }
}
