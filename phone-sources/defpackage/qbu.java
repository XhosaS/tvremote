package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qbu extends yiz implements yjz {
    Object a;
    int b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbu(List list, qbv qbvVar, pxg pxgVar, qdo qdoVar, yih yihVar, int i) {
        super(2, yihVar);
        this.g = i;
        this.c = list;
        this.d = qbvVar;
        this.e = pxgVar;
        this.f = qdoVar;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.g;
        if (i == 0) {
            return ((qbu) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        if (i != 1) {
            return ((qbu) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        return ((qbu) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, qkb] */
    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        int i = this.g;
        if (i == 0) {
            ?? r3 = this.c;
            Object obj2 = this.d;
            return new qbu((List) r3, (qbv) obj2, (pxg) this.e, (qdo) this.f, yihVar, 0);
        }
        if (i != 1) {
            return new qbu((Map) this.c, (qkb) this.d, (rbi) this.f, (qel) this.e, yihVar, 2);
        }
        Object obj3 = this.e;
        Object obj4 = this.d;
        return new qbu((pbq) obj3, (uwh) obj4, (String) this.c, (vlo) this.f, yihVar, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013b A[PHI: r9
  0x013b: PHI (r9v2 java.lang.Object) = (r9v1 java.lang.Object), (r9v1 java.lang.Object), (r9v3 java.lang.Object) binds: [B:36:0x00cd, B:43:0x0137, B:30:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0146  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, qkb] */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qbu.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbu(Map map, qkb qkbVar, rbi rbiVar, qel qelVar, yih yihVar, int i) {
        super(2, yihVar);
        this.g = i;
        this.c = map;
        this.d = qkbVar;
        this.f = rbiVar;
        this.e = qelVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbu(pbq pbqVar, uwh uwhVar, String str, vlo vloVar, yih yihVar, int i) {
        super(2, yihVar);
        this.g = i;
        this.e = pbqVar;
        this.d = uwhVar;
        this.c = str;
        this.f = vloVar;
    }
}
