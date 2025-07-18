package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayf extends awo implements asm, auh {
    public static final long a = TimeUnit.HOURS.toMillis(12);
    public final aue b;
    public final Context c;
    public final cov d;
    public final ayv e;
    private final asq f;
    private final Executor g;

    public ayf(auf aufVar, Context context, asq asqVar, Executor executor, cov covVar, ayv ayvVar, crv crvVar) {
        this.b = aufVar.a(executor, covVar, crvVar);
        this.g = executor;
        this.c = context;
        this.d = covVar;
        this.e = ayvVar;
        this.f = asqVar;
    }

    @Override // defpackage.asm
    public final void i(aqe aqeVar) {
        this.f.b(this);
        qm.O(new chs() { // from class: aye
            /* JADX WARN: Removed duplicated region for block: B:66:0x01b5  */
            /* JADX WARN: Removed duplicated region for block: B:67:0x01c3  */
            /* JADX WARN: Type inference failed for: r11v20, types: [crv, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r11v29, types: [crv, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v28, types: [crv, java.lang.Object] */
            @Override // defpackage.chs
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final defpackage.cja a() throws java.lang.InterruptedException, android.content.pm.PackageManager.NameNotFoundException, java.io.IOException {
                /*
                    Method dump skipped, instructions count: 793
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.aye.a():cja");
            }
        }, this.g);
    }

    @Override // defpackage.auh
    public final void t() {
        this.f.a(this);
    }

    @Override // defpackage.asm
    public final /* synthetic */ void j(aqe aqeVar) {
    }
}
