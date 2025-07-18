package defpackage;

import android.content.Context;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qfc implements qez {
    public static final tvn a = tvn.n("GnpSdk");
    public final Context b;
    public final Map c;
    public final xbw d;
    public final xbw e;
    public final xbw f;
    private final yil g;

    public qfc(Context context, Map map, xbw xbwVar, xbw xbwVar2, xbw xbwVar3, yil yilVar) {
        map.getClass();
        xbwVar.getClass();
        xbwVar2.getClass();
        xbwVar3.getClass();
        this.b = context;
        this.c = map;
        this.d = xbwVar;
        this.e = xbwVar2;
        this.f = xbwVar3;
        this.g = yilVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.qez
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.gox r8, int r9, defpackage.yih r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.qfa
            if (r0 == 0) goto L13
            r0 = r10
            qfa r0 = (defpackage.qfa) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qfa r0 = new qfa
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            qdz r8 = r0.d
            defpackage.ybn.f(r10)     // Catch: java.lang.Throwable -> L2a
            goto L50
        L2a:
            r9 = move-exception
            goto L5d
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            defpackage.ybn.f(r10)
            qdz r10 = new qdz
            r10.<init>(r4)
            yil r2 = r7.g     // Catch: java.lang.Throwable -> L5a
            qfb r5 = new qfb     // Catch: java.lang.Throwable -> L5a
            r5.<init>(r7, r8, r9, r3)     // Catch: java.lang.Throwable -> L5a
            r0.d = r10     // Catch: java.lang.Throwable -> L5a
            r0.c = r4     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r8 = defpackage.ykr.l(r2, r5, r0)     // Catch: java.lang.Throwable -> L5a
            if (r8 == r1) goto L59
            r6 = r10
            r10 = r8
            r8 = r6
        L50:
            gli r10 = (defpackage.gli) r10     // Catch: java.lang.Throwable -> L2a
            defpackage.wef.v(r8, r3)
            r10.getClass()
            return r10
        L59:
            return r1
        L5a:
            r8 = move-exception
            r9 = r8
            r8 = r10
        L5d:
            throw r9     // Catch: java.lang.Throwable -> L5e
        L5e:
            r10 = move-exception
            defpackage.wef.v(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qfc.a(gox, int, yih):java.lang.Object");
    }
}
