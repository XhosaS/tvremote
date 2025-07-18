package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class uaa implements Iterable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ uaa(tsg tsgVar, Iterable iterable, int i) {
        this.c = i;
        this.b = tsgVar;
        this.a = iterable;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Iterable, java.lang.Object] */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        if (this.c != 0) {
            return ((tsg) this.b).lambda$convertAll$0(this.a);
        }
        return new uab((uae) this.a, (tts) this.b);
    }

    public /* synthetic */ uaa(uae uaeVar, tts ttsVar, int i) {
        this.c = i;
        this.a = uaeVar;
        this.b = ttsVar;
    }
}
