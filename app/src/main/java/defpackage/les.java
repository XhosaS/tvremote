package defpackage;

import java.net.URL;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
class les implements Runnable {
    public final leq a;
    public final String b;
    final /* synthetic */ let c;
    private final URL d;
    private final byte[] e;
    private final Map f;

    public les(let letVar, String str, URL url, byte[] bArr, Map map, leq leqVar) {
        this.c = letVar;
        kkk.h(str);
        kkk.k(url);
        this.d = url;
        this.e = bArr;
        this.a = leqVar;
        this.b = str;
        this.f = map;
    }

    private final void a(final int i, final Exception exc, final byte[] bArr) {
        lbk lbkVar = this.c.y;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.h(new Runnable() { // from class: ler
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.a(i, exc, bArr);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0115 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.les.run():void");
    }
}
