package defpackage;

import j$.util.Collection;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import j$.util.function.Predicate$CC;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uaa {
    public static final zdy a = zdy.h("com/google/android/libraries/speech/transcription/recognition/service/RecognitionServiceWrapper");
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final tzh c;
    private final Set d;

    public uaa(tzh tzhVar, Set set) {
        this.c = tzhVar;
        this.d = set;
    }

    public final void a() {
        Collection.EL.stream(this.d).filter(new Predicate() { // from class: tzj
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            public final /* synthetic */ Predicate negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((tyj) obj).a();
            }
        }).forEach(new Consumer() { // from class: tzk
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((tyj) obj).b();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
