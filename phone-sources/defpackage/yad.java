package defpackage;

import java.net.ProxySelector;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yad implements ttm {
    private final /* synthetic */ int a;

    public yad(int i) {
        this.a = i;
    }

    @Override // defpackage.ttm
    public final /* synthetic */ Object get() {
        return this.a != 0 ? new ttl() : ProxySelector.getDefault();
    }
}
