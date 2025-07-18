package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yhl extends yiy implements yjz {
    Object a;
    Object b;
    int c;
    int d;
    final /* synthetic */ int e;
    final /* synthetic */ int f;
    final /* synthetic */ Iterator g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yhl(int i, int i2, Iterator it, yih yihVar) {
        super(yihVar);
        this.e = i;
        this.f = i2;
        this.g = it;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yhl) create((ymy) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        yhl yhlVar = new yhl(this.e, this.f, this.g, yihVar);
        yhlVar.h = obj;
        return yhlVar;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x009a A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x008e -> B:13:0x0044). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0119 -> B:49:0x011b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0142 -> B:57:0x0144). Please report as a decompilation issue!!! */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yhl.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
