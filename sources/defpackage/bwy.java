package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bwy implements Consumer {
    private final /* synthetic */ int a;

    public /* synthetic */ bwy(int i) {
        this.a = i;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.a == 0) {
            ((bxm) obj).a();
        } else {
            bwm bwmVar = bwx.a;
            ((bxm) obj).a();
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return this.a != 0 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
    }
}
