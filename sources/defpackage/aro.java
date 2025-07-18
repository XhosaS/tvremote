package defpackage;

import android.os.PatternMatcher;
import j$.util.function.Function$CC;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aro implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ aro(int i) {
        this.a = i;
    }

    public final /* synthetic */ Function andThen(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object, java.util.List] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return arq.d((cxl) obj);
            case 1:
                return new PatternMatcher((String) obj, 2);
            case 2:
                return arq.c((cyt) obj);
            case 3:
                cyq cyqVar = (cyq) obj;
                return new arp(cyqVar, arq.d(cyqVar.c == 1 ? (cxl) cyqVar.d : cxl.a));
            case 4:
                return ((arr) obj).b();
            case 5:
                cyq cyqVar2 = (cyq) obj;
                return new arp(cyqVar2, arq.c(cyqVar2.c == 3 ? (cyt) cyqVar2.d : cyt.a));
            case 6:
                return 9;
            case 7:
                return new AtomicReference();
            case 8:
                ?? r10 = ((adx) obj).a;
                bzo bzoVar = new bzo(r10.size());
                cau cauVar = cau.a;
                Collections.sort(r10, cat.a);
                Iterator it = r10.iterator();
                cah cahVar = it instanceof cah ? (cah) it : new cah(it);
                while (cahVar.hasNext()) {
                    cau cauVar2 = (cau) cahVar.next();
                    while (cahVar.hasNext()) {
                        if (!cahVar.b) {
                            cahVar.c = cahVar.a.next();
                            cahVar.b = true;
                        }
                        cau cauVar3 = (cau) cahVar.c;
                        if (!((cauVar2.b.compareTo(cauVar3.b) < 0 || cauVar2.c.compareTo(cauVar3.c) > 0) ? cauVar3 : cauVar2).a()) {
                            throw new IllegalArgumentException(bit.l("Overlapping ranges not permitted but found %s overlapping %s", cauVar2, cauVar3));
                        }
                        cau cauVar4 = (cau) cahVar.next();
                        bzi bziVar = cauVar4.b;
                        bzi bziVar2 = cauVar4.c;
                    }
                    bzoVar.g(cauVar2);
                }
                bzs bzsVarF = bzoVar.f();
                return bzsVarF.isEmpty() ? bzy.a : (((cax) bzsVarF).c == 1 && ((cau) biu.l(bzsVarF)).equals(cau.a)) ? bzy.b : new bzy(bzsVarF);
            case 9:
                return ((bzo) obj).f();
            default:
                return ((bzz) obj).f();
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
