package defpackage;

import android.content.Context;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evm implements evy {
    public fjg a;
    private final evl b;
    private final eer c;
    private boolean d;

    public evm(Context context, fds fdsVar) {
        eez eezVar = new eez(context);
        this.c = eezVar;
        this.a = new fjf(1);
        evl evlVar = new evl(fdsVar, this.a);
        this.b = evlVar;
        if (eezVar != evlVar.d) {
            evlVar.d = eezVar;
            evlVar.b.clear();
            evlVar.c.clear();
        }
        this.d = true;
    }

    public static evy a(Class cls, eer eerVar) {
        try {
            return (evy) cls.getConstructor(eer.class).newInstance(eerVar);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0218  */
    @Override // defpackage.evy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ewb b(defpackage.dzy r13) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.evm.b(dzy):ewb");
    }

    @Override // defpackage.evy
    @Deprecated
    public final /* bridge */ /* synthetic */ void d(boolean z) {
        this.d = z;
        evl evlVar = this.b;
        evlVar.e = z;
        ((fdl) evlVar.a).b(z);
        Iterator it = evlVar.c.values().iterator();
        while (it.hasNext()) {
            ((evy) it.next()).d(z);
        }
    }

    @Override // defpackage.evy
    public final /* bridge */ /* synthetic */ void g(fjg fjgVar) {
        fjgVar.getClass();
        this.a = fjgVar;
        evl evlVar = this.b;
        evlVar.f = fjgVar;
        ((fdl) evlVar.a).d(fjgVar);
        Iterator it = evlVar.c.values().iterator();
        while (it.hasNext()) {
            ((evy) it.next()).g(fjgVar);
        }
    }

    @Override // defpackage.evy
    public final /* bridge */ /* synthetic */ void e() {
    }
}
