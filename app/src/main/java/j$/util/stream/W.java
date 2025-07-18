package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Function;

/* loaded from: classes3.dex */
public final class W extends a0 {
    public boolean b;
    public final /* synthetic */ Function c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(c0 c0Var, Function function) {
        super(c0Var);
        this.c = function;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) throws Exception {
        Stream stream = (Stream) this.c.apply(obj);
        if (stream != null) {
            try {
                boolean z = this.b;
                c0 c0Var = this.a;
                if (z) {
                    Spliterator spliterator = ((Stream) stream.sequential()).spliterator();
                    while (!c0Var.g() && spliterator.tryAdvance(c0Var)) {
                    }
                } else {
                    ((Stream) stream.sequential()).forEach(c0Var);
                }
            } catch (Throwable th) {
                try {
                    stream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (stream != null) {
            stream.close();
        }
    }

    @Override // j$.util.stream.a0, j$.util.stream.c0
    public final void d(long j) {
        this.a.d(-1L);
    }

    @Override // j$.util.stream.a0, j$.util.stream.c0
    public final boolean g() {
        this.b = true;
        return this.a.g();
    }
}
