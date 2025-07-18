package defpackage;

import android.accounts.Account;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hct extends agtu implements agvb {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    int f;
    final /* synthetic */ Optional g;
    final /* synthetic */ hcv h;
    final /* synthetic */ Account i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hct(Optional optional, hcv hcvVar, Account account, agsw agswVar) {
        super(2, agswVar);
        this.g = optional;
        this.h = hcvVar;
        this.i = account;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hct) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003d A[PHI: r5 r6 r7
  0x003d: PHI (r5v1 java.util.Iterator) = (r5v0 java.util.Iterator), (r5v6 java.util.Iterator) binds: [B:10:0x002d, B:23:0x0074] A[DONT_GENERATE, DONT_INLINE]
  0x003d: PHI (r6v1 java.lang.Object) = (r6v0 java.lang.Object), (r6v2 java.lang.Object) binds: [B:10:0x002d, B:23:0x0074] A[DONT_GENERATE, DONT_INLINE]
  0x003d: PHI (r7v1 java.lang.Object) = (r7v0 java.lang.Object), (r7v2 java.lang.Object) binds: [B:10:0x002d, B:23:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x006e -> B:22:0x0070). Please report as a decompilation issue!!! */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            agtg r0 = defpackage.agtg.a
            int r1 = r9.f
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L16
            java.lang.Object r1 = r9.e
            java.lang.Object r4 = r9.d
            java.lang.Object r5 = r9.c
            java.lang.Object r6 = r9.b
            java.lang.Object r7 = r9.a
            defpackage.agpl.b(r10)
            goto L70
        L16:
            defpackage.agpl.b(r10)
            j$.util.Optional r10 = r9.g
            boolean r1 = r10.isPresent()
            if (r1 == 0) goto L7c
            java.lang.Object r10 = r10.get()
            ymc r10 = (defpackage.ymc) r10
            yjn r10 = r10.k
            if (r10 != 0) goto L2d
            yjn r10 = defpackage.yjn.a
        L2d:
            abxs r10 = r10.b
            r10.getClass()
            hcv r1 = r9.h
            android.accounts.Account r4 = r9.i
            java.util.Iterator r10 = r10.iterator()
            r5 = r10
            r7 = r1
            r6 = r4
        L3d:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L78
            java.lang.Object r4 = r5.next()
            r10 = r4
            yjm r10 = (defpackage.yjm) r10
            java.lang.String r1 = r10.b
            r10 = r7
            hcv r10 = (defpackage.hcv) r10
            fsv r10 = r10.e
            if (r6 == 0) goto L59
            r8 = r6
            android.accounts.Account r8 = (android.accounts.Account) r8
            java.lang.String r8 = r8.name
            goto L5a
        L59:
            r8 = r3
        L5a:
            r9.a = r7
            r9.b = r6
            r9.c = r5
            r9.d = r4
            r9.e = r1
            r9.f = r2
            if (r8 != 0) goto L6a
            java.lang.String r8 = ""
        L6a:
            java.lang.Object r10 = r10.c(r8, r9)
            if (r10 == r0) goto L77
        L70:
            boolean r10 = defpackage.agvy.c(r1, r10)
            if (r10 != 0) goto L79
            goto L3d
        L77:
            return r0
        L78:
            r4 = r3
        L79:
            yjm r4 = (defpackage.yjm) r4
            goto L7d
        L7c:
            r4 = r3
        L7d:
            if (r4 == 0) goto L88
            hcx r10 = new hcx
            boolean r0 = r4.c
            r0 = r0 ^ r2
            r10.<init>(r0)
            goto L89
        L88:
            r10 = r3
        L89:
            hcv r0 = r9.h
            r0.f = r10
            android.content.ContentResolver r10 = r0.c
            android.net.Uri r0 = defpackage.hef.c
            r10.notifyChange(r0, r3)
            agpu r10 = defpackage.agpu.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hct.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new hct(this.g, this.h, this.i, agswVar);
    }
}
