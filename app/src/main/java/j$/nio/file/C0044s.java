package j$.nio.file;

import j$.util.C0079n;
import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import j$.util.stream.AbstractC0083a;
import j$.util.stream.C0090h;
import j$.util.stream.c0;
import j$.util.stream.k0;
import j$.util.stream.s0;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* renamed from: j$.nio.file.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0044s implements Consumer, s0, c0, Supplier {
    public final /* synthetic */ int a;
    public final Consumer b;

    public /* synthetic */ C0044s(Consumer consumer, int i) {
        this.a = i;
        this.b = consumer;
    }

    @Override // j$.util.stream.s0
    public Object a(AbstractC0083a abstractC0083a, Spliterator spliterator) {
        abstractC0083a.a(spliterator, abstractC0083a.m(this));
        return null;
    }

    @Override // j$.util.stream.c0
    public /* synthetic */ void accept(int i) {
        switch (this.a) {
            case 3:
                j$.util.stream.L.d();
                throw null;
            default:
                j$.util.stream.L.d();
                throw null;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.s0
    public Object b(AbstractC0083a abstractC0083a, Spliterator spliterator) {
        new C0090h(abstractC0083a, spliterator, abstractC0083a.m(this)).invoke();
        return null;
    }

    @Override // j$.util.stream.s0
    public int c() {
        return k0.o;
    }

    @Override // j$.util.stream.c0
    public /* synthetic */ void d(long j) {
        int i = this.a;
    }

    @Override // j$.util.stream.c0
    public /* synthetic */ void end() {
        int i = this.a;
    }

    @Override // j$.util.stream.c0
    public /* synthetic */ boolean g() {
        switch (this.a) {
        }
        return false;
    }

    @Override // java.util.function.Supplier
    public /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.accept(AbstractC0002a.g(obj));
                break;
            case 1:
                this.b.accept(AbstractC0002a.g(obj));
                break;
            case 2:
                this.b.accept(new C0079n((Map.Entry) obj));
                break;
            case 3:
                this.b.accept(obj);
                break;
            default:
                this.b.accept(obj);
                break;
        }
    }

    private final /* synthetic */ void f(long j) {
    }

    private final /* synthetic */ void h(long j) {
    }

    private final /* synthetic */ void j() {
    }

    private final /* synthetic */ void k() {
    }
}
