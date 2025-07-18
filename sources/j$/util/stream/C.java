package j$.util.stream;

import java.util.function.Function;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final class C extends z {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public C(G g, Object obj, int i) {
        this.b = i;
        this.c = obj;
        g.getClass();
        this.a = g;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                if (((Predicate) this.c).test(obj)) {
                    ((G) this.a).accept(obj);
                    break;
                }
                break;
            default:
                ((G) this.a).accept(((Function) this.c).apply(obj));
                break;
        }
    }

    @Override // j$.util.stream.z, j$.util.stream.G
    public void b(long j) {
        switch (this.b) {
            case 0:
                ((G) this.a).b(-1L);
                break;
            default:
                super.b(j);
                break;
        }
    }
}
