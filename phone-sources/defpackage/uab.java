package defpackage;

import com.google.common.collect.AbstractIterator;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uab extends AbstractIterator {
    final /* synthetic */ tts a;
    final /* synthetic */ uae b;
    private int c = 0;
    private final ttl d;

    public uab(uae uaeVar, tts ttsVar) {
        this.a = ttsVar;
        this.b = uaeVar;
        this.d = ttl.c(ttsVar);
    }

    @Override // com.google.common.collect.AbstractIterator
    protected final /* bridge */ /* synthetic */ Object computeNext() {
        ttl ttlVar = this.d;
        int i = this.c;
        Duration.ofNanos(ttlVar.b()).getClass();
        uae uaeVar = this.b;
        Duration durationOfNanos = !uaeVar.a(i) ? uae.d : i == 0 ? Duration.ZERO : !uaeVar.a(i) ? uae.d : Duration.ofNanos((long) (uen.a(((uad) uaeVar).b) * Math.pow(2.0d, i - 1)));
        if (durationOfNanos.isNegative()) {
            endOfData();
            return null;
        }
        this.c++;
        return durationOfNanos;
    }
}
