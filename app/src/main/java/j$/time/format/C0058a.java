package j$.time.format;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: j$.time.format.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0058a extends B {
    public final /* synthetic */ A d;

    public C0058a(A a) {
        this.d = a;
    }

    @Override // j$.time.format.B
    public final String b(j$.time.chrono.m mVar, j$.time.temporal.n nVar, long j, G g, Locale locale) {
        return this.d.a(j, g);
    }

    @Override // j$.time.format.B
    public final String c(j$.time.temporal.n nVar, long j, G g, Locale locale) {
        return this.d.a(j, g);
    }

    @Override // j$.time.format.B
    public final Iterator d(j$.time.chrono.m mVar, j$.time.temporal.n nVar, G g, Locale locale) {
        List list = (List) this.d.b.get(g);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }

    @Override // j$.time.format.B
    public final Iterator e(j$.time.temporal.n nVar, G g, Locale locale) {
        List list = (List) this.d.b.get(g);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }
}
