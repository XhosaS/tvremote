package j$.util;

import j$.util.Spliterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes4.dex */
public final /* synthetic */ class G implements Spliterator.OfPrimitive {
    public final /* synthetic */ Spliterator.OfPrimitive a;

    public /* synthetic */ G(Spliterator.OfPrimitive ofPrimitive) {
        this.a = ofPrimitive;
    }

    public static /* synthetic */ Spliterator.OfPrimitive a(Spliterator.OfPrimitive ofPrimitive) {
        if (ofPrimitive == null) {
            return null;
        }
        if (ofPrimitive instanceof H) {
            return ((H) ofPrimitive).a;
        }
        if (ofPrimitive instanceof Spliterator.OfDouble) {
            Spliterator.OfDouble ofDouble = (Spliterator.OfDouble) ofPrimitive;
            return ofDouble instanceof B ? ((B) ofDouble).a : new A(ofDouble);
        }
        if (ofPrimitive instanceof Spliterator.OfInt) {
            Spliterator.OfInt ofInt = (Spliterator.OfInt) ofPrimitive;
            return ofInt instanceof D ? ((D) ofInt).a : new C(ofInt);
        }
        if (!(ofPrimitive instanceof Spliterator.OfLong)) {
            return new G(ofPrimitive);
        }
        Spliterator.OfLong ofLong = (Spliterator.OfLong) ofPrimitive;
        return ofLong instanceof F ? ((F) ofLong).a : new E(ofLong);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfPrimitive ofPrimitive = this.a;
        if (obj instanceof G) {
            obj = ((G) obj).a;
        }
        return ofPrimitive.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.a.forEachRemaining((Spliterator.OfPrimitive) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
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

    @Override // j$.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.a.tryAdvance((Spliterator.OfPrimitive) obj);
    }

    @Override // j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
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
        return I.a(this.a.trySplit());
    }
}
