package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class axj implements chs {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ axj(avg avgVar, AtomicInteger atomicInteger, int i, int i2) {
        this.d = i2;
        this.b = avgVar;
        this.c = atomicInteger;
        this.a = i;
    }

    @Override // defpackage.chs
    public final cja a() {
        if (this.d != 0) {
            if (((AtomicInteger) this.c).getAndDecrement() <= 0) {
                return ciw.a;
            }
            int i = this.a;
            avg avgVar = (avg) this.b;
            return avgVar.n(i, (aut) avgVar.b.a());
        }
        final axm axmVar = (axm) this.b;
        axb axbVar = (axb) axmVar.c.a();
        if ((true != axbVar.b() ? -1L : 1000L) == -1) {
            return ciw.a;
        }
        Object obj = this.c;
        final int i2 = this.a;
        cja cjaVarK = qm.K(null);
        byg bygVar = axbVar.a;
        cit citVarX = cit.x(cjaVarK);
        ata ataVar = new ata(5);
        cjd cjdVar = axmVar.a;
        final String str = (String) obj;
        return chk.i(cgp.h(citVarX, RuntimeException.class, ataVar, cjdVar), new cht() { // from class: axl
            /* JADX WARN: Removed duplicated region for block: B:102:0x028a  */
            /* JADX WARN: Removed duplicated region for block: B:111:0x02c9  */
            /* JADX WARN: Removed duplicated region for block: B:143:0x0377  */
            /* JADX WARN: Removed duplicated region for block: B:146:0x0393  */
            /* JADX WARN: Removed duplicated region for block: B:149:0x03cf  */
            /* JADX WARN: Removed duplicated region for block: B:152:0x03eb  */
            /* JADX WARN: Removed duplicated region for block: B:155:0x0424  */
            /* JADX WARN: Removed duplicated region for block: B:158:0x043d  */
            /* JADX WARN: Removed duplicated region for block: B:161:0x045d  */
            /* JADX WARN: Removed duplicated region for block: B:164:0x0477  */
            /* JADX WARN: Removed duplicated region for block: B:170:0x049a  */
            /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
            @Override // defpackage.cht
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final defpackage.cja a(java.lang.Object r27) throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 1249
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.axl.a(java.lang.Object):cja");
            }
        }, cjdVar);
    }

    public /* synthetic */ axj(axm axmVar, int i, String str, int i2) {
        this.d = i2;
        this.b = axmVar;
        this.a = i;
        this.c = str;
    }
}
