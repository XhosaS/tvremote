package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.concurrent.Executor;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tfo implements aejg {
    public static absv b(Context context, Executor executor, Optional optional, mcw mcwVar, abst abstVar) {
        context.getClass();
        executor.getClass();
        mcwVar.getClass();
        Optional optionalEmpty = Optional.empty();
        Optional optionalEmpty2 = Optional.empty();
        Optional.empty();
        Optional.empty();
        Optional optionalEmpty3 = Optional.empty();
        Optional optionalOf = Optional.of(new abtf(context.getContentResolver(), executor));
        Optional optionalOf2 = Optional.of(abstVar);
        optional.isPresent();
        abss abssVar = (abss) optionalOf.orElseGet(new Supplier() { // from class: absx
            @Override // java.util.function.Supplier
            public final Object get() {
                return new abss() { // from class: abta
                    @Override // defpackage.abss
                    public final zyd a() {
                        return zxn.h(absg.c(zcp.b));
                    }
                };
            }
        });
        abst abstVar2 = (abst) optionalOf2.orElseGet(new Supplier() { // from class: absz
            @Override // java.util.function.Supplier
            public final Object get() {
                return new abtd();
            }
        });
        yzq yzqVar = abru.a;
        return new abti(new abru(new absf(abssVar, absu.a), new absf(abssVar, absu.b), new absf(abssVar, absu.c), optionalEmpty3), abstVar2);
    }

    @Override // defpackage.agow
    public final /* bridge */ /* synthetic */ Object a() {
        throw null;
    }
}
