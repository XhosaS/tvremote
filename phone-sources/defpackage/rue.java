package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rue extends rrx implements roq, rqf {
    public static final long a = TimeUnit.HOURS.toMillis(12);
    public final rqd b;
    public final Context c;
    public final xbw d;
    public final rvg e;
    private final rou f;
    private final Executor g;

    public rue(yyh yyhVar, Context context, rou rouVar, Executor executor, xbw xbwVar, rvg rvgVar, yfo yfoVar) {
        super(null);
        this.b = yyhVar.f(executor, xbwVar, yfoVar);
        this.g = executor;
        this.c = context;
        this.d = xbwVar;
        this.e = rvgVar;
        this.f = rouVar;
    }

    @Override // defpackage.roq
    public final void g(rmp rmpVar) {
        this.f.b(this);
        sfy.G(new ufv() { // from class: rud
            /* JADX WARN: Removed duplicated region for block: B:153:0x01b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:158:0x0242 A[SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r11v15, types: [java.lang.Object, yfo] */
            /* JADX WARN: Type inference failed for: r1v37, types: [java.lang.Object, yfo] */
            /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, yfo] */
            @Override // defpackage.ufv
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final defpackage.uhp a() throws java.lang.InterruptedException, android.content.pm.PackageManager.NameNotFoundException, java.io.IOException {
                /*
                    Method dump skipped, instructions count: 1172
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.rud.a():uhp");
            }
        }, this.g);
    }

    @Override // defpackage.rqf
    public final void k() {
        this.f.a(this);
    }

    @Override // defpackage.roq
    public final /* synthetic */ void j(rmp rmpVar) {
    }
}
