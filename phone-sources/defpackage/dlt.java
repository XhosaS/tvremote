package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dlt extends yiz implements yjz {
    Object a;
    Object b;
    int c;
    int d;
    int e;
    final /* synthetic */ dlv f;
    final /* synthetic */ Context g;
    final /* synthetic */ int[] h;
    private /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlt(dlv dlvVar, Context context, int[] iArr, yih yihVar) {
        super(2, yihVar);
        this.f = dlvVar;
        this.g = context;
        this.h = iArr;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlt) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        dlt dltVar = new dlt(this.f, this.g, this.h, yihVar);
        dltVar.i = obj;
        return dltVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0033  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x004f -> B:10:0x0052). Please report as a decompilation issue!!! */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            yio r0 = defpackage.yio.a
            int r1 = r9.e
            r2 = 1
            if (r1 == 0) goto L17
            int r1 = r9.d
            int r3 = r9.c
            java.lang.Object r4 = r9.b
            java.lang.Object r5 = r9.a
            java.lang.Object r6 = r9.i
            int[] r6 = (int[]) r6
            defpackage.ybn.f(r10)
            goto L52
        L17:
            defpackage.ybn.f(r10)
            java.lang.Object r10 = r9.i
            yow r10 = (defpackage.yow) r10
            dlv r1 = r9.f
            android.content.Context r3 = r9.g
            int r4 = defpackage.dlv.b
            r1.b(r10, r3)
            int[] r10 = r9.h
            int r4 = r10.length
            r5 = 0
            r6 = r5
            r5 = r1
            r1 = r4
            r4 = r3
            r3 = r6
            r6 = r10
        L31:
            if (r3 >= r1) goto L54
            r10 = r6[r3]
            r7 = r5
            dlv r7 = (defpackage.dlv) r7
            dlj r7 = r7.a()
            r9.i = r6
            r9.a = r5
            r9.b = r4
            r9.c = r3
            r9.d = r1
            r9.e = r2
            r8 = r4
            android.content.Context r8 = (android.content.Context) r8
            java.lang.Object r10 = r7.b(r8, r10, r9)
            if (r10 != r0) goto L52
            return r0
        L52:
            int r3 = r3 + r2
            goto L31
        L54:
            ygi r10 = defpackage.ygi.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlt.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
