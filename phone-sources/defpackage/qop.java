package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qop extends yiz implements yjz {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    int f;
    final /* synthetic */ List g;
    final /* synthetic */ qel h;
    final /* synthetic */ Map i;
    final /* synthetic */ aafi j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qop(aafi aafiVar, List list, qel qelVar, Map map, yih yihVar) {
        super(2, yihVar);
        this.j = aafiVar;
        this.g = list;
        this.h = qelVar;
        this.i = map;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((qop) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        return new qop(this.j, this.g, this.h, this.i, yihVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d8 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:6:0x000f, B:31:0x00d2, B:33:0x00d8, B:34:0x00ec, B:36:0x00f2, B:38:0x00fa, B:39:0x00fd, B:40:0x011a, B:41:0x0120, B:43:0x0124, B:46:0x012c, B:47:0x0131, B:15:0x004a, B:17:0x0050, B:18:0x0059, B:19:0x0062, B:21:0x0068, B:23:0x0075, B:24:0x0079, B:25:0x0086, B:27:0x008c, B:28:0x00b1), top: B:51:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0120 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:6:0x000f, B:31:0x00d2, B:33:0x00d8, B:34:0x00ec, B:36:0x00f2, B:38:0x00fa, B:39:0x00fd, B:40:0x011a, B:41:0x0120, B:43:0x0124, B:46:0x012c, B:47:0x0131, B:15:0x004a, B:17:0x0050, B:18:0x0059, B:19:0x0062, B:21:0x0068, B:23:0x0075, B:24:0x0079, B:25:0x0086, B:27:0x008c, B:28:0x00b1), top: B:51:0x0007 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qop.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
