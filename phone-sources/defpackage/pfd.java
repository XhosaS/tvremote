package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.libraries.notifications.platform.internal.room.GnpPerAccountRoomDatabase;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pfd extends yiz implements yjz {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pfd(GnpPerAccountRoomDatabase gnpPerAccountRoomDatabase, yjv yjvVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.b = gnpPerAccountRoomDatabase;
        this.c = yjvVar;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                return ((pfd) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 1:
                return ((pfd) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 2:
                return ((pfd) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 3:
                return ((pfd) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 4:
                return ((pfd) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 5:
                return ((pfd) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 6:
                return ((pfd) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 7:
                return ((pfd) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 8:
                return ((pfd) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 9:
                return ((pfd) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 10:
                return ((pfd) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 11:
                return ((pfd) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 12:
                return ((pfd) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 13:
                return ((pfd) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 14:
                return ((pfd) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 15:
                return ((pfd) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 16:
                return ((pfd) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 17:
                return ((pfd) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 18:
                return ((pfd) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 19:
                return ((pfd) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            default:
                return ((pfd) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, qja] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, qpv] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, qsx] */
    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        switch (this.d) {
            case 0:
                return new pfd((pfh) this.b, (String) this.c, yihVar, 0);
            case 1:
                return new pfd((nsf) this.b, (vlo) this.c, yihVar, 1);
            case 2:
                return new pfd((pfh) this.b, (vlo) this.c, yihVar, 2);
            case 3:
                return new pfd((pfh) this.b, (vlo) this.c, yihVar, 3, (byte[]) null);
            case 4:
                return new pfd((pfk) this.c, (Bundle) this.b, yihVar, 4);
            case 5:
                return new pfd((pgl) this.c, (oyd) this.b, yihVar, 5);
            case 6:
                return new pfd((pgl) this.c, (oyd) this.b, yihVar, 6, (byte[]) null);
            case 7:
                return new pfd((pic) this.c, (oyd) this.b, yihVar, 7);
            case 8:
                return new pfd((puv) this.c, (Intent) this.b, yihVar, 8);
            case 9:
                return new pfd((unc) this.b, (vmd) this.c, yihVar, 9);
            case 10:
                return new pfd((pzo) this.b, (qen) this.c, yihVar, 10);
            case 11:
                return new pfd((pzo) this.b, (qen) this.c, yihVar, 11, (byte[]) null);
            case 12:
                return new pfd((qha) this.c, (qgw) this.b, yihVar, 12);
            case 13:
                return new pfd((qja) this.b, (String) this.c, yihVar, 13);
            case 14:
                return new pfd((rbi) this.b, (qpv) this.c, yihVar, 14);
            case 15:
                return new pfd((GnpPerAccountRoomDatabase) this.b, (yjv) this.c, yihVar, 15);
            case 16:
                return new pfd((qqo) this.b, (vmd) this.c, yihVar, 16);
            case 17:
                return new pfd((qsu) this.c, (qen) this.b, yihVar, 17);
            case 18:
                return new pfd((qsx) this.c, (Bundle) this.b, yihVar, 18);
            case 19:
                return new pfd((qta) this.c, (Bundle) this.b, yihVar, 19);
            default:
                return new pfd((qta) this.c, (Bundle) this.b, yihVar, 20, (byte[]) null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x02a9, code lost:
    
        if (((defpackage.pic) r13).a.a((defpackage.oyd) r1, null, r12) == r0) goto L141;
     */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03cd A[PHI: r13
  0x03cd: PHI (r13v22 java.lang.Object) = (r13v21 java.lang.Object), (r13v24 java.lang.Object) binds: [B:198:0x03ca, B:194:0x03bb] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Type inference failed for: r13v100, types: [java.lang.Object, qnr] */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.lang.Object, pex] */
    /* JADX WARN: Type inference failed for: r13v119, types: [java.lang.Object, qsx] */
    /* JADX WARN: Type inference failed for: r13v82, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r13v96, types: [java.lang.Object, qja] */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.lang.Object, qjy] */
    /* JADX WARN: Type inference failed for: r1v49, types: [java.lang.Object, qpv] */
    /* JADX WARN: Type inference failed for: r1v51, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, yow] */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pfd.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pfd(nsf nsfVar, vlo vloVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.b = nsfVar;
        this.c = vloVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pfd(pfh pfhVar, String str, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.b = pfhVar;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pfd(pfh pfhVar, vlo vloVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.b = pfhVar;
        this.c = vloVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pfd(pfh pfhVar, vlo vloVar, yih yihVar, int i, byte[] bArr) {
        super(2, yihVar);
        this.d = i;
        this.b = pfhVar;
        this.c = vloVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pfd(pfk pfkVar, Bundle bundle, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.c = pfkVar;
        this.b = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pfd(pgl pglVar, oyd oydVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.c = pglVar;
        this.b = oydVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pfd(pgl pglVar, oyd oydVar, yih yihVar, int i, byte[] bArr) {
        super(2, yihVar);
        this.d = i;
        this.c = pglVar;
        this.b = oydVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pfd(pic picVar, oyd oydVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.c = picVar;
        this.b = oydVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pfd(puv puvVar, Intent intent, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.c = puvVar;
        this.b = intent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pfd(pzo pzoVar, qen qenVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.b = pzoVar;
        this.c = qenVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pfd(pzo pzoVar, qen qenVar, yih yihVar, int i, byte[] bArr) {
        super(2, yihVar);
        this.d = i;
        this.b = pzoVar;
        this.c = qenVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pfd(qha qhaVar, qgw qgwVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.c = qhaVar;
        this.b = qgwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pfd(qja qjaVar, String str, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.b = qjaVar;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pfd(qqo qqoVar, vmd vmdVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.b = qqoVar;
        this.c = vmdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pfd(qsu qsuVar, qen qenVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.c = qsuVar;
        this.b = qenVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pfd(qsx qsxVar, Bundle bundle, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.c = qsxVar;
        this.b = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pfd(qta qtaVar, Bundle bundle, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.c = qtaVar;
        this.b = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pfd(qta qtaVar, Bundle bundle, yih yihVar, int i, byte[] bArr) {
        super(2, yihVar);
        this.d = i;
        this.c = qtaVar;
        this.b = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pfd(rbi rbiVar, qpv qpvVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.b = rbiVar;
        this.c = qpvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pfd(unc uncVar, vmd vmdVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.b = uncVar;
        this.c = vmdVar;
    }
}
