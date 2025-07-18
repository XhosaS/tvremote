package defpackage;

import android.support.v7.appcompat.R;
import android.support.v7.widget.ActivityChooserView;
import android.support.v7.widget.helper.ItemTouchHelper;
import j$.time.Duration;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vyf {
    public static volatile xsq a;
    public static volatile xsq b;
    public static volatile xsq c;

    private vyf() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A(defpackage.ysx r6, defpackage.yjz r7, defpackage.yih r8) {
        /*
            boolean r0 = r8 instanceof defpackage.yud
            if (r0 == 0) goto L13
            r0 = r8
            yud r0 = (defpackage.yud) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            yud r0 = new yud
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            ioo r6 = r0.d
            ylf r7 = r0.c
            defpackage.ybn.f(r8)     // Catch: defpackage.yvh -> L2b
            goto L62
        L2b:
            r8 = move-exception
            goto L58
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            defpackage.ybn.f(r8)
            ylf r8 = new ylf
            r8.<init>()
            ioo r2 = new ioo
            r4 = 16
            r5 = 0
            r2.<init>(r7, r8, r4, r5)
            r0.c = r8     // Catch: defpackage.yvh -> L54
            r0.d = r2     // Catch: defpackage.yvh -> L54
            r0.b = r3     // Catch: defpackage.yvh -> L54
            java.lang.Object r6 = r6.a(r2, r0)     // Catch: defpackage.yvh -> L54
            if (r6 == r1) goto L53
            r7 = r8
            goto L62
        L53:
            return r1
        L54:
            r6 = move-exception
            r7 = r8
            r8 = r6
            r6 = r2
        L58:
            defpackage.wae.Y(r8, r6)
            yil r6 = r0.getContext()
            defpackage.yoz.z(r6)
        L62:
            java.lang.Object r6 = r7.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vyf.A(ysx, yjz, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object B(defpackage.ysx r5, defpackage.yih r6) {
        /*
            boolean r0 = r6 instanceof defpackage.yue
            if (r0 == 0) goto L13
            r0 = r6
            yue r0 = (defpackage.yue) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            yue r0 = new yue
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ylf r5 = r0.c
            defpackage.ybn.f(r6)
            goto L4f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ybn.f(r6)
            ylf r6 = new ylf
            r6.<init>()
            yxo r2 = defpackage.yvz.a
            r6.a = r2
            irv r2 = new irv
            r4 = 15
            r2.<init>(r6, r4)
            r0.c = r6
            r0.b = r3
            java.lang.Object r5 = r5.a(r2, r0)
            if (r5 == r1) goto L5e
            r5 = r6
        L4f:
            java.lang.Object r5 = r5.a
            yxo r6 = defpackage.yvz.a
            if (r5 == r6) goto L56
            return r5
        L56:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "Flow is empty"
            r5.<init>(r6)
            throw r5
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vyf.B(ysx, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object C(defpackage.ysy r4, java.lang.Object r5, java.lang.Object r6, defpackage.yih r7) {
        /*
            boolean r0 = r7 instanceof defpackage.ytp
            if (r0 == 0) goto L13
            r0 = r7
            ytp r0 = (defpackage.ytp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ytp r0 = new ytp
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            java.lang.Object r6 = r0.a
            defpackage.ybn.f(r7)
            goto L3f
        L31:
            defpackage.ybn.f(r7)
            r0.a = r6
            r0.c = r3
            java.lang.Object r4 = r4.emit(r5, r0)
            if (r4 != r1) goto L3f
            return r1
        L3f:
            yvh r4 = new yvh
            r4.<init>(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vyf.C(ysy, java.lang.Object, java.lang.Object, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object D(defpackage.ysx r5, defpackage.ysy r6, defpackage.yih r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof defpackage.yti
            if (r0 == 0) goto L13
            r0 = r7
            yti r0 = (defpackage.yti) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            yti r0 = new yti
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ylf r5 = r0.c
            defpackage.ybn.f(r7)     // Catch: java.lang.Throwable -> L29
            goto L4d
        L29:
            r6 = move-exception
            goto L52
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.ybn.f(r7)
            ylf r7 = new ylf
            r7.<init>()
            ioo r2 = new ioo     // Catch: java.lang.Throwable -> L4f
            r4 = 12
            r2.<init>(r6, r7, r4)     // Catch: java.lang.Throwable -> L4f
            r0.c = r7     // Catch: java.lang.Throwable -> L4f
            r0.b = r3     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r5 = r5.a(r2, r0)     // Catch: java.lang.Throwable -> L4f
            if (r5 != r1) goto L4d
            return r1
        L4d:
            r5 = 0
            return r5
        L4f:
            r5 = move-exception
            r6 = r5
            r5 = r7
        L52:
            java.lang.Object r5 = r5.a
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            boolean r7 = U(r6, r5)
            if (r7 != 0) goto L8a
            yil r7 = r0.getContext()
            bbx r0 = defpackage.yqe.c
            yij r7 = r7.get(r0)
            yqe r7 = (defpackage.yqe) r7
            if (r7 == 0) goto L7b
            boolean r0 = r7.v()
            if (r0 != 0) goto L71
            goto L7b
        L71:
            java.util.concurrent.CancellationException r7 = r7.q()
            boolean r7 = U(r6, r7)
            if (r7 != 0) goto L8a
        L7b:
            if (r5 != 0) goto L7e
            return r6
        L7e:
            boolean r7 = r6 instanceof java.util.concurrent.CancellationException
            if (r7 == 0) goto L86
            defpackage.ybn.h(r5, r6)
            throw r5
        L86:
            defpackage.ybn.h(r6, r5)
            throw r6
        L8a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vyf.D(ysx, ysy, yih):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object E(defpackage.ysy r4, defpackage.yka r5, java.lang.Throwable r6, defpackage.yih r7) {
        /*
            boolean r0 = r7 instanceof defpackage.ytc
            if (r0 == 0) goto L13
            r0 = r7
            ytc r0 = (defpackage.ytc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ytc r0 = new ytc
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r6 = r0.a
            defpackage.ybn.f(r7)     // Catch: java.lang.Throwable -> L29
            goto L41
        L29:
            r4 = move-exception
            goto L44
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.ybn.f(r7)
            r0.a = r6     // Catch: java.lang.Throwable -> L29
            r0.c = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r5.a(r4, r6, r0)     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L41
            return r1
        L41:
            ygi r4 = defpackage.ygi.a
            return r4
        L44:
            if (r6 == 0) goto L4d
            if (r6 == r4) goto L4d
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            defpackage.ybn.h(r4, r6)
        L4d:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vyf.E(ysy, yka, java.lang.Throwable, yih):java.lang.Object");
    }

    public static final void F(ysy ysyVar) throws Throwable {
        if (ysyVar instanceof yvg) {
            throw ((yvg) ysyVar).a;
        }
    }

    public static final ysx G(ysx ysxVar) {
        return M(ysxVar, -1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ysx H(ysx ysxVar, yil yilVar) {
        if (yilVar.get(yqe.c) == null) {
            return yks.e(yilVar, yim.a) ? ysxVar : wae.X(ysxVar, yilVar, 0, 0, 6);
        }
        Objects.toString(yilVar);
        throw new IllegalArgumentException("Flow context cannot contain job in it. Had ".concat(String.valueOf(yilVar)));
    }

    public static final Object I(ysx ysxVar, yih yihVar) {
        Object objA = ysxVar.a(yvy.a, yihVar);
        return objA == yio.a ? objA : ygi.a;
    }

    public static final Object J(ysx ysxVar, yjz yjzVar, yih yihVar) {
        Object objI = I(M(ytx.a(ysxVar, yjzVar), 0), yihVar);
        return objI == yio.a ? objI : ygi.a;
    }

    public static final Object K(ysy ysyVar, ysx ysxVar, yih yihVar) throws Throwable {
        F(ysyVar);
        Object objA = ysxVar.a(ysyVar, yihVar);
        return objA == yio.a ? objA : ygi.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073 A[Catch: all -> 0x0094, TRY_LEAVE, TryCatch #0 {all -> 0x0094, blocks: (B:13:0x002e, B:23:0x0056, B:27:0x006b, B:29:0x0073, B:18:0x0044, B:22:0x0052), top: B:44:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0087 -> B:23:0x0056). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object L(defpackage.ysy r6, defpackage.ysm r7, boolean r8, defpackage.yih r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof defpackage.yta
            if (r0 == 0) goto L13
            r0 = r9
            yta r0 = (defpackage.yta) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            yta r0 = new yta
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.d
            yio r1 = defpackage.yio.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            boolean r8 = r0.c
            yrr r6 = r0.f
            java.lang.Object r7 = r0.b
            java.lang.Object r2 = r0.a
            defpackage.ybn.f(r9)     // Catch: java.lang.Throwable -> L94
            r9 = r6
            r6 = r2
            goto L56
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            boolean r8 = r0.c
            yrr r6 = r0.f
            java.lang.Object r7 = r0.b
            java.lang.Object r2 = r0.a
            defpackage.ybn.f(r9)     // Catch: java.lang.Throwable -> L94
            r5 = r0
            r0 = r6
            r6 = r2
        L4a:
            r2 = r5
            goto L6b
        L4c:
            defpackage.ybn.f(r9)
            F(r6)
            yrr r9 = r7.C()     // Catch: java.lang.Throwable -> L94
        L56:
            r0.a = r6     // Catch: java.lang.Throwable -> L94
            r0.b = r7     // Catch: java.lang.Throwable -> L94
            r0.f = r9     // Catch: java.lang.Throwable -> L94
            r0.c = r8     // Catch: java.lang.Throwable -> L94
            r0.e = r4     // Catch: java.lang.Throwable -> L94
            java.lang.Object r2 = r9.a(r0)     // Catch: java.lang.Throwable -> L94
            if (r2 != r1) goto L67
            goto L8a
        L67:
            r5 = r0
            r0 = r9
            r9 = r2
            goto L4a
        L6b:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L94
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L94
            if (r9 == 0) goto L8b
            java.lang.Object r9 = r0.b()     // Catch: java.lang.Throwable -> L94
            r2.a = r6     // Catch: java.lang.Throwable -> L94
            r2.b = r7     // Catch: java.lang.Throwable -> L94
            r2.f = r0     // Catch: java.lang.Throwable -> L94
            r2.c = r8     // Catch: java.lang.Throwable -> L94
            r2.e = r3     // Catch: java.lang.Throwable -> L94
            java.lang.Object r9 = r6.emit(r9, r2)     // Catch: java.lang.Throwable -> L94
            if (r9 == r1) goto L8a
            r9 = r0
            r0 = r2
            goto L56
        L8a:
            return r1
        L8b:
            if (r8 == 0) goto L91
            r6 = 0
            Q(r7, r6)
        L91:
            ygi r6 = defpackage.ygi.a
            return r6
        L94:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L96
        L96:
            r9 = move-exception
            if (r8 != 0) goto L9a
            goto L9d
        L9a:
            Q(r7, r6)
        L9d:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vyf.L(ysy, ysm, boolean, yih):java.lang.Object");
    }

    public static /* synthetic */ ysx M(ysx ysxVar, int i) {
        if (i < 0 && i != -2) {
            i = -1;
        }
        int i2 = i == -1 ? 2 : 1;
        if (i == -1) {
            i = 0;
        }
        return ysxVar instanceof yvw ? wae.X((yvw) ysxVar, null, i, i2, 1) : new yvn(ysxVar, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object P(defpackage.ysk r4, defpackage.yjk r5, defpackage.yih r6) {
        /*
            boolean r0 = r6 instanceof defpackage.ysj
            if (r0 == 0) goto L13
            r0 = r6
            ysj r0 = (defpackage.ysj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ysj r0 = new ysj
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.a
            defpackage.ybn.f(r6)     // Catch: java.lang.Throwable -> L29
            goto L63
        L29:
            r4 = move-exception
            goto L69
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.ybn.f(r6)
            yil r6 = r0.getContext()
            bbx r2 = defpackage.yqe.c
            yij r6 = r6.get(r2)
            if (r6 != r4) goto L6d
            r0.a = r5     // Catch: java.lang.Throwable -> L29
            r0.c = r3     // Catch: java.lang.Throwable -> L29
            yof r6 = new yof     // Catch: java.lang.Throwable -> L29
            yih r0 = defpackage.wcq.S(r0)     // Catch: java.lang.Throwable -> L29
            r6.<init>(r0, r3)     // Catch: java.lang.Throwable -> L29
            r6.v()     // Catch: java.lang.Throwable -> L29
            bil r0 = new bil     // Catch: java.lang.Throwable -> L29
            r2 = 11
            r0.<init>(r6, r2)     // Catch: java.lang.Throwable -> L29
            r4.eL(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r6.i()     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L63
            return r1
        L63:
            r5.a()
            ygi r4 = defpackage.ygi.a
            return r4
        L69:
            r5.a()
            throw r4
        L6d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vyf.P(ysk, yjk, yih):java.lang.Object");
    }

    public static final void Q(ysm ysmVar, Throwable th) {
        if (th != null) {
            cancellationExceptionAj = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationExceptionAj == null) {
                cancellationExceptionAj = ylh.aj("Channel was consumed, consumer had failed", th);
            }
        }
        ysmVar.t(cancellationExceptionAj);
    }

    public static /* synthetic */ yrz R(int i, int i2, int i3) {
        if (1 == (i3 & 1)) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if (i == -2) {
            return i2 == 1 ? new yrv(yry.a) : new ysh(1, i2);
        }
        if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? i2 == 1 ? new yrv(i) : new ysh(i, i2) : new yrv(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) : i2 == 1 ? new yrv(0) : new ysh(1, i2);
        }
        if (i2 == 1) {
            return new ysh(1, 2);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    public static /* synthetic */ String S(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "DROP_LATEST" : "DROP_OLDEST" : "SUSPEND";
    }

    public static /* synthetic */ ysn T(yow yowVar, int i, yjz yjzVar, int i2) {
        yim yimVar = (i2 & 1) != 0 ? yim.a : null;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        yil yilVarB = yos.b(yowVar, yimVar);
        yrz yrzVarR = R(i, 0, 6);
        ysa ysiVar = yoz.j(1) ? new ysi(yilVarB, yrzVarR, yjzVar) : new yrp(yilVarB, yrzVarR, true);
        yoz.i(1, yjzVar, ysiVar, ysiVar);
        return ysiVar;
    }

    private static final boolean U(Throwable th, Throwable th2) {
        if (th2 == null) {
            return false;
        }
        boolean z = yoy.b;
        if (z) {
            th2 = yxn.c(th2);
        }
        if (z) {
            th = yxn.c(th);
        }
        return yks.e(th2, th);
    }

    public static final void a(vyw vywVar, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vyz vyzVar = (vyz) vtwVar.b;
        vyz vyzVar2 = vyz.a;
        vyzVar.d = vywVar;
        vyzVar.c = 1;
    }

    public static int b(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 4 ? 0 : 5;
        }
        return 3;
    }

    public static final Duration c(vtl vtlVar) {
        Duration durationC = vxr.c(vtlVar);
        durationC.getClass();
        return durationC;
    }

    public static final Instant d(vwe vweVar) {
        Instant instantD = vxr.d(vweVar);
        instantD.getClass();
        return instantD;
    }

    public static double e(double d, double d2, double d3) {
        return d3 < d ? d : d3 > d2 ? d2 : d3;
    }

    public static double f(double d, double d2, double d3) {
        return ((1.0d - d3) * d) + (d3 * d2);
    }

    public static double g(double d) {
        double d2 = d % 360.0d;
        return d2 < 0.0d ? d2 + 360.0d : d2;
    }

    public static int h(int i) {
        int i2 = i % 360;
        return i2 < 0 ? i2 + 360 : i2;
    }

    public static int i(double d) {
        if (d < 0.0d) {
            return -1;
        }
        return d == 0.0d ? 0 : 1;
    }

    public static int j(int i) {
        if (i < 0) {
            return 0;
        }
        if (i > 255) {
            return 255;
        }
        return i;
    }

    public static List k(Map map) {
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[360];
        double dIntValue = 0.0d;
        for (Map.Entry entry : map.entrySet()) {
            wfs wfsVar = new wfs(((Integer) entry.getKey()).intValue());
            arrayList.add(wfsVar);
            int iFloor = (int) Math.floor(wfsVar.a);
            iArr[iFloor] = iArr[iFloor] + ((Integer) entry.getValue()).intValue();
            dIntValue += ((Integer) entry.getValue()).intValue();
        }
        double[] dArr = new double[360];
        for (int i = 0; i < 360; i++) {
            double d = iArr[i] / dIntValue;
            for (int i2 = i - 14; i2 < i + 16; i2++) {
                int iH = h(i2);
                dArr[iH] = dArr[iH] + d;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            wfs wfsVar2 = (wfs) arrayList.get(i3);
            double d2 = dArr[h((int) Math.round(wfsVar2.a))];
            double d3 = wfsVar2.b;
            if (d3 >= 5.0d && d2 > 0.01d) {
                arrayList2.add(new wfz(wfsVar2, (d2 * 100.0d * 0.7d) + ((d3 - 48.0d) * (d3 < 48.0d ? 0.1d : 0.3d))));
            }
        }
        Collections.sort(arrayList2, new zbq(1));
        ArrayList arrayList3 = new ArrayList();
        for (int i4 = 90; i4 >= 15; i4--) {
            arrayList3.clear();
            int size2 = arrayList2.size();
            int i5 = 0;
            while (i5 < size2) {
                Object obj = ((wfz) arrayList2.get(i5)).b;
                int size3 = arrayList3.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size3) {
                        arrayList3.add(obj);
                        break;
                    }
                    wfs wfsVar3 = (wfs) arrayList3.get(i6);
                    i6++;
                    if (180.0d - Math.abs(Math.abs(((wfs) obj).a - wfsVar3.a) - 180.0d) < i4) {
                        break;
                    }
                }
                i5++;
                if (arrayList3.size() >= 4) {
                    break;
                }
            }
            if (arrayList3.size() >= 4) {
                break;
            }
        }
        ArrayList arrayList4 = new ArrayList();
        if (arrayList3.isEmpty()) {
            arrayList4.add(-12417548);
        }
        int size4 = arrayList3.size();
        for (int i7 = 0; i7 < size4; i7++) {
            arrayList4.add(Integer.valueOf(((wfs) arrayList3.get(i7)).d));
        }
        return arrayList4;
    }

    static int l(int i, int i2, int i3) {
        return (i << 10) + (i << 6) + i + (i2 << 5) + i2 + i3;
    }

    static int m(wfx wfxVar, int[] iArr) {
        int i = wfxVar.b;
        int i2 = wfxVar.d;
        int i3 = wfxVar.f;
        int i4 = iArr[l(i, i2, i3)];
        int i5 = wfxVar.e;
        int i6 = i4 - iArr[l(i, i2, i5)];
        int i7 = wfxVar.c;
        int i8 = (i6 - iArr[l(i, i7, i3)]) + iArr[l(i, i7, i5)];
        int i9 = wfxVar.a;
        return (((i8 - iArr[l(i9, i2, i3)]) + iArr[l(i9, i2, i5)]) + iArr[l(i9, i7, i3)]) - iArr[l(i9, i7, i5)];
    }

    static int n(wfx wfxVar, int i, int[] iArr) {
        int i2;
        int i3;
        int i4 = i - 1;
        if (i4 == 0) {
            int i5 = wfxVar.a;
            int i6 = wfxVar.d;
            int i7 = wfxVar.f;
            int i8 = -iArr[l(i5, i6, i7)];
            int i9 = wfxVar.e;
            int i10 = i8 + iArr[l(i5, i6, i9)];
            int i11 = wfxVar.c;
            i2 = i10 + iArr[l(i5, i11, i7)];
            i3 = iArr[l(i5, i11, i9)];
        } else if (i4 != 1) {
            int i12 = wfxVar.b;
            int i13 = wfxVar.d;
            int i14 = wfxVar.e;
            int i15 = -iArr[l(i12, i13, i14)];
            int i16 = wfxVar.c;
            int i17 = i15 + iArr[l(i12, i16, i14)];
            int i18 = wfxVar.a;
            i2 = i17 + iArr[l(i18, i13, i14)];
            i3 = iArr[l(i18, i16, i14)];
        } else {
            int i19 = wfxVar.b;
            int i20 = wfxVar.c;
            int i21 = wfxVar.f;
            int i22 = -iArr[l(i19, i20, i21)];
            int i23 = wfxVar.e;
            int i24 = i22 + iArr[l(i19, i20, i23)];
            int i25 = wfxVar.a;
            i2 = i24 + iArr[l(i25, i20, i21)];
            i3 = iArr[l(i25, i20, i23)];
        }
        return i2 - i3;
    }

    static int o(wfx wfxVar, int i, int i2, int[] iArr) {
        int i3;
        int i4;
        int i5 = i - 1;
        if (i5 == 0) {
            int i6 = wfxVar.d;
            int i7 = wfxVar.f;
            int i8 = iArr[l(i2, i6, i7)];
            int i9 = wfxVar.e;
            int i10 = i8 - iArr[l(i2, i6, i9)];
            int i11 = wfxVar.c;
            i3 = i10 - iArr[l(i2, i11, i7)];
            i4 = iArr[l(i2, i11, i9)];
        } else if (i5 != 1) {
            int i12 = wfxVar.b;
            int i13 = wfxVar.d;
            int i14 = iArr[l(i12, i13, i2)];
            int i15 = wfxVar.c;
            int i16 = i14 - iArr[l(i12, i15, i2)];
            int i17 = wfxVar.a;
            i3 = i16 - iArr[l(i17, i13, i2)];
            i4 = iArr[l(i17, i15, i2)];
        } else {
            int i18 = wfxVar.b;
            int i19 = wfxVar.f;
            int i20 = iArr[l(i18, i2, i19)];
            int i21 = wfxVar.e;
            int i22 = i20 - iArr[l(i18, i2, i21)];
            int i23 = wfxVar.a;
            i3 = i22 - iArr[l(i23, i2, i19)];
            i4 = iArr[l(i23, i2, i21)];
        }
        return i3 + i4;
    }

    static final wfy p(wfx wfxVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        wfx wfxVar2 = wfxVar;
        int i8 = i;
        int[] iArr5 = iArr;
        int[] iArr6 = iArr2;
        int iN = n(wfxVar2, i8, iArr6);
        int iN2 = n(wfxVar2, i8, iArr3);
        int iN3 = n(wfxVar2, i8, iArr4);
        int iN4 = n(wfxVar2, i8, iArr5);
        double d = 0.0d;
        int i9 = -1;
        int i10 = i2;
        while (i10 < i3) {
            int iO = o(wfxVar2, i8, i10, iArr6) + iN;
            int iO2 = iN2 + o(wfxVar2, i8, i10, iArr3);
            int iO3 = iN3 + o(wfxVar2, i8, i10, iArr4);
            int iO4 = iN4 + o(wfxVar2, i8, i10, iArr5);
            if (iO4 != 0) {
                int i11 = iO * iO;
                int i12 = iO2 * iO2;
                int i13 = iO3 * iO3;
                int i14 = i4 - iO;
                int i15 = i5 - iO2;
                int i16 = i6 - iO3;
                int i17 = i7 - iO4;
                if (i17 != 0) {
                    double d2 = (((i11 + i12) + i13) / iO4) + ((((i14 * i14) + (i15 * i15)) + (i16 * i16)) / i17);
                    if (d2 > d) {
                        d = d2;
                        i9 = i10;
                    }
                }
            }
            i10++;
            wfxVar2 = wfxVar;
            i8 = i;
            iArr5 = iArr;
            iArr6 = iArr2;
        }
        return new wfy(i9, d);
    }

    static final double q(wfx wfxVar, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, double[] dArr) {
        int iM = m(wfxVar, iArr2);
        int iM2 = m(wfxVar, iArr3);
        int iM3 = m(wfxVar, iArr4);
        int i = wfxVar.b;
        int i2 = wfxVar.d;
        int i3 = wfxVar.f;
        double d = dArr[l(i, i2, i3)];
        int i4 = wfxVar.e;
        double d2 = d - dArr[l(i, i2, i4)];
        int i5 = wfxVar.c;
        double d3 = (d2 - dArr[l(i, i5, i3)]) + dArr[l(i, i5, i4)];
        int i6 = wfxVar.a;
        return ((((d3 - dArr[l(i6, i2, i3)]) + dArr[l(i6, i2, i4)]) + dArr[l(i6, i5, i3)]) - dArr[l(i6, i5, i4)]) - ((((iM * iM) + (iM2 * iM2)) + (iM3 * iM3)) / m(wfxVar, iArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x02a4 A[EDGE_INSN: B:188:0x02a4->B:77:0x02a4 BREAK  A[LOOP:6: B:28:0x014f->B:75:0x0295], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0295 A[LOOP:6: B:28:0x014f->B:75:0x0295, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Map r(int[] r33) {
        /*
            Method dump skipped, instructions count: 1506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vyf.r(int[]):java.util.Map");
    }

    public static int s(int i) {
        int i2 = 88;
        if (i != 88) {
            i2 = 89;
            if (i != 89) {
                i2 = R.styleable.AppCompatTheme_toolbarStyle;
                if (i != 113) {
                    i2 = R.styleable.AppCompatTheme_tooltipForegroundColor;
                    if (i != 114) {
                        i2 = 171;
                        if (i != 171) {
                            i2 = 172;
                            if (i != 172) {
                                switch (i) {
                                    case 18:
                                        return 18;
                                    case 22:
                                        return 22;
                                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                        return 37;
                                    case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                                        return 78;
                                    case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                                        return 81;
                                    case R.styleable.AppCompatTheme_panelBackground /* 86 */:
                                        return 86;
                                    case R.styleable.AppCompatTheme_windowActionBar /* 117 */:
                                        return R.styleable.AppCompatTheme_windowActionBar;
                                    case R.styleable.AppCompatTheme_windowActionModeOverlay /* 119 */:
                                        return R.styleable.AppCompatTheme_windowActionModeOverlay;
                                    case 139:
                                        return 139;
                                    case 140:
                                        return 140;
                                    case 141:
                                        return 141;
                                    case 142:
                                        return 142;
                                    case 143:
                                        return 143;
                                    case 144:
                                        return 144;
                                    case 145:
                                        return 145;
                                    case 146:
                                        return 146;
                                    case 180:
                                        return 180;
                                    case 198:
                                        return 198;
                                    case 199:
                                        return 199;
                                    case 212:
                                        return 212;
                                    case 213:
                                        return 213;
                                    case 214:
                                        return 214;
                                    case 215:
                                        return 215;
                                    case 216:
                                        return 216;
                                    case 217:
                                        return 217;
                                    case 222:
                                        return 222;
                                    case 223:
                                        return 223;
                                    case 224:
                                        return 224;
                                    case 225:
                                        return 225;
                                    case 226:
                                        return 226;
                                    case 227:
                                        return 227;
                                    case 242:
                                        return 242;
                                    case 243:
                                        return 243;
                                    case 244:
                                        return 244;
                                    case 245:
                                        return 245;
                                    case 246:
                                        return 246;
                                    case 247:
                                        return 247;
                                    case 248:
                                        return 248;
                                    case 249:
                                        return 249;
                                    case ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION /* 250 */:
                                        return ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION;
                                    case 251:
                                        return 251;
                                    case 256:
                                        return 256;
                                    case 258:
                                        return 258;
                                    case 259:
                                        return 259;
                                    case 261:
                                        return 261;
                                    case 271:
                                        return 271;
                                    case 272:
                                        return 272;
                                    case 273:
                                        return 273;
                                    case 274:
                                        return 274;
                                    case 275:
                                        return 275;
                                    case 276:
                                        return 276;
                                    case 277:
                                        return 277;
                                    case 278:
                                        return 278;
                                    case 279:
                                        return 279;
                                    case 280:
                                        return 280;
                                    case 281:
                                        return 281;
                                    case 282:
                                        return 282;
                                    case 283:
                                        return 283;
                                    case 284:
                                        return 284;
                                    case 285:
                                        return 285;
                                    case 286:
                                        return 286;
                                    case 287:
                                        return 287;
                                    case 288:
                                        return 288;
                                    case 289:
                                        return 289;
                                    case 290:
                                        return 290;
                                    case 291:
                                        return 291;
                                    case 292:
                                        return 292;
                                    case 293:
                                        return 293;
                                    case 294:
                                        return 294;
                                    case 295:
                                        return 295;
                                    case 296:
                                        return 296;
                                    case 297:
                                        return 297;
                                    case 302:
                                        return 302;
                                    case 303:
                                        return 303;
                                    case 308:
                                        return 308;
                                    case 313:
                                        return 313;
                                    case 314:
                                        return 314;
                                    case 315:
                                        return 315;
                                    case 317:
                                        return 317;
                                    case 318:
                                        return 318;
                                    case 325:
                                        return 325;
                                    case 326:
                                        return 326;
                                    case 328:
                                        return 328;
                                    case 329:
                                        return 329;
                                    case 330:
                                        return 330;
                                    case 331:
                                        return 331;
                                    case 332:
                                        return 332;
                                    case 333:
                                        return 333;
                                    case 334:
                                        return 334;
                                    case 335:
                                        return 335;
                                    case 336:
                                        return 336;
                                    case 337:
                                        return 337;
                                    case 350:
                                        return 350;
                                    case 351:
                                        return 351;
                                    case 352:
                                        return 352;
                                    case 353:
                                        return 353;
                                    case 354:
                                        return 354;
                                    case 355:
                                        return 355;
                                    case 356:
                                        return 356;
                                    case 357:
                                        return 357;
                                    case 358:
                                        return 358;
                                    case 359:
                                        return 359;
                                    case 360:
                                        return 360;
                                    case 361:
                                        return 361;
                                    case 362:
                                        return 362;
                                    case 363:
                                        return 363;
                                    case 364:
                                        return 364;
                                    case 365:
                                        return 365;
                                    case 366:
                                        return 366;
                                    case 367:
                                        return 367;
                                    case 368:
                                        return 368;
                                    case 380:
                                        return 380;
                                    case 381:
                                        return 381;
                                    case 432:
                                        return 432;
                                    case 433:
                                        return 433;
                                    case 434:
                                        return 434;
                                    case 435:
                                        return 435;
                                    case 436:
                                        return 436;
                                    case 437:
                                        return 437;
                                    case 438:
                                        return 438;
                                    case 439:
                                        return 439;
                                    case 440:
                                        return 440;
                                    case 441:
                                        return 441;
                                    case 442:
                                        return 442;
                                    case 443:
                                        return 443;
                                    case 444:
                                        return 444;
                                    case 445:
                                        return 445;
                                    case 446:
                                        return 446;
                                    case 447:
                                        return 447;
                                    case 448:
                                        return 448;
                                    case 449:
                                        return 449;
                                    case 450:
                                        return 450;
                                    case 451:
                                        return 451;
                                    case 452:
                                        return 452;
                                    case 453:
                                        return 453;
                                    case 454:
                                        return 454;
                                    case 455:
                                        return 455;
                                    case 456:
                                        return 456;
                                    case 457:
                                        return 457;
                                    case 458:
                                        return 458;
                                    case 459:
                                        return 459;
                                    case 460:
                                        return 460;
                                    case 461:
                                        return 461;
                                    case 462:
                                        return 462;
                                    case 463:
                                        return 463;
                                    case 464:
                                        return 464;
                                    case 465:
                                        return 465;
                                    case 480:
                                        return 480;
                                    case 481:
                                        return 481;
                                    case 482:
                                        return 482;
                                    case 483:
                                        return 483;
                                    case 484:
                                        return 484;
                                    case 485:
                                        return 485;
                                    case 486:
                                        return 486;
                                    case 487:
                                        return 487;
                                    case 488:
                                        return 488;
                                    case 489:
                                        return 489;
                                    case 490:
                                        return 490;
                                    case 491:
                                        return 491;
                                    case 492:
                                        return 492;
                                    case 493:
                                        return 493;
                                    case 494:
                                        return 494;
                                    case 495:
                                        return 495;
                                    case 496:
                                        return 496;
                                    case 497:
                                        return 497;
                                    case 498:
                                        return 498;
                                    case 499:
                                        return 499;
                                    case 500:
                                        return 500;
                                    case 501:
                                        return 501;
                                    case 502:
                                        return 502;
                                    case 503:
                                        return 503;
                                    case 504:
                                        return 504;
                                    case 505:
                                        return 505;
                                    case 506:
                                        return 506;
                                    case 507:
                                        return 507;
                                    case 508:
                                        return 508;
                                    case 509:
                                        return 509;
                                    case 510:
                                        return 510;
                                    case 511:
                                        return 511;
                                    case 512:
                                        return 512;
                                    case 513:
                                        return 513;
                                    case 514:
                                        return 514;
                                    case 515:
                                        return 515;
                                    case 516:
                                        return 516;
                                    case 517:
                                        return 517;
                                    case 518:
                                        return 518;
                                    case 519:
                                        return 519;
                                    case 520:
                                        return 520;
                                    case 521:
                                        return 521;
                                    case 522:
                                        return 522;
                                    case 523:
                                        return 523;
                                    case 524:
                                        return 524;
                                    case 525:
                                        return 525;
                                    case 526:
                                        return 526;
                                    case 527:
                                        return 527;
                                    case 528:
                                        return 528;
                                    case 529:
                                        return 529;
                                    case 530:
                                        return 530;
                                    case 531:
                                        return 531;
                                    case 532:
                                        return 532;
                                    case 533:
                                        return 533;
                                    case 534:
                                        return 534;
                                    case 535:
                                        return 535;
                                    case 536:
                                        return 536;
                                    case 537:
                                        return 537;
                                    case 538:
                                        return 538;
                                    case 539:
                                        return 539;
                                    case 540:
                                        return 540;
                                    case 541:
                                        return 541;
                                    case 542:
                                        return 542;
                                    case 543:
                                        return 543;
                                    case 544:
                                        return 544;
                                    case 545:
                                        return 545;
                                    case 546:
                                        return 546;
                                    case 547:
                                        return 547;
                                    case 559:
                                        return 559;
                                    case 560:
                                        return 560;
                                    case 561:
                                        return 561;
                                    case 562:
                                        return 562;
                                    case 577:
                                        return 577;
                                    case 578:
                                        return 578;
                                    case 579:
                                        return 579;
                                    case 580:
                                        return 580;
                                    case 581:
                                        return 581;
                                    case 582:
                                        return 582;
                                    case 583:
                                        return 583;
                                    case 584:
                                        return 584;
                                    case 585:
                                        return 585;
                                    case 586:
                                        return 586;
                                    case 587:
                                        return 587;
                                    case 588:
                                        return 588;
                                    case 589:
                                        return 589;
                                    case 590:
                                        return 590;
                                    case 591:
                                        return 591;
                                    case 592:
                                        return 592;
                                    case 704:
                                        return 704;
                                    case 705:
                                        return 705;
                                    case 706:
                                        return 706;
                                    case 707:
                                        return 707;
                                    case 708:
                                        return 708;
                                    case 709:
                                        return 709;
                                    case 710:
                                        return 710;
                                    case 711:
                                        return 711;
                                    case 748:
                                        return 748;
                                    case 749:
                                        return 749;
                                    default:
                                        switch (i) {
                                            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                                                return 52;
                                            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                                                return 53;
                                            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                                                return 54;
                                            default:
                                                switch (i) {
                                                    case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                                                        return 59;
                                                    case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                                                        return 60;
                                                    case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                                                        return 61;
                                                    case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                                                        return 62;
                                                    case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                                                        return 63;
                                                    case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                                                        return 64;
                                                    default:
                                                        switch (i) {
                                                            case 133:
                                                                return 133;
                                                            case 134:
                                                                return 134;
                                                            case 135:
                                                                return 135;
                                                            case 136:
                                                                return 136;
                                                            case 137:
                                                                return 137;
                                                            default:
                                                                switch (i) {
                                                                    case 148:
                                                                        return 148;
                                                                    case 149:
                                                                        return 149;
                                                                    case 150:
                                                                        return 150;
                                                                    default:
                                                                        switch (i) {
                                                                            case 159:
                                                                                return 159;
                                                                            case 160:
                                                                                return 160;
                                                                            case 161:
                                                                                return 161;
                                                                            default:
                                                                                switch (i) {
                                                                                    case 186:
                                                                                        return 186;
                                                                                    case 187:
                                                                                        return 187;
                                                                                    case 188:
                                                                                        return 188;
                                                                                    case 189:
                                                                                        return 189;
                                                                                    case 190:
                                                                                        return 190;
                                                                                    case 191:
                                                                                        return 191;
                                                                                    case 192:
                                                                                        return 192;
                                                                                    case 193:
                                                                                        return 193;
                                                                                    default:
                                                                                        return 0;
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                            }
                        }
                    }
                }
            }
        }
        return i2;
    }

    public static int t(int i) {
        int i2 = 2;
        if (i != 2) {
            i2 = 3;
            if (i != 3) {
                i2 = 4;
                if (i != 4) {
                    return 0;
                }
            }
        }
        return i2;
    }

    public static int u(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public static int v(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            default:
                return 0;
        }
    }

    public static final yva w(ysx ysxVar, yow yowVar, yuu yuuVar, Object obj) {
        ysx ysxVar2;
        yil yilVar;
        yvl yvlVar;
        ysx ysxVarF;
        boolean z = yoy.a;
        int i = yrz.e;
        if (!(ysxVar instanceof yvl) || (ysxVarF = (yvlVar = (yvl) ysxVar).f()) == null) {
            ysxVar2 = ysxVar;
            yilVar = yim.a;
        } else {
            yilVar = yvlVar.a;
            ysxVar2 = ysxVarF;
        }
        yvc yvcVarA = yvd.a(obj);
        ykr.m(yowVar, yilVar, true != yks.e(yuuVar, yut.a) ? 4 : 1, new qft(yuuVar, ysxVar2, yvcVarA, obj, (yih) null, 4));
        return new yul(yvcVarA);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object x(defpackage.ysx r5, defpackage.yih r6) {
        /*
            boolean r0 = r6 instanceof defpackage.ytz
            if (r0 == 0) goto L13
            r0 = r6
            ytz r0 = (defpackage.ytz) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ytz r0 = new ytz
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            irv r5 = r0.d
            ylf r1 = r0.c
            defpackage.ybn.f(r6)     // Catch: defpackage.yvh -> L2b
            goto L65
        L2b:
            r6 = move-exception
            goto L5b
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.ybn.f(r6)
            ylf r6 = new ylf
            r6.<init>()
            yxo r2 = defpackage.yvz.a
            r6.a = r2
            irv r2 = new irv
            r4 = 13
            r2.<init>(r6, r4)
            r0.c = r6     // Catch: defpackage.yvh -> L57
            r0.d = r2     // Catch: defpackage.yvh -> L57
            r0.b = r3     // Catch: defpackage.yvh -> L57
            java.lang.Object r5 = r5.a(r2, r0)     // Catch: defpackage.yvh -> L57
            if (r5 == r1) goto L56
            r1 = r6
            goto L65
        L56:
            return r1
        L57:
            r5 = move-exception
            r1 = r6
            r6 = r5
            r5 = r2
        L5b:
            defpackage.wae.Y(r6, r5)
            yil r5 = r0.getContext()
            defpackage.yoz.z(r5)
        L65:
            java.lang.Object r5 = r1.a
            yxo r6 = defpackage.yvz.a
            if (r5 == r6) goto L6c
            return r5
        L6c:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "Expected at least one element"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vyf.x(ysx, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object y(defpackage.ysx r6, defpackage.yjz r7, defpackage.yih r8) {
        /*
            boolean r0 = r8 instanceof defpackage.yua
            if (r0 == 0) goto L13
            r0 = r8
            yua r0 = (defpackage.yua) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            yua r0 = new yua
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            ioo r6 = r0.d
            ylf r7 = r0.c
            defpackage.ybn.f(r8)     // Catch: defpackage.yvh -> L2b
            goto L66
        L2b:
            r8 = move-exception
            goto L5c
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            defpackage.ybn.f(r8)
            ylf r8 = new ylf
            r8.<init>()
            yxo r2 = defpackage.yvz.a
            r8.a = r2
            ioo r2 = new ioo
            r4 = 15
            r5 = 0
            r2.<init>(r7, r8, r4, r5)
            r0.c = r8     // Catch: defpackage.yvh -> L58
            r0.d = r2     // Catch: defpackage.yvh -> L58
            r0.b = r3     // Catch: defpackage.yvh -> L58
            java.lang.Object r6 = r6.a(r2, r0)     // Catch: defpackage.yvh -> L58
            if (r6 == r1) goto L57
            r7 = r8
            goto L66
        L57:
            return r1
        L58:
            r6 = move-exception
            r7 = r8
            r8 = r6
            r6 = r2
        L5c:
            defpackage.wae.Y(r8, r6)
            yil r6 = r0.getContext()
            defpackage.yoz.z(r6)
        L66:
            java.lang.Object r6 = r7.a
            yxo r7 = defpackage.yvz.a
            if (r6 == r7) goto L6d
            return r6
        L6d:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.String r7 = "Expected at least one element matching the predicate"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vyf.y(ysx, yjz, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object z(defpackage.ysx r5, defpackage.yih r6) {
        /*
            boolean r0 = r6 instanceof defpackage.yuc
            if (r0 == 0) goto L13
            r0 = r6
            yuc r0 = (defpackage.yuc) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            yuc r0 = new yuc
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            irv r5 = r0.d
            ylf r1 = r0.c
            defpackage.ybn.f(r6)     // Catch: defpackage.yvh -> L2b
            goto L61
        L2b:
            r6 = move-exception
            goto L57
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.ybn.f(r6)
            ylf r6 = new ylf
            r6.<init>()
            irv r2 = new irv
            r4 = 14
            r2.<init>(r6, r4)
            r0.c = r6     // Catch: defpackage.yvh -> L53
            r0.d = r2     // Catch: defpackage.yvh -> L53
            r0.b = r3     // Catch: defpackage.yvh -> L53
            java.lang.Object r5 = r5.a(r2, r0)     // Catch: defpackage.yvh -> L53
            if (r5 == r1) goto L52
            r1 = r6
            goto L61
        L52:
            return r1
        L53:
            r5 = move-exception
            r1 = r6
            r6 = r5
            r5 = r2
        L57:
            defpackage.wae.Y(r6, r5)
            yil r5 = r0.getContext()
            defpackage.yoz.z(r5)
        L61:
            java.lang.Object r5 = r1.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vyf.z(ysx, yih):java.lang.Object");
    }
}
