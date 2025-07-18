package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: j$.util.stream.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0137n extends AbstractC0113b {
    public final C0131k j;
    public final boolean k;

    public C0137n(C0131k c0131k, boolean z, AbstractC0111a abstractC0111a, Spliterator spliterator) {
        super(abstractC0111a, spliterator);
        this.k = z;
        this.j = c0131k;
    }

    @Override // j$.util.stream.AbstractC0117d
    public final Object a() {
        AbstractC0111a abstractC0111a = this.a;
        s1 s1Var = (s1) this.j.d.get();
        abstractC0111a.n(this.b, s1Var);
        Object obj = s1Var.get();
        if (this.k) {
            if (obj != null) {
                i(obj);
                return obj;
            }
        } else if (obj != null) {
            AtomicReference atomicReference = this.h;
            while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC0117d
    public final AbstractC0117d e(Spliterator spliterator) {
        return new C0137n(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0113b
    public final Object h() {
        return this.j.b;
    }

    public final void i(Object obj) {
        if (c()) {
            AtomicReference atomicReference = this.h;
            while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
            }
            return;
        }
        AbstractC0117d abstractC0117d = this;
        for (AbstractC0117d abstractC0117d2 = (AbstractC0113b) b(); abstractC0117d2 != null; abstractC0117d2 = (AbstractC0113b) abstractC0117d2.b()) {
            if (abstractC0117d2.d == abstractC0117d) {
                AbstractC0113b abstractC0113b = (AbstractC0113b) abstractC0117d2.e;
                if (!abstractC0113b.i) {
                    abstractC0113b.i = true;
                }
            }
            abstractC0117d = abstractC0117d2;
        }
    }

    @Override // j$.util.stream.AbstractC0117d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        Object objH;
        if (this.k) {
            C0137n c0137n = (C0137n) this.d;
            C0137n c0137n2 = null;
            while (true) {
                if (c0137n != c0137n2) {
                    if (c0137n.d()) {
                        objH = c0137n.h.get();
                        if (objH == null) {
                            objH = c0137n.h();
                        }
                    } else {
                        objH = c0137n.f;
                    }
                    if (objH != null && this.j.c.test(objH)) {
                        f(objH);
                        i(objH);
                        break;
                    } else {
                        c0137n2 = c0137n;
                        c0137n = (C0137n) this.e;
                    }
                } else {
                    break;
                }
            }
        }
        super.onCompletion(countedCompleter);
    }

    public C0137n(C0137n c0137n, Spliterator spliterator) {
        super(c0137n, spliterator);
        this.k = c0137n.k;
        this.j = c0137n.j;
    }
}
