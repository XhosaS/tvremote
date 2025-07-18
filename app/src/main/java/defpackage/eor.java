package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eor implements aakx {
    static final eor a = new eor();
    private static final aakw b;

    static {
        aakv aakvVar = new aakv("messagingClientEvent");
        aakvVar.b(new aakz(1, aalc.DEFAULT));
        b = aakvVar.a();
    }

    private eor() {
    }

    @Override // defpackage.aakt
    public final /* synthetic */ void a(Object obj, Object obj2) throws IOException {
        aalf aalfVar = (aalf) obj2;
        aalfVar.c(b, ((aarf) obj).a, true);
    }
}
