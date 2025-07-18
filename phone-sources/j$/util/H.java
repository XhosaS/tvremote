package j$.util;

import j$.util.Spliterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes4.dex */
public final /* synthetic */ class H implements Spliterator.OfPrimitive {
    public final /* synthetic */ Spliterator.OfPrimitive a;

    public /* synthetic */ H(Spliterator.OfPrimitive ofPrimitive) {
        this.a = ofPrimitive;
    }

    public static /* synthetic */ Spliterator.OfPrimitive a(Spliterator.OfPrimitive ofPrimitive) {
        if (ofPrimitive == null) {
            return null;
        }
        if (ofPrimitive instanceof G) {
            return ((G) ofPrimitive).a;
        }
        if (ofPrimitive instanceof Spliterator.OfDouble) {
            Spliterator.OfDouble ofDouble = (Spliterator.OfDouble) ofPrimitive;
            return ofDouble instanceof A ? ((A) ofDouble).a : new B(ofDouble);
        }
        if (ofPrimitive instanceof Spliterator.OfInt) {
            Spliterator.OfInt ofInt = (Spliterator.OfInt) ofPrimitive;
            return ofInt instanceof C ? ((C) ofInt).a : new D(ofInt);
        }
        if (!(ofPrimitive instanceof Spliterator.OfLong)) {
            return new H(ofPrimitive);
        }
        Spliterator.OfLong ofLong = (Spliterator.OfLong) ofPrimitive;
        return ofLong instanceof E ? ((E) ofLong).a : new F(ofLong);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfPrimitive ofPrimitive = this.a;
        if (obj instanceof H) {
            obj = ((H) obj).a;
        }
        return ofPrimitive.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.a.forEachRemaining((Spliterator.OfPrimitive) obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.a.tryAdvance((Spliterator.OfPrimitive) obj);
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return a(this.a.trySplit());
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ java.util.Spliterator trySplit() {
        return J.a(this.a.trySplit());
    }
}
