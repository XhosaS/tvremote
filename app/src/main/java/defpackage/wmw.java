package defpackage;

import j$.lang.Iterable$EL;
import j$.util.function.Consumer$CC;
import java.util.Set;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wmw {
    private final aehf a;

    public wmw(aehf aehfVar) {
        this.a = aehfVar;
    }

    public final void a() {
        Iterable$EL.forEach((Set) this.a.a(), new Consumer() { // from class: wmv
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((vrh) obj).b();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void b() {
        Iterable$EL.forEach((Set) this.a.a(), new Consumer() { // from class: wmt
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((vrh) obj).a();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void c() {
        Iterable$EL.forEach((Set) this.a.a(), new Consumer() { // from class: wmu
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((vrh) obj).c();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
