package j$.util;

import j$.util.function.Consumer$CC;
import j$.util.stream.G;
import java.util.Map;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class j implements Consumer, G {
    public final /* synthetic */ int a;
    public final /* synthetic */ Consumer b;

    public /* synthetic */ j(Consumer consumer, int i) {
        this.a = i;
        this.b = consumer;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.accept(new k((Map.Entry) obj));
                break;
            default:
                this.b.accept(obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.G
    public /* synthetic */ boolean c() {
        return false;
    }

    @Override // j$.util.stream.G
    public /* synthetic */ void b(long j) {
    }

    @Override // j$.util.stream.G
    public /* synthetic */ void end() {
    }
}
