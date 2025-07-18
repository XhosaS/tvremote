package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cea extends yiz implements yjz {
    Object a;
    int b;
    final /* synthetic */ ContentResolver c;
    final /* synthetic */ Uri d;
    final /* synthetic */ ceb e;
    final /* synthetic */ yrz f;
    final /* synthetic */ Context g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cea(ContentResolver contentResolver, Uri uri, ceb cebVar, yrz yrzVar, Context context, yih yihVar) {
        super(2, yihVar);
        this.c = contentResolver;
        this.d = uri;
        this.e = cebVar;
        this.f = yrzVar;
        this.g = context;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cea) create((ysy) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        cea ceaVar = new cea(this.c, this.d, this.e, this.f, this.g, yihVar);
        ceaVar.h = obj;
        return ceaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c A[Catch: all -> 0x007d, TRY_LEAVE, TryCatch #0 {all -> 0x007d, blocks: (B:6:0x000f, B:13:0x0035, B:15:0x0044, B:17:0x004c, B:9:0x0019, B:12:0x002f), top: B:27:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0070 -> B:13:0x0035). Please report as a decompilation issue!!! */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            yio r0 = defpackage.yio.a
            int r1 = r6.b
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 == r2) goto L13
            java.lang.Object r1 = r6.a
            java.lang.Object r3 = r6.h
            ysy r3 = (defpackage.ysy) r3
            defpackage.ybn.f(r7)     // Catch: java.lang.Throwable -> L7d
            goto L35
        L13:
            java.lang.Object r1 = r6.a
            java.lang.Object r3 = r6.h
            ysy r3 = (defpackage.ysy) r3
            defpackage.ybn.f(r7)     // Catch: java.lang.Throwable -> L7d
            goto L44
        L1d:
            defpackage.ybn.f(r7)
            java.lang.Object r7 = r6.h
            r3 = r7
            ysy r3 = (defpackage.ysy) r3
            android.content.ContentResolver r7 = r6.c
            android.net.Uri r1 = r6.d
            r4 = 0
            ceb r5 = r6.e
            r7.registerContentObserver(r1, r4, r5)
            yrz r7 = r6.f     // Catch: java.lang.Throwable -> L7d
            yrr r1 = r7.C()     // Catch: java.lang.Throwable -> L7d
        L35:
            r6.h = r3     // Catch: java.lang.Throwable -> L7d
            r6.a = r1     // Catch: java.lang.Throwable -> L7d
            r6.b = r2     // Catch: java.lang.Throwable -> L7d
            r7 = r1
            yrr r7 = (defpackage.yrr) r7     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r7 = r7.a(r6)     // Catch: java.lang.Throwable -> L7d
            if (r7 == r0) goto L7f
        L44:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L7d
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L7d
            if (r7 == 0) goto L73
            r7 = r1
            yrr r7 = (defpackage.yrr) r7     // Catch: java.lang.Throwable -> L7d
            r7.b()     // Catch: java.lang.Throwable -> L7d
            android.content.Context r7 = r6.g     // Catch: java.lang.Throwable -> L7d
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r4 = "animator_duration_scale"
            r5 = 1065353216(0x3f800000, float:1.0)
            float r7 = android.provider.Settings.Global.getFloat(r7, r4, r5)     // Catch: java.lang.Throwable -> L7d
            java.lang.Float r4 = new java.lang.Float     // Catch: java.lang.Throwable -> L7d
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L7d
            r6.h = r3     // Catch: java.lang.Throwable -> L7d
            r6.a = r1     // Catch: java.lang.Throwable -> L7d
            r7 = 2
            r6.b = r7     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r7 = r3.emit(r4, r6)     // Catch: java.lang.Throwable -> L7d
            if (r7 != r0) goto L35
            goto L7f
        L73:
            android.content.ContentResolver r7 = r6.c
            ceb r0 = r6.e
            r7.unregisterContentObserver(r0)
            ygi r7 = defpackage.ygi.a
            return r7
        L7d:
            r7 = move-exception
            goto L80
        L7f:
            return r0
        L80:
            android.content.ContentResolver r0 = r6.c
            ceb r1 = r6.e
            r0.unregisterContentObserver(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cea.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
