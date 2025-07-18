package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import j$.util.function.Function$CC;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fxq implements fxu, fxt {
    public static final /* synthetic */ int c = 0;
    private static final IntentFilter d = new IntentFilter("com.google.android.katniss.DATA_STORE_CHANGED");
    public final Context a;
    public final hag b;
    private final ahbt e;
    private final ConcurrentHashMap f;
    private final fxp g;

    public fxq(Context context, ahbt ahbtVar, hag hagVar) {
        context.getClass();
        ahbtVar.getClass();
        hagVar.getClass();
        this.a = context;
        this.e = ahbtVar;
        this.b = hagVar;
        this.f = new ConcurrentHashMap();
        this.g = new fxp(this);
    }

    @Override // defpackage.fxu
    public final void a(fxk fxkVar) {
        fxkVar.getClass();
        ConcurrentHashMap concurrentHashMap = this.f;
        fxr fxrVar = fxkVar.a;
        Set set = (Set) concurrentHashMap.get(fxrVar);
        if (set != null) {
            set.remove(fxkVar);
            if (set.isEmpty()) {
                concurrentHashMap.remove(fxrVar);
            }
        }
        if (concurrentHashMap.isEmpty()) {
            this.a.unregisterReceiver(this.g);
        }
    }

    @Override // defpackage.fxt
    public final void b(fxr fxrVar) {
        fxrVar.getClass();
        ahal.e(this.e, null, 0, new fxn(this, fxrVar, null), 3);
    }

    public final void c(fxr fxrVar) {
        Set set = (Set) this.f.get(fxrVar);
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ahal.e(this.e, null, 0, new fxo((fxk) it.next(), null), 3);
            }
        }
    }

    @Override // defpackage.fxu
    public final void d(fxk fxkVar) {
        fxkVar.getClass();
        ConcurrentHashMap concurrentHashMap = this.f;
        if (concurrentHashMap.isEmpty()) {
            abs.c(this.a, this.g, d, null, 2);
        }
        Object objComputeIfAbsent = ConcurrentMap.EL.computeIfAbsent(concurrentHashMap, fxkVar.a, new Function() { // from class: fxm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo116andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i = fxq.c;
                ((fxr) obj).getClass();
                return new LinkedHashSet();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        objComputeIfAbsent.getClass();
        ((Collection) objComputeIfAbsent).add(fxkVar);
    }
}
