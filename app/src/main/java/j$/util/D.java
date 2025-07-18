package j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class D implements F {
    public final /* synthetic */ Spliterator.OfPrimitive a;

    public /* synthetic */ D(Spliterator.OfPrimitive ofPrimitive) {
        this.a = ofPrimitive;
    }

    public static /* synthetic */ F a(Spliterator.OfPrimitive ofPrimitive) {
        if (ofPrimitive == null) {
            return null;
        }
        if (ofPrimitive instanceof E) {
            return ((E) ofPrimitive).a;
        }
        if (ofPrimitive instanceof Spliterator.OfDouble) {
            Spliterator.OfDouble ofDouble = (Spliterator.OfDouble) ofPrimitive;
            return ofDouble instanceof w ? ((w) ofDouble).a : new v(ofDouble);
        }
        if (ofPrimitive instanceof Spliterator.OfInt) {
            Spliterator.OfInt ofInt = (Spliterator.OfInt) ofPrimitive;
            return ofInt instanceof z ? ((z) ofInt).a : new y(ofInt);
        }
        if (!(ofPrimitive instanceof Spliterator.OfLong)) {
            return new D(ofPrimitive);
        }
        Spliterator.OfLong ofLong = (Spliterator.OfLong) ofPrimitive;
        return ofLong instanceof B ? ((B) ofLong).a : new A(ofLong);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfPrimitive ofPrimitive = this.a;
        if (obj instanceof D) {
            obj = ((D) obj).a;
        }
        return ofPrimitive.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // j$.util.F
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.a.forEachRemaining((Spliterator.OfPrimitive) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.F
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.a.tryAdvance((Spliterator.OfPrimitive) obj);
    }

    @Override // j$.util.F, j$.util.Spliterator
    public final /* synthetic */ F trySplit() {
        return a(this.a.trySplit());
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining(consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.a.tryAdvance(consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return G.a(this.a.trySplit());
    }
}
