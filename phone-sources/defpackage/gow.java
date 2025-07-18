package defpackage;

import androidx.work.CoroutineWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gow extends yiz implements yjz {
    int a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gow(CoroutineWorker coroutineWorker, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.b = coroutineWorker;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) throws Throwable {
        switch (this.c) {
            case 0:
                yih<ygi> yihVarCreate = create((yow) obj, (yih) obj2);
                ygi ygiVar = ygi.a;
                ((gow) yihVarCreate).invokeSuspend(ygiVar);
                return ygiVar;
            case 1:
                return ((gow) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 2:
                return ((gow) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 3:
                return ((gow) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 4:
                return ((gow) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 5:
                return ((gow) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 6:
                return ((gow) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 7:
                return ((gow) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 8:
                return ((gow) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 9:
                return ((gow) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 10:
                return ((gow) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 11:
                return ((gow) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 12:
                return ((gow) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 13:
                return ((gow) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 14:
                return ((gow) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 15:
                return ((gow) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 16:
                return ((gow) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 17:
                return ((gow) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 18:
                return ((gow) create((sbr) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 19:
                return ((gow) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            default:
                return ((gow) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
    }

    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        switch (this.c) {
            case 0:
                return new gow((CoroutineWorker) this.b, yihVar, 0);
            case 1:
                return new gow((yol) this.b, yihVar, 1);
            case 2:
                return new gow((CoroutineWorker) this.b, yihVar, 2, (byte[]) null);
            case 3:
                return new gow((gsb) this.b, yihVar, 3);
            case 4:
                return new gow((gsb) this.b, yihVar, 4, (byte[]) null);
            case 5:
                return new gow((ConstraintTrackingWorker) this.b, yihVar, 5);
            case 6:
                return new gow((gxa) this.b, yihVar, 6);
            case 7:
                return new gow((iom) this.b, yihVar, 7);
            case 8:
                return new gow((igp) this.b, yihVar, 8);
            case 9:
                return new gow((ihq) this.b, yihVar, 9);
            case 10:
                return new gow((kw) this.b, yihVar, 10);
            case 11:
                return new gow((iov) this.b, yihVar, 11);
            case 12:
                return new gow((iqo) this.b, yihVar, 12);
            case 13:
                return new gow((iqo) this.b, yihVar, 13, (byte[]) null);
            case 14:
                return new gow((iqo) this.b, yihVar, 14, (char[]) null);
            case 15:
                return new gow((isi) this.b, yihVar, 15);
            case 16:
                return new gow((isl) this.b, yihVar, 16);
            case 17:
                return new gow((iyd) this.b, yihVar, 17);
            case 18:
                return new gow((iye) this.b, yihVar, 18);
            case 19:
                return new gow((jah) this.b, yihVar, 19);
            default:
                return new gow((jah) this.b, yihVar, 20, (byte[]) null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x01af, code lost:
    
        if (r14 == r0) goto L78;
     */
    /* JADX WARN: Type inference failed for: r14v48, types: [java.lang.Object, yfo] */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1058
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gow.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gow(CoroutineWorker coroutineWorker, yih yihVar, int i, byte[] bArr) {
        super(2, yihVar);
        this.c = i;
        this.b = coroutineWorker;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gow(ConstraintTrackingWorker constraintTrackingWorker, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.b = constraintTrackingWorker;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gow(gsb gsbVar, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.b = gsbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gow(gsb gsbVar, yih yihVar, int i, byte[] bArr) {
        super(2, yihVar);
        this.c = i;
        this.b = gsbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gow(gxa gxaVar, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.b = gxaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gow(igp igpVar, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.b = igpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gow(ihq ihqVar, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.b = ihqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gow(iom iomVar, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.b = iomVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gow(iov iovVar, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.b = iovVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gow(iqo iqoVar, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.b = iqoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gow(iqo iqoVar, yih yihVar, int i, byte[] bArr) {
        super(2, yihVar);
        this.c = i;
        this.b = iqoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gow(iqo iqoVar, yih yihVar, int i, char[] cArr) {
        super(2, yihVar);
        this.c = i;
        this.b = iqoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gow(isi isiVar, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.b = isiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gow(isl islVar, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.b = islVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gow(iyd iydVar, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.b = iydVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gow(iye iyeVar, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.b = iyeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gow(jah jahVar, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.b = jahVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gow(jah jahVar, yih yihVar, int i, byte[] bArr) {
        super(2, yihVar);
        this.c = i;
        this.b = jahVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gow(kw kwVar, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.b = kwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gow(yol yolVar, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.b = yolVar;
    }
}
