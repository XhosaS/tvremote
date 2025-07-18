package j$.util;

import j$.util.Spliterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes4.dex */
public final /* synthetic */ class F implements Spliterator.OfLong {
    public final /* synthetic */ Spliterator.OfLong a;

    public /* synthetic */ F(Spliterator.OfLong ofLong) {
        this.a = ofLong;
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfLong ofLong = this.a;
        if (obj instanceof F) {
            obj = ((F) obj).a;
        }
        return ofLong.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.a.forEachRemaining((Spliterator.OfLong) longConsumer);
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
    public final /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return this.a.tryAdvance((Spliterator.OfLong) longConsumer);
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfLong trySplit() {
        Spliterator.OfLong ofLongTrySplit = this.a.trySplit();
        if (ofLongTrySplit == null) {
            return null;
        }
        return ofLongTrySplit instanceof E ? ((E) ofLongTrySplit).a : new F(ofLongTrySplit);
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return H.a(this.a.trySplit());
    }

    @Override // java.util.Spliterator.OfLong
    /* renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(LongConsumer longConsumer) {
        this.a.forEachRemaining(longConsumer);
    }

    @Override // java.util.Spliterator.OfLong
    /* renamed from: tryAdvance, reason: avoid collision after fix types in other method */
    public final /* synthetic */ boolean tryAdvance2(LongConsumer longConsumer) {
        return this.a.tryAdvance(longConsumer);
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ java.util.Spliterator trySplit() {
        return J.a(this.a.trySplit());
    }
}
