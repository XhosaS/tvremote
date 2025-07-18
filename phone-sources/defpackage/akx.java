package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akx extends yiy implements yjz {
    int a;
    final /* synthetic */ Object b;
    private /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akx(alg algVar, yih yihVar, int i) {
        super(yihVar);
        this.d = i;
        this.b = algVar;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.d;
        if (i == 0) {
            return ((akx) create((btq) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        if (i != 1) {
            return ((akx) create((ymy) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        return ((akx) create((btq) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        int i = this.d;
        if (i == 0) {
            akx akxVar = new akx((alg) this.b, yihVar, 0);
            akxVar.c = obj;
            return akxVar;
        }
        if (i != 1) {
            akx akxVar2 = new akx((View) this.b, yihVar, 2);
            akxVar2.c = obj;
            return akxVar2;
        }
        akx akxVar3 = new akx((qj) this.b, yihVar, 1);
        akxVar3.c = obj;
        return akxVar3;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012c A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0099 -> B:37:0x009c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x012a -> B:66:0x012d). Please report as a decompilation issue!!! */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akx.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akx(View view, yih yihVar, int i) {
        super(yihVar);
        this.d = i;
        this.b = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akx(qj qjVar, yih yihVar, int i) {
        super(yihVar);
        this.d = i;
        this.b = qjVar;
    }
}
